package su.nsk.iae.post.generator.common

import su.nsk.iae.post.poST.Constant
import su.nsk.iae.post.poST.IntegerLiteral
import su.nsk.iae.post.poST.RealLiteral
import su.nsk.iae.post.poST.TimeLiteral
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import su.nsk.iae.post.poST.SignedInteger

abstract class CommonGenerator {
	
	protected def String generateGlobalTimeName() {
		return '''___global_time'''
	}
	
	protected def String getValue(Constant value) {
		if (value === null) {
			return null
		}
		if (value instanceof IntegerLiteral) {
			return getSignedInt(value.value)
		}
		if (value instanceof RealLiteral) {
			return NodeModelUtils.getNode(value).text.trim
		}
		if (value instanceof TimeLiteral) {
			return String.valueOf(getTimeAsMilliseconds(value.interval))
		}
		val b = NodeModelUtils.getNode(value).text.trim.toLowerCase
		if (b == 'true') {
			return '''1'''
		}
		return '''0'''
	}
	
	protected def String getSignedInt(SignedInteger sInt) {
		return '''«IF sInt.ISig»-«ENDIF»«String.valueOf(sInt.value)»'''
	}
	
	protected static def long getTimeAsMilliseconds(String interval) {
		
		return 0
	}
	
	protected def String getCType(String type) {
		switch(type) {
			case "SINT":
				return '''int'''
			case "INT":
				return '''int'''
			case "DINT":
				return '''int'''
			case "LINT":
				return '''int'''
			
			case "USINT":
				return '''unsigned int'''
			case "UINT":
				return '''unsigned int'''
			case "UDINT":
				return '''unsigned int'''
			case "ULINT":
				return '''unsigned int'''
			
			case "REAL":
				return '''float'''
			case "LREAL":
				return '''double'''
				
			case "BOOL":
				return '''bool'''
			case "BYTE":
				return '''byte'''
			case "WORD":
				return '''byte'''
			case "DWORD":
				return '''byte'''
			case "LWORD":
				return '''byte'''
				
			case "STRING":
				return '''char*'''
			case "WSTRING":
				return '''char*'''
		}
	}
}