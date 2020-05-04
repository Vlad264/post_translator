package su.nsk.iae.post.generator.common

import java.util.List
import java.util.LinkedList

class TaskData {
	
	String name
	String programCall
	List<String> inVars = new LinkedList
	List<String> outVars = new LinkedList
	
	def void setName(String name) {
		this.name = name
	}
	
	def String getName() {
		return name
	}
	
	def void setProgramCall(String programCall) {
		this.programCall = programCall
	}
	
	def String getProgramCall() {
		return programCall
	}
	
	def List<String> getInVars() {
		return inVars
	}
	
	def List<String> getOutVars() {
		return outVars
	}
}