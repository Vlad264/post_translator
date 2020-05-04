package su.nsk.iae.post.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import su.nsk.iae.post.generator.common.ConfigurationGenerator
import su.nsk.iae.post.generator.arduino.ArduinoGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class PoSTGenerator extends AbstractGenerator {
	
	ConfigurationGenerator generator
	
	override beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generator = new ArduinoGenerator(resource)
	}

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		generator.generate(fsa)
	}
}
