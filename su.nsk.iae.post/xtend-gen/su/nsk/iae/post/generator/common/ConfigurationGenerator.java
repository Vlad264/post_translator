package su.nsk.iae.post.generator.common;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import su.nsk.iae.post.generator.common.CommonGenerator;
import su.nsk.iae.post.generator.common.ProgramGenerator;
import su.nsk.iae.post.generator.common.TaskData;
import su.nsk.iae.post.generator.common.vars.GlobalVarHelper;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.generator.common.vars.data.DirectVarData;
import su.nsk.iae.post.poST.AssignmentType;
import su.nsk.iae.post.poST.Configuration;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.GlobalVarInitDeclaration;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.ProgramConfElement;
import su.nsk.iae.post.poST.ProgramConfiguration;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.Task;

@SuppressWarnings("all")
public abstract class ConfigurationGenerator extends CommonGenerator {
  private Configuration configuration;
  
  private VarHelper globalVars = new GlobalVarHelper();
  
  private List<ProgramGenerator> programList = new LinkedList<ProgramGenerator>();
  
  private Map<String, List<TaskData>> taskMap = new HashMap<String, List<TaskData>>();
  
  private Map<String, DirectVarData> directMap = new HashMap<String, DirectVarData>();
  
  protected abstract String generateInclude();
  
  protected abstract String generateGlobalVars();
  
  protected abstract String generateInit();
  
  protected abstract String generateTimeControlDefinition();
  
  protected abstract String generateTimeControlCall();
  
  protected abstract String parseDirectVar(final DirectVarData varData);
  
  protected abstract String generateRead(final String directVarName, final int size, final List<Integer> address, final String assigmentVar);
  
  protected abstract String generateWrite(final String directVarName, final int size, final List<Integer> address, final String value);
  
  public ConfigurationGenerator(final Resource resource) {
    final Model model = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class)), Model.class))[0];
    this.configuration = model.getConf();
    final EList<Program> programs = model.getPrograms();
    EList<GlobalVarDeclaration> _resGlobVars = this.configuration.getResources().get(0).getResGlobVars();
    for (final GlobalVarDeclaration v : _resGlobVars) {
      {
        this.globalVars.add(v);
        this.parseDirectVars(v.getVarsAs());
      }
    }
    EList<Task> _tasks = this.configuration.getResources().get(0).getResStatement().getTasks();
    for (final Task t : _tasks) {
      String _name = t.getName();
      LinkedList<TaskData> _linkedList = new LinkedList<TaskData>();
      this.taskMap.put(_name, _linkedList);
    }
    EList<ProgramConfiguration> _programConfs = this.configuration.getResources().get(0).getResStatement().getProgramConfs();
    for (final ProgramConfiguration c : _programConfs) {
      {
        final Function1<Program, Boolean> _function = (Program it) -> {
          String _name_1 = it.getName();
          String _name_2 = c.getProgram().getName();
          return Boolean.valueOf(Objects.equal(_name_1, _name_2));
        };
        Program _findFirst = IterableExtensions.<Program>findFirst(programs, _function);
        String _name_1 = c.getName();
        final ProgramGenerator programGenerator = new ProgramGenerator(_findFirst, _name_1);
        List<TaskData> _get = this.taskMap.get(c.getTask().getName());
        TaskData _taskData = new TaskData();
        _get.add(_taskData);
        TaskData _last = IterableExtensions.<TaskData>last(this.taskMap.get(c.getTask().getName()));
        _last.setName(c.getName());
        EList<ProgramConfElement> _elements = c.getAgrs().getElements();
        for (final ProgramConfElement e : _elements) {
          {
            AssignmentType _assig = e.getAssig();
            if (_assig != null) {
              switch (_assig) {
                case IN:
                  IterableExtensions.<TaskData>last(this.taskMap.get(c.getTask().getName())).getInVars().add(e.getGlobVar().getName());
                  break;
                case OUT:
                  IterableExtensions.<TaskData>last(this.taskMap.get(c.getTask().getName())).getOutVars().add(e.getGlobVar().getName());
                  break;
                default:
                  break;
              }
            }
            programGenerator.addMapVar(e.getProgramVar().getName(), e.getGlobVar().getName());
          }
        }
        this.programList.add(programGenerator);
        Task _task = c.getTask();
        boolean _tripleNotEquals = (_task != null);
        if (_tripleNotEquals) {
          TaskData _last_1 = IterableExtensions.<TaskData>last(this.taskMap.get(c.getTask().getName()));
          _last_1.setProgramCall(programGenerator.generateCall());
        }
      }
    }
  }
  
  public void generate(final IFileSystemAccess2 fsa) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("main.c");
    fsa.generateFile(_builder.toString(), this.generateMain());
    for (final ProgramGenerator p : this.programList) {
      p.generate(fsa);
    }
  }
  
  private String generateMain() {
    StringConcatenation _builder = new StringConcatenation();
    String _generateInclude = this.generateInclude();
    _builder.append(_generateInclude);
    _builder.newLineIfNotEmpty();
    _builder.append("#include <stdint.h>");
    _builder.newLine();
    _builder.append("#include <stdbool.h>");
    _builder.newLine();
    {
      for(final ProgramGenerator p : this.programList) {
        _builder.append("#include \"");
        String _generateFileName = p.generateFileName();
        _builder.append(_generateFileName);
        _builder.append(".h\"");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      EList<Task> _tasks = this.configuration.getResources().get(0).getResStatement().getTasks();
      for(final Task t : _tasks) {
        {
          if (((!Objects.equal(this.getValue(t.getInit().getInterval()), "0")) && (!this.taskMap.get(t.getName()).isEmpty()))) {
            _builder.append("#define ");
            String _upperCase = t.getName().toUpperCase();
            _builder.append(_upperCase);
            _builder.append("_INTERVAL ");
            String _value = this.getValue(t.getInit().getInterval());
            _builder.append(_value);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    _builder.append("unsigned long ");
    String _generateGlobalTimeName = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateGlobalVars = this.generateGlobalVars();
    _builder.append(_generateGlobalVars);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generate = this.globalVars.generate();
    _builder.append(_generate);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generateTimeControlDefinition = this.generateTimeControlDefinition();
    _builder.append(_generateTimeControlDefinition);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("int main(int argc, char *argv[]) {");
    _builder.newLine();
    _builder.append("\t");
    String _generateInit = this.generateInit();
    _builder.append(_generateInit, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Time vars for tasks");
    _builder.newLine();
    {
      EList<Task> _tasks_1 = this.configuration.getResources().get(0).getResStatement().getTasks();
      for(final Task t_1 : _tasks_1) {
        {
          if (((!Objects.equal(this.getValue(t_1.getInit().getInterval()), "0")) && (!this.taskMap.get(t_1.getName()).isEmpty()))) {
            _builder.append("\t");
            _builder.append("unsigned long ");
            String _lowerCase = t_1.getName().toLowerCase();
            _builder.append(_lowerCase, "\t");
            _builder.append("_time;");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("for (;;) {");
    _builder.newLine();
    _builder.append("\t\t");
    String _generateGlobalTimeName_1 = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName_1, "\t\t");
    _builder.append(" = ");
    String _generateTimeControlCall = this.generateTimeControlCall();
    _builder.append(_generateTimeControlCall, "\t\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    {
      final Comparator<Task> _function = (Task a, Task b) -> {
        int _priority = a.getInit().getPriority();
        int _priority_1 = b.getInit().getPriority();
        return (_priority - _priority_1);
      };
      List<Task> _sortWith = IterableExtensions.<Task>sortWith(this.configuration.getResources().get(0).getResStatement().getTasks(), _function);
      for(final Task t_2 : _sortWith) {
        {
          boolean _isEmpty = this.taskMap.get(t_2.getName()).isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            _builder.append("\t\t");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("//Task ");
            String _name = t_2.getName();
            _builder.append(_name, "\t\t");
            _builder.newLineIfNotEmpty();
            {
              String _value_1 = this.getValue(t_2.getInit().getInterval());
              boolean _notEquals = (!Objects.equal(_value_1, "0"));
              if (_notEquals) {
                _builder.append("\t\t");
                _builder.append("if (");
                String _lowerCase_1 = t_2.getName().toLowerCase();
                _builder.append(_lowerCase_1, "\t\t");
                _builder.append("_time <= curtime) {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                String _generateTask = this.generateTask(t_2);
                _builder.append(_generateTask, "\t\t\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("//Find next activation time");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                String _lowerCase_2 = t_2.getName().toLowerCase();
                _builder.append(_lowerCase_2, "\t\t\t");
                _builder.append("_time = ");
                String _generateGlobalTimeName_2 = this.generateGlobalTimeName();
                _builder.append(_generateGlobalTimeName_2, "\t\t\t");
                _builder.append(" + ");
                String _upperCase_1 = t_2.getName().toUpperCase();
                _builder.append(_upperCase_1, "\t\t\t");
                _builder.append("_INTERVAL;");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("}");
                _builder.newLine();
              } else {
                _builder.append("\t\t");
                String _generateTask_1 = this.generateTask(t_2);
                _builder.append(_generateTask_1, "\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return 0;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateTask(final Task task) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<TaskData> _get = this.taskMap.get(task.getName());
      for(final TaskData p : _get) {
        _builder.append("//Program ");
        String _name = p.getName();
        _builder.append(_name);
        _builder.newLineIfNotEmpty();
        {
          List<String> _inVars = p.getInVars();
          for(final String in : _inVars) {
            {
              boolean _containsKey = this.directMap.containsKey(in);
              if (_containsKey) {
                String _generateRead = this.generateRead(this.parseDirectVar(this.directMap.get(in)), this.directMap.get(in).getSize(), this.directMap.get(in).getAddress(), in);
                _builder.append(_generateRead);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
        String _programCall = p.getProgramCall();
        _builder.append(_programCall);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        {
          List<String> _outVars = p.getOutVars();
          for(final String out : _outVars) {
            {
              boolean _containsKey_1 = this.directMap.containsKey(out);
              if (_containsKey_1) {
                String _generateWrite = this.generateWrite(this.parseDirectVar(this.directMap.get(out)), this.directMap.get(out).getSize(), this.directMap.get(out).getAddress(), out);
                _builder.append(_generateWrite);
                _builder.newLineIfNotEmpty();
              }
            }
          }
        }
      }
    }
    return _builder.toString();
  }
  
  private void parseDirectVars(final EList<GlobalVarInitDeclaration> list) {
    for (final GlobalVarInitDeclaration v : list) {
      {
        String _location = v.getLocation();
        final DirectVarData data = new DirectVarData(_location);
        EList<SymbolicVariable> _vars = v.getVarList().getVars();
        for (final SymbolicVariable e : _vars) {
          this.directMap.put(e.getName(), data);
        }
      }
    }
  }
}
