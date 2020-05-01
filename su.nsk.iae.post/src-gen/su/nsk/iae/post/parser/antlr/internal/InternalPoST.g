/*
 * generated by Xtext 2.21.0
 */
grammar InternalPoST;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package su.nsk.iae.post.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package su.nsk.iae.post.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import su.nsk.iae.post.services.PoSTGrammarAccess;

}

@parser::members {

 	private PoSTGrammarAccess grammarAccess;

    public InternalPoSTParser(TokenStream input, PoSTGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected PoSTGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
			}
			lv_greetings_0_0=ruleGreeting
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"greetings",
					lv_greetings_0_0,
					"su.nsk.iae.post.PoST.Greeting");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Hello'
		{
			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGreetingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"su.nsk.iae.post.PoST.ID");
				}
			)
		)
		otherlv_2='!'
		{
			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
		}
	)
;

// Entry rule entryRuleDataTypeName
entryRuleDataTypeName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeNameRule()); }
	iv_ruleDataTypeName=ruleDataTypeName
	{ $current=$iv_ruleDataTypeName.current.getText(); }
	EOF;

// Rule DataTypeName
ruleDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDataTypeNameAccess().getNumericTypeNameParserRuleCall_0());
		}
		this_NumericTypeName_0=ruleNumericTypeName
		{
			$current.merge(this_NumericTypeName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_BIT_STRING_TYPE_NAME_1=RULE_BIT_STRING_TYPE_NAME
		{
			$current.merge(this_BIT_STRING_TYPE_NAME_1);
		}
		{
			newLeafNode(this_BIT_STRING_TYPE_NAME_1, grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1());
		}
		    |
		kw='STRING'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2());
		}
		    |
		kw='WSTRING'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3());
		}
	)
;

// Entry rule entryRuleNumericTypeName
entryRuleNumericTypeName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNumericTypeNameRule()); }
	iv_ruleNumericTypeName=ruleNumericTypeName
	{ $current=$iv_ruleNumericTypeName.current.getText(); }
	EOF;

// Rule NumericTypeName
ruleNumericTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNumericTypeNameAccess().getIntegerTypeNameParserRuleCall_0());
		}
		this_IntegerTypeName_0=ruleIntegerTypeName
		{
			$current.merge(this_IntegerTypeName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_REAL_TYPE_NAME_1=RULE_REAL_TYPE_NAME
		{
			$current.merge(this_REAL_TYPE_NAME_1);
		}
		{
			newLeafNode(this_REAL_TYPE_NAME_1, grammarAccess.getNumericTypeNameAccess().getREAL_TYPE_NAMETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleIntegerTypeName
entryRuleIntegerTypeName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getIntegerTypeNameRule()); }
	iv_ruleIntegerTypeName=ruleIntegerTypeName
	{ $current=$iv_ruleIntegerTypeName.current.getText(); }
	EOF;

// Rule IntegerTypeName
ruleIntegerTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SIGNED_INTEGER_TYPE_NAME_0=RULE_SIGNED_INTEGER_TYPE_NAME
		{
			$current.merge(this_SIGNED_INTEGER_TYPE_NAME_0);
		}
		{
			newLeafNode(this_SIGNED_INTEGER_TYPE_NAME_0, grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0());
		}
		    |
		this_UNSIGNED_INTEGER_TYPE_NAME_1=RULE_UNSIGNED_INTEGER_TYPE_NAME
		{
			$current.merge(this_UNSIGNED_INTEGER_TYPE_NAME_1);
		}
		{
			newLeafNode(this_UNSIGNED_INTEGER_TYPE_NAME_1, grammarAccess.getIntegerTypeNameAccess().getUNSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleSimpleSpecificationInit
entryRuleSimpleSpecificationInit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleSpecificationInitRule()); }
	iv_ruleSimpleSpecificationInit=ruleSimpleSpecificationInit
	{ $current=$iv_ruleSimpleSpecificationInit.current; }
	EOF;

// Rule SimpleSpecificationInit
ruleSimpleSpecificationInit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleSpecificationInitAccess().getTypeDataTypeNameParserRuleCall_1_0());
				}
				lv_type_1_0=ruleDataTypeName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleSpecificationInitRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"su.nsk.iae.post.PoST.DataTypeName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=':='
			{
				newLeafNode(otherlv_2, grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSimpleSpecificationInitAccess().getValueConstantParserRuleCall_2_1_0());
					}
					lv_value_3_0=ruleConstant
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSimpleSpecificationInitRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"su.nsk.iae.post.PoST.Constant");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleConstant
entryRuleConstant returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConstantRule()); }
	iv_ruleConstant=ruleConstant
	{ $current=$iv_ruleConstant.current; }
	EOF;

// Rule Constant
ruleConstant returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0());
		}
		this_NumericLiteral_0=ruleNumericLiteral
		{
			$current = $this_NumericLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConstantAccess().getConstantAction_1_0(),
						$current);
				}
			)
			this_BOOLEAN_LITERAL_2=RULE_BOOLEAN_LITERAL
			{
				newLeafNode(this_BOOLEAN_LITERAL_2, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1_1());
			}
		)
	)
;

// Entry rule entryRuleSignedInteger
entryRuleSignedInteger returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSignedIntegerRule()); }
	iv_ruleSignedInteger=ruleSignedInteger
	{ $current=$iv_ruleSignedInteger.current; }
	EOF;

// Rule SignedInteger
ruleSignedInteger returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_sig_0_0='-'
				{
					newLeafNode(lv_sig_0_0, grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSignedIntegerRule());
					}
					setWithLastConsumed($current, "sig", true, "-");
				}
			)
		)?
		(
			(
				lv_value_1_0=RULE_INTEGER
				{
					newLeafNode(lv_value_1_0, grammarAccess.getSignedIntegerAccess().getValueINTEGERTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSignedIntegerRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"su.nsk.iae.post.PoST.INTEGER");
				}
			)
		)
	)
;

// Entry rule entryRuleNumericLiteral
entryRuleNumericLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNumericLiteralRule()); }
	iv_ruleNumericLiteral=ruleNumericLiteral
	{ $current=$iv_ruleNumericLiteral.current; }
	EOF;

// Rule NumericLiteral
ruleNumericLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0());
		}
		this_IntegerLiteral_0=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_1());
		}
		this_RealLiteral_1=ruleRealLiteral
		{
			$current = $this_RealLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getIntegerLiteralAccess().getTypeIntegerTypeNameParserRuleCall_0_0_0());
					}
					lv_type_0_0=ruleIntegerTypeName
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
						}
						set(
							$current,
							"type",
							lv_type_0_0,
							"su.nsk.iae.post.PoST.IntegerTypeName");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_1='#'
			{
				newLeafNode(otherlv_1, grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValueSignedIntegerParserRuleCall_1_0());
				}
				lv_value_2_0=ruleSignedInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"su.nsk.iae.post.PoST.SignedInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleRealLiteral
entryRuleRealLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRealLiteralRule()); }
	iv_ruleRealLiteral=ruleRealLiteral
	{ $current=$iv_ruleRealLiteral.current; }
	EOF;

// Rule RealLiteral
ruleRealLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_type_0_0=RULE_REAL_TYPE_NAME
					{
						newLeafNode(lv_type_0_0, grammarAccess.getRealLiteralAccess().getTypeREAL_TYPE_NAMETerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRealLiteralRule());
						}
						setWithLastConsumed(
							$current,
							"type",
							lv_type_0_0,
							"su.nsk.iae.post.PoST.REAL_TYPE_NAME");
					}
				)
			)
			otherlv_1='#'
			{
				newLeafNode(otherlv_1, grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRealLiteralAccess().getDivSignedIntegerParserRuleCall_1_0());
				}
				lv_div_2_0=ruleSignedInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRealLiteralRule());
					}
					set(
						$current,
						"div",
						lv_div_2_0,
						"su.nsk.iae.post.PoST.SignedInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getRealLiteralAccess().getFullStopKeyword_2());
		}
		(
			(
				lv_mod_4_0=RULE_INTEGER
				{
					newLeafNode(lv_mod_4_0, grammarAccess.getRealLiteralAccess().getModINTEGERTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRealLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"mod",
						lv_mod_4_0,
						"su.nsk.iae.post.PoST.INTEGER");
				}
			)
		)
	)
;

RULE_SIGNED_INTEGER_TYPE_NAME : ('SINT'|'INT'|'DINT'|'LINT');

RULE_UNSIGNED_INTEGER_TYPE_NAME : ('USINT'|'UINT'|'UDINT'|'ULINT');

RULE_REAL_TYPE_NAME : ('REAL'|'LREAL');

RULE_BIT_STRING_TYPE_NAME : ('BOOL'|'BYTE'|'WORD'|'DWORD'|'LWORD');

RULE_INTEGER : RULE_DIGIT+;

RULE_BINARY_INTEGER : '2#' RULE_BIT+;

RULE_OCTAL_INTEGER : '8#' RULE_OCTAL_DIGIT+;

RULE_HEX_INTEGER : '16#' RULE_HEX_DIGIT+;

RULE_BOOLEAN_LITERAL : ('TRUE'|'FALSE');

fragment RULE_LETTER : ('A'..'Z'|'a'..'z'|'_');

fragment RULE_BIT : ('0'|'1');

fragment RULE_OCTAL_DIGIT : '0'..'7';

fragment RULE_DIGIT : '0'..'9';

fragment RULE_HEX_DIGIT : (RULE_DIGIT|'A'..'F');

RULE_ID : RULE_LETTER (RULE_LETTER|RULE_DIGIT)*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
