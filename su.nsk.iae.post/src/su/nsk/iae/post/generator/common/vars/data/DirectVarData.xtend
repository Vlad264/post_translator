package su.nsk.iae.post.generator.common.vars.data

import java.util.List
import java.util.ArrayList

class DirectVarData {
	
	enum Type {
		INPUT,
		OUTPUT,
		MEMORY
	}
	
	Type type
	int size
	List<Integer> address
	
	new(String directStr) {
		var str = directStr.substring(1)
		parseType(str)
		str = str.substring(1)
		parseSize(str)
		str = str.substring(1)
		parseAddress(str)
	}
	
	new(Type type, int size, List<Integer> address) {
		this.type = type
		this.size = size
		this.address = address
	}
	
	def void setType(Type type) {
		this.type = type
	}
	
	def Type getType() {
		return type
	}
	
	def void setSize(int size) {
		this.size = size
	}
	
	def int getSize() {
		return size
	}
	
	def void setAddress(List<Integer> address) {
		this.address = address
	}
	
	def List<Integer> getAddress() {
		return address
	}
	
	private def void parseType(String str) {
		switch str {
			case str.startsWith("I") : type = Type.INPUT 
			case str.startsWith("Q") : type = Type.OUTPUT
			case str.startsWith("M") : type = Type.MEMORY
		}
	}
	
	private def void parseSize(String str) {
		switch str {
			case str.startsWith("X") : size = 1
			case str.startsWith("B") : size = 8
			case str.startsWith("W") : size = 16
			case str.startsWith("D") : size = 32
			case str.startsWith("L") : size = 64
		}
	}
	
	private def void parseAddress(String str) {
		val arr = str.split("\\.")
		address = new ArrayList
		for (s : arr) {
			address.add(Integer.valueOf(s))
		}
	}
	

}