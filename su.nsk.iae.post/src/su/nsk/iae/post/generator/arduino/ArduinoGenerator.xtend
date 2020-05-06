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
	
	override protected generateInclude() '''
		#include <avr/io.h> 
		#include <avr/interrupt.h>
	'''
	
	override protected generateGlobalVars() '''
		#define F_CPU 16000000UL
		static volatile unsigned long ovf_cnt = 0;
	'''
	
	override protected generateInitTimeControl() '''
		//Init timer0
		TCCR0 = (1<<CS00) | (1 <<CS02); // /1024 prescaler
		TIMSK = (1<<TOIE0); // overflow interrupt
	'''
	
	override protected generateTimeControlDefinition() '''	
		unsigned long get_millis(void) {
			unsigned char sreg = SREG;
			cli(); //start critical section
			unsigned long ovf = ovf_cnt;
			unsigned long tcnt = TCNT0;
			SREG = sreg; //end of critical section - no sei() needed
		
			//Timer has already overflown, but interrupt has yet to execute
			if ((TIFR & _BV(TOV0)) && (tcnt < 255)) {
				ovf++;
			}
		
			unsigned long fract;
			const unsigned long mfcpu = F_CPU/1000; // 1000 -> milliseconds
		
			fract = ovf % mfcpu;
			fract <<= (8UL + 10UL); //8 -> 256 timer, 10 -> 1024 prescaler
			fract /= mfcpu;
		
			ovf /= mfcpu;
			ovf <<= (8UL + 10UL);
			ovf += fract;
		
			return ovf + (tcnt << 10UL) / mfcpu;
		}
		
		//Timer0 overflow interrupt handler
		ISR(TIMER0_OVF_vect) {
			ovf_cnt++;
		}
	'''
	
	override protected generateTimeControlCall() {
		return '''get_millis()'''
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