package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.GlobalVarDeclaration

class GlobalVarHelper extends VarHelper {
	
	override add(EObject varDecl) {
		if (varDecl instanceof GlobalVarDeclaration) {
			parseSimpleVar(varDecl.varsSimple, varDecl.const)
		}
	}
	
}