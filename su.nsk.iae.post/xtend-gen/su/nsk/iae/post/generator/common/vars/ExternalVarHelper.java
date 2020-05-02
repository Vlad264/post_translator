package su.nsk.iae.post.generator.common.vars;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.generator.common.vars.data.VarData;
import su.nsk.iae.post.poST.ExternalVarDeclaration;
import su.nsk.iae.post.poST.ExternalVarInitDeclaration;
import su.nsk.iae.post.poST.SymbolicVariable;

@SuppressWarnings("all")
public class ExternalVarHelper extends VarHelper {
  public ExternalVarHelper() {
    this.varCType = VarHelper.VarType.EXTERN;
  }
  
  @Override
  public void add(final EObject varDecl) {
    if ((varDecl instanceof ExternalVarDeclaration)) {
      this.parseExternVar(((ExternalVarDeclaration)varDecl).getVars());
    }
  }
  
  private void parseExternVar(final EList<ExternalVarInitDeclaration> varList) {
    for (final ExternalVarInitDeclaration v : varList) {
      {
        final String type = this.getCType(v.getType());
        EList<SymbolicVariable> _vars = v.getVarList().getVars();
        for (final SymbolicVariable e : _vars) {
          String _name = e.getName();
          VarData _varData = new VarData(_name, type, null, false);
          this.listDecl.add(_varData);
        }
      }
    }
  }
}
