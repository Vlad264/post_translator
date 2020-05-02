package su.nsk.iae.post.generator.common.vars;

import org.eclipse.emf.ecore.EObject;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.poST.TempVarDeclaration;

@SuppressWarnings("all")
public class TempVarHelper extends VarHelper {
  @Override
  public void add(final EObject varDecl) {
    if ((varDecl instanceof TempVarDeclaration)) {
      this.parseSimpleVar(((TempVarDeclaration)varDecl).getVars());
    }
  }
}
