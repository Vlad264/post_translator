package su.nsk.iae.post.generator;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import su.nsk.iae.post.generator.arduino.ArduinoGenerator;
import su.nsk.iae.post.generator.common.ConfigurationGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class PoSTGenerator extends AbstractGenerator {
  private ConfigurationGenerator generator;
  
  @Override
  public void beforeGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    ArduinoGenerator _arduinoGenerator = new ArduinoGenerator(resource);
    this.generator = _arduinoGenerator;
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.generator.generate(fsa);
  }
}
