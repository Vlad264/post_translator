package su.nsk.iae.post.generator.common

import su.nsk.iae.post.generator.common.vars.VarHelper
import su.nsk.iae.post.generator.common.vars.InputVarHelper
import su.nsk.iae.post.generator.common.vars.OutputVarHelper
import su.nsk.iae.post.generator.common.vars.InputOutputVarHelper
import su.nsk.iae.post.generator.common.vars.ExternalVarHelper
import su.nsk.iae.post.generator.common.vars.SimpleVarHelper
import su.nsk.iae.post.generator.common.vars.TempVarHelper
import su.nsk.iae.post.poST.Program
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.HashMap

class ProgramGenerator extends CommonGenerator {
	
	Program program
	String taskName
	
	VarHelper inVarList = new InputVarHelper
	VarHelper outVarList = new OutputVarHelper
	VarHelper inOutVarList = new InputOutputVarHelper
	VarHelper externalVarList = new ExternalVarHelper
	VarHelper varList = new SimpleVarHelper
	VarHelper tempVarList = new TempVarHelper
	Map<String, String> mapVars = new HashMap
	
	List<ProcessGenerator> processList = new LinkedList
	
	new(Program program, String taskName) {
		this.program = program
		this.taskName = taskName.toLowerCase
		
		varList.namePrefix = generateProgramPrefix
		tempVarList.namePrefix = generateProgramPrefix
		for (v : program.progInVars) {
			inVarList.add(v)
		}
		for (v : program.progOutVars) {
			outVarList.add(v)
		}
		for (v : program.progInOutVars) {
			inOutVarList.add(v)
		}
		for (v : program.progExternVars) {
			externalVarList.add(v)
		}
		for (v : program.progVars) {
			varList.add(v)
		}
		for (v : program.progTempVars) {
			tempVarList.add(v)
		}
		
		for (p: program.processes) {
			processList.add(new ProcessGenerator(this, p))
		}
	}
	
	def void addMapVar(String key, String value) {
		mapVars.put(key, value)
	}
	
	def String generateProgramVar(String name) {
		if (inVarList.contains(name) || 
			outVarList.contains(name) || 
			inOutVarList.contains(name) ||
			externalVarList.contains(name)
		) {
			return '''«generateProgramPrefix.toUpperCase»«name.toUpperCase»'''
		}
		return '''«generateProgramPrefix»«name»'''
	}
	
	def void generate(IFileSystemAccess2 fsa) {
		fsa.generateFile('''«generateFileName».h''', generateH)
		fsa.generateFile('''«generateFileName».c''', generateC)
	}
	
	def String generateCall() {
		return '''program_«taskName»()'''
	}
	
	def String generateFileName() {
		return '''«taskName»_«program.name.toLowerCase»'''
	}
	
	def String generateProcessEnum(String processName) {
		return processList.findFirst[name == processName].generateEnumName
	}
	
	private def String generateH() '''
		«generateDeclaration»;
	'''
	
	private def String generateC() '''
		#include <stdint.h>
		#include <stdbool.h>
		#include "«generateFileName».h"
		
		extern unsigned long «generateGlobalTimeName»;
		«FOR p : processList»
			static unsigned long «p.generateStartTime»;
		«ENDFOR»
		
		«FOR p : processList»
			«p.generateEnum(processList.indexOf(p))»
			
		«ENDFOR»
		
		//Input Vars
		«inVarList.generateExternVar»
		
		//Output Vars
		«outVarList.generateExternVar»
		
		//External Vars
		«externalVarList.generateExternVar»
		
		//Program Vars
		«varList.generate»
		
		//Processes Vars
		«FOR p : processList»
			«p.generateVars»
		«ENDFOR»
		
		«FOR p : processList»
			«p.generateInitDeclaration»;
		«ENDFOR»
		
		«generateDeclaration» {
			//Program Temp Vars
			«tempVarList.generate»
			
			//Processes Temp Vars
			«FOR p : processList»
				«p.generateTempVars»
			«ENDFOR»
			
			«FOR p : processList»
				«p.generateBody»
				
			«ENDFOR»
		}
		
		«FOR p : processList»
			«p.generateInitDefinition»
			
		«ENDFOR»
		
	'''
	
	private def String generateDeclaration() {
		return '''void program_«taskName»(void)'''
	}
	
	private def String generateProgramPrefix() {
		return '''program_'''
	}
	
	private def String generateExternVar(VarHelper varList) '''
		«FOR v : varList.list»
			«IF mapVars.containsKey(v.name)»
				extern «v.type» «mapVars.get(v.name)»;
				#define «generateProgramPrefix.toUpperCase»«v.name.toUpperCase» «mapVars.get(v.name)»
			«ELSE»
				extern «v.type» «v.name»;
				#define «generateProgramPrefix.toUpperCase»«v.name.toUpperCase» «v.name»
			«ENDIF»
		«ENDFOR»
	'''
}