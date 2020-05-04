package su.nsk.iae.post.generator.arduino

import su.nsk.iae.post.generator.common.ConfigurationGenerator
import org.eclipse.emf.ecore.resource.Resource
import su.nsk.iae.post.generator.common.vars.data.DirectVarData
import java.util.List
import java.util.LinkedList

class ArduinoGenerator extends ConfigurationGenerator {
	
	new(Resource resource) {
		super(resource)
	}
	
	override protected parseDirectVar(DirectVarData varData) {
		if (varData.type == DirectVarData.Type.INPUT) {
			if (varData.address.get(0) == 2) {
				return "PORTB"
			}
			return "PORTC"
		}
		return "PIND"
	}
	
	override protected generateRead(String directVarName, int size, List<Integer> address, String assigmentVar) '''
		«IF size == 1»
			«assigmentVar» = («directVarName» & «generateBitMask(size, address.get(1))») >> «String.valueOf(address.get(1) - 1)»;
		«ELSE»
			«assigmentVar» = «directVarName»;
		«ENDIF»
	'''
	
	override protected generateWrite(String directVarName, int size, List<Integer> address, String value) '''
		«IF size == 1»
			«directVarName» &= !«generateBitMask(size, address.get(1))»;
			«directVarName» |= («value» & «generateBitMask(size, address.get(1))») << «String.valueOf(address.get(1) - 1)»;
		«ELSE»
			«directVarName» = «value» & «generateBitMask(8, 1)»;
		«ENDIF»
	'''
	
	private def String generateBitMask(int size, int address) {
		var temp = new LinkedList<String>
		for (i : 1..8) {
			if ((i >= address) && (i < address + size)) {
				temp.addFirst("1")
			} else {
				temp.addFirst("0")
			}
			
		}
		return '''0b«temp.map[it].join»'''
	}
	
}