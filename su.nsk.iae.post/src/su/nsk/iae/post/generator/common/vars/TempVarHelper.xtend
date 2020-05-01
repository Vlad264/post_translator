package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.TempVarDeclaration

class TempVarHelper extends VarHelper {
	
	override add(EObject varDecl) {
		if (varDecl instanceof TempVarDeclaration) {
			parseSimpleVar(varDecl.vars)
		}
	}
	
}