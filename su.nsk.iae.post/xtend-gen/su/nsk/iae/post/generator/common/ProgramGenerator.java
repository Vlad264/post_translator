package su.nsk.iae.post.generator.common;

import com.google.common.base.Objects;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import su.nsk.iae.post.generator.common.CommonGenerator;
import su.nsk.iae.post.generator.common.ProcessGenerator;
import su.nsk.iae.post.generator.common.vars.ExternalVarHelper;
import su.nsk.iae.post.generator.common.vars.InputOutputVarHelper;
import su.nsk.iae.post.generator.common.vars.InputVarHelper;
import su.nsk.iae.post.generator.common.vars.OutputVarHelper;
import su.nsk.iae.post.generator.common.vars.SimpleVarHelper;
import su.nsk.iae.post.generator.common.vars.TempVarHelper;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.generator.common.vars.data.VarData;
import su.nsk.iae.post.poST.ExternalVarDeclaration;
import su.nsk.iae.post.poST.InputOutputVarDeclaration;
import su.nsk.iae.post.poST.InputVarDeclaration;
import su.nsk.iae.post.poST.OutputVarDeclaration;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.TempVarDeclaration;
import su.nsk.iae.post.poST.VarDeclaration;

@SuppressWarnings("all")
public class ProgramGenerator extends CommonGenerator {
  private Program program;
  
  private String taskName;
  
  private VarHelper inVarList = new InputVarHelper();
  
  private VarHelper outVarList = new OutputVarHelper();
  
  private VarHelper inOutVarList = new InputOutputVarHelper();
  
  private VarHelper externalVarList = new ExternalVarHelper();
  
  private VarHelper varList = new SimpleVarHelper();
  
  private VarHelper tempVarList = new TempVarHelper();
  
  private Map<String, String> mapVars = new HashMap<String, String>();
  
  private List<ProcessGenerator> processList = new LinkedList<ProcessGenerator>();
  
  public ProgramGenerator(final Program program, final String taskName) {
    EList<InputVarDeclaration> _progInVars = program.getProgInVars();
    for (final InputVarDeclaration v : _progInVars) {
      this.inVarList.add(v);
    }
    EList<OutputVarDeclaration> _progOutVars = program.getProgOutVars();
    for (final OutputVarDeclaration v_1 : _progOutVars) {
      this.outVarList.add(v_1);
    }
    EList<InputOutputVarDeclaration> _progInOutVars = program.getProgInOutVars();
    for (final InputOutputVarDeclaration v_2 : _progInOutVars) {
      this.inOutVarList.add(v_2);
    }
    EList<ExternalVarDeclaration> _progExternVars = program.getProgExternVars();
    for (final ExternalVarDeclaration v_3 : _progExternVars) {
      this.externalVarList.add(v_3);
    }
    EList<VarDeclaration> _progVars = program.getProgVars();
    for (final VarDeclaration v_4 : _progVars) {
      this.varList.add(v_4);
    }
    EList<TempVarDeclaration> _progTempVars = program.getProgTempVars();
    for (final TempVarDeclaration v_5 : _progTempVars) {
      this.tempVarList.add(v_5);
    }
    EList<su.nsk.iae.post.poST.Process> _processes = program.getProcesses();
    for (final su.nsk.iae.post.poST.Process p : _processes) {
      ProcessGenerator _processGenerator = new ProcessGenerator(this, p);
      this.processList.add(_processGenerator);
    }
    this.program = program;
    this.taskName = taskName.toLowerCase();
  }
  
  public void addMapVar(final String key, final String value) {
    this.mapVars.put(key, value);
  }
  
  public boolean containsInputOutputVar(final String name) {
    return ((this.inVarList.contains(name) || this.outVarList.contains(name)) || this.inOutVarList.contains(name));
  }
  
  public void generate(final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateFileName = this.generateFileName();
    _builder.append(_generateFileName);
    _builder.append(".h");
    fsa.generateFile(_builder.toString(), this.generateH());
    StringConcatenation _builder_1 = new StringConcatenation();
    String _generateFileName_1 = this.generateFileName();
    _builder_1.append(_generateFileName_1);
    _builder_1.append(".c");
    fsa.generateFile(_builder_1.toString(), this.generateC());
  }
  
  public String generateCall() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("program_");
    _builder.append(this.taskName);
    _builder.append("()");
    return _builder.toString();
  }
  
  public String generateFileName() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.taskName);
    _builder.append("_");
    String _lowerCase = this.program.getName().toLowerCase();
    _builder.append(_lowerCase);
    return _builder.toString();
  }
  
  public String generateProcessEnum(final String processName) {
    final Function1<ProcessGenerator, Boolean> _function = (ProcessGenerator it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, processName));
    };
    return IterableExtensions.<ProcessGenerator>findFirst(this.processList, _function).generateEnumName();
  }
  
  private String generateH() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateDeclaration = this.generateDeclaration();
    _builder.append(_generateDeclaration);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  private String generateC() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#include \"");
    String _generateFileName = this.generateFileName();
    _builder.append(_generateFileName);
    _builder.append(".h\"");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("extern unsigned long ");
    String _generateGlobalTimeName = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      for(final ProcessGenerator p : this.processList) {
        _builder.append("static unsigned long ");
        String _generateStartTime = p.generateStartTime();
        _builder.append(_generateStartTime);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final ProcessGenerator p_1 : this.processList) {
        String _generateEnum = p_1.generateEnum(this.processList.indexOf(p_1));
        _builder.append(_generateEnum);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("//Input Vars");
    _builder.newLine();
    String _generateInputOutputVar = this.generateInputOutputVar(this.inVarList);
    _builder.append(_generateInputOutputVar);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//Output Vars");
    _builder.newLine();
    String _generateInputOutputVar_1 = this.generateInputOutputVar(this.outVarList);
    _builder.append(_generateInputOutputVar_1);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//External Vars");
    _builder.newLine();
    String _generate = this.externalVarList.generate();
    _builder.append(_generate);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//Program Vars");
    _builder.newLine();
    String _generateDeclaration = this.varList.generateDeclaration();
    _builder.append(_generateDeclaration);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//Processes Vars");
    _builder.newLine();
    {
      for(final ProcessGenerator p_2 : this.processList) {
        String _generateVars = p_2.generateVars();
        _builder.append(_generateVars);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      for(final ProcessGenerator p_3 : this.processList) {
        String _generateInitDeclaration = p_3.generateInitDeclaration();
        _builder.append(_generateInitDeclaration);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    String _generateDeclaration_1 = this.generateDeclaration();
    _builder.append(_generateDeclaration_1);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("//Program Temp Vars");
    _builder.newLine();
    _builder.append("\t");
    String _generate_1 = this.tempVarList.generate();
    _builder.append(_generate_1, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Processes Temp Vars");
    _builder.newLine();
    {
      for(final ProcessGenerator p_4 : this.processList) {
        _builder.append("\t");
        String _generateTempVars = p_4.generateTempVars();
        _builder.append(_generateTempVars, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      for(final ProcessGenerator p_5 : this.processList) {
        _builder.append("\t");
        String _generateBody = p_5.generateBody();
        _builder.append(_generateBody, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      for(final ProcessGenerator p_6 : this.processList) {
        String _generateInitDefinition = p_6.generateInitDefinition();
        _builder.append(_generateInitDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("void program_");
    _builder.append(this.taskName);
    _builder.append("(void)");
    return _builder.toString();
  }
  
  private String generateInputOutputVar(final VarHelper varList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<VarData> _list = varList.getList();
      for(final VarData v : _list) {
        {
          boolean _containsKey = this.mapVars.containsKey(v.getName());
          if (_containsKey) {
            _builder.append("extern ");
            String _type = v.getType();
            _builder.append(_type);
            _builder.append(" ");
            String _get = this.mapVars.get(v.getName());
            _builder.append(_get);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.append("#define ");
            String _upperCase = v.getName().toUpperCase();
            _builder.append(_upperCase);
            _builder.append(" ");
            String _get_1 = this.mapVars.get(v.getName());
            _builder.append(_get_1);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
}
