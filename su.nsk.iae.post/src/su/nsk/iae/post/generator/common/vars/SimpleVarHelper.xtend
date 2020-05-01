package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.VarDeclaration
import su.nsk.iae.post.generator.common.vars.VarHelper.VarType

class SimpleVarHelper extends VarHelper {
	
	new() {
		varCType = VarType.STATIC
	}
	
	override add(EObject varDecl) {
		if (varDecl instanceof VarDeclaration) {
			parseSimpleVar(varDecl.vars, varDecl.const)
		}
	}
	
}