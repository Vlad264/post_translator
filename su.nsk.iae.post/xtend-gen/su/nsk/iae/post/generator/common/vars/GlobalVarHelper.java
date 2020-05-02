package su.nsk.iae.post.generator.common.vars;

import org.eclipse.emf.ecore.EObject;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.poST.GlobalVarDeclaration;

@SuppressWarnings("all")
public class GlobalVarHelper extends VarHelper {
  @Override
  public void add(final EObject varDecl) {
    if ((varDecl instanceof GlobalVarDeclaration)) {
      this.parseSimpleVar(((GlobalVarDeclaration)varDecl).getVarsSimple(), ((GlobalVarDeclaration)varDecl).isConst());
    }
  }
}
