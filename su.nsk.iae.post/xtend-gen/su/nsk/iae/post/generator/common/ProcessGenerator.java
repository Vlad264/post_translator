package su.nsk.iae.post.generator.common;

import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import su.nsk.iae.post.generator.common.ProgramGenerator;
import su.nsk.iae.post.generator.common.StateGenerator;
import su.nsk.iae.post.generator.common.vars.SimpleVarHelper;
import su.nsk.iae.post.generator.common.vars.TempVarHelper;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.poST.State;
import su.nsk.iae.post.poST.TempVarDeclaration;
import su.nsk.iae.post.poST.VarDeclaration;

@SuppressWarnings("all")
public class ProcessGenerator {
  private ProgramGenerator program;
  
  private su.nsk.iae.post.poST.Process process;
  
  private VarHelper varList = new SimpleVarHelper();
  
  private VarHelper tempVarList = new TempVarHelper();
  
  private List<StateGenerator> stateList = new LinkedList<StateGenerator>();
  
  public ProcessGenerator(final ProgramGenerator program, final su.nsk.iae.post.poST.Process process) {
    this.program = program;
    this.process = process;
    this.varList.setNamePrefix(this.generateProcessPrefix());
    this.tempVarList.setNamePrefix(this.generateProcessPrefix());
    EList<VarDeclaration> _procVars = process.getProcVars();
    for (final VarDeclaration v : _procVars) {
      this.varList.add(v);
    }
    EList<TempVarDeclaration> _procTempVars = process.getProcTempVars();
    for (final TempVarDeclaration v_1 : _procTempVars) {
      this.tempVarList.add(v_1);
    }
    EList<State> _states = process.getStates();
    for (final State s : _states) {
      StateGenerator _stateGenerator = new StateGenerator(program, this, s);
      this.stateList.add(_stateGenerator);
    }
  }
  
  public String getName() {
    return this.process.getName();
  }
  
  public String generateProcessPrefix() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("___process_");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append("_");
    return _builder.toString();
  }
  
  public boolean containsVar(final String name) {
    return (this.varList.contains(name) || this.tempVarList.contains(name));
  }
  
  public String getNextState(final StateGenerator state) {
    int _indexOf = this.stateList.indexOf(state);
    int _plus = (_indexOf + 1);
    int _size = this.stateList.size();
    boolean _lessThan = (_plus < _size);
    if (_lessThan) {
      int _indexOf_1 = this.stateList.indexOf(state);
      int _plus_1 = (_indexOf_1 + 1);
      return this.stateList.get(_plus_1).getName();
    }
    return this.stateList.get(0).getName();
  }
  
  public String generateVars() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDeclaration = this.varList.generateDeclaration();
    _builder.append(_generateDeclaration);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateTempVars() {
    StringConcatenation _builder = new StringConcatenation();
    String _generate = this.tempVarList.generate();
    _builder.append(_generate);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateEnum(final int index) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Process ");
    String _name = this.process.getName();
    _builder.append(_name);
    _builder.append(" enum");
    _builder.newLineIfNotEmpty();
    _builder.append("enum ___process_");
    String _lowerCase = this.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_state_enum_t {");
    _builder.newLineIfNotEmpty();
    {
      for(final StateGenerator s : this.stateList) {
        _builder.append("\t");
        String _upperCase = s.getName().toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append(",");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("STOP = 254,");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ERROR = 255");
    _builder.newLine();
    _builder.append("} ");
    String _generateEnumName = this.generateEnumName();
    _builder.append(_generateEnumName);
    _builder.append(" = ");
    {
      if ((index == 0)) {
        String _upperCase_1 = this.stateList.get(0).getName().toUpperCase();
        _builder.append(_upperCase_1);
      } else {
        _builder.append("STOP");
      }
    }
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String generateEnumName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("___process_");
    String _lowerCase = this.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_current_state");
    return _builder.toString();
  }
  
  public String generateBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//Process ");
    String _name = this.process.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.append("switch(");
    String _generateEnumName = this.generateEnumName();
    _builder.append(_generateEnumName);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      for(final StateGenerator s : this.stateList) {
        _builder.append("\t");
        String _generateBody = s.generateBody();
        _builder.append(_generateBody, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("STOP:");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("ERROR:");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateInitCall() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("init_process_");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append("()");
    return _builder.toString();
  }
  
  public String generateInitDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void init_process_");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append("(void)");
    return _builder.toString();
  }
  
  public String generateInitDefinition() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateInitDeclaration = this.generateInitDeclaration();
    _builder.append(_generateInitDeclaration);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateDefinition = this.varList.generateDefinition();
    _builder.append(_generateDefinition, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateStartTime() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("___process_");
    String _lowerCase = this.process.getName().toLowerCase();
    _builder.append(_lowerCase);
    _builder.append("_state_start_time");
    return _builder.toString();
  }
}
