package su.nsk.iae.post.generator.common

import java.util.LinkedList
import java.util.List
import su.nsk.iae.post.generator.common.vars.SimpleVarHelper
import su.nsk.iae.post.generator.common.vars.TempVarHelper
import su.nsk.iae.post.generator.common.vars.VarHelper
import su.nsk.iae.post.poST.Process

class ProcessGenerator {
	
	Process process
	
	VarHelper varList = new SimpleVarHelper
	VarHelper tempVarList = new TempVarHelper
	
	List<StateGenerator> stateList = new LinkedList
	
	new(ProgramGenerator program, Process process) {
		this.process = process
		
		varList.namePrefix = generateProcessPrefix
		tempVarList.namePrefix = generateProcessPrefix
		for (v : process.procVars) {
			varList.add(v)
		}
		for (v : process.procTempVars) {
			tempVarList.add(v)
		}
		
		for (s : process.states) {
			stateList.add(new StateGenerator(program, this, s))
		}
	}
	
	def String getName() {
		return process.name
	}
	
	def String generateProcessPrefix() {
		return '''process_�name�_'''
	}
	
	def boolean containsVar(String name) {
		return varList.contains(name) || tempVarList.contains(name)
	}
	
	def String getEnumStateName(String name) {
		return '''�this.name.toUpperCase�_�name.toUpperCase�'''
	}
	
	def String getNextState(StateGenerator state) {
		if (stateList.indexOf(state) + 1 < stateList.size) {
			return getEnumStateName(stateList.get(stateList.indexOf(state) + 1).name)
		}
		return getEnumStateName(stateList.get(0).name)
	}
	
	def String generateVars() '''
		�varList.generateDeclaration�
	'''
	
	def String generateTempVars() '''
		�tempVarList.generate�
	'''
	
	def String generateEnum(int index) '''
		//Process �process.name� enum
		static enum g_process_�name.toLowerCase�_state_enum_t {
			�FOR s : stateList�
				�s.name.enumStateName�,
			�ENDFOR�
		} �generateEnumName� = �IF index === 0��stateList.get(0).name.enumStateName��ELSE�STOP�ENDIF�;
	'''
	
	def String generateEnumName() {
		return '''g_process_�name.toLowerCase�_current_state'''
	}
	
	def String generateBody() '''
		//Process �process.name�
		switch(�generateEnumName�) {
			�FOR s : stateList�
				�s.generateBody�
			�ENDFOR�
			case STOP:
			case ERROR:
				break;
		}
	'''
	
	def String generateInitCall() {
		return '''init_process_�name�()'''
	}
	
	def String generateInitDeclaration() {
		return '''static void init_process_�name�(void)'''
	}
	
	def String generateInitDefinition() '''
		�generateInitDeclaration� {
			�varList.generateDefinition�
		}
	'''
	
	def String generateStartTime() {
		return '''g_process_�process.name.toLowerCase�_state_start_time'''
	}
	
}