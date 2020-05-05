package su.nsk.iae.post.generator.common.vars

import org.eclipse.emf.ecore.EObject
import su.nsk.iae.post.poST.ExternalVarDeclaration
import org.eclipse.emf.common.util.EList
import su.nsk.iae.post.poST.ExternalVarInitDeclaration
import su.nsk.iae.post.generator.common.vars.data.VarData
import su.nsk.iae.post.generator.common.vars.VarHelper.VarType

class ExternalVarHelper extends VarHelper {
	
	new() {
		varCType = VarType.EXTERN
	}
	
	override add(EObject varDecl) {
		if (varDecl instanceof ExternalVarDeclaration) {
			parseExternVar(varDecl.vars, varDecl.const)
		}
	}
	
	private def void parseExternVar(EList<ExternalVarInitDeclaration> varList, boolean isConst) {
		for (v : varList) {
			val type = getCType(v.type)
			for (e : v.varList.vars) {
				listDecl.add(new VarData(e.name, type, null, isConst))
			}
		}
	}
	
}