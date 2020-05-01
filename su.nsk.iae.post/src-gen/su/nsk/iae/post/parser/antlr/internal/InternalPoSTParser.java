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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPoSTParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_DIRECT_VARIABLE", "RULE_TIME_PREF_LITERAL", "RULE_INTERVAL", "RULE_BIT_STRING_TYPE_NAME", "RULE_REAL_TYPE_NAME", "RULE_SIGNED_INTEGER_TYPE_NAME", "RULE_UNSIGNED_INTEGER_TYPE_NAME", "RULE_BOOLEAN_LITERAL", "RULE_INTEGER", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_DIGIT", "RULE_BIT", "RULE_BINARY_INTEGER", "RULE_OCTAL_DIGIT", "RULE_OCTAL_INTEGER", "RULE_HEX_DIGIT", "RULE_HEX_INTEGER", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'!'", "':'", "','", "'AT'", "'#'", "'-'", "'STRING'", "'WSTRING'", "':='", "'.'"
    };
    public static final int RULE_INTERVAL=7;
    public static final int RULE_DIRECT_VARIABLE=5;
    public static final int RULE_DIRECT_TYPE_PREFIX=14;
    public static final int RULE_HEX_INTEGER=22;
    public static final int RULE_BINARY_INTEGER=18;
    public static final int RULE_SL_COMMENT=25;
    public static final int RULE_BIT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_TIME_PREF_LITERAL=6;
    public static final int RULE_SIGNED_INTEGER_TYPE_NAME=10;
    public static final int T__33=33;
    public static final int RULE_OCTAL_INTEGER=20;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_UNSIGNED_INTEGER_TYPE_NAME=11;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DIRECT_SIZE_PREFIX=15;
    public static final int RULE_ID=4;
    public static final int RULE_REAL_TYPE_NAME=9;
    public static final int RULE_BOOLEAN_LITERAL=12;
    public static final int RULE_WS=26;
    public static final int RULE_DIGIT=16;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_LETTER=23;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_HEX_DIGIT=21;
    public static final int RULE_INTEGER=13;
    public static final int RULE_BIT_STRING_TYPE_NAME=8;

    // delegates
    // delegators


        public InternalPoSTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPoSTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPoSTParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPoST.g"; }



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




    // $ANTLR start "entryRuleModel"
    // InternalPoST.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPoST.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalPoST.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPoST.g:71:1: ruleModel returns [EObject current=null] : ( (lv_greetings_0_0= ruleGreeting ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_greetings_0_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:77:2: ( ( (lv_greetings_0_0= ruleGreeting ) )* )
            // InternalPoST.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            {
            // InternalPoST.g:78:2: ( (lv_greetings_0_0= ruleGreeting ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==28) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPoST.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    {
            	    // InternalPoST.g:79:3: (lv_greetings_0_0= ruleGreeting )
            	    // InternalPoST.g:80:4: lv_greetings_0_0= ruleGreeting
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_greetings_0_0=ruleGreeting();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"greetings",
            	    					lv_greetings_0_0,
            	    					"su.nsk.iae.post.PoST.Greeting");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalPoST.g:100:1: entryRuleGreeting returns [EObject current=null] : iv_ruleGreeting= ruleGreeting EOF ;
    public final EObject entryRuleGreeting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreeting = null;


        try {
            // InternalPoST.g:100:49: (iv_ruleGreeting= ruleGreeting EOF )
            // InternalPoST.g:101:2: iv_ruleGreeting= ruleGreeting EOF
            {
             newCompositeNode(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGreeting=ruleGreeting();

            state._fsp--;

             current =iv_ruleGreeting; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalPoST.g:107:1: ruleGreeting returns [EObject current=null] : (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) ;
    public final EObject ruleGreeting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalPoST.g:113:2: ( (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' ) )
            // InternalPoST.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            {
            // InternalPoST.g:114:2: (otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!' )
            // InternalPoST.g:115:3: otherlv_0= 'Hello' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '!'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
            		
            // InternalPoST.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGreetingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleSymbolicVariable"
    // InternalPoST.g:145:1: entryRuleSymbolicVariable returns [EObject current=null] : iv_ruleSymbolicVariable= ruleSymbolicVariable EOF ;
    public final EObject entryRuleSymbolicVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicVariable = null;


        try {
            // InternalPoST.g:145:57: (iv_ruleSymbolicVariable= ruleSymbolicVariable EOF )
            // InternalPoST.g:146:2: iv_ruleSymbolicVariable= ruleSymbolicVariable EOF
            {
             newCompositeNode(grammarAccess.getSymbolicVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymbolicVariable=ruleSymbolicVariable();

            state._fsp--;

             current =iv_ruleSymbolicVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymbolicVariable"


    // $ANTLR start "ruleSymbolicVariable"
    // InternalPoST.g:152:1: ruleSymbolicVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolicVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPoST.g:158:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPoST.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPoST.g:159:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPoST.g:160:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPoST.g:160:3: (lv_name_0_0= RULE_ID )
            // InternalPoST.g:161:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getSymbolicVariableAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSymbolicVariableRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"su.nsk.iae.post.PoST.ID");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymbolicVariable"


    // $ANTLR start "entryRuleVarInitDeclaration"
    // InternalPoST.g:180:1: entryRuleVarInitDeclaration returns [EObject current=null] : iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF ;
    public final EObject entryRuleVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInitDeclaration = null;


        try {
            // InternalPoST.g:180:59: (iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF )
            // InternalPoST.g:181:2: iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarInitDeclaration=ruleVarInitDeclaration();

            state._fsp--;

             current =iv_ruleVarInitDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarInitDeclaration"


    // $ANTLR start "ruleVarInitDeclaration"
    // InternalPoST.g:187:1: ruleVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) ) ;
    public final EObject ruleVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        EObject lv_spec_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:193:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) ) )
            // InternalPoST.g:194:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) )
            {
            // InternalPoST.g:194:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) )
            // InternalPoST.g:195:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) )
            {
            // InternalPoST.g:195:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:196:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:196:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:197:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_varList_0_0=ruleVarList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"su.nsk.iae.post.PoST.VarList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getVarInitDeclarationAccess().getColonKeyword_1());
            		
            // InternalPoST.g:218:3: ( (lv_spec_2_0= ruleSimpleSpecificationInit ) )
            // InternalPoST.g:219:4: (lv_spec_2_0= ruleSimpleSpecificationInit )
            {
            // InternalPoST.g:219:4: (lv_spec_2_0= ruleSimpleSpecificationInit )
            // InternalPoST.g:220:5: lv_spec_2_0= ruleSimpleSpecificationInit
            {

            					newCompositeNode(grammarAccess.getVarInitDeclarationAccess().getSpecSimpleSpecificationInitParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_spec_2_0=ruleSimpleSpecificationInit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"spec",
            						lv_spec_2_0,
            						"su.nsk.iae.post.PoST.SimpleSpecificationInit");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarInitDeclaration"


    // $ANTLR start "entryRuleVarList"
    // InternalPoST.g:241:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalPoST.g:241:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalPoST.g:242:2: iv_ruleVarList= ruleVarList EOF
            {
             newCompositeNode(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarList=ruleVarList();

            state._fsp--;

             current =iv_ruleVarList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalPoST.g:248:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:254:2: ( ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* ) )
            // InternalPoST.g:255:2: ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* )
            {
            // InternalPoST.g:255:2: ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* )
            // InternalPoST.g:256:3: ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )*
            {
            // InternalPoST.g:256:3: ( (lv_vars_0_0= ruleSymbolicVariable ) )
            // InternalPoST.g:257:4: (lv_vars_0_0= ruleSymbolicVariable )
            {
            // InternalPoST.g:257:4: (lv_vars_0_0= ruleSymbolicVariable )
            // InternalPoST.g:258:5: lv_vars_0_0= ruleSymbolicVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_vars_0_0=ruleSymbolicVariable();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarListRule());
            					}
            					add(
            						current,
            						"vars",
            						lv_vars_0_0,
            						"su.nsk.iae.post.PoST.SymbolicVariable");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:275:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPoST.g:276:4: otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,31,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPoST.g:280:4: ( (lv_vars_2_0= ruleSymbolicVariable ) )
            	    // InternalPoST.g:281:5: (lv_vars_2_0= ruleSymbolicVariable )
            	    {
            	    // InternalPoST.g:281:5: (lv_vars_2_0= ruleSymbolicVariable )
            	    // InternalPoST.g:282:6: lv_vars_2_0= ruleSymbolicVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_vars_2_0=ruleSymbolicVariable();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.post.PoST.SymbolicVariable");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleExternalVarInitDeclaration"
    // InternalPoST.g:304:1: entryRuleExternalVarInitDeclaration returns [EObject current=null] : iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF ;
    public final EObject entryRuleExternalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVarInitDeclaration = null;


        try {
            // InternalPoST.g:304:67: (iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF )
            // InternalPoST.g:305:2: iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternalVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalVarInitDeclaration=ruleExternalVarInitDeclaration();

            state._fsp--;

             current =iv_ruleExternalVarInitDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalVarInitDeclaration"


    // $ANTLR start "ruleExternalVarInitDeclaration"
    // InternalPoST.g:311:1: ruleExternalVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) ) ;
    public final EObject ruleExternalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:317:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) ) )
            // InternalPoST.g:318:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) )
            {
            // InternalPoST.g:318:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) )
            // InternalPoST.g:319:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) )
            {
            // InternalPoST.g:319:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:320:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:320:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:321:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getExternalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_varList_0_0=ruleVarList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"su.nsk.iae.post.PoST.VarList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalVarInitDeclarationAccess().getColonKeyword_1());
            		
            // InternalPoST.g:342:3: ( (lv_type_2_0= ruleDataTypeName ) )
            // InternalPoST.g:343:4: (lv_type_2_0= ruleDataTypeName )
            {
            // InternalPoST.g:343:4: (lv_type_2_0= ruleDataTypeName )
            // InternalPoST.g:344:5: lv_type_2_0= ruleDataTypeName
            {

            					newCompositeNode(grammarAccess.getExternalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleDataTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"su.nsk.iae.post.PoST.DataTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalVarInitDeclaration"


    // $ANTLR start "entryRuleGlobalVarInitDeclaration"
    // InternalPoST.g:365:1: entryRuleGlobalVarInitDeclaration returns [EObject current=null] : iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF ;
    public final EObject entryRuleGlobalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVarInitDeclaration = null;


        try {
            // InternalPoST.g:365:65: (iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF )
            // InternalPoST.g:366:2: iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF
            {
             newCompositeNode(grammarAccess.getGlobalVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVarInitDeclaration=ruleGlobalVarInitDeclaration();

            state._fsp--;

             current =iv_ruleGlobalVarInitDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalVarInitDeclaration"


    // $ANTLR start "ruleGlobalVarInitDeclaration"
    // InternalPoST.g:372:1: ruleGlobalVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) ) ;
    public final EObject ruleGlobalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        EObject lv_varList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:378:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) ) )
            // InternalPoST.g:379:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) )
            {
            // InternalPoST.g:379:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) )
            // InternalPoST.g:380:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) )
            {
            // InternalPoST.g:380:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:381:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:381:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:382:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_varList_0_0=ruleVarList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"varList",
            						lv_varList_0_0,
            						"su.nsk.iae.post.PoST.VarList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalVarInitDeclarationAccess().getATKeyword_1());
            		
            // InternalPoST.g:403:3: ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
            // InternalPoST.g:404:4: (lv_location_2_0= RULE_DIRECT_VARIABLE )
            {
            // InternalPoST.g:404:4: (lv_location_2_0= RULE_DIRECT_VARIABLE )
            // InternalPoST.g:405:5: lv_location_2_0= RULE_DIRECT_VARIABLE
            {
            lv_location_2_0=(Token)match(input,RULE_DIRECT_VARIABLE,FOLLOW_6); 

            					newLeafNode(lv_location_2_0, grammarAccess.getGlobalVarInitDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGlobalVarInitDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_2_0,
            						"su.nsk.iae.post.PoST.DIRECT_VARIABLE");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalVarInitDeclarationAccess().getColonKeyword_3());
            		
            // InternalPoST.g:425:3: ( (lv_type_4_0= ruleDataTypeName ) )
            // InternalPoST.g:426:4: (lv_type_4_0= ruleDataTypeName )
            {
            // InternalPoST.g:426:4: (lv_type_4_0= ruleDataTypeName )
            // InternalPoST.g:427:5: lv_type_4_0= ruleDataTypeName
            {

            					newCompositeNode(grammarAccess.getGlobalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleDataTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGlobalVarInitDeclarationRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"su.nsk.iae.post.PoST.DataTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalVarInitDeclaration"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalPoST.g:448:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalPoST.g:448:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalPoST.g:449:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
            {
             newCompositeNode(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeLiteral=ruleTimeLiteral();

            state._fsp--;

             current =iv_ruleTimeLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalPoST.g:455:1: ruleTimeLiteral returns [EObject current=null] : (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token this_TIME_PREF_LITERAL_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_interval_3_0=null;


        	enterRule();

        try {
            // InternalPoST.g:461:2: ( (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) ) )
            // InternalPoST.g:462:2: (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) )
            {
            // InternalPoST.g:462:2: (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) )
            // InternalPoST.g:463:3: this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) )
            {
            this_TIME_PREF_LITERAL_0=(Token)match(input,RULE_TIME_PREF_LITERAL,FOLLOW_11); 

            			newLeafNode(this_TIME_PREF_LITERAL_0, grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeLiteralAccess().getNumberSignKeyword_1());
            		
            // InternalPoST.g:471:3: (otherlv_2= '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalPoST.g:472:4: otherlv_2= '-'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2());
                    			

                    }
                    break;

            }

            // InternalPoST.g:477:3: ( (lv_interval_3_0= RULE_INTERVAL ) )
            // InternalPoST.g:478:4: (lv_interval_3_0= RULE_INTERVAL )
            {
            // InternalPoST.g:478:4: (lv_interval_3_0= RULE_INTERVAL )
            // InternalPoST.g:479:5: lv_interval_3_0= RULE_INTERVAL
            {
            lv_interval_3_0=(Token)match(input,RULE_INTERVAL,FOLLOW_2); 

            					newLeafNode(lv_interval_3_0, grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTimeLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"interval",
            						lv_interval_3_0,
            						"su.nsk.iae.post.PoST.INTERVAL");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleDataTypeName"
    // InternalPoST.g:499:1: entryRuleDataTypeName returns [String current=null] : iv_ruleDataTypeName= ruleDataTypeName EOF ;
    public final String entryRuleDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeName = null;


        try {
            // InternalPoST.g:499:52: (iv_ruleDataTypeName= ruleDataTypeName EOF )
            // InternalPoST.g:500:2: iv_ruleDataTypeName= ruleDataTypeName EOF
            {
             newCompositeNode(grammarAccess.getDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataTypeName=ruleDataTypeName();

            state._fsp--;

             current =iv_ruleDataTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeName"


    // $ANTLR start "ruleDataTypeName"
    // InternalPoST.g:506:1: ruleDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | kw= 'STRING' | kw= 'WSTRING' ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIT_STRING_TYPE_NAME_1=null;
        Token kw=null;
        AntlrDatatypeRuleToken this_NumericTypeName_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:512:2: ( (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | kw= 'STRING' | kw= 'WSTRING' ) )
            // InternalPoST.g:513:2: (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | kw= 'STRING' | kw= 'WSTRING' )
            {
            // InternalPoST.g:513:2: (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | kw= 'STRING' | kw= 'WSTRING' )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt4=1;
                }
                break;
            case RULE_BIT_STRING_TYPE_NAME:
                {
                alt4=2;
                }
                break;
            case 35:
                {
                alt4=3;
                }
                break;
            case 36:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalPoST.g:514:3: this_NumericTypeName_0= ruleNumericTypeName
                    {

                    			newCompositeNode(grammarAccess.getDataTypeNameAccess().getNumericTypeNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericTypeName_0=ruleNumericTypeName();

                    state._fsp--;


                    			current.merge(this_NumericTypeName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:525:3: this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME
                    {
                    this_BIT_STRING_TYPE_NAME_1=(Token)match(input,RULE_BIT_STRING_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_BIT_STRING_TYPE_NAME_1);
                    		

                    			newLeafNode(this_BIT_STRING_TYPE_NAME_1, grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:533:3: kw= 'STRING'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPoST.g:539:3: kw= 'WSTRING'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeName"


    // $ANTLR start "entryRuleNumericTypeName"
    // InternalPoST.g:548:1: entryRuleNumericTypeName returns [String current=null] : iv_ruleNumericTypeName= ruleNumericTypeName EOF ;
    public final String entryRuleNumericTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericTypeName = null;


        try {
            // InternalPoST.g:548:55: (iv_ruleNumericTypeName= ruleNumericTypeName EOF )
            // InternalPoST.g:549:2: iv_ruleNumericTypeName= ruleNumericTypeName EOF
            {
             newCompositeNode(grammarAccess.getNumericTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericTypeName=ruleNumericTypeName();

            state._fsp--;

             current =iv_ruleNumericTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericTypeName"


    // $ANTLR start "ruleNumericTypeName"
    // InternalPoST.g:555:1: ruleNumericTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleNumericTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REAL_TYPE_NAME_1=null;
        AntlrDatatypeRuleToken this_IntegerTypeName_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:561:2: ( (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME ) )
            // InternalPoST.g:562:2: (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME )
            {
            // InternalPoST.g:562:2: (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA5_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_REAL_TYPE_NAME) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPoST.g:563:3: this_IntegerTypeName_0= ruleIntegerTypeName
                    {

                    			newCompositeNode(grammarAccess.getNumericTypeNameAccess().getIntegerTypeNameParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerTypeName_0=ruleIntegerTypeName();

                    state._fsp--;


                    			current.merge(this_IntegerTypeName_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:574:3: this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME
                    {
                    this_REAL_TYPE_NAME_1=(Token)match(input,RULE_REAL_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_REAL_TYPE_NAME_1);
                    		

                    			newLeafNode(this_REAL_TYPE_NAME_1, grammarAccess.getNumericTypeNameAccess().getREAL_TYPE_NAMETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericTypeName"


    // $ANTLR start "entryRuleIntegerTypeName"
    // InternalPoST.g:585:1: entryRuleIntegerTypeName returns [String current=null] : iv_ruleIntegerTypeName= ruleIntegerTypeName EOF ;
    public final String entryRuleIntegerTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerTypeName = null;


        try {
            // InternalPoST.g:585:55: (iv_ruleIntegerTypeName= ruleIntegerTypeName EOF )
            // InternalPoST.g:586:2: iv_ruleIntegerTypeName= ruleIntegerTypeName EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerTypeName=ruleIntegerTypeName();

            state._fsp--;

             current =iv_ruleIntegerTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerTypeName"


    // $ANTLR start "ruleIntegerTypeName"
    // InternalPoST.g:592:1: ruleIntegerTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleIntegerTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_TYPE_NAME_0=null;
        Token this_UNSIGNED_INTEGER_TYPE_NAME_1=null;


        	enterRule();

        try {
            // InternalPoST.g:598:2: ( (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME ) )
            // InternalPoST.g:599:2: (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME )
            {
            // InternalPoST.g:599:2: (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_SIGNED_INTEGER_TYPE_NAME) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_UNSIGNED_INTEGER_TYPE_NAME) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalPoST.g:600:3: this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME
                    {
                    this_SIGNED_INTEGER_TYPE_NAME_0=(Token)match(input,RULE_SIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_SIGNED_INTEGER_TYPE_NAME_0);
                    		

                    			newLeafNode(this_SIGNED_INTEGER_TYPE_NAME_0, grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:608:3: this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME
                    {
                    this_UNSIGNED_INTEGER_TYPE_NAME_1=(Token)match(input,RULE_UNSIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_UNSIGNED_INTEGER_TYPE_NAME_1);
                    		

                    			newLeafNode(this_UNSIGNED_INTEGER_TYPE_NAME_1, grammarAccess.getIntegerTypeNameAccess().getUNSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerTypeName"


    // $ANTLR start "entryRuleSimpleSpecificationInit"
    // InternalPoST.g:619:1: entryRuleSimpleSpecificationInit returns [EObject current=null] : iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF ;
    public final EObject entryRuleSimpleSpecificationInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSpecificationInit = null;


        try {
            // InternalPoST.g:619:64: (iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF )
            // InternalPoST.g:620:2: iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF
            {
             newCompositeNode(grammarAccess.getSimpleSpecificationInitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleSpecificationInit=ruleSimpleSpecificationInit();

            state._fsp--;

             current =iv_ruleSimpleSpecificationInit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleSpecificationInit"


    // $ANTLR start "ruleSimpleSpecificationInit"
    // InternalPoST.g:626:1: ruleSimpleSpecificationInit returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? ) ;
    public final EObject ruleSimpleSpecificationInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:632:2: ( ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? ) )
            // InternalPoST.g:633:2: ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? )
            {
            // InternalPoST.g:633:2: ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? )
            // InternalPoST.g:634:3: () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )?
            {
            // InternalPoST.g:634:3: ()
            // InternalPoST.g:635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0(),
            					current);
            			

            }

            // InternalPoST.g:641:3: ( (lv_type_1_0= ruleDataTypeName ) )
            // InternalPoST.g:642:4: (lv_type_1_0= ruleDataTypeName )
            {
            // InternalPoST.g:642:4: (lv_type_1_0= ruleDataTypeName )
            // InternalPoST.g:643:5: lv_type_1_0= ruleDataTypeName
            {

            					newCompositeNode(grammarAccess.getSimpleSpecificationInitAccess().getTypeDataTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_type_1_0=ruleDataTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleSpecificationInitRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"su.nsk.iae.post.PoST.DataTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:660:3: (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==37) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPoST.g:661:4: otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalPoST.g:665:4: ( (lv_value_3_0= ruleConstant ) )
                    // InternalPoST.g:666:5: (lv_value_3_0= ruleConstant )
                    {
                    // InternalPoST.g:666:5: (lv_value_3_0= ruleConstant )
                    // InternalPoST.g:667:6: lv_value_3_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getSimpleSpecificationInitAccess().getValueConstantParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimpleSpecificationInitRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"su.nsk.iae.post.PoST.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleSpecificationInit"


    // $ANTLR start "entryRuleConstant"
    // InternalPoST.g:689:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalPoST.g:689:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalPoST.g:690:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalPoST.g:696:1: ruleConstant returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token this_BOOLEAN_LITERAL_3=null;
        EObject this_NumericLiteral_0 = null;

        EObject this_TimeLiteral_1 = null;



        	enterRule();

        try {
            // InternalPoST.g:702:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL ) ) )
            // InternalPoST.g:703:2: (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL ) )
            {
            // InternalPoST.g:703:2: (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
            case RULE_INTEGER:
            case 34:
                {
                alt8=1;
                }
                break;
            case RULE_TIME_PREF_LITERAL:
                {
                alt8=2;
                }
                break;
            case RULE_BOOLEAN_LITERAL:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPoST.g:704:3: this_NumericLiteral_0= ruleNumericLiteral
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumericLiteral_0=ruleNumericLiteral();

                    state._fsp--;


                    			current = this_NumericLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:713:3: this_TimeLiteral_1= ruleTimeLiteral
                    {

                    			newCompositeNode(grammarAccess.getConstantAccess().getTimeLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TimeLiteral_1=ruleTimeLiteral();

                    state._fsp--;


                    			current = this_TimeLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:722:3: ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalPoST.g:722:3: ( () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL )
                    // InternalPoST.g:723:4: () this_BOOLEAN_LITERAL_3= RULE_BOOLEAN_LITERAL
                    {
                    // InternalPoST.g:723:4: ()
                    // InternalPoST.g:724:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_2_0(),
                    						current);
                    				

                    }

                    this_BOOLEAN_LITERAL_3=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    				newLeafNode(this_BOOLEAN_LITERAL_3, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleSignedInteger"
    // InternalPoST.g:739:1: entryRuleSignedInteger returns [EObject current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final EObject entryRuleSignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInteger = null;


        try {
            // InternalPoST.g:739:54: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // InternalPoST.g:740:2: iv_ruleSignedInteger= ruleSignedInteger EOF
            {
             newCompositeNode(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSignedInteger=ruleSignedInteger();

            state._fsp--;

             current =iv_ruleSignedInteger; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // InternalPoST.g:746:1: ruleSignedInteger returns [EObject current=null] : ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleSignedInteger() throws RecognitionException {
        EObject current = null;

        Token lv_sig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPoST.g:752:2: ( ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalPoST.g:753:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalPoST.g:753:2: ( ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalPoST.g:754:3: ( (lv_sig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalPoST.g:754:3: ( (lv_sig_0_0= '-' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:755:4: (lv_sig_0_0= '-' )
                    {
                    // InternalPoST.g:755:4: (lv_sig_0_0= '-' )
                    // InternalPoST.g:756:5: lv_sig_0_0= '-'
                    {
                    lv_sig_0_0=(Token)match(input,34,FOLLOW_16); 

                    					newLeafNode(lv_sig_0_0, grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignedIntegerRule());
                    					}
                    					setWithLastConsumed(current, "sig", true, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:768:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalPoST.g:769:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalPoST.g:769:4: (lv_value_1_0= RULE_INTEGER )
            // InternalPoST.g:770:5: lv_value_1_0= RULE_INTEGER
            {
            lv_value_1_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getSignedIntegerAccess().getValueINTEGERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSignedIntegerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"su.nsk.iae.post.PoST.INTEGER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPoST.g:790:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPoST.g:790:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPoST.g:791:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumericLiteral=ruleNumericLiteral();

            state._fsp--;

             current =iv_ruleNumericLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalPoST.g:797:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalPoST.g:803:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalPoST.g:804:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalPoST.g:804:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt10=2;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==RULE_INTEGER) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==38) ) {
                        alt10=2;
                    }
                    else if ( (LA10_3==EOF) ) {
                        alt10=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==38) ) {
                    alt10=2;
                }
                else if ( (LA10_3==EOF) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REAL_TYPE_NAME:
                {
                alt10=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalPoST.g:805:3: this_IntegerLiteral_0= ruleIntegerLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerLiteral_0=ruleIntegerLiteral();

                    state._fsp--;


                    			current = this_IntegerLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:814:3: this_RealLiteral_1= ruleRealLiteral
                    {

                    			newCompositeNode(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RealLiteral_1=ruleRealLiteral();

                    state._fsp--;


                    			current = this_RealLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalPoST.g:826:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalPoST.g:826:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalPoST.g:827:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerLiteral=ruleIntegerLiteral();

            state._fsp--;

             current =iv_ruleIntegerLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalPoST.g:833:1: ruleIntegerLiteral returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:839:2: ( ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) ) )
            // InternalPoST.g:840:2: ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) )
            {
            // InternalPoST.g:840:2: ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) )
            // InternalPoST.g:841:3: ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) )
            {
            // InternalPoST.g:841:3: ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA11_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPoST.g:842:4: ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#'
                    {
                    // InternalPoST.g:842:4: ( (lv_type_0_0= ruleIntegerTypeName ) )
                    // InternalPoST.g:843:5: (lv_type_0_0= ruleIntegerTypeName )
                    {
                    // InternalPoST.g:843:5: (lv_type_0_0= ruleIntegerTypeName )
                    // InternalPoST.g:844:6: lv_type_0_0= ruleIntegerTypeName
                    {

                    						newCompositeNode(grammarAccess.getIntegerLiteralAccess().getTypeIntegerTypeNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_type_0_0=ruleIntegerTypeName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"su.nsk.iae.post.PoST.IntegerTypeName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPoST.g:866:3: ( (lv_value_2_0= ruleSignedInteger ) )
            // InternalPoST.g:867:4: (lv_value_2_0= ruleSignedInteger )
            {
            // InternalPoST.g:867:4: (lv_value_2_0= ruleSignedInteger )
            // InternalPoST.g:868:5: lv_value_2_0= ruleSignedInteger
            {

            					newCompositeNode(grammarAccess.getIntegerLiteralAccess().getValueSignedIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleSignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntegerLiteralRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"su.nsk.iae.post.PoST.SignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalPoST.g:889:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalPoST.g:889:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalPoST.g:890:2: iv_ruleRealLiteral= ruleRealLiteral EOF
            {
             newCompositeNode(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRealLiteral=ruleRealLiteral();

            state._fsp--;

             current =iv_ruleRealLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalPoST.g:896:1: ruleRealLiteral returns [EObject current=null] : ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_div_2_0= ruleSignedInteger ) ) otherlv_3= '.' ( (lv_mod_4_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_mod_4_0=null;
        EObject lv_div_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:902:2: ( ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_div_2_0= ruleSignedInteger ) ) otherlv_3= '.' ( (lv_mod_4_0= RULE_INTEGER ) ) ) )
            // InternalPoST.g:903:2: ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_div_2_0= ruleSignedInteger ) ) otherlv_3= '.' ( (lv_mod_4_0= RULE_INTEGER ) ) )
            {
            // InternalPoST.g:903:2: ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_div_2_0= ruleSignedInteger ) ) otherlv_3= '.' ( (lv_mod_4_0= RULE_INTEGER ) ) )
            // InternalPoST.g:904:3: ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_div_2_0= ruleSignedInteger ) ) otherlv_3= '.' ( (lv_mod_4_0= RULE_INTEGER ) )
            {
            // InternalPoST.g:904:3: ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_REAL_TYPE_NAME) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPoST.g:905:4: ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#'
                    {
                    // InternalPoST.g:905:4: ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) )
                    // InternalPoST.g:906:5: (lv_type_0_0= RULE_REAL_TYPE_NAME )
                    {
                    // InternalPoST.g:906:5: (lv_type_0_0= RULE_REAL_TYPE_NAME )
                    // InternalPoST.g:907:6: lv_type_0_0= RULE_REAL_TYPE_NAME
                    {
                    lv_type_0_0=(Token)match(input,RULE_REAL_TYPE_NAME,FOLLOW_11); 

                    						newLeafNode(lv_type_0_0, grammarAccess.getRealLiteralAccess().getTypeREAL_TYPE_NAMETerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRealLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_0_0,
                    							"su.nsk.iae.post.PoST.REAL_TYPE_NAME");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPoST.g:928:3: ( (lv_div_2_0= ruleSignedInteger ) )
            // InternalPoST.g:929:4: (lv_div_2_0= ruleSignedInteger )
            {
            // InternalPoST.g:929:4: (lv_div_2_0= ruleSignedInteger )
            // InternalPoST.g:930:5: lv_div_2_0= ruleSignedInteger
            {

            					newCompositeNode(grammarAccess.getRealLiteralAccess().getDivSignedIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_div_2_0=ruleSignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRealLiteralRule());
            					}
            					set(
            						current,
            						"div",
            						lv_div_2_0,
            						"su.nsk.iae.post.PoST.SignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getRealLiteralAccess().getFullStopKeyword_2());
            		
            // InternalPoST.g:951:3: ( (lv_mod_4_0= RULE_INTEGER ) )
            // InternalPoST.g:952:4: (lv_mod_4_0= RULE_INTEGER )
            {
            // InternalPoST.g:952:4: (lv_mod_4_0= RULE_INTEGER )
            // InternalPoST.g:953:5: lv_mod_4_0= RULE_INTEGER
            {
            lv_mod_4_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

            					newLeafNode(lv_mod_4_0, grammarAccess.getRealLiteralAccess().getModINTEGERTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"mod",
            						lv_mod_4_0,
            						"su.nsk.iae.post.PoST.INTEGER");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRealLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001800000F00L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400003E40L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400002C00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});

}