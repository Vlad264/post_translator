package su.nsk.iae.post.generator.common.vars;

import com.google.common.base.Objects;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import su.nsk.iae.post.generator.common.CommonGenerator;
import su.nsk.iae.post.generator.common.vars.data.VarData;
import su.nsk.iae.post.poST.SymbolicVariable;
import su.nsk.iae.post.poST.VarInitDeclaration;

@SuppressWarnings("all")
public abstract class VarHelper extends CommonGenerator {
  protected enum VarType {
    STATIC,
    
    EXTERN,
    
    NONE;
  }
  
  protected VarHelper.VarType varCType = VarHelper.VarType.NONE;
  
  protected String namePrefix = "";
  
  protected List<VarData> listDecl = new LinkedList<VarData>();
  
  public abstract void add(final EObject varDecl);
  
  public String generate() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final VarData v : this.listDecl) {
        String _generateSingleDeclaration = this.generateSingleDeclaration(v);
        _builder.append(_generateSingleDeclaration);
        {
          String _value = v.getValue();
          boolean _tripleNotEquals = (_value != null);
          if (_tripleNotEquals) {
            _builder.append(" = ");
            String _value_1 = v.getValue();
            _builder.append(_value_1);
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateDeclaration() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final VarData v : this.listDecl) {
        String _generateSingleDeclaration = this.generateSingleDeclaration(v);
        _builder.append(_generateSingleDeclaration);
        {
          if (((v.getValue() != null) && v.isConst())) {
            _builder.append(" = ");
            String _value = v.getValue();
            _builder.append(_value);
          }
        }
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateDefinition() {
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final VarData v : this.listDecl) {
        {
          if (((v.getValue() != null) && (!v.isConst()))) {
            _builder.append(this.namePrefix);
            String _name = v.getName();
            _builder.append(_name);
            _builder.append(" = ");
            String _value = v.getValue();
            _builder.append(_value);
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  public void setNamePrefix(final String prefix) {
    this.namePrefix = prefix;
  }
  
  public List<VarData> getList() {
    return this.listDecl;
  }
  
  public boolean contains(final String name) {
    for (final VarData v : this.listDecl) {
      String _name = v.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  protected void parseSimpleVar(final EList<VarInitDeclaration> varList) {
    this.parseSimpleVar(varList, false);
  }
  
  protected void parseSimpleVar(final EList<VarInitDeclaration> varList, final boolean isConst) {
    for (final VarInitDeclaration v : varList) {
      {
        final String type = this.getCType(v.getSpec().getType());
        final String value = this.getValue(v.getSpec().getValue());
        EList<SymbolicVariable> _vars = v.getVarList().getVars();
        for (final SymbolicVariable e : _vars) {
          String _name = e.getName();
          VarData _varData = new VarData(_name, type, value, isConst);
          this.listDecl.add(_varData);
        }
      }
    }
  }
  
  protected String generateSingleDeclaration(final VarData data) {
    StringConcatenation _builder = new StringConcatenation();
    String _generatePrefix = this.generatePrefix();
    _builder.append(_generatePrefix);
    String _generateConst = this.generateConst(data);
    _builder.append(_generateConst);
    String _type = data.getType();
    _builder.append(_type);
    _builder.append(" ");
    _builder.append(this.namePrefix);
    String _name = data.getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  private String generatePrefix() {
    final VarHelper.VarType varCType = this.varCType;
    if (varCType != null) {
      switch (varCType) {
        case STATIC:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("static ");
          return _builder.toString();
        case EXTERN:
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("extern ");
          return _builder_1.toString();
        case NONE:
          StringConcatenation _builder_2 = new StringConcatenation();
          return _builder_2.toString();
        default:
          break;
      }
    }
    return null;
  }
  
  private String generateConst(final VarData data) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _isConst = data.isConst();
      if (_isConst) {
        _builder.append("const ");
      }
    }
    return _builder.toString();
  }
}
