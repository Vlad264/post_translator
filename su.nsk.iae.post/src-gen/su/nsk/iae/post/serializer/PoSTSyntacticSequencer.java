/*
 * generated by Xtext 2.21.0
 */
package su.nsk.iae.post.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import su.nsk.iae.post.services.PoSTGrammarAccess;

@SuppressWarnings("all")
public class PoSTSyntacticSequencer extends AbstractSyntacticSequencer {

	protected PoSTGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Constant_BINARY_INTEGERTerminalRuleCall_2_1_or_BOOLEAN_LITERALTerminalRuleCall_5_1_or_HEX_INTEGERTerminalRuleCall_4_1_or_OCTAL_INTEGERTerminalRuleCall_3_1;
	protected AbstractElementAlias match_Statement___EXIT_STATEMENTTerminalRuleCall_4_1_0_SemicolonKeyword_4_1_1___or___LoopStatementParserRuleCall_7_1_0_SemicolonKeyword_7_1_1___or___SUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0_SemicolonKeyword_3_1_1__;
	protected AbstractElementAlias match_TimeLiteral_HyphenMinusKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (PoSTGrammarAccess) access;
		match_Constant_BINARY_INTEGERTerminalRuleCall_2_1_or_BOOLEAN_LITERALTerminalRuleCall_5_1_or_HEX_INTEGERTerminalRuleCall_4_1_or_OCTAL_INTEGERTerminalRuleCall_3_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstantAccess().getBINARY_INTEGERTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_5_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getHEX_INTEGERTerminalRuleCall_4_1()), new TokenAlias(false, false, grammarAccess.getConstantAccess().getOCTAL_INTEGERTerminalRuleCall_3_1()));
		match_Statement___EXIT_STATEMENTTerminalRuleCall_4_1_0_SemicolonKeyword_4_1_1___or___LoopStatementParserRuleCall_7_1_0_SemicolonKeyword_7_1_1___or___SUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0_SemicolonKeyword_3_1_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getEXIT_STATEMENTTerminalRuleCall_4_1_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getLoopStatementParserRuleCall_7_1_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStatementAccess().getSUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0()), new TokenAlias(false, false, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1_1())));
		match_TimeLiteral_HyphenMinusKeyword_2_q = new TokenAlias(false, true, grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getAND_OPERATORRule())
			return getAND_OPERATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBINARY_INTEGERRule())
			return getBINARY_INTEGERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getBOOLEAN_LITERALRule())
			return getBOOLEAN_LITERALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEXIT_STATEMENTRule())
			return getEXIT_STATEMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHEX_INTEGERRule())
			return getHEX_INTEGERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTERVAL_DECLARATIONRule())
			return getINTERVAL_DECLARATIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLoopStatementRule())
			return getLoopStatementToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOCTAL_INTEGERRule())
			return getOCTAL_INTEGERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOR_OPERATORRule())
			return getOR_OPERATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPLC_ARDUINI_LITERALRule())
			return getPLC_ARDUINI_LITERALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPOWER_OPERATORRule())
			return getPOWER_OPERATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPRIORITY_DECLARATIONRule())
			return getPRIORITY_DECLARATIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSINGLE_DECLARATIONRule())
			return getSINGLE_DECLARATIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSUBPROGRAM_CONTROL_STATEMENTRule())
			return getSUBPROGRAM_CONTROL_STATEMENTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTIME_PREF_LITERALRule())
			return getTIME_PREF_LITERALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getUNARY_OPERATORRule())
			return getUNARY_OPERATORToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getXOR_OPERATORRule())
			return getXOR_OPERATORToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal AND_OPERATOR:
	 * 	'&' | 'AND';
	 */
	protected String getAND_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&";
	}
	
	/**
	 * terminal BINARY_INTEGER returns ecore::EString:
	 * 	'2#' BIT+;
	 */
	protected String getBINARY_INTEGERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "2#0";
	}
	
	/**
	 * terminal BOOLEAN_LITERAL:
	 * 	'TRUE' | 'FALSE';
	 */
	protected String getBOOLEAN_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "TRUE";
	}
	
	/**
	 * terminal EXIT_STATEMENT:
	 * 	'EXIT';
	 */
	protected String getEXIT_STATEMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "EXIT";
	}
	
	/**
	 * terminal HEX_INTEGER returns ecore::EString:
	 * 	'16#' HEX_DIGIT+;
	 */
	protected String getHEX_INTEGERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "16#";
	}
	
	/**
	 * terminal INTERVAL_DECLARATION:
	 * 	'INTERVAL';
	 */
	protected String getINTERVAL_DECLARATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "INTERVAL";
	}
	
	/**
	 * LoopStatement:
	 * 	'LOOP';
	 */
	protected String getLoopStatementToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "LOOP";
	}
	
	/**
	 * terminal OCTAL_INTEGER returns ecore::EString:
	 * 	'8#' OCTAL_DIGIT+;
	 */
	protected String getOCTAL_INTEGERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "8#";
	}
	
	/**
	 * terminal OR_OPERATOR:
	 * 	'OR';
	 */
	protected String getOR_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "OR";
	}
	
	/**
	 * terminal PLC_ARDUINI_LITERAL:
	 * 	'PLC_ARDUINO';
	 */
	protected String getPLC_ARDUINI_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PLC_ARDUINO";
	}
	
	/**
	 * terminal POWER_OPERATOR:
	 * 	'**';
	 */
	protected String getPOWER_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "**";
	}
	
	/**
	 * terminal PRIORITY_DECLARATION:
	 * 	'PRIORITY';
	 */
	protected String getPRIORITY_DECLARATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "PRIORITY";
	}
	
	/**
	 * terminal SINGLE_DECLARATION:
	 * 	'SINGLE';
	 */
	protected String getSINGLE_DECLARATIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "SINGLE";
	}
	
	/**
	 * terminal SUBPROGRAM_CONTROL_STATEMENT:
	 * 	'RETURN';
	 */
	protected String getSUBPROGRAM_CONTROL_STATEMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "RETURN";
	}
	
	/**
	 * terminal TIME_PREF_LITERAL:
	 * 	'T';
	 */
	protected String getTIME_PREF_LITERALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "T";
	}
	
	/**
	 * terminal UNARY_OPERATOR:
	 * 	'NOT';
	 */
	protected String getUNARY_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "NOT";
	}
	
	/**
	 * terminal XOR_OPERATOR:
	 * 	'XOR';
	 */
	protected String getXOR_OPERATORToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "XOR";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Constant_BINARY_INTEGERTerminalRuleCall_2_1_or_BOOLEAN_LITERALTerminalRuleCall_5_1_or_HEX_INTEGERTerminalRuleCall_4_1_or_OCTAL_INTEGERTerminalRuleCall_3_1.equals(syntax))
				emit_Constant_BINARY_INTEGERTerminalRuleCall_2_1_or_BOOLEAN_LITERALTerminalRuleCall_5_1_or_HEX_INTEGERTerminalRuleCall_4_1_or_OCTAL_INTEGERTerminalRuleCall_3_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Statement___EXIT_STATEMENTTerminalRuleCall_4_1_0_SemicolonKeyword_4_1_1___or___LoopStatementParserRuleCall_7_1_0_SemicolonKeyword_7_1_1___or___SUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0_SemicolonKeyword_3_1_1__.equals(syntax))
				emit_Statement___EXIT_STATEMENTTerminalRuleCall_4_1_0_SemicolonKeyword_4_1_1___or___LoopStatementParserRuleCall_7_1_0_SemicolonKeyword_7_1_1___or___SUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0_SemicolonKeyword_3_1_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_TimeLiteral_HyphenMinusKeyword_2_q.equals(syntax))
				emit_TimeLiteral_HyphenMinusKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     BINARY_INTEGER | OCTAL_INTEGER | HEX_INTEGER | BOOLEAN_LITERAL
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Constant_BINARY_INTEGERTerminalRuleCall_2_1_or_BOOLEAN_LITERALTerminalRuleCall_5_1_or_HEX_INTEGERTerminalRuleCall_4_1_or_OCTAL_INTEGERTerminalRuleCall_3_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (SUBPROGRAM_CONTROL_STATEMENT ';') | (EXIT_STATEMENT ';') | (LoopStatement ';')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Statement___EXIT_STATEMENTTerminalRuleCall_4_1_0_SemicolonKeyword_4_1_1___or___LoopStatementParserRuleCall_7_1_0_SemicolonKeyword_7_1_1___or___SUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0_SemicolonKeyword_3_1_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '-'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) TIME_PREF_LITERAL '#' (ambiguity) interval=INTERVAL
	 */
	protected void emit_TimeLiteral_HyphenMinusKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
