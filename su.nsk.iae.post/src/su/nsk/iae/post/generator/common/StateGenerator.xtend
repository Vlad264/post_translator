package su.nsk.iae.post.generator.common

import su.nsk.iae.post.poST.State
import su.nsk.iae.post.poST.StatementList
import su.nsk.iae.post.poST.Statement
import su.nsk.iae.post.poST.Expression
import su.nsk.iae.post.poST.XorExpression
import su.nsk.iae.post.poST.AndExpression
import su.nsk.iae.post.poST.CompExpression
import su.nsk.iae.post.poST.EquExpression
import su.nsk.iae.post.poST.AddExpression
import su.nsk.iae.post.poST.MulExpression
import su.nsk.iae.post.poST.PowerExpression
import su.nsk.iae.post.poST.PrimaryExpression
import su.nsk.iae.post.poST.UnaryExpression
import su.nsk.iae.post.poST.EquOperator
import su.nsk.iae.post.poST.MulOperator
import su.nsk.iae.post.poST.AddOperator
import su.nsk.iae.post.poST.CompOperator
import su.nsk.iae.post.poST.SymbolicVariable
import su.nsk.iae.post.poST.AssignmentStatement
import su.nsk.iae.post.poST.IfStatement
import su.nsk.iae.post.poST.CaseStatement
import su.nsk.iae.post.poST.ForStatement
import su.nsk.iae.post.poST.WhileStatement
import su.nsk.iae.post.poST.RepeatStatement
import su.nsk.iae.post.poST.StartProcessStatement
import su.nsk.iae.post.poST.StopProcessStatement
import su.nsk.iae.post.poST.ErrorProcessStatement
import su.nsk.iae.post.poST.SetStateStatement

class StateGenerator extends CommonGenerator {
	
	ProgramGenerator program
	ProcessGenerator process
	State state
	
	new(ProgramGenerator program, ProcessGenerator process, State state) {
		this.program = program
		this.process = process
		this.state = state
	}
	
	def String generateBody() '''
		case «state.name.toUpperCase»: {
			«state.statement.generateStatementList»
			«IF state.timeout !== null»
				//Timeout statement
				«generateTimeout»
			«ENDIF»
		}
	'''
	
	def String getName() {
		return state.name
	}
	
	private def String generateTimeout() '''
	
	'''
	
	private def String generateStatementList(StatementList statementList) '''
		«FOR s : statementList.statements»
			«s.generateStatement»
		«ENDFOR»
	'''
	
	private def String generateStatement(Statement s) {
		switch s {
			AssignmentStatement:
				return '''«s.variable.generateVar» = «s.value.generateExpression»;'''
			IfStatement:
				return '''
					if («s.mainCond.generateExpression») {
						«s.mainStatement.generateStatementList»
					} 
					«IF !s.elseIfCond.empty»
						«FOR i : 0..(s.elseIfCond.size - 1)»
							else if («s.elseIfCond.get(i).generateExpression») {
								«s.elseIfStatements.get(i).generateStatementList»
							}
						«ENDFOR»
					«ENDIF»
					«IF s.elseStatement !== null»
						else {
							«s.elseStatement.generateStatementList»
						}
					«ENDIF»
				'''
			CaseStatement:
				return '''
					switch («s.cond.generateExpression») {
						«FOR e : s.caseElements»
							«FOR c : e.caseList.caseListElement»
								case «getSignedInt(c)»:
							«ENDFOR»
							«e.statement.generateStatementList»
							break;
						«ENDFOR»
						«IF s.elseStatement !== null»
							default:
								«s.elseStatement.generateStatementList»
								break;
						«ENDIF»
					}
				'''
			ForStatement:
				return '''
					for («s.variable.generateVar» = «s.forList.start.generateExpression»; «s.variable.generateVar» <= «s.forList.end.generateExpression»; «IF s.forList.step === null»++«s.variable.generateVar»«ELSE»«s.variable.generateVar» += «s.forList.step.generateExpression»«ENDIF») {
						«s.statement.generateStatementList»
					}
				'''
			WhileStatement:
				return '''
					while («s.cond.generateExpression») {
						«s.statement.generateStatementList»
					}
				'''
			RepeatStatement:
				return '''
					do {
						«s.statement.generateStatementList»
					} while («s.cond.generateExpression»);
				'''
			StartProcessStatement:
				return '''
					«process.generateInitCall»;
					«program.generateProcessEnum(s.process.name)» = 0;
				'''
			StopProcessStatement:
				return '''«IF s.process !== null»«program.generateProcessEnum(s.process.name)»«ELSE»«process.generateEnumName»«ENDIF» = STOP;'''
			ErrorProcessStatement:
				return '''«IF s.process !== null»«program.generateProcessEnum(s.process.name)»«ELSE»«process.generateEnumName»«ENDIF» = ERROR;'''
			SetStateStatement:
				return '''
					«process.generateEnumName» = «IF s.next»«process.getNextState(this).toUpperCase»«ELSE»«s.state.name.toUpperCase»«ENDIF»;
					«process.generateStartTime» = «generateGlobalTimeName»;
				'''
		}
		return '''
			«process.generateStartTime» = «generateGlobalTimeName»;
			break;
		'''
	}
	
	private def String generateExpression(Expression exp) {
		switch exp {
			PrimaryExpression: {
				if (exp.const !== null) {
					return getValue(exp.const)
				} else if (exp.variable !== null) {
					return exp.variable.generateVar
				} else if (exp.procStatus !== null) {
					return '''«program.generateProcessEnum(exp.procStatus.process.name)» == «IF exp.procStatus.stateName !== null»«exp.procStatus.stateName.name.toUpperCase»«ELSEIF exp.procStatus.stop»STOP«ELSE»ERROR«ENDIF»'''
				} else {
					return '''(«exp.nestExpr.generateExpression»)'''
				}
			}
			UnaryExpression:
				return '''«IF exp.unOp»!«ENDIF»«exp.right.generateExpression»'''
			PowerExpression:
				return '''«exp.left.generateExpression» ** «exp.right.generateExpression»'''
			MulExpression:
				return '''«exp.left.generateExpression» «exp.mulOp.generateMulOperators» «exp.right.generateExpression»'''
			AddExpression:
				return '''«exp.left.generateExpression» «IF exp.addOp == AddOperator.PLUS»+«ELSE»-«ENDIF» «exp.right.generateExpression»'''
			EquExpression:
				return '''«exp.left.generateExpression» «exp.equOp.generateEquOperators» «exp.right.generateExpression»'''
			CompExpression:
				return '''«exp.left.generateExpression» «IF exp.compOp == CompOperator.EQUAL»==«ELSE»!=«ENDIF» «exp.right.generateExpression»'''
			AndExpression:
				return '''«exp.left.generateExpression» & «exp.right.generateExpression»'''
			XorExpression:
				return '''«exp.left.generateExpression» ^ «exp.right.generateExpression»'''
			Expression:
				return '''«exp.left.generateExpression» | «exp.right.generateExpression»'''
				
		}
	}
	
	private def String generateVar(SymbolicVariable varName) {
		if (process.containsVar(varName.name)) {
			return '''«process.generateProcessPrefix»«varName.name»'''
		}
		if (program.containsInputOutputVar(varName.name)) {
			return '''«varName.name.toUpperCase»'''
		}
		return name
	}
	
	private def String generateEquOperators(EquOperator op) {
		switch op {
			case EquOperator.LESS:
				return '''<'''
			case EquOperator.LESS_EQU:
				return '''<='''
			case EquOperator.GREATER:
				return '''>'''
			case EquOperator.GREATER_EQU:
				return '''>='''
		}
	}
	
	private def String generateMulOperators(MulOperator op) {
		switch op {
			case MulOperator.MUL:
				return '''*'''
			case MulOperator.DIV:
				return '''/'''
			case MulOperator.MOD:
				return '''%'''
		}
	}
	
	
}