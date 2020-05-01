package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.InputVarDeclaration

class InputVarHelper extends VarHelper {
	
	override add(EObject varDecl) {
		if (varDecl instanceof InputVarDeclaration) {
			parseSimpleVar(varDecl.vars, true)
		}
	}
	
}