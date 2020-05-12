package su.nsk.iae.post.generator.arduino;

import com.google.common.base.Objects;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import su.nsk.iae.post.generator.common.ResourceGenerator;
import su.nsk.iae.post.generator.common.vars.data.DirectVarData;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.Resource;

@SuppressWarnings("all")
public class ArduinoGenerator extends ResourceGenerator {
  public ArduinoGenerator(final Resource resource, final EList<Program> programs, final String path) {
    super(resource, programs, path);
    this.headerFileType = ".hh";
    this.codeFileType = ".cpp";
  }
  
  @Override
  protected String generateInclude() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include <avr/io.h> ");
    _builder.newLine();
    _builder.append("#include <avr/interrupt.h>");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String generateGlobalVars() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("static volatile unsigned long ovf_cnt = 0;");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String generateInit() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Set ports B, C for input and port C for output");
    _builder.newLine();
    _builder.append("DDRB = 0xff;");
    _builder.newLine();
    _builder.append("DDRC = 0xff;");
    _builder.newLine();
    _builder.append("DDRD = 0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("//Init timer0");
    _builder.newLine();
    _builder.append("TCCR0B = (1<<CS00) | (1 <<CS02); // /1024 prescaler");
    _builder.newLine();
    _builder.append("TIMSK0 = (1<<TOIE0); // overflow interrupt");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String generateTimeControlDefinition() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("unsigned long get_millis(void) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("unsigned char sreg = SREG;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("cli(); //start critical section");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("unsigned long ovf = ovf_cnt;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("unsigned long tcnt = TCNT0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("SREG = sreg; //end of critical section - no sei() needed");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Timer has already overflown, but interrupt has yet to execute");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if ((TIFR0 & _BV(TOV0)) && (tcnt < 255)) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("ovf++;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("unsigned long fract;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("const unsigned long mfcpu = F_CPU/1000; // 1000 -> milliseconds");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fract = ovf % mfcpu;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fract <<= (8UL + 10UL); //8 -> 256 timer, 10 -> 1024 prescaler");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fract /= mfcpu;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ovf /= mfcpu;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ovf <<= (8UL + 10UL);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ovf += fract;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return ovf + (tcnt << 10UL) / mfcpu;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("//Timer0 overflow interrupt handler");
    _builder.newLine();
    _builder.append("ISR(TIMER0_OVF_vect) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ovf_cnt++;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  @Override
  protected String generateTimeControlCall() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("get_millis()");
    return _builder.toString();
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
