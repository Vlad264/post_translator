package su.nsk.iae.post.generator.common

import su.nsk.iae.post.poST.Constant
import su.nsk.iae.post.poST.IntegerLiteral
import su.nsk.iae.post.poST.RealLiteral
import su.nsk.iae.post.poST.TimeLiteral
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import su.nsk.iae.post.poST.SignedInteger

abstract class CommonGenerator {
	
	protected def String generateGlobalTimeName() {
		return '''global_time'''
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
		return '''�IF sInt.ISig�-�ENDIF��String.valueOf(sInt.value)�'''
	}
	
	protected static def long getTimeAsMilliseconds(String interval) {
		var str = interval.replaceAll("ms", "q")
		var res = 0;
		if (str.contains("d")) {
			res += Integer.valueOf(str.substring(0, str.indexOf("d"))) * 86400000
			str = str.substring(str.indexOf("d") + 1)
		}
		if (str.contains("h")) {
			res += Integer.valueOf(str.substring(0, str.indexOf("h"))) * 3600000
			str = str.substring(str.indexOf("h") + 1)
		}
		if (str.contains("m")) {
			res += Integer.valueOf(str.substring(0, str.indexOf("m"))) * 60000
			str = str.substring(str.indexOf("m") + 1)
		}
		if (str.contains("s")) {
			res += Integer.valueOf(str.substring(0, str.indexOf("s"))) * 1000
			str = str.substring(str.indexOf("s") + 1)
		}
		if (str.contains("q")) {
			res += Integer.valueOf(str.substring(0, str.indexOf("q")))
		}
		return res
	}
	
	protected def String getCType(String type) {
		switch(type) {
			case "SINT":
				return '''int8_t'''
			case "INT":
				return '''int16_t'''
			case "DINT":
				return '''int32_t'''
			case "LINT":
				return '''int64_t'''
			
			case "USINT":
				return '''uint8_t'''
			case "UINT":
				return '''uint16_t'''
			case "UDINT":
				return '''uint32_t'''
			case "ULINT":
				return '''uint64_t'''
			
			case "REAL":
				return '''float'''
			case "LREAL":
				return '''double'''
				
			case "BOOL":
				return '''bool'''
			case "BYTE":
				return '''uint8_t'''
			case "WORD":
				return '''uint16_t'''
			case "DWORD":
				return '''uint32_t'''
			case "LWORD":
				return '''uint64_t'''
				
			case "TIME":
				return "unsigned long"
			case "STRING":
				return '''char*'''
			case "WSTRING":
				return '''char*'''
		}
	}
}