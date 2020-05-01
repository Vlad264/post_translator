package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.InputOutputVarDeclaration

class InputOutputVarHelper extends VarHelper {
	
	override add(EObject varDecl) {
		if (varDecl instanceof InputOutputVarDeclaration) {
			parseSimpleVar(varDecl.vars)
		}
	}
	
}