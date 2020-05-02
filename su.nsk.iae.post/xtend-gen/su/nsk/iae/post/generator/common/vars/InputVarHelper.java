package su.nsk.iae.post.generator.common.vars;

import org.eclipse.emf.ecore.EObject;
import su.nsk.iae.post.generator.common.vars.VarHelper;
import su.nsk.iae.post.poST.InputVarDeclaration;

@SuppressWarnings("all")
public class InputVarHelper extends VarHelper {
  @Override
  public void add(final EObject varDecl) {
    if ((varDecl instanceof InputVarDeclaration)) {
      this.parseSimpleVar(((InputVarDeclaration)varDecl).getVars(), true);
    }
  }
}
