package su.nsk.iae.post.generator.common

import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.generator.IFileSystemAccess2
import su.nsk.iae.post.generator.common.vars.GlobalVarHelper
import su.nsk.iae.post.generator.common.vars.VarHelper
import su.nsk.iae.post.generator.common.vars.data.DirectVarData
import su.nsk.iae.post.poST.AssignmentType
import su.nsk.iae.post.poST.GlobalVarInitDeclaration
import su.nsk.iae.post.poST.Program
import su.nsk.iae.post.poST.Resource
import su.nsk.iae.post.poST.Task

abstract class ResourceGenerator extends CommonGenerator {
	
	Resource resource
	String path = ""
	
	VarHelper globalVars = new GlobalVarHelper
	List<ProgramGenerator> programList = new LinkedList
	Map<String, List<TaskData>> taskMap = new HashMap
	Map<String, DirectVarData> directMap = new HashMap
	protected String headerFileType = ".h"
	protected String codeFileType = ".c"
	
	protected def String generateInclude()
	protected def String generateGlobalVars()
	protected def String generateInit()
	protected def String generateTimeControlDefinition()
	protected def String generateTimeControlCall()
	protected def String parseDirectVar(DirectVarData varData)
	protected def String generateRead(String directVarName, int size, List<Integer> address, String assigmentVar)
	protected def String generateWrite(String directVarName, int size, List<Integer> address, String value)
	
	new(Resource resource, EList<Program> programs, String path) {
		this.resource = resource
		this.path = path
		for (v : resource.resGlobVars) {
			globalVars.add(v)
			parseDirectVars(v.varsAs)
		}
		for (t : resource.resStatement.tasks) {
			taskMap.put(t.name, new LinkedList)
		}
		for (c : resource.resStatement.programConfs) {
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
		fsa.generateFile('''�path�main�codeFileType�''', generateMain)
		for (p : programList) {
			p.generate(fsa, path, headerFileType, codeFileType)
		}
	}
	
	private def String generateMain() '''
		�generateInclude�
		#include <stdint.h>
		#include <stdbool.h>
		�FOR p : programList�
			#include "�p.generateFileName��headerFileType�"
		�ENDFOR�
		
		�FOR t : resource.resStatement.tasks�
			�IF (getValue(t.init.interval) != "0") && (!taskMap.get(t.name).empty)�
				#define �t.name.toUpperCase�_INTERVAL �getValue(t.init.interval)�;
			�ENDIF�
		�ENDFOR�
		
		unsigned long �generateGlobalTimeName�;
		
		�generateGlobalVars�
		
		�globalVars.generate�
		
		�generateTimeControlDefinition�
		
		int main(int argc, char *argv[]) {
			�generateInit�
			
			//Time vars for tasks
			�FOR t : resource.resStatement.tasks�
				�IF (getValue(t.init.interval) != "0") && (!taskMap.get(t.name).empty)�
					unsigned long �t.name.toLowerCase�_time = 0;
				�ENDIF�
			�ENDFOR�
			for (;;) {
				�generateGlobalTimeName� = �generateTimeControlCall�;
				�FOR t : resource.resStatement.tasks.sortWith([a,b | return a.init.priority - b.init.priority])�
					�IF !taskMap.get(t.name).empty�
						
						//Task �t.name�
						�IF getValue(t.init.interval) != "0"�
							if (�t.name.toLowerCase�_time <= �generateGlobalTimeName�) {
								�t.generateTask�
								//Find next activation time
								�t.name.toLowerCase�_time = �generateGlobalTimeName� + �t.name.toUpperCase�_INTERVAL;
							}
						�ELSE�
							�t.generateTask�
						�ENDIF�
					�ENDIF�
				�ENDFOR�
			}
			return 0;
		}
	'''
	
	private def String generateTask(Task task) '''
		�FOR p : taskMap.get(task.name)�
			//Program �p.name�
			�FOR in : p.inVars�
				�IF directMap.containsKey(in)�
					�generateRead(parseDirectVar(directMap.get(in)), directMap.get(in).size, directMap.get(in).address, in)�
				�ENDIF�
			�ENDFOR�
			�p.programCall�;
			�FOR out : p.outVars�
				�IF directMap.containsKey(out)�
					�generateWrite(parseDirectVar(directMap.get(out)), directMap.get(out).size, directMap.get(out).address, out)�
				�ENDIF�
			�ENDFOR�
		�ENDFOR�
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