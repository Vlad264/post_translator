package su.nsk.iae.post.generator.common.vars

import su.nsk.iae.post.generator.common.CommonGenerator
import java.util.List
import su.nsk.iae.post.generator.common.vars.data.VarData
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import su.nsk.iae.post.poST.VarInitDeclaration
import org.eclipse.emf.ecore.EObject

abstract class VarHelper extends CommonGenerator {
	
	protected enum VarType {
		STATIC,
		EXTERN,
		NONE
	}
	
	protected VarType varCType = VarType.NONE;
	protected String namePrefix = ""
	protected List<VarData> listDecl = new LinkedList
	
	def void add(EObject varDecl)
	
	def String generate() '''
		«FOR v : listDecl»
			«v.generateSingleDeclaration»«IF v.value !== null» = «v.value»«ENDIF»;
		«ENDFOR»
	'''
	
	def String generateDeclaration() '''
		«FOR v : listDecl»
			«v.generateSingleDeclaration»«IF (v.value !== null) && v.isConst» = «v.value»«ENDIF»;
		«ENDFOR»
	'''
	
	def String generateDefinition() '''
		«FOR v : listDecl»
			«IF (v.value !== null) && !v.isConst»
				«namePrefix»«v.name» = «v.value»;
			«ENDIF»
		«ENDFOR»
	'''
	
	def void setNamePrefix(String prefix) {
		namePrefix = prefix
	}
	
	def getList() {
		return listDecl
	}
	
	def boolean contains(String name) {
		for (v : listDecl) {
			if (v.name == name) {
				return true
			}
		}
		return false
	}
	
	protected def void parseSimpleVar(EList<VarInitDeclaration> varList) {
		parseSimpleVar(varList, false)
	}
	
	protected def void parseSimpleVar(EList<VarInitDeclaration> varList, boolean isConst) {
		for (v : varList) {
			val type = getCType(v.spec.type)
			val value = getValue(v.spec.value);
			for (e : v.varList.vars) {
				listDecl.add(new VarData(e.name, type, value, isConst))
			}
		}
	}
	
	protected def String generateSingleDeclaration(VarData data) {
		return '''«generatePrefix»«data.generateConst»«data.type» «namePrefix»«data.name»'''
	}
	
	private def String generatePrefix() {
		switch(varCType) {
			case VarType.STATIC:
				return '''static '''
			case VarType.EXTERN:
				return '''extern '''
			case VarType.NONE:
				return ''''''
		}
	}
	
	private def String generateConst(VarData data) {
		return '''«IF data.isConst»const «ENDIF»'''
	}
}