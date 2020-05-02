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

class ConfigurationGenerator extends CommonGenerator {
	
	Configuration configuration
	VarHelper globalVars = new GlobalVarHelper
	List<ProgramGenerator> programList = new LinkedList
	Map<String, List<String>> taskMap = new HashMap
	
	new(Resource resource) {
		val model = resource.allContents.toIterable.filter(Model).get(0)
		this.configuration = model.conf
		val programs = model.programs
		for (v : configuration.resources.get(0).resGlobVars) {
			globalVars.add(v)
		}
		for (t : configuration.resources.get(0).resStatement.tasks) {
			taskMap.put(t.name, new LinkedList)
		}
		for (c : configuration.resources.get(0).resStatement.programConfs) {
			val programGenerator = new ProgramGenerator(programs.findFirst[name == c.program.name], c.name)
			for (e : c.agrs.elements) {
				programGenerator.addMapVar(e.programVar.name, e.globVar.name)
			}
			programList.add(programGenerator)
			
			if (c.task !== null) {
				taskMap.get(c.task.name).add(programGenerator.generateCall)
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
		#include <avr/io.h>
		#include <avr/interrupt.h>
		«FOR p : programList»
			#include "«p.generateFileName».h"
		«ENDFOR»
		
		«FOR t : configuration.resources.get(0).resStatement.tasks»
			#define «t.name.toUpperCase»_INTERVAL «getValue(t.init.interval)»;
		«ENDFOR»
		
		unsigned long «generateGlobalTimeName»;
		
		«globalVars.generate»
		
		//Timer interrupt handler
		ISR(TIMER1_COMPA_vect) {
			++___global_time;
		}
		
		int main(int argc, char *argv[]) {
			//Set ports B, C for input and port C for output
			DDRB = 0xff;
			DDRC = 0xff;
			DDRD = 0;
			
			//Set registers of timer 1 to zero
			TCCR1A = 0;
			TCCR1B = 0;
			
			//Set CTC mode and match register
			TCCR1B |= (1 << WGM12);
			OCR1A = 16;
			
			//Set division factor to 1024
			TCCR1B |= (1 << CS10);
			TCCR1B |= (1 << CS12);
			
			//Enable interrupt by coincidence
			TIMSK1 |= (1 << OCIE1A);
			
			//Enable interrupt
			sei();
			
			//Time vars for tasks
			unsigned long curtime;
			«FOR t : configuration.resources.get(0).resStatement.tasks»
				long «t.name.toLowerCase»_time;
			«ENDFOR»
			for (;;) {
				curtime = ___globaltime;
				«FOR t : configuration.resources.get(0).resStatement.tasks.sortWith([a,b | return a.init.priority - b.init.priority])»
					if («t.name.toLowerCase»_time <= curtime) {
						«FOR p : taskMap.get(t.name)»
							«p»;
						«ENDFOR»
						«t.name.toLowerCase»_time = curtime + «t.name.toUpperCase»_INTERVAL;
					}
				«ENDFOR»
			}
			return 0;
		}
	'''

}