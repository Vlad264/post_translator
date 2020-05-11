package su.nsk.iae.post.generator.common;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import su.nsk.iae.post.generator.common.CommonGenerator;
import su.nsk.iae.post.generator.common.ProcessGenerator;
import su.nsk.iae.post.generator.common.ProgramGenerator;
import su.nsk.iae.post.poST.AddExpression;
import su.nsk.iae.post.poST.AddOperator;
import su.nsk.iae.post.poST.AndExpression;
import su.nsk.iae.post.poST.AssignmentStatement;
import su.nsk.iae.post.poST.CaseElement;
import su.nsk.iae.post.poST.CaseStatement;
import su.nsk.iae.post.poST.CompExpression;
import su.nsk.iae.post.poST.CompOperator;
import su.nsk.iae.post.poST.Constant;
import su.nsk.iae.post.poST.EquExpression;
import su.nsk.iae.post.poST.EquOperator;
import su.nsk.iae.post.poST.ErrorProcessStatement;
import su.nsk.iae.post.poST.Expression;
import su.nsk.iae.post.poST.ForStatement;
import su.nsk.iae.post.poST.IfStatement;
import su.nsk.iae.post.poST.MulExpression;
import su.nsk.iae.post.poST.MulOperator;
import su.nsk.iae.post.poST.PowerExpression;
import su.nsk.iae.post.poST.PrimaryExpression;
import su.nsk.iae.post.poST.ProcessStatusExpression;
import su.nsk.iae.post.poST.RepeatStatement;
import su.nsk.iae.post.poST.SetStateStatement;
import su.nsk.iae.post.poST.SignedInteger;
import su.nsk.iae.post.poST.StartProcessStatement;
import su.nsk.iae.post.poST.State;
import su.nsk.iae.post.poST.Statement;
import su.nsk.iae.post.poST.StatementList;
import su.nsk.iae.post.poST.StopProcessStatement;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.TimeoutStatement;
import su.nsk.iae.post.poST.UnaryExpression;
import su.nsk.iae.post.poST.WhileStatement;
import su.nsk.iae.post.poST.XorExpression;

@SuppressWarnings("all")
public class StateGenerator extends CommonGenerator {
  private ProgramGenerator program;
  
  private ProcessGenerator process;
  
  private State state;
  
  public StateGenerator(final ProgramGenerator program, final ProcessGenerator process, final State state) {
    this.program = program;
    this.process = process;
    this.state = state;
  }
  
  public String generateBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("case ");
    String _enumStateName = this.process.getEnumStateName(this.state.getName());
    _builder.append(_enumStateName);
    _builder.append(": {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateStatementList = this.generateStatementList(this.state.getStatement());
    _builder.append(_generateStatementList, "\t");
    _builder.newLineIfNotEmpty();
    {
      TimeoutStatement _timeout = this.state.getTimeout();
      boolean _tripleNotEquals = (_timeout != null);
      if (_tripleNotEquals) {
        _builder.append("\t");
        _builder.append("//Timeout statement");
        _builder.newLine();
        _builder.append("\t");
        String _generateTimeout = this.generateTimeout(this.state.getTimeout());
        _builder.append(_generateTimeout, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("break;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String getName() {
    return this.state.getName();
  }
  
  private String generateTimeout(final TimeoutStatement timeout) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if ((");
    String _generateGlobalTimeName = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName);
    _builder.append(" - ");
    String _generateStartTime = this.process.generateStartTime();
    _builder.append(_generateStartTime);
    _builder.append(") >= ");
    {
      Constant _const = timeout.getConst();
      boolean _tripleNotEquals = (_const != null);
      if (_tripleNotEquals) {
        String _value = this.getValue(timeout.getConst());
        _builder.append(_value);
      } else {
        String _generateVar = this.generateVar(timeout.getVariable());
        _builder.append(_generateVar);
      }
    }
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _generateStatementList = this.generateStatementList(timeout.getStatement());
    _builder.append(_generateStatementList, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateStatementList(final StatementList statementList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Statement> _statements = statementList.getStatements();
      for(final Statement s : _statements) {
        String _generateStatement = this.generateStatement(s);
        _builder.append(_generateStatement);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  private String generateStatement(final Statement s) {
    boolean _matched = false;
    if (s instanceof AssignmentStatement) {
      _matched=true;
      StringConcatenation _builder = new StringConcatenation();
      String _generateVar = this.generateVar(((AssignmentStatement)s).getVariable());
      _builder.append(_generateVar);
      _builder.append(" = ");
      String _generateExpression = this.generateExpression(((AssignmentStatement)s).getValue());
      _builder.append(_generateExpression);
      _builder.append(";");
      return _builder.toString();
    }
    if (!_matched) {
      if (s instanceof IfStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("if (");
        String _generateExpression = this.generateExpression(((IfStatement)s).getMainCond());
        _builder.append(_generateExpression);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateStatementList = this.generateStatementList(((IfStatement)s).getMainStatement());
        _builder.append(_generateStatementList, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("} ");
        _builder.newLine();
        {
          boolean _isEmpty = ((IfStatement)s).getElseIfCond().isEmpty();
          boolean _not = (!_isEmpty);
          if (_not) {
            {
              int _size = ((IfStatement)s).getElseIfCond().size();
              int _minus = (_size - 1);
              IntegerRange _upTo = new IntegerRange(0, _minus);
              for(final Integer i : _upTo) {
                _builder.append("else if (");
                String _generateExpression_1 = this.generateExpression(((IfStatement)s).getElseIfCond().get((i).intValue()));
                _builder.append(_generateExpression_1);
                _builder.append(") {");
                _builder.newLineIfNotEmpty();
                _builder.append("\t");
                String _generateStatementList_1 = this.generateStatementList(((IfStatement)s).getElseIfStatements().get((i).intValue()));
                _builder.append(_generateStatementList_1, "\t");
                _builder.newLineIfNotEmpty();
                _builder.append("}");
                _builder.newLine();
              }
            }
          }
        }
        {
          StatementList _elseStatement = ((IfStatement)s).getElseStatement();
          boolean _tripleNotEquals = (_elseStatement != null);
          if (_tripleNotEquals) {
            _builder.append("else {");
            _builder.newLine();
            _builder.append("\t");
            String _generateStatementList_2 = this.generateStatementList(((IfStatement)s).getElseStatement());
            _builder.append(_generateStatementList_2, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("}");
            _builder.newLine();
          }
        }
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof CaseStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("switch (");
        String _generateExpression = this.generateExpression(((CaseStatement)s).getCond());
        _builder.append(_generateExpression);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        {
          EList<CaseElement> _caseElements = ((CaseStatement)s).getCaseElements();
          for(final CaseElement e : _caseElements) {
            {
              EList<SignedInteger> _caseListElement = e.getCaseList().getCaseListElement();
              for(final SignedInteger c : _caseListElement) {
                _builder.append("\t");
                _builder.append("case ");
                String _signedInt = this.getSignedInt(c);
                _builder.append(_signedInt, "\t");
                _builder.append(":");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            String _generateStatementList = this.generateStatementList(e.getStatement());
            _builder.append(_generateStatementList, "\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("break;");
            _builder.newLine();
          }
        }
        {
          StatementList _elseStatement = ((CaseStatement)s).getElseStatement();
          boolean _tripleNotEquals = (_elseStatement != null);
          if (_tripleNotEquals) {
            _builder.append("\t");
            _builder.append("default:");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("\t");
            String _generateStatementList_1 = this.generateStatementList(((CaseStatement)s).getElseStatement());
            _builder.append(_generateStatementList_1, "\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("break;");
            _builder.newLine();
          }
        }
        _builder.append("}");
        _builder.newLine();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof ForStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("for (");
        String _generateVar = this.generateVar(((ForStatement)s).getVariable());
        _builder.append(_generateVar);
        _builder.append(" = ");
        String _generateExpression = this.generateExpression(((ForStatement)s).getForList().getStart());
        _builder.append(_generateExpression);
        _builder.append("; ");
        String _generateVar_1 = this.generateVar(((ForStatement)s).getVariable());
        _builder.append(_generateVar_1);
        _builder.append(" <= ");
        String _generateExpression_1 = this.generateExpression(((ForStatement)s).getForList().getEnd());
        _builder.append(_generateExpression_1);
        _builder.append("; ");
        {
          Expression _step = ((ForStatement)s).getForList().getStep();
          boolean _tripleEquals = (_step == null);
          if (_tripleEquals) {
            _builder.append("++");
            String _generateVar_2 = this.generateVar(((ForStatement)s).getVariable());
            _builder.append(_generateVar_2);
          } else {
            String _generateVar_3 = this.generateVar(((ForStatement)s).getVariable());
            _builder.append(_generateVar_3);
            _builder.append(" += ");
            String _generateExpression_2 = this.generateExpression(((ForStatement)s).getForList().getStep());
            _builder.append(_generateExpression_2);
          }
        }
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateStatementList = this.generateStatementList(((ForStatement)s).getStatement());
        _builder.append(_generateStatementList, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof WhileStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("while (");
        String _generateExpression = this.generateExpression(((WhileStatement)s).getCond());
        _builder.append(_generateExpression);
        _builder.append(") {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateStatementList = this.generateStatementList(((WhileStatement)s).getStatement());
        _builder.append(_generateStatementList, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof RepeatStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("do {");
        _builder.newLine();
        _builder.append("\t");
        String _generateStatementList = this.generateStatementList(((RepeatStatement)s).getStatement());
        _builder.append(_generateStatementList, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("} while (");
        String _generateExpression = this.generateExpression(((RepeatStatement)s).getCond());
        _builder.append(_generateExpression);
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof StartProcessStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateInitCall = this.process.generateInitCall();
        _builder.append(_generateInitCall);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        String _generateProcessEnum = this.program.generateProcessEnum(((StartProcessStatement)s).getProcess().getName());
        _builder.append(_generateProcessEnum);
        _builder.append(" = 0;");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof StopProcessStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        {
          su.nsk.iae.post.poST.Process _process = ((StopProcessStatement)s).getProcess();
          boolean _tripleNotEquals = (_process != null);
          if (_tripleNotEquals) {
            String _generateProcessEnum = this.program.generateProcessEnum(((StopProcessStatement)s).getProcess().getName());
            _builder.append(_generateProcessEnum);
          } else {
            String _generateEnumName = this.process.generateEnumName();
            _builder.append(_generateEnumName);
          }
        }
        _builder.append(" = STOP;");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof ErrorProcessStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        {
          su.nsk.iae.post.poST.Process _process = ((ErrorProcessStatement)s).getProcess();
          boolean _tripleNotEquals = (_process != null);
          if (_tripleNotEquals) {
            String _generateProcessEnum = this.program.generateProcessEnum(((ErrorProcessStatement)s).getProcess().getName());
            _builder.append(_generateProcessEnum);
          } else {
            String _generateEnumName = this.process.generateEnumName();
            _builder.append(_generateEnumName);
          }
        }
        _builder.append(" = ERROR;");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (s instanceof SetStateStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateEnumName = this.process.generateEnumName();
        _builder.append(_generateEnumName);
        _builder.append(" = ");
        {
          boolean _isNext = ((SetStateStatement)s).isNext();
          if (_isNext) {
            String _upperCase = this.process.getNextState(this).toUpperCase();
            _builder.append(_upperCase);
          } else {
            String _enumStateName = this.process.getEnumStateName(((SetStateStatement)s).getState().getName());
            _builder.append(_enumStateName);
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        String _generateStartTime = this.process.generateStartTime();
        _builder.append(_generateStartTime);
        _builder.append(" = ");
        String _generateGlobalTimeName = this.generateGlobalTimeName();
        _builder.append(_generateGlobalTimeName);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    String _generateStartTime = this.process.generateStartTime();
    _builder.append(_generateStartTime);
    _builder.append(" = ");
    String _generateGlobalTimeName = this.generateGlobalTimeName();
    _builder.append(_generateGlobalTimeName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("break;");
    _builder.newLine();
    return _builder.toString();
  }
  
  private String generateExpression(final Expression exp) {
    boolean _matched = false;
    if (exp instanceof PrimaryExpression) {
      _matched=true;
      Constant _const = ((PrimaryExpression)exp).getConst();
      boolean _tripleNotEquals = (_const != null);
      if (_tripleNotEquals) {
        return this.getValue(((PrimaryExpression)exp).getConst());
      } else {
        SymbolicVariable _variable = ((PrimaryExpression)exp).getVariable();
        boolean _tripleNotEquals_1 = (_variable != null);
        if (_tripleNotEquals_1) {
          return this.generateVar(((PrimaryExpression)exp).getVariable());
        } else {
          ProcessStatusExpression _procStatus = ((PrimaryExpression)exp).getProcStatus();
          boolean _tripleNotEquals_2 = (_procStatus != null);
          if (_tripleNotEquals_2) {
            StringConcatenation _builder = new StringConcatenation();
            String _generateProcessEnum = this.program.generateProcessEnum(((PrimaryExpression)exp).getProcStatus().getProcess().getName());
            _builder.append(_generateProcessEnum);
            _builder.append(" == ");
            {
              State _stateName = ((PrimaryExpression)exp).getProcStatus().getStateName();
              boolean _tripleNotEquals_3 = (_stateName != null);
              if (_tripleNotEquals_3) {
                String _upperCase = ((PrimaryExpression)exp).getProcStatus().getStateName().getName().toUpperCase();
                _builder.append(_upperCase);
              } else {
                boolean _isStop = ((PrimaryExpression)exp).getProcStatus().isStop();
                if (_isStop) {
                  _builder.append("STOP");
                } else {
                  _builder.append("ERROR");
                }
              }
            }
            return _builder.toString();
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("(");
            String _generateExpression = this.generateExpression(((PrimaryExpression)exp).getNestExpr());
            _builder_1.append(_generateExpression);
            _builder_1.append(")");
            return _builder_1.toString();
          }
        }
      }
    }
    if (!_matched) {
      if (exp instanceof UnaryExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("!");
        String _generateExpression = this.generateExpression(((UnaryExpression)exp).getRight());
        _builder.append(_generateExpression);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof PowerExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((PowerExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ** ");
        String _generateExpression_1 = this.generateExpression(((PowerExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof MulExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((MulExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ");
        String _generateMulOperators = this.generateMulOperators(((MulExpression)exp).getMulOp());
        _builder.append(_generateMulOperators);
        _builder.append(" ");
        String _generateExpression_1 = this.generateExpression(((MulExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof AddExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((AddExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ");
        {
          AddOperator _addOp = ((AddExpression)exp).getAddOp();
          boolean _equals = Objects.equal(_addOp, AddOperator.PLUS);
          if (_equals) {
            _builder.append("+");
          } else {
            _builder.append("-");
          }
        }
        _builder.append(" ");
        String _generateExpression_1 = this.generateExpression(((AddExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof EquExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((EquExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ");
        String _generateEquOperators = this.generateEquOperators(((EquExpression)exp).getEquOp());
        _builder.append(_generateEquOperators);
        _builder.append(" ");
        String _generateExpression_1 = this.generateExpression(((EquExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof CompExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((CompExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ");
        {
          CompOperator _compOp = ((CompExpression)exp).getCompOp();
          boolean _equals = Objects.equal(_compOp, CompOperator.EQUAL);
          if (_equals) {
            _builder.append("==");
          } else {
            _builder.append("!=");
          }
        }
        _builder.append(" ");
        String _generateExpression_1 = this.generateExpression(((CompExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof AndExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((AndExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" & ");
        String _generateExpression_1 = this.generateExpression(((AndExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof XorExpression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(((XorExpression)exp).getLeft());
        _builder.append(_generateExpression);
        _builder.append(" ^ ");
        String _generateExpression_1 = this.generateExpression(((XorExpression)exp).getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (exp instanceof Expression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _generateExpression = this.generateExpression(exp.getLeft());
        _builder.append(_generateExpression);
        _builder.append(" | ");
        String _generateExpression_1 = this.generateExpression(exp.getRight());
        _builder.append(_generateExpression_1);
        return _builder.toString();
      }
    }
    return null;
  }
  
  private String generateVar(final SymbolicVariable varName) {
    boolean _containsVar = this.process.containsVar(varName.getName());
    if (_containsVar) {
      StringConcatenation _builder = new StringConcatenation();
      String _generateProcessPrefix = this.process.generateProcessPrefix();
      _builder.append(_generateProcessPrefix);
      String _name = varName.getName();
      _builder.append(_name);
      return _builder.toString();
    }
    return this.program.generateProgramVar(varName.getName());
  }
  
  private String generateEquOperators(final EquOperator op) {
    if (op != null) {
      switch (op) {
        case LESS:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("<");
          return _builder.toString();
        case LESS_EQU:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("<=");
          return _builder_1.toString();
        case GREATER:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append(">");
          return _builder_2.toString();
        case GREATER_EQU:
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append(">=");
          return _builder_3.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  private String generateMulOperators(final MulOperator op) {
    if (op != null) {
      switch (op) {
        case MUL:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("*");
          return _builder.toString();
        case DIV:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("/");
          return _builder_1.toString();
        case MOD:
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("%");
          return _builder_2.toString();
        default:
          break;
      }
    }
    return null;
  }
}
