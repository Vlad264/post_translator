package su.nsk.iae.post.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import su.nsk.iae.post.generator.arduino.ArduinoGenerator
import su.nsk.iae.post.generator.common.ResourceGenerator
import su.nsk.iae.post.poST.Model
import java.util.List
import java.util.LinkedList

class PoSTGenerator extends AbstractGenerator {
	
	List<ResourceGenerator> generators = new LinkedList
	
	override beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val model = resource.allContents.toIterable.filter(Model).get(0)
		for (res : model.conf.resources) {
			if (res.type.equals("PLC_ARDUINO")) {
				generators.add(new ArduinoGenerator(res, model.programs, '''«res.name.toLowerCase»/'''))
			}
		}
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (res : generators) {
			res.generate(fsa)
		}
	}
}
