package su.nsk.iae.post.generator;

import com.google.common.collect.Iterables;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import su.nsk.iae.post.generator.arduino.ArduinoGenerator;
import su.nsk.iae.post.generator.common.ResourceGenerator;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.Program;

@SuppressWarnings("all")
public class PoSTGenerator extends AbstractGenerator {
  private List<ResourceGenerator> generators = new LinkedList<ResourceGenerator>();
  
  @Override
  public void beforeGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Model model = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class)), Model.class))[0];
    EList<su.nsk.iae.post.poST.Resource> _resources = model.getConf().getResources();
    for (final su.nsk.iae.post.poST.Resource res : _resources) {
      boolean _equals = res.getType().equals("PLC_ARDUINO");
      if (_equals) {
        EList<Program> _programs = model.getPrograms();
        StringConcatenation _builder = new StringConcatenation();
        String _lowerCase = res.getName().toLowerCase();
        _builder.append(_lowerCase);
        _builder.append("/");
        ArduinoGenerator _arduinoGenerator = new ArduinoGenerator(res, _programs, _builder.toString());
        this.generators.add(_arduinoGenerator);
      }
    }
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    for (final ResourceGenerator res : this.generators) {
      res.generate(fsa);
    }
  }
}
