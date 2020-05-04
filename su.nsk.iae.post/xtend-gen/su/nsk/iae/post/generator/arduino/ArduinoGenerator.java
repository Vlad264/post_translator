package su.nsk.iae.post.generator.arduino;

import com.google.common.base.Objects;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import su.nsk.iae.post.generator.common.ConfigurationGenerator;
import su.nsk.iae.post.generator.common.vars.data.DirectVarData;

@SuppressWarnings("all")
public class ArduinoGenerator extends ConfigurationGenerator {
  public ArduinoGenerator(final Resource resource) {
    super(resource);
  }
  
  @Override
  protected String parseDirectVar(final DirectVarData varData) {
    DirectVarData.Type _type = varData.getType();
    boolean _equals = Objects.equal(_type, DirectVarData.Type.INPUT);
    if (_equals) {
      Integer _get = varData.getAddress().get(0);
      boolean _equals_1 = ((_get).intValue() == 2);
      if (_equals_1) {
        return "PORTB";
      }
      return "PORTC";
    }
    return "PIND";
  }
  
  @Override
  protected String generateRead(final String directVarName, final int size, final List<Integer> address, final String assigmentVar) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((size == 1)) {
        _builder.append(assigmentVar);
        _builder.append(" = (");
        _builder.append(directVarName);
        _builder.append(" & ");
        String _generateBitMask = this.generateBitMask(size, (address.get(1)).intValue());
        _builder.append(_generateBitMask);
        _builder.append(") >> ");
        Integer _get = address.get(1);
        int _minus = ((_get).intValue() - 1);
        String _valueOf = String.valueOf(_minus);
        _builder.append(_valueOf);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append(assigmentVar);
        _builder.append(" = ");
        _builder.append(directVarName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  @Override
  protected String generateWrite(final String directVarName, final int size, final List<Integer> address, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((size == 1)) {
        _builder.append(directVarName);
        _builder.append(" &= !");
        String _generateBitMask = this.generateBitMask(size, (address.get(1)).intValue());
        _builder.append(_generateBitMask);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        _builder.append(directVarName);
        _builder.append(" |= (");
        _builder.append(value);
        _builder.append(" & ");
        String _generateBitMask_1 = this.generateBitMask(size, (address.get(1)).intValue());
        _builder.append(_generateBitMask_1);
        _builder.append(") << ");
        Integer _get = address.get(1);
        int _minus = ((_get).intValue() - 1);
        String _valueOf = String.valueOf(_minus);
        _builder.append(_valueOf);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      } else {
        _builder.append(directVarName);
        _builder.append(" = ");
        _builder.append(value);
        _builder.append(" & ");
        String _generateBitMask_2 = this.generateBitMask(8, 1);
        _builder.append(_generateBitMask_2);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String generateBitMask(final int size, final int address) {
    LinkedList<String> temp = new LinkedList<String>();
    IntegerRange _upTo = new IntegerRange(1, 8);
    for (final Integer i : _upTo) {
      if ((((i).intValue() >= address) && ((i).intValue() < (address + size)))) {
        temp.addFirst("1");
      } else {
        temp.addFirst("0");
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("0b");
    final Function1<String, String> _function = (String it) -> {
      return it;
    };
    String _join = IterableExtensions.join(ListExtensions.<String, String>map(temp, _function));
    _builder.append(_join);
    return _builder.toString();
  }
}
