package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.OutputVarDeclaration

class OutputVarHelper extends VarHelper {
	
	override add(EObject varDecl) {
		if (varDecl instanceof OutputVarDeclaration) {
			parseSimpleVar(varDecl.vars)
		}
	}
}