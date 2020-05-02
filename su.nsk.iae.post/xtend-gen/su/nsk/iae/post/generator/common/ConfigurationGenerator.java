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
import su.nsk.iae.post.generator.common.vars.GlobalVarHelper;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.poST.Configuration;
import su.nsk.iae.post.poST.GlobalVarDeclaration;
import su.nsk.iae.post.poST.Model;
import su.nsk.iae.post.poST.Program;
import su.nsk.iae.post.poST.ProgramConfElement;
import su.nsk.iae.post.poST.ProgramConfiguration;
import su.nsk.iae.post.poST.Task;

@SuppressWarnings("all")
public class ConfigurationGenerator extends CommonGenerator {
  private Configuration configuration;
  
  private VarHelper globalVars = new GlobalVarHelper();
  
  private List<ProgramGenerator> programList = new LinkedList<ProgramGenerator>();
  
  private Map<String, List<String>> taskMap = new HashMap<String, List<String>>();
  
  public ConfigurationGenerator(final Resource resource) {
    final Model model = ((Model[])Conversions.unwrapArray((Iterables.<Model>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Model.class)), Model.class))[0];
    this.configuration = model.getConf();
    final EList<Program> programs = model.getPrograms();
    EList<GlobalVarDeclaration> _resGlobVars = this.configuration.getResources().get(0).getResGlobVars();
    for (final GlobalVarDeclaration v : _resGlobVars) {
      this.globalVars.add(v);
    }
    EList<Task> _tasks = this.configuration.getResources().get(0).getResStatement().getTasks();
    for (final Task t : _tasks) {
      String _name = t.getName();
      LinkedList<String> _linkedList = new LinkedList<String>();
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
        EList<ProgramConfElement> _elements = c.getAgrs().getElements();
        for (final ProgramConfElement e : _elements) {
          programGenerator.addMapVar(e.getProgramVar().getName(), e.getGlobVar().getName());
        }
        this.programList.add(programGenerator);
        Task _task = c.getTask();
        boolean _tripleNotEquals = (_task != null);
        if (_tripleNotEquals) {
          this.taskMap.get(c.getTask().getName()).add(programGenerator.generateCall());
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
    _builder.append("#include <avr/io.h>");
    _builder.newLine();
    _builder.append("#include <avr/interrupt.h>");
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
    _builder.newLine();
    _builder.append("unsigned long ");
    String _generateGlobalTimeName = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    String _generate = this.globalVars.generate();
    _builder.append(_generate);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("//Timer interrupt handler");
    _builder.newLine();
    _builder.append("ISR(TIMER1_COMPA_vect) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("++___global_time;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("int main(int argc, char *argv[]) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Set ports B, C for input and port C for output");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DDRB = 0xff;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DDRC = 0xff;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("DDRD = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Set registers of timer 1 to zero");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TCCR1A = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TCCR1B = 0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Set CTC mode and match register");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TCCR1B |= (1 << WGM12);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("OCR1A = 16;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Set division factor to 1024");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TCCR1B |= (1 << CS10);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TCCR1B |= (1 << CS12);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Enable interrupt by coincidence");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("TIMSK1 |= (1 << OCIE1A);");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Enable interrupt");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("sei();");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//Time vars for tasks");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("unsigned long curtime;");
    _builder.newLine();
    {
      EList<Task> _tasks_1 = this.configuration.getResources().get(0).getResStatement().getTasks();
      for(final Task t_1 : _tasks_1) {
        _builder.append("\t");
        _builder.append("long ");
        String _lowerCase = t_1.getName().toLowerCase();
        _builder.append(_lowerCase, "\t");
        _builder.append("_time;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("for (;;) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("curtime = ___globaltime;");
    _builder.newLine();
    {
      final Comparator<Task> _function = (Task a, Task b) -> {
        int _priority = a.getInit().getPriority();
        int _priority_1 = b.getInit().getPriority();
        return (_priority - _priority_1);
      };
      List<Task> _sortWith = IterableExtensions.<Task>sortWith(this.configuration.getResources().get(0).getResStatement().getTasks(), _function);
      for(final Task t_2 : _sortWith) {
        _builder.append("\t\t");
        _builder.append("if (");
        String _lowerCase_1 = t_2.getName().toLowerCase();
        _builder.append(_lowerCase_1, "\t\t");
        _builder.append("_time <= curtime) {");
        _builder.newLineIfNotEmpty();
        {
          List<String> _get = this.taskMap.get(t_2.getName());
          for(final String p_1 : _get) {
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append(p_1, "\t\t\t");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        String _lowerCase_2 = t_2.getName().toLowerCase();
        _builder.append(_lowerCase_2, "\t\t\t");
        _builder.append("_time = curtime + ");
        String _upperCase_1 = t_2.getName().toUpperCase();
        _builder.append(_upperCase_1, "\t\t\t");
        _builder.append("_INTERVAL;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
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
}
