package su.nsk.iae.post.generator.common

import su.nsk.iae.post.poST.Configuration
import java.util.List
import java.util.LinkedList
import org.eclipse.emf.ecore.resource.Resource
import su.nsk.iae.post.poST.Model
import java.util.Map
import java.util.HashMap
import org.eclipse.xtext.generator.IFileSystemAccess2
import su.nsk.iae.post.generator.common.vars.VarHelper
import su.nsk.iae.post.generator.common.vars.GlobalVarHelper
import su.nsk.iae.post.generator.common.vars.data.DirectVarData
import org.eclipse.emf.common.util.EList
import su.nsk.iae.post.poST.GlobalVarInitDeclaration
import su.nsk.iae.post.poST.AssignmentType

abstract class ConfigurationGenerator extends CommonGenerator {
	
	Configuration configuration
	VarHelper globalVars = new GlobalVarHelper
	List<ProgramGenerator> programList = new LinkedList
	Map<String, List<TaskData>> taskMap = new HashMap
	Map<String, DirectVarData> directMap = new HashMap
	
	protected def String generateInclude()
	protected def String generateGlobalVars()
	protected def String generateInitTimeControl()
	protected def String generateTimeControlDefinition()
	protected def String generateTimeControlCall()
	protected def String parseDirectVar(DirectVarData varData)
	protected def String generateRead(String directVarName, int size, List<Integer> address, String assigmentVar)
	protected def String generateWrite(String directVarName, int size, List<Integer> address, String value)
	
	new(Resource resource) {
		val model = resource.allContents.toIterable.filter(Model).get(0)
		this.configuration = model.conf
		val programs = model.programs
		for (v : configuration.resources.get(0).resGlobVars) {
			globalVars.add(v)
			parseDirectVars(v.varsAs)
		}
		for (t : configuration.resources.get(0).resStatement.tasks) {
			taskMap.put(t.name, new LinkedList)
		}
		for (c : configuration.resources.get(0).resStatement.programConfs) {
			val programGenerator = new ProgramGenerator(programs.findFirst[name == c.program.name], c.name)
			taskMap.get(c.task.name).add(new TaskData)
			taskMap.get(c.task.name).last.name = c.name
			for (e : c.agrs.elements) {
				switch e.assig {
					case AssignmentType.IN : taskMap.get(c.task.name).last.inVars.add(e.globVar.name)
					case AssignmentType.OUT : taskMap.get(c.task.name).last.outVars.add(e.globVar.name)
				}
				programGenerator.addMapVar(e.programVar.name, e.globVar.name)
			}
			programList.add(programGenerator)
			
			if (c.task !== null) {
				taskMap.get(c.task.name).last.programCall = programGenerator.generateCall
			}
		}
	}
	
	def void generate(IFileSystemAccess2 fsa) {
		fsa.generateFile('''main.c''', generateMain)
		for (p : programList) {
			p.generate(fsa)
		}
	}
	
	private def String generateMain() '''
		«generateInclude»
		«FOR p : programList»
			#include "«p.generateFileName».h"
		«ENDFOR»
		
		«FOR t : configuration.resources.get(0).resStatement.tasks»
			#define «t.name.toUpperCase»_INTERVAL «getValue(t.init.interval)»;
		«ENDFOR»
		
		unsigned long «generateGlobalTimeName»;
		
		«generateGlobalVars»
		
		«globalVars.generate»
		
		«generateTimeControlDefinition»
		
		int main(int argc, char *argv[]) {
			//Set ports B, C for input and port C for output
			DDRB = 0xff;
			DDRC = 0xff;
			DDRD = 0;
			
			«generateInitTimeControl»
			
			//Time vars for tasks
			«FOR t : configuration.resources.get(0).resStatement.tasks»
				unsigned long «t.name.toLowerCase»_time;
			«ENDFOR»
			for (;;) {
				«generateGlobalTimeName» = «generateTimeControlCall»;
				«FOR t : configuration.resources.get(0).resStatement.tasks.sortWith([a,b | return a.init.priority - b.init.priority])»
					«IF !taskMap.get(t.name).empty»
						if («t.name.toLowerCase»_time <= curtime) {
							«FOR p : taskMap.get(t.name)»
								//Program «p.name»
								«FOR in : p.inVars»
									«IF directMap.containsKey(in)»
										«generateRead(parseDirectVar(directMap.get(in)), directMap.get(in).size, directMap.get(in).address, in)»
									«ENDIF»
								«ENDFOR»
								«p.programCall»;
								«FOR out : p.outVars»
									«IF directMap.containsKey(out)»
										«generateWrite(parseDirectVar(directMap.get(out)), directMap.get(out).size, directMap.get(out).address, out)»
									«ENDIF»
								«ENDFOR»
								
							«ENDFOR»
							//Find next activation time
							«t.name.toLowerCase»_time = «generateGlobalTimeName» + «t.name.toUpperCase»_INTERVAL;
						}
					«ENDIF»
				«ENDFOR»
			}
			return 0;
		}
	'''
	
	private def void parseDirectVars(EList<GlobalVarInitDeclaration> list) {
		for (v : list) {
			val data = new DirectVarData(v.location)
			for (e : v.varList.vars) {
				directMap.put(e.name, data)
			}
		}
	}

}