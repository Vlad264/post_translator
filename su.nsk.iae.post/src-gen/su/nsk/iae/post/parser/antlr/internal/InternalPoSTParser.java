package su.nsk.iae.post.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_ATMEGA168_PLC_LITERAL", "RULE_SINGLE_DECLARATION", "RULE_INTERVAL_DECLARATION", "RULE_PRIORITY_DECLARATION", "RULE_INTEGER", "RULE_OR_OPERATOR", "RULE_XOR_OPERATOR", "RULE_AND_OPERATOR", "RULE_POWER_OPERATOR", "RULE_UNARY_OPERATOR", "RULE_SUBPROGRAM_CONTROL_STATEMENT", "RULE_EXIT_STATEMENT", "RULE_DIRECT_VARIABLE", "RULE_TIME_PREF_LITERAL", "RULE_INTERVAL", "RULE_BIT_STRING_TYPE_NAME", "RULE_TIME_TYPE_NAME", "RULE_STRING_TYPE_NAME", "RULE_REAL_TYPE_NAME", "RULE_SIGNED_INTEGER_TYPE_NAME", "RULE_UNSIGNED_INTEGER_TYPE_NAME", "RULE_BINARY_INTEGER", "RULE_OCTAL_INTEGER", "RULE_HEX_INTEGER", "RULE_BOOLEAN_LITERAL", "RULE_REAL", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_DIGIT", "RULE_BIT", "RULE_OCTAL_DIGIT", "RULE_HEX_DIGIT", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CONFIGURATION'", "'END_CONFIGURATION'", "'RESOURCE'", "'ON'", "'END_RESOURCE'", "';'", "'TASK'", "'('", "')'", "':='", "','", "'PROGRAM'", "'WITH'", "':'", "'END_PROGRAM'", "'PROCESS'", "'END_PROCESS'", "'STATE'", "'END_STATE'", "'SET'", "'NEXT'", "'IN'", "'STOP'", "'ERROR'", "'START'", "'TIMEOUT'", "'THEN'", "'END_TIMEOUT'", "'RESET'", "'TIMER'", "'IF'", "'ELSEIF'", "'ELSE'", "'END_IF'", "'CASE'", "'OF'", "'END_CASE'", "'FOR'", "'DO'", "'END_FOR'", "'TO'", "'BY'", "'WHILE'", "'END_WHILE'", "'REPEAT'", "'UNTIL'", "'END_REPEAT'", "'VAR_INPUT'", "'END_VAR'", "'VAR_OUTPUT'", "'VAR_IN_OUT'", "'VAR'", "'CONSTANT'", "'VAR_TEMP'", "'VAR_EXTERNAL'", "'VAR_GLOBAL'", "'AT'", "'#'", "'-'", "'=>'", "'='", "'<>'", "'<'", "'>'", "'<='", "'>='", "'+'", "'*'", "'/'", "'MOD'"
    };
    public static final int T__50=50;
    public static final int RULE_PRIORITY_DECLARATION=8;
    public static final int RULE_INTERVAL=19;
    public static final int RULE_BIT=34;
    public static final int RULE_SINGLE_DECLARATION=6;
    public static final int T__59=59;
    public static final int RULE_SIGNED_INTEGER_TYPE_NAME=24;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_REAL_TYPE_NAME=23;
    public static final int RULE_BOOLEAN_LITERAL=29;
    public static final int RULE_REAL=30;
    public static final int RULE_DIGIT=33;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=38;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int RULE_BIT_STRING_TYPE_NAME=20;
    public static final int T__65=65;
    public static final int RULE_ATMEGA168_PLC_LITERAL=5;
    public static final int RULE_DIRECT_VARIABLE=17;
    public static final int RULE_OR_OPERATOR=10;
    public static final int RULE_XOR_OPERATOR=11;
    public static final int RULE_HEX_INTEGER=28;
    public static final int RULE_TIME_TYPE_NAME=21;
    public static final int RULE_STRING_TYPE_NAME=22;
    public static final int RULE_OCTAL_DIGIT=35;
    public static final int RULE_AND_OPERATOR=12;
    public static final int RULE_LETTER=37;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_HEX_DIGIT=36;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int RULE_INTERVAL_DECLARATION=7;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int RULE_SUBPROGRAM_CONTROL_STATEMENT=15;
    public static final int T__90=90;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int RULE_UNSIGNED_INTEGER_TYPE_NAME=25;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DIRECT_SIZE_PREFIX=32;
    public static final int RULE_UNARY_OPERATOR=14;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_DIRECT_TYPE_PREFIX=31;
    public static final int RULE_POWER_OPERATOR=13;
    public static final int RULE_BINARY_INTEGER=26;
    public static final int RULE_SL_COMMENT=39;
    public static final int RULE_EXIT_STATEMENT=16;
    public static final int RULE_TIME_PREF_LITERAL=18;
    public static final int T__77=77;
    public static final int RULE_OCTAL_INTEGER=27;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=40;
    public static final int RULE_ANY_OTHER=41;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int RULE_INTEGER=9;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalPoST.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalPoST.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalPoST.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalPoST.g:72:1: ruleModel returns [EObject current=null] : ( ( (lv_conf_0_0= ruleConfiguration ) )? ( (lv_programs_1_0= ruleProgram ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_conf_0_0 = null;

        EObject lv_programs_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:78:2: ( ( ( (lv_conf_0_0= ruleConfiguration ) )? ( (lv_programs_1_0= ruleProgram ) )* ) )
            // InternalPoST.g:79:2: ( ( (lv_conf_0_0= ruleConfiguration ) )? ( (lv_programs_1_0= ruleProgram ) )* )
            {
            // InternalPoST.g:79:2: ( ( (lv_conf_0_0= ruleConfiguration ) )? ( (lv_programs_1_0= ruleProgram ) )* )
            // InternalPoST.g:80:3: ( (lv_conf_0_0= ruleConfiguration ) )? ( (lv_programs_1_0= ruleProgram ) )*
            {
            // InternalPoST.g:80:3: ( (lv_conf_0_0= ruleConfiguration ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==42) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalPoST.g:81:4: (lv_conf_0_0= ruleConfiguration )
                    {
                    // InternalPoST.g:81:4: (lv_conf_0_0= ruleConfiguration )
                    // InternalPoST.g:82:5: lv_conf_0_0= ruleConfiguration
                    {

                    					newCompositeNode(grammarAccess.getModelAccess().getConfConfigurationParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_conf_0_0=ruleConfiguration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getModelRule());
                    					}
                    					set(
                    						current,
                    						"conf",
                    						lv_conf_0_0,
                    						"su.nsk.iae.post.PoST.Configuration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:99:3: ( (lv_programs_1_0= ruleProgram ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==53) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalPoST.g:100:4: (lv_programs_1_0= ruleProgram )
            	    {
            	    // InternalPoST.g:100:4: (lv_programs_1_0= ruleProgram )
            	    // InternalPoST.g:101:5: lv_programs_1_0= ruleProgram
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getProgramsProgramParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_programs_1_0=ruleProgram();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"programs",
            	    						lv_programs_1_0,
            	    						"su.nsk.iae.post.PoST.Program");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleConfiguration"
    // InternalPoST.g:122:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalPoST.g:122:54: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalPoST.g:123:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
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
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalPoST.g:129:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'CONFIGURATION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )* ( (lv_resources_3_0= ruleResource ) )* otherlv_4= 'END_CONFIGURATION' ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_confGlobVars_2_0 = null;

        EObject lv_resources_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:135:2: ( (otherlv_0= 'CONFIGURATION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )* ( (lv_resources_3_0= ruleResource ) )* otherlv_4= 'END_CONFIGURATION' ) )
            // InternalPoST.g:136:2: (otherlv_0= 'CONFIGURATION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )* ( (lv_resources_3_0= ruleResource ) )* otherlv_4= 'END_CONFIGURATION' )
            {
            // InternalPoST.g:136:2: (otherlv_0= 'CONFIGURATION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )* ( (lv_resources_3_0= ruleResource ) )* otherlv_4= 'END_CONFIGURATION' )
            // InternalPoST.g:137:3: otherlv_0= 'CONFIGURATION' ( (lv_name_1_0= RULE_ID ) ) ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )* ( (lv_resources_3_0= ruleResource ) )* otherlv_4= 'END_CONFIGURATION'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getCONFIGURATIONKeyword_0());
            		
            // InternalPoST.g:141:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:142:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:142:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:143:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            // InternalPoST.g:159:3: ( (lv_confGlobVars_2_0= ruleGlobalVarDeclaration ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==97) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPoST.g:160:4: (lv_confGlobVars_2_0= ruleGlobalVarDeclaration )
            	    {
            	    // InternalPoST.g:160:4: (lv_confGlobVars_2_0= ruleGlobalVarDeclaration )
            	    // InternalPoST.g:161:5: lv_confGlobVars_2_0= ruleGlobalVarDeclaration
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getConfGlobVarsGlobalVarDeclarationParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_confGlobVars_2_0=ruleGlobalVarDeclaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"confGlobVars",
            	    						lv_confGlobVars_2_0,
            	    						"su.nsk.iae.post.PoST.GlobalVarDeclaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalPoST.g:178:3: ( (lv_resources_3_0= ruleResource ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==44) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPoST.g:179:4: (lv_resources_3_0= ruleResource )
            	    {
            	    // InternalPoST.g:179:4: (lv_resources_3_0= ruleResource )
            	    // InternalPoST.g:180:5: lv_resources_3_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getConfigurationAccess().getResourcesResourceParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_resources_3_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_3_0,
            	    						"su.nsk.iae.post.PoST.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,43,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getEND_CONFIGURATIONKeyword_4());
            		

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
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleResource"
    // InternalPoST.g:205:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalPoST.g:205:49: (iv_ruleResource= ruleResource EOF )
            // InternalPoST.g:206:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalPoST.g:212:1: ruleResource returns [EObject current=null] : (otherlv_0= 'RESOURCE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ON' ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) ) ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )? ( (lv_resStatement_5_0= ruleSingleResource ) ) otherlv_6= 'END_RESOURCE' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_1=null;
        Token lv_type_3_2=null;
        Token otherlv_6=null;
        EObject lv_resGlobVars_4_0 = null;

        EObject lv_resStatement_5_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:218:2: ( (otherlv_0= 'RESOURCE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ON' ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) ) ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )? ( (lv_resStatement_5_0= ruleSingleResource ) ) otherlv_6= 'END_RESOURCE' ) )
            // InternalPoST.g:219:2: (otherlv_0= 'RESOURCE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ON' ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) ) ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )? ( (lv_resStatement_5_0= ruleSingleResource ) ) otherlv_6= 'END_RESOURCE' )
            {
            // InternalPoST.g:219:2: (otherlv_0= 'RESOURCE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ON' ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) ) ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )? ( (lv_resStatement_5_0= ruleSingleResource ) ) otherlv_6= 'END_RESOURCE' )
            // InternalPoST.g:220:3: otherlv_0= 'RESOURCE' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'ON' ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) ) ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )? ( (lv_resStatement_5_0= ruleSingleResource ) ) otherlv_6= 'END_RESOURCE'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getRESOURCEKeyword_0());
            		
            // InternalPoST.g:224:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:225:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:225:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:226:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,45,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getONKeyword_2());
            		
            // InternalPoST.g:246:3: ( ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) ) )
            // InternalPoST.g:247:4: ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) )
            {
            // InternalPoST.g:247:4: ( (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID ) )
            // InternalPoST.g:248:5: (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID )
            {
            // InternalPoST.g:248:5: (lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL | lv_type_3_2= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ATMEGA168_PLC_LITERAL) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPoST.g:249:6: lv_type_3_1= RULE_ATMEGA168_PLC_LITERAL
                    {
                    lv_type_3_1=(Token)match(input,RULE_ATMEGA168_PLC_LITERAL,FOLLOW_9); 

                    						newLeafNode(lv_type_3_1, grammarAccess.getResourceAccess().getTypeATMEGA168_PLC_LITERALTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_1,
                    							"su.nsk.iae.post.PoST.ATMEGA168_PLC_LITERAL");
                    					

                    }
                    break;
                case 2 :
                    // InternalPoST.g:264:6: lv_type_3_2= RULE_ID
                    {
                    lv_type_3_2=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_type_3_2, grammarAccess.getResourceAccess().getTypeIDTerminalRuleCall_3_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"type",
                    							lv_type_3_2,
                    							"su.nsk.iae.post.PoST.ID");
                    					

                    }
                    break;

            }


            }


            }

            // InternalPoST.g:281:3: ( (lv_resGlobVars_4_0= ruleGlobalVarDeclaration ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==97) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalPoST.g:282:4: (lv_resGlobVars_4_0= ruleGlobalVarDeclaration )
                    {
                    // InternalPoST.g:282:4: (lv_resGlobVars_4_0= ruleGlobalVarDeclaration )
                    // InternalPoST.g:283:5: lv_resGlobVars_4_0= ruleGlobalVarDeclaration
                    {

                    					newCompositeNode(grammarAccess.getResourceAccess().getResGlobVarsGlobalVarDeclarationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_10);
                    lv_resGlobVars_4_0=ruleGlobalVarDeclaration();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getResourceRule());
                    					}
                    					add(
                    						current,
                    						"resGlobVars",
                    						lv_resGlobVars_4_0,
                    						"su.nsk.iae.post.PoST.GlobalVarDeclaration");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:300:3: ( (lv_resStatement_5_0= ruleSingleResource ) )
            // InternalPoST.g:301:4: (lv_resStatement_5_0= ruleSingleResource )
            {
            // InternalPoST.g:301:4: (lv_resStatement_5_0= ruleSingleResource )
            // InternalPoST.g:302:5: lv_resStatement_5_0= ruleSingleResource
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getResStatementSingleResourceParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_resStatement_5_0=ruleSingleResource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"resStatement",
            						lv_resStatement_5_0,
            						"su.nsk.iae.post.PoST.SingleResource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,46,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getEND_RESOURCEKeyword_6());
            		

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleSingleResource"
    // InternalPoST.g:327:1: entryRuleSingleResource returns [EObject current=null] : iv_ruleSingleResource= ruleSingleResource EOF ;
    public final EObject entryRuleSingleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleResource = null;


        try {
            // InternalPoST.g:327:55: (iv_ruleSingleResource= ruleSingleResource EOF )
            // InternalPoST.g:328:2: iv_ruleSingleResource= ruleSingleResource EOF
            {
             newCompositeNode(grammarAccess.getSingleResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleResource=ruleSingleResource();

            state._fsp--;

             current =iv_ruleSingleResource; 
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
    // $ANTLR end "entryRuleSingleResource"


    // $ANTLR start "ruleSingleResource"
    // InternalPoST.g:334:1: ruleSingleResource returns [EObject current=null] : ( () ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )* ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )* ) ;
    public final EObject ruleSingleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tasks_1_0 = null;

        EObject lv_programConfs_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:340:2: ( ( () ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )* ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )* ) )
            // InternalPoST.g:341:2: ( () ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )* ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )* )
            {
            // InternalPoST.g:341:2: ( () ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )* ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )* )
            // InternalPoST.g:342:3: () ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )* ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )*
            {
            // InternalPoST.g:342:3: ()
            // InternalPoST.g:343:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSingleResourceAccess().getSingleResourceAction_0(),
            					current);
            			

            }

            // InternalPoST.g:349:3: ( ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPoST.g:350:4: ( (lv_tasks_1_0= ruleTask ) ) otherlv_2= ';'
            	    {
            	    // InternalPoST.g:350:4: ( (lv_tasks_1_0= ruleTask ) )
            	    // InternalPoST.g:351:5: (lv_tasks_1_0= ruleTask )
            	    {
            	    // InternalPoST.g:351:5: (lv_tasks_1_0= ruleTask )
            	    // InternalPoST.g:352:6: lv_tasks_1_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getSingleResourceAccess().getTasksTaskParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_tasks_1_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSingleResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_1_0,
            	    							"su.nsk.iae.post.PoST.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_13); 

            	    				newLeafNode(otherlv_2, grammarAccess.getSingleResourceAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalPoST.g:374:3: ( ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==53) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalPoST.g:375:4: ( (lv_programConfs_3_0= ruleProgramConfiguration ) ) otherlv_4= ';'
            	    {
            	    // InternalPoST.g:375:4: ( (lv_programConfs_3_0= ruleProgramConfiguration ) )
            	    // InternalPoST.g:376:5: (lv_programConfs_3_0= ruleProgramConfiguration )
            	    {
            	    // InternalPoST.g:376:5: (lv_programConfs_3_0= ruleProgramConfiguration )
            	    // InternalPoST.g:377:6: lv_programConfs_3_0= ruleProgramConfiguration
            	    {

            	    						newCompositeNode(grammarAccess.getSingleResourceAccess().getProgramConfsProgramConfigurationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_programConfs_3_0=ruleProgramConfiguration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSingleResourceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"programConfs",
            	    							lv_programConfs_3_0,
            	    							"su.nsk.iae.post.PoST.ProgramConfiguration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_4=(Token)match(input,47,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getSingleResourceAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleSingleResource"


    // $ANTLR start "entryRuleTask"
    // InternalPoST.g:403:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalPoST.g:403:45: (iv_ruleTask= ruleTask EOF )
            // InternalPoST.g:404:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalPoST.g:410:1: ruleTask returns [EObject current=null] : (otherlv_0= 'TASK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_init_3_0= ruleTaskInitialization ) ) otherlv_4= ')' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_init_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:416:2: ( (otherlv_0= 'TASK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_init_3_0= ruleTaskInitialization ) ) otherlv_4= ')' ) )
            // InternalPoST.g:417:2: (otherlv_0= 'TASK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_init_3_0= ruleTaskInitialization ) ) otherlv_4= ')' )
            {
            // InternalPoST.g:417:2: (otherlv_0= 'TASK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_init_3_0= ruleTaskInitialization ) ) otherlv_4= ')' )
            // InternalPoST.g:418:3: otherlv_0= 'TASK' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_init_3_0= ruleTaskInitialization ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTASKKeyword_0());
            		
            // InternalPoST.g:422:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:423:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:423:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:424:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,49,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPoST.g:444:3: ( (lv_init_3_0= ruleTaskInitialization ) )
            // InternalPoST.g:445:4: (lv_init_3_0= ruleTaskInitialization )
            {
            // InternalPoST.g:445:4: (lv_init_3_0= ruleTaskInitialization )
            // InternalPoST.g:446:5: lv_init_3_0= ruleTaskInitialization
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getInitTaskInitializationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_16);
            lv_init_3_0=ruleTaskInitialization();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"init",
            						lv_init_3_0,
            						"su.nsk.iae.post.PoST.TaskInitialization");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleTaskInitialization"
    // InternalPoST.g:471:1: entryRuleTaskInitialization returns [EObject current=null] : iv_ruleTaskInitialization= ruleTaskInitialization EOF ;
    public final EObject entryRuleTaskInitialization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTaskInitialization = null;


        try {
            // InternalPoST.g:471:59: (iv_ruleTaskInitialization= ruleTaskInitialization EOF )
            // InternalPoST.g:472:2: iv_ruleTaskInitialization= ruleTaskInitialization EOF
            {
             newCompositeNode(grammarAccess.getTaskInitializationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTaskInitialization=ruleTaskInitialization();

            state._fsp--;

             current =iv_ruleTaskInitialization; 
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
    // $ANTLR end "entryRuleTaskInitialization"


    // $ANTLR start "ruleTaskInitialization"
    // InternalPoST.g:478:1: ruleTaskInitialization returns [EObject current=null] : ( (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) ) | ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) ) ) ;
    public final EObject ruleTaskInitialization() throws RecognitionException {
        EObject current = null;

        Token this_SINGLE_DECLARATION_0=null;
        Token otherlv_1=null;
        Token this_INTERVAL_DECLARATION_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token this_PRIORITY_DECLARATION_7=null;
        Token otherlv_8=null;
        Token lv_priority_9_0=null;
        EObject lv_single_2_0 = null;

        EObject lv_interval_5_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:484:2: ( ( (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) ) | ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) ) ) )
            // InternalPoST.g:485:2: ( (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) ) | ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) ) )
            {
            // InternalPoST.g:485:2: ( (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) ) | ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_SINGLE_DECLARATION) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INTERVAL_DECLARATION) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:486:3: (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) )
                    {
                    // InternalPoST.g:486:3: (this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) ) )
                    // InternalPoST.g:487:4: this_SINGLE_DECLARATION_0= RULE_SINGLE_DECLARATION otherlv_1= ':=' ( (lv_single_2_0= ruleConstant ) )
                    {
                    this_SINGLE_DECLARATION_0=(Token)match(input,RULE_SINGLE_DECLARATION,FOLLOW_17); 

                    				newLeafNode(this_SINGLE_DECLARATION_0, grammarAccess.getTaskInitializationAccess().getSINGLE_DECLARATIONTerminalRuleCall_0_0());
                    			
                    otherlv_1=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_1, grammarAccess.getTaskInitializationAccess().getColonEqualsSignKeyword_0_1());
                    			
                    // InternalPoST.g:495:4: ( (lv_single_2_0= ruleConstant ) )
                    // InternalPoST.g:496:5: (lv_single_2_0= ruleConstant )
                    {
                    // InternalPoST.g:496:5: (lv_single_2_0= ruleConstant )
                    // InternalPoST.g:497:6: lv_single_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getTaskInitializationAccess().getSingleConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_single_2_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskInitializationRule());
                    						}
                    						set(
                    							current,
                    							"single",
                    							lv_single_2_0,
                    							"su.nsk.iae.post.PoST.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:516:3: ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) )
                    {
                    // InternalPoST.g:516:3: ( (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) ) )
                    // InternalPoST.g:517:4: (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) ) otherlv_6= ',' this_PRIORITY_DECLARATION_7= RULE_PRIORITY_DECLARATION otherlv_8= ':=' ( (lv_priority_9_0= RULE_INTEGER ) )
                    {
                    // InternalPoST.g:517:4: (this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) ) )
                    // InternalPoST.g:518:5: this_INTERVAL_DECLARATION_3= RULE_INTERVAL_DECLARATION otherlv_4= ':=' ( (lv_interval_5_0= ruleConstant ) )
                    {
                    this_INTERVAL_DECLARATION_3=(Token)match(input,RULE_INTERVAL_DECLARATION,FOLLOW_17); 

                    					newLeafNode(this_INTERVAL_DECLARATION_3, grammarAccess.getTaskInitializationAccess().getINTERVAL_DECLARATIONTerminalRuleCall_1_0_0());
                    				
                    otherlv_4=(Token)match(input,51,FOLLOW_18); 

                    					newLeafNode(otherlv_4, grammarAccess.getTaskInitializationAccess().getColonEqualsSignKeyword_1_0_1());
                    				
                    // InternalPoST.g:526:5: ( (lv_interval_5_0= ruleConstant ) )
                    // InternalPoST.g:527:6: (lv_interval_5_0= ruleConstant )
                    {
                    // InternalPoST.g:527:6: (lv_interval_5_0= ruleConstant )
                    // InternalPoST.g:528:7: lv_interval_5_0= ruleConstant
                    {

                    							newCompositeNode(grammarAccess.getTaskInitializationAccess().getIntervalConstantParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_interval_5_0=ruleConstant();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTaskInitializationRule());
                    							}
                    							set(
                    								current,
                    								"interval",
                    								lv_interval_5_0,
                    								"su.nsk.iae.post.PoST.Constant");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_6=(Token)match(input,52,FOLLOW_20); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskInitializationAccess().getCommaKeyword_1_1());
                    			
                    this_PRIORITY_DECLARATION_7=(Token)match(input,RULE_PRIORITY_DECLARATION,FOLLOW_17); 

                    				newLeafNode(this_PRIORITY_DECLARATION_7, grammarAccess.getTaskInitializationAccess().getPRIORITY_DECLARATIONTerminalRuleCall_1_2());
                    			
                    otherlv_8=(Token)match(input,51,FOLLOW_21); 

                    				newLeafNode(otherlv_8, grammarAccess.getTaskInitializationAccess().getColonEqualsSignKeyword_1_3());
                    			
                    // InternalPoST.g:558:4: ( (lv_priority_9_0= RULE_INTEGER ) )
                    // InternalPoST.g:559:5: (lv_priority_9_0= RULE_INTEGER )
                    {
                    // InternalPoST.g:559:5: (lv_priority_9_0= RULE_INTEGER )
                    // InternalPoST.g:560:6: lv_priority_9_0= RULE_INTEGER
                    {
                    lv_priority_9_0=(Token)match(input,RULE_INTEGER,FOLLOW_2); 

                    						newLeafNode(lv_priority_9_0, grammarAccess.getTaskInitializationAccess().getPriorityINTEGERTerminalRuleCall_1_4_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskInitializationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"priority",
                    							lv_priority_9_0,
                    							"su.nsk.iae.post.PoST.INTEGER");
                    					

                    }


                    }


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
    // $ANTLR end "ruleTaskInitialization"


    // $ANTLR start "entryRuleProgramConfiguration"
    // InternalPoST.g:581:1: entryRuleProgramConfiguration returns [EObject current=null] : iv_ruleProgramConfiguration= ruleProgramConfiguration EOF ;
    public final EObject entryRuleProgramConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramConfiguration = null;


        try {
            // InternalPoST.g:581:61: (iv_ruleProgramConfiguration= ruleProgramConfiguration EOF )
            // InternalPoST.g:582:2: iv_ruleProgramConfiguration= ruleProgramConfiguration EOF
            {
             newCompositeNode(grammarAccess.getProgramConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramConfiguration=ruleProgramConfiguration();

            state._fsp--;

             current =iv_ruleProgramConfiguration; 
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
    // $ANTLR end "entryRuleProgramConfiguration"


    // $ANTLR start "ruleProgramConfiguration"
    // InternalPoST.g:588:1: ruleProgramConfiguration returns [EObject current=null] : (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )? ) ;
    public final EObject ruleProgramConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_agrs_7_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:594:2: ( (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )? ) )
            // InternalPoST.g:595:2: (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )? )
            {
            // InternalPoST.g:595:2: (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )? )
            // InternalPoST.g:596:3: otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= ':' ( (otherlv_5= RULE_ID ) ) (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramConfigurationAccess().getPROGRAMKeyword_0());
            		
            // InternalPoST.g:600:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:601:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:601:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:602:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramConfigurationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramConfigurationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            // InternalPoST.g:618:3: (otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==54) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPoST.g:619:4: otherlv_2= 'WITH' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getProgramConfigurationAccess().getWITHKeyword_2_0());
                    			
                    // InternalPoST.g:623:4: ( (otherlv_3= RULE_ID ) )
                    // InternalPoST.g:624:5: (otherlv_3= RULE_ID )
                    {
                    // InternalPoST.g:624:5: (otherlv_3= RULE_ID )
                    // InternalPoST.g:625:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProgramConfigurationRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getProgramConfigurationAccess().getTaskTaskCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,55,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getProgramConfigurationAccess().getColonKeyword_3());
            		
            // InternalPoST.g:641:3: ( (otherlv_5= RULE_ID ) )
            // InternalPoST.g:642:4: (otherlv_5= RULE_ID )
            {
            // InternalPoST.g:642:4: (otherlv_5= RULE_ID )
            // InternalPoST.g:643:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramConfigurationRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_5, grammarAccess.getProgramConfigurationAccess().getProgramProgramCrossReference_4_0());
            				

            }


            }

            // InternalPoST.g:654:3: (otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPoST.g:655:4: otherlv_6= '(' ( (lv_agrs_7_0= ruleProgramConfElements ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,49,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getProgramConfigurationAccess().getLeftParenthesisKeyword_5_0());
                    			
                    // InternalPoST.g:659:4: ( (lv_agrs_7_0= ruleProgramConfElements ) )
                    // InternalPoST.g:660:5: (lv_agrs_7_0= ruleProgramConfElements )
                    {
                    // InternalPoST.g:660:5: (lv_agrs_7_0= ruleProgramConfElements )
                    // InternalPoST.g:661:6: lv_agrs_7_0= ruleProgramConfElements
                    {

                    						newCompositeNode(grammarAccess.getProgramConfigurationAccess().getAgrsProgramConfElementsParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_agrs_7_0=ruleProgramConfElements();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getProgramConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"agrs",
                    							lv_agrs_7_0,
                    							"su.nsk.iae.post.PoST.ProgramConfElements");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getProgramConfigurationAccess().getRightParenthesisKeyword_5_2());
                    			

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
    // $ANTLR end "ruleProgramConfiguration"


    // $ANTLR start "entryRuleProgramConfElements"
    // InternalPoST.g:687:1: entryRuleProgramConfElements returns [EObject current=null] : iv_ruleProgramConfElements= ruleProgramConfElements EOF ;
    public final EObject entryRuleProgramConfElements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramConfElements = null;


        try {
            // InternalPoST.g:687:60: (iv_ruleProgramConfElements= ruleProgramConfElements EOF )
            // InternalPoST.g:688:2: iv_ruleProgramConfElements= ruleProgramConfElements EOF
            {
             newCompositeNode(grammarAccess.getProgramConfElementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramConfElements=ruleProgramConfElements();

            state._fsp--;

             current =iv_ruleProgramConfElements; 
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
    // $ANTLR end "entryRuleProgramConfElements"


    // $ANTLR start "ruleProgramConfElements"
    // InternalPoST.g:694:1: ruleProgramConfElements returns [EObject current=null] : ( ( (lv_elements_0_0= ruleProgramConfElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )* ) ;
    public final EObject ruleProgramConfElements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:700:2: ( ( ( (lv_elements_0_0= ruleProgramConfElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )* ) )
            // InternalPoST.g:701:2: ( ( (lv_elements_0_0= ruleProgramConfElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )* )
            {
            // InternalPoST.g:701:2: ( ( (lv_elements_0_0= ruleProgramConfElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )* )
            // InternalPoST.g:702:3: ( (lv_elements_0_0= ruleProgramConfElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )*
            {
            // InternalPoST.g:702:3: ( (lv_elements_0_0= ruleProgramConfElement ) )
            // InternalPoST.g:703:4: (lv_elements_0_0= ruleProgramConfElement )
            {
            // InternalPoST.g:703:4: (lv_elements_0_0= ruleProgramConfElement )
            // InternalPoST.g:704:5: lv_elements_0_0= ruleProgramConfElement
            {

            					newCompositeNode(grammarAccess.getProgramConfElementsAccess().getElementsProgramConfElementParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_elements_0_0=ruleProgramConfElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramConfElementsRule());
            					}
            					add(
            						current,
            						"elements",
            						lv_elements_0_0,
            						"su.nsk.iae.post.PoST.ProgramConfElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:721:3: (otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==52) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPoST.g:722:4: otherlv_1= ',' ( (lv_elements_2_0= ruleProgramConfElement ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getProgramConfElementsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPoST.g:726:4: ( (lv_elements_2_0= ruleProgramConfElement ) )
            	    // InternalPoST.g:727:5: (lv_elements_2_0= ruleProgramConfElement )
            	    {
            	    // InternalPoST.g:727:5: (lv_elements_2_0= ruleProgramConfElement )
            	    // InternalPoST.g:728:6: lv_elements_2_0= ruleProgramConfElement
            	    {

            	    						newCompositeNode(grammarAccess.getProgramConfElementsAccess().getElementsProgramConfElementParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_elements_2_0=ruleProgramConfElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramConfElementsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elements",
            	    							lv_elements_2_0,
            	    							"su.nsk.iae.post.PoST.ProgramConfElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // $ANTLR end "ruleProgramConfElements"


    // $ANTLR start "entryRuleProgramConfElement"
    // InternalPoST.g:750:1: entryRuleProgramConfElement returns [EObject current=null] : iv_ruleProgramConfElement= ruleProgramConfElement EOF ;
    public final EObject entryRuleProgramConfElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgramConfElement = null;


        try {
            // InternalPoST.g:750:59: (iv_ruleProgramConfElement= ruleProgramConfElement EOF )
            // InternalPoST.g:751:2: iv_ruleProgramConfElement= ruleProgramConfElement EOF
            {
             newCompositeNode(grammarAccess.getProgramConfElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgramConfElement=ruleProgramConfElement();

            state._fsp--;

             current =iv_ruleProgramConfElement; 
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
    // $ANTLR end "entryRuleProgramConfElement"


    // $ANTLR start "ruleProgramConfElement"
    // InternalPoST.g:757:1: ruleProgramConfElement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (lv_assig_1_0= ruleAssignmentType ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleProgramConfElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_assig_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:763:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (lv_assig_1_0= ruleAssignmentType ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalPoST.g:764:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_assig_1_0= ruleAssignmentType ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalPoST.g:764:2: ( ( (otherlv_0= RULE_ID ) ) ( (lv_assig_1_0= ruleAssignmentType ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalPoST.g:765:3: ( (otherlv_0= RULE_ID ) ) ( (lv_assig_1_0= ruleAssignmentType ) ) ( (otherlv_2= RULE_ID ) )
            {
            // InternalPoST.g:765:3: ( (otherlv_0= RULE_ID ) )
            // InternalPoST.g:766:4: (otherlv_0= RULE_ID )
            {
            // InternalPoST.g:766:4: (otherlv_0= RULE_ID )
            // InternalPoST.g:767:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramConfElementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_0, grammarAccess.getProgramConfElementAccess().getProgramVarSymbolicVariableCrossReference_0_0());
            				

            }


            }

            // InternalPoST.g:778:3: ( (lv_assig_1_0= ruleAssignmentType ) )
            // InternalPoST.g:779:4: (lv_assig_1_0= ruleAssignmentType )
            {
            // InternalPoST.g:779:4: (lv_assig_1_0= ruleAssignmentType )
            // InternalPoST.g:780:5: lv_assig_1_0= ruleAssignmentType
            {

            					newCompositeNode(grammarAccess.getProgramConfElementAccess().getAssigAssignmentTypeEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_assig_1_0=ruleAssignmentType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramConfElementRule());
            					}
            					set(
            						current,
            						"assig",
            						lv_assig_1_0,
            						"su.nsk.iae.post.PoST.AssignmentType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:797:3: ( (otherlv_2= RULE_ID ) )
            // InternalPoST.g:798:4: (otherlv_2= RULE_ID )
            {
            // InternalPoST.g:798:4: (otherlv_2= RULE_ID )
            // InternalPoST.g:799:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramConfElementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getProgramConfElementAccess().getGlobVarSymbolicVariableCrossReference_2_0());
            				

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
    // $ANTLR end "ruleProgramConfElement"


    // $ANTLR start "entryRuleProgram"
    // InternalPoST.g:814:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalPoST.g:814:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalPoST.g:815:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalPoST.g:821:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= 'END_PROGRAM' ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_9=null;
        EObject lv_progInVars_2_0 = null;

        EObject lv_progOutVars_3_0 = null;

        EObject lv_progInOutVars_4_0 = null;

        EObject lv_progVars_5_0 = null;

        EObject lv_progTempVars_6_0 = null;

        EObject lv_progExternVars_7_0 = null;

        EObject lv_processes_8_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:827:2: ( (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= 'END_PROGRAM' ) )
            // InternalPoST.g:828:2: (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= 'END_PROGRAM' )
            {
            // InternalPoST.g:828:2: (otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= 'END_PROGRAM' )
            // InternalPoST.g:829:3: otherlv_0= 'PROGRAM' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )* ( (lv_processes_8_0= ruleProcess ) )* otherlv_9= 'END_PROGRAM'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getPROGRAMKeyword_0());
            		
            // InternalPoST.g:833:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:834:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:834:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:835:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            // InternalPoST.g:851:3: ( ( (lv_progInVars_2_0= ruleInputVarDeclaration ) ) | ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) ) | ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) ) | ( (lv_progVars_5_0= ruleVarDeclaration ) ) | ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) ) | ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) ) )*
            loop13:
            do {
                int alt13=7;
                switch ( input.LA(1) ) {
                case 89:
                    {
                    alt13=1;
                    }
                    break;
                case 91:
                    {
                    alt13=2;
                    }
                    break;
                case 92:
                    {
                    alt13=3;
                    }
                    break;
                case 93:
                    {
                    alt13=4;
                    }
                    break;
                case 95:
                    {
                    alt13=5;
                    }
                    break;
                case 96:
                    {
                    alt13=6;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // InternalPoST.g:852:4: ( (lv_progInVars_2_0= ruleInputVarDeclaration ) )
            	    {
            	    // InternalPoST.g:852:4: ( (lv_progInVars_2_0= ruleInputVarDeclaration ) )
            	    // InternalPoST.g:853:5: (lv_progInVars_2_0= ruleInputVarDeclaration )
            	    {
            	    // InternalPoST.g:853:5: (lv_progInVars_2_0= ruleInputVarDeclaration )
            	    // InternalPoST.g:854:6: lv_progInVars_2_0= ruleInputVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgInVarsInputVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progInVars_2_0=ruleInputVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progInVars",
            	    							lv_progInVars_2_0,
            	    							"su.nsk.iae.post.PoST.InputVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPoST.g:872:4: ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) )
            	    {
            	    // InternalPoST.g:872:4: ( (lv_progOutVars_3_0= ruleOutputVarDeclaration ) )
            	    // InternalPoST.g:873:5: (lv_progOutVars_3_0= ruleOutputVarDeclaration )
            	    {
            	    // InternalPoST.g:873:5: (lv_progOutVars_3_0= ruleOutputVarDeclaration )
            	    // InternalPoST.g:874:6: lv_progOutVars_3_0= ruleOutputVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgOutVarsOutputVarDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progOutVars_3_0=ruleOutputVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progOutVars",
            	    							lv_progOutVars_3_0,
            	    							"su.nsk.iae.post.PoST.OutputVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalPoST.g:892:4: ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) )
            	    {
            	    // InternalPoST.g:892:4: ( (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration ) )
            	    // InternalPoST.g:893:5: (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration )
            	    {
            	    // InternalPoST.g:893:5: (lv_progInOutVars_4_0= ruleInputOutputVarDeclaration )
            	    // InternalPoST.g:894:6: lv_progInOutVars_4_0= ruleInputOutputVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgInOutVarsInputOutputVarDeclarationParserRuleCall_2_2_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progInOutVars_4_0=ruleInputOutputVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progInOutVars",
            	    							lv_progInOutVars_4_0,
            	    							"su.nsk.iae.post.PoST.InputOutputVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalPoST.g:912:4: ( (lv_progVars_5_0= ruleVarDeclaration ) )
            	    {
            	    // InternalPoST.g:912:4: ( (lv_progVars_5_0= ruleVarDeclaration ) )
            	    // InternalPoST.g:913:5: (lv_progVars_5_0= ruleVarDeclaration )
            	    {
            	    // InternalPoST.g:913:5: (lv_progVars_5_0= ruleVarDeclaration )
            	    // InternalPoST.g:914:6: lv_progVars_5_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgVarsVarDeclarationParserRuleCall_2_3_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progVars_5_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progVars",
            	    							lv_progVars_5_0,
            	    							"su.nsk.iae.post.PoST.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalPoST.g:932:4: ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) )
            	    {
            	    // InternalPoST.g:932:4: ( (lv_progTempVars_6_0= ruleTempVarDeclaration ) )
            	    // InternalPoST.g:933:5: (lv_progTempVars_6_0= ruleTempVarDeclaration )
            	    {
            	    // InternalPoST.g:933:5: (lv_progTempVars_6_0= ruleTempVarDeclaration )
            	    // InternalPoST.g:934:6: lv_progTempVars_6_0= ruleTempVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgTempVarsTempVarDeclarationParserRuleCall_2_4_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progTempVars_6_0=ruleTempVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progTempVars",
            	    							lv_progTempVars_6_0,
            	    							"su.nsk.iae.post.PoST.TempVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalPoST.g:952:4: ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) )
            	    {
            	    // InternalPoST.g:952:4: ( (lv_progExternVars_7_0= ruleExternalVarDeclaration ) )
            	    // InternalPoST.g:953:5: (lv_progExternVars_7_0= ruleExternalVarDeclaration )
            	    {
            	    // InternalPoST.g:953:5: (lv_progExternVars_7_0= ruleExternalVarDeclaration )
            	    // InternalPoST.g:954:6: lv_progExternVars_7_0= ruleExternalVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProgramAccess().getProgExternVarsExternalVarDeclarationParserRuleCall_2_5_0());
            	    					
            	    pushFollow(FOLLOW_27);
            	    lv_progExternVars_7_0=ruleExternalVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProgramRule());
            	    						}
            	    						add(
            	    							current,
            	    							"progExternVars",
            	    							lv_progExternVars_7_0,
            	    							"su.nsk.iae.post.PoST.ExternalVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // InternalPoST.g:972:3: ( (lv_processes_8_0= ruleProcess ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==57) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPoST.g:973:4: (lv_processes_8_0= ruleProcess )
            	    {
            	    // InternalPoST.g:973:4: (lv_processes_8_0= ruleProcess )
            	    // InternalPoST.g:974:5: lv_processes_8_0= ruleProcess
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getProcessesProcessParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_processes_8_0=ruleProcess();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"processes",
            	    						lv_processes_8_0,
            	    						"su.nsk.iae.post.PoST.Process");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_9=(Token)match(input,56,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getProgramAccess().getEND_PROGRAMKeyword_4());
            		

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleProcess"
    // InternalPoST.g:999:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalPoST.g:999:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalPoST.g:1000:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalPoST.g:1006:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'PROCESS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= 'END_PROCESS' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_5=null;
        EObject lv_procVars_2_0 = null;

        EObject lv_procTempVars_3_0 = null;

        EObject lv_states_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1012:2: ( (otherlv_0= 'PROCESS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= 'END_PROCESS' ) )
            // InternalPoST.g:1013:2: (otherlv_0= 'PROCESS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= 'END_PROCESS' )
            {
            // InternalPoST.g:1013:2: (otherlv_0= 'PROCESS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= 'END_PROCESS' )
            // InternalPoST.g:1014:3: otherlv_0= 'PROCESS' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )* ( (lv_states_4_0= ruleState ) )* otherlv_5= 'END_PROCESS'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getPROCESSKeyword_0());
            		
            // InternalPoST.g:1018:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:1019:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:1019:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:1020:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            // InternalPoST.g:1036:3: ( ( (lv_procVars_2_0= ruleVarDeclaration ) ) | ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==93) ) {
                    alt15=1;
                }
                else if ( (LA15_0==95) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPoST.g:1037:4: ( (lv_procVars_2_0= ruleVarDeclaration ) )
            	    {
            	    // InternalPoST.g:1037:4: ( (lv_procVars_2_0= ruleVarDeclaration ) )
            	    // InternalPoST.g:1038:5: (lv_procVars_2_0= ruleVarDeclaration )
            	    {
            	    // InternalPoST.g:1038:5: (lv_procVars_2_0= ruleVarDeclaration )
            	    // InternalPoST.g:1039:6: lv_procVars_2_0= ruleVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getProcVarsVarDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_procVars_2_0=ruleVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procVars",
            	    							lv_procVars_2_0,
            	    							"su.nsk.iae.post.PoST.VarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPoST.g:1057:4: ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) )
            	    {
            	    // InternalPoST.g:1057:4: ( (lv_procTempVars_3_0= ruleTempVarDeclaration ) )
            	    // InternalPoST.g:1058:5: (lv_procTempVars_3_0= ruleTempVarDeclaration )
            	    {
            	    // InternalPoST.g:1058:5: (lv_procTempVars_3_0= ruleTempVarDeclaration )
            	    // InternalPoST.g:1059:6: lv_procTempVars_3_0= ruleTempVarDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getProcessAccess().getProcTempVarsTempVarDeclarationParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_29);
            	    lv_procTempVars_3_0=ruleTempVarDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProcessRule());
            	    						}
            	    						add(
            	    							current,
            	    							"procTempVars",
            	    							lv_procTempVars_3_0,
            	    							"su.nsk.iae.post.PoST.TempVarDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalPoST.g:1077:3: ( (lv_states_4_0= ruleState ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==59) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPoST.g:1078:4: (lv_states_4_0= ruleState )
            	    {
            	    // InternalPoST.g:1078:4: (lv_states_4_0= ruleState )
            	    // InternalPoST.g:1079:5: lv_states_4_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getStatesStateParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_states_4_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_4_0,
            	    						"su.nsk.iae.post.PoST.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,58,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessAccess().getEND_PROCESSKeyword_4());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleState"
    // InternalPoST.g:1104:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalPoST.g:1104:46: (iv_ruleState= ruleState EOF )
            // InternalPoST.g:1105:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalPoST.g:1111:1: ruleState returns [EObject current=null] : (otherlv_0= 'STATE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statement_2_0= ruleStatementList ) ) ( (lv_timeout_3_0= ruleTimeoutStatement ) )? otherlv_4= 'END_STATE' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_4=null;
        EObject lv_statement_2_0 = null;

        EObject lv_timeout_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1117:2: ( (otherlv_0= 'STATE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statement_2_0= ruleStatementList ) ) ( (lv_timeout_3_0= ruleTimeoutStatement ) )? otherlv_4= 'END_STATE' ) )
            // InternalPoST.g:1118:2: (otherlv_0= 'STATE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statement_2_0= ruleStatementList ) ) ( (lv_timeout_3_0= ruleTimeoutStatement ) )? otherlv_4= 'END_STATE' )
            {
            // InternalPoST.g:1118:2: (otherlv_0= 'STATE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statement_2_0= ruleStatementList ) ) ( (lv_timeout_3_0= ruleTimeoutStatement ) )? otherlv_4= 'END_STATE' )
            // InternalPoST.g:1119:3: otherlv_0= 'STATE' ( (lv_name_1_0= RULE_ID ) ) ( (lv_statement_2_0= ruleStatementList ) ) ( (lv_timeout_3_0= ruleTimeoutStatement ) )? otherlv_4= 'END_STATE'
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getSTATEKeyword_0());
            		
            // InternalPoST.g:1123:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPoST.g:1124:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPoST.g:1124:4: (lv_name_1_0= RULE_ID )
            // InternalPoST.g:1125:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"su.nsk.iae.post.PoST.ID");
            				

            }


            }

            // InternalPoST.g:1141:3: ( (lv_statement_2_0= ruleStatementList ) )
            // InternalPoST.g:1142:4: (lv_statement_2_0= ruleStatementList )
            {
            // InternalPoST.g:1142:4: (lv_statement_2_0= ruleStatementList )
            // InternalPoST.g:1143:5: lv_statement_2_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getStateAccess().getStatementStatementListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_statement_2_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:1160:3: ( (lv_timeout_3_0= ruleTimeoutStatement ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==67) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalPoST.g:1161:4: (lv_timeout_3_0= ruleTimeoutStatement )
                    {
                    // InternalPoST.g:1161:4: (lv_timeout_3_0= ruleTimeoutStatement )
                    // InternalPoST.g:1162:5: lv_timeout_3_0= ruleTimeoutStatement
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getTimeoutTimeoutStatementParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_timeout_3_0=ruleTimeoutStatement();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					set(
                    						current,
                    						"timeout",
                    						lv_timeout_3_0,
                    						"su.nsk.iae.post.PoST.TimeoutStatement");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,60,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getEND_STATEKeyword_4());
            		

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleSetStateStatement"
    // InternalPoST.g:1187:1: entryRuleSetStateStatement returns [EObject current=null] : iv_ruleSetStateStatement= ruleSetStateStatement EOF ;
    public final EObject entryRuleSetStateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetStateStatement = null;


        try {
            // InternalPoST.g:1187:58: (iv_ruleSetStateStatement= ruleSetStateStatement EOF )
            // InternalPoST.g:1188:2: iv_ruleSetStateStatement= ruleSetStateStatement EOF
            {
             newCompositeNode(grammarAccess.getSetStateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetStateStatement=ruleSetStateStatement();

            state._fsp--;

             current =iv_ruleSetStateStatement; 
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
    // $ANTLR end "entryRuleSetStateStatement"


    // $ANTLR start "ruleSetStateStatement"
    // InternalPoST.g:1194:1: ruleSetStateStatement returns [EObject current=null] : ( () otherlv_1= 'SET' ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) ) ) ;
    public final EObject ruleSetStateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_next_4_0=null;


        	enterRule();

        try {
            // InternalPoST.g:1200:2: ( ( () otherlv_1= 'SET' ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) ) ) )
            // InternalPoST.g:1201:2: ( () otherlv_1= 'SET' ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) ) )
            {
            // InternalPoST.g:1201:2: ( () otherlv_1= 'SET' ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) ) )
            // InternalPoST.g:1202:3: () otherlv_1= 'SET' ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) )
            {
            // InternalPoST.g:1202:3: ()
            // InternalPoST.g:1203:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSetStateStatementAccess().getSetStateStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getSetStateStatementAccess().getSETKeyword_1());
            		
            // InternalPoST.g:1213:3: ( (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) ) | ( (lv_next_4_0= 'NEXT' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==59) ) {
                alt18=1;
            }
            else if ( (LA18_0==62) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalPoST.g:1214:4: (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalPoST.g:1214:4: (otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) ) )
                    // InternalPoST.g:1215:5: otherlv_2= 'STATE' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_4); 

                    					newLeafNode(otherlv_2, grammarAccess.getSetStateStatementAccess().getSTATEKeyword_2_0_0());
                    				
                    // InternalPoST.g:1219:5: ( (otherlv_3= RULE_ID ) )
                    // InternalPoST.g:1220:6: (otherlv_3= RULE_ID )
                    {
                    // InternalPoST.g:1220:6: (otherlv_3= RULE_ID )
                    // InternalPoST.g:1221:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getSetStateStatementRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_3, grammarAccess.getSetStateStatementAccess().getStateStateCrossReference_2_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:1234:4: ( (lv_next_4_0= 'NEXT' ) )
                    {
                    // InternalPoST.g:1234:4: ( (lv_next_4_0= 'NEXT' ) )
                    // InternalPoST.g:1235:5: (lv_next_4_0= 'NEXT' )
                    {
                    // InternalPoST.g:1235:5: (lv_next_4_0= 'NEXT' )
                    // InternalPoST.g:1236:6: lv_next_4_0= 'NEXT'
                    {
                    lv_next_4_0=(Token)match(input,62,FOLLOW_2); 

                    						newLeafNode(lv_next_4_0, grammarAccess.getSetStateStatementAccess().getNextNEXTKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSetStateStatementRule());
                    						}
                    						setWithLastConsumed(current, "next", true, "NEXT");
                    					

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
    // $ANTLR end "ruleSetStateStatement"


    // $ANTLR start "entryRuleProcessStatements"
    // InternalPoST.g:1253:1: entryRuleProcessStatements returns [EObject current=null] : iv_ruleProcessStatements= ruleProcessStatements EOF ;
    public final EObject entryRuleProcessStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessStatements = null;


        try {
            // InternalPoST.g:1253:58: (iv_ruleProcessStatements= ruleProcessStatements EOF )
            // InternalPoST.g:1254:2: iv_ruleProcessStatements= ruleProcessStatements EOF
            {
             newCompositeNode(grammarAccess.getProcessStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessStatements=ruleProcessStatements();

            state._fsp--;

             current =iv_ruleProcessStatements; 
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
    // $ANTLR end "entryRuleProcessStatements"


    // $ANTLR start "ruleProcessStatements"
    // InternalPoST.g:1260:1: ruleProcessStatements returns [EObject current=null] : (this_StartProcessStatement_0= ruleStartProcessStatement | this_StopProcessStatement_1= ruleStopProcessStatement | this_ErrorProcessStatement_2= ruleErrorProcessStatement ) ;
    public final EObject ruleProcessStatements() throws RecognitionException {
        EObject current = null;

        EObject this_StartProcessStatement_0 = null;

        EObject this_StopProcessStatement_1 = null;

        EObject this_ErrorProcessStatement_2 = null;



        	enterRule();

        try {
            // InternalPoST.g:1266:2: ( (this_StartProcessStatement_0= ruleStartProcessStatement | this_StopProcessStatement_1= ruleStopProcessStatement | this_ErrorProcessStatement_2= ruleErrorProcessStatement ) )
            // InternalPoST.g:1267:2: (this_StartProcessStatement_0= ruleStartProcessStatement | this_StopProcessStatement_1= ruleStopProcessStatement | this_ErrorProcessStatement_2= ruleErrorProcessStatement )
            {
            // InternalPoST.g:1267:2: (this_StartProcessStatement_0= ruleStartProcessStatement | this_StopProcessStatement_1= ruleStopProcessStatement | this_ErrorProcessStatement_2= ruleErrorProcessStatement )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt19=1;
                }
                break;
            case 64:
                {
                alt19=2;
                }
                break;
            case 65:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalPoST.g:1268:3: this_StartProcessStatement_0= ruleStartProcessStatement
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementsAccess().getStartProcessStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartProcessStatement_0=ruleStartProcessStatement();

                    state._fsp--;


                    			current = this_StartProcessStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:1277:3: this_StopProcessStatement_1= ruleStopProcessStatement
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementsAccess().getStopProcessStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopProcessStatement_1=ruleStopProcessStatement();

                    state._fsp--;


                    			current = this_StopProcessStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:1286:3: this_ErrorProcessStatement_2= ruleErrorProcessStatement
                    {

                    			newCompositeNode(grammarAccess.getProcessStatementsAccess().getErrorProcessStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ErrorProcessStatement_2=ruleErrorProcessStatement();

                    state._fsp--;


                    			current = this_ErrorProcessStatement_2;
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
    // $ANTLR end "ruleProcessStatements"


    // $ANTLR start "entryRuleProcessStatusExpression"
    // InternalPoST.g:1298:1: entryRuleProcessStatusExpression returns [EObject current=null] : iv_ruleProcessStatusExpression= ruleProcessStatusExpression EOF ;
    public final EObject entryRuleProcessStatusExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessStatusExpression = null;


        try {
            // InternalPoST.g:1298:64: (iv_ruleProcessStatusExpression= ruleProcessStatusExpression EOF )
            // InternalPoST.g:1299:2: iv_ruleProcessStatusExpression= ruleProcessStatusExpression EOF
            {
             newCompositeNode(grammarAccess.getProcessStatusExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessStatusExpression=ruleProcessStatusExpression();

            state._fsp--;

             current =iv_ruleProcessStatusExpression; 
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
    // $ANTLR end "entryRuleProcessStatusExpression"


    // $ANTLR start "ruleProcessStatusExpression"
    // InternalPoST.g:1305:1: ruleProcessStatusExpression returns [EObject current=null] : (otherlv_0= 'PROCESS' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'IN' otherlv_3= 'STATE' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) ) ) ;
    public final EObject ruleProcessStatusExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_stop_5_0=null;
        Token lv_error_6_0=null;


        	enterRule();

        try {
            // InternalPoST.g:1311:2: ( (otherlv_0= 'PROCESS' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'IN' otherlv_3= 'STATE' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) ) ) )
            // InternalPoST.g:1312:2: (otherlv_0= 'PROCESS' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'IN' otherlv_3= 'STATE' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) ) )
            {
            // InternalPoST.g:1312:2: (otherlv_0= 'PROCESS' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'IN' otherlv_3= 'STATE' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) ) )
            // InternalPoST.g:1313:3: otherlv_0= 'PROCESS' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'IN' otherlv_3= 'STATE' ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessStatusExpressionAccess().getPROCESSKeyword_0());
            		
            // InternalPoST.g:1317:3: ( (otherlv_1= RULE_ID ) )
            // InternalPoST.g:1318:4: (otherlv_1= RULE_ID )
            {
            // InternalPoST.g:1318:4: (otherlv_1= RULE_ID )
            // InternalPoST.g:1319:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessStatusExpressionRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_1, grammarAccess.getProcessStatusExpressionAccess().getProcessProcessCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,63,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessStatusExpressionAccess().getINKeyword_2());
            		
            otherlv_3=(Token)match(input,59,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getProcessStatusExpressionAccess().getSTATEKeyword_3());
            		
            // InternalPoST.g:1338:3: ( ( (otherlv_4= RULE_ID ) ) | ( (lv_stop_5_0= 'STOP' ) ) | ( (lv_error_6_0= 'ERROR' ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt20=1;
                }
                break;
            case 64:
                {
                alt20=2;
                }
                break;
            case 65:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalPoST.g:1339:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalPoST.g:1339:4: ( (otherlv_4= RULE_ID ) )
                    // InternalPoST.g:1340:5: (otherlv_4= RULE_ID )
                    {
                    // InternalPoST.g:1340:5: (otherlv_4= RULE_ID )
                    // InternalPoST.g:1341:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessStatusExpressionRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getProcessStatusExpressionAccess().getStateNameStateCrossReference_4_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:1353:4: ( (lv_stop_5_0= 'STOP' ) )
                    {
                    // InternalPoST.g:1353:4: ( (lv_stop_5_0= 'STOP' ) )
                    // InternalPoST.g:1354:5: (lv_stop_5_0= 'STOP' )
                    {
                    // InternalPoST.g:1354:5: (lv_stop_5_0= 'STOP' )
                    // InternalPoST.g:1355:6: lv_stop_5_0= 'STOP'
                    {
                    lv_stop_5_0=(Token)match(input,64,FOLLOW_2); 

                    						newLeafNode(lv_stop_5_0, grammarAccess.getProcessStatusExpressionAccess().getStopSTOPKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessStatusExpressionRule());
                    						}
                    						setWithLastConsumed(current, "stop", true, "STOP");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:1368:4: ( (lv_error_6_0= 'ERROR' ) )
                    {
                    // InternalPoST.g:1368:4: ( (lv_error_6_0= 'ERROR' ) )
                    // InternalPoST.g:1369:5: (lv_error_6_0= 'ERROR' )
                    {
                    // InternalPoST.g:1369:5: (lv_error_6_0= 'ERROR' )
                    // InternalPoST.g:1370:6: lv_error_6_0= 'ERROR'
                    {
                    lv_error_6_0=(Token)match(input,65,FOLLOW_2); 

                    						newLeafNode(lv_error_6_0, grammarAccess.getProcessStatusExpressionAccess().getErrorERRORKeyword_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessStatusExpressionRule());
                    						}
                    						setWithLastConsumed(current, "error", true, "ERROR");
                    					

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
    // $ANTLR end "ruleProcessStatusExpression"


    // $ANTLR start "entryRuleStartProcessStatement"
    // InternalPoST.g:1387:1: entryRuleStartProcessStatement returns [EObject current=null] : iv_ruleStartProcessStatement= ruleStartProcessStatement EOF ;
    public final EObject entryRuleStartProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartProcessStatement = null;


        try {
            // InternalPoST.g:1387:62: (iv_ruleStartProcessStatement= ruleStartProcessStatement EOF )
            // InternalPoST.g:1388:2: iv_ruleStartProcessStatement= ruleStartProcessStatement EOF
            {
             newCompositeNode(grammarAccess.getStartProcessStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartProcessStatement=ruleStartProcessStatement();

            state._fsp--;

             current =iv_ruleStartProcessStatement; 
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
    // $ANTLR end "entryRuleStartProcessStatement"


    // $ANTLR start "ruleStartProcessStatement"
    // InternalPoST.g:1394:1: ruleStartProcessStatement returns [EObject current=null] : ( () otherlv_1= 'START' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleStartProcessStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPoST.g:1400:2: ( ( () otherlv_1= 'START' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalPoST.g:1401:2: ( () otherlv_1= 'START' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalPoST.g:1401:2: ( () otherlv_1= 'START' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) ) )
            // InternalPoST.g:1402:3: () otherlv_1= 'START' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )
            {
            // InternalPoST.g:1402:3: ()
            // InternalPoST.g:1403:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartProcessStatementAccess().getStartProcessStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,66,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getStartProcessStatementAccess().getSTARTKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getStartProcessStatementAccess().getPROCESSKeyword_2());
            		
            // InternalPoST.g:1417:3: ( (otherlv_3= RULE_ID ) )
            // InternalPoST.g:1418:4: (otherlv_3= RULE_ID )
            {
            // InternalPoST.g:1418:4: (otherlv_3= RULE_ID )
            // InternalPoST.g:1419:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartProcessStatementRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getStartProcessStatementAccess().getProcessProcessCrossReference_3_0());
            				

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
    // $ANTLR end "ruleStartProcessStatement"


    // $ANTLR start "entryRuleStopProcessStatement"
    // InternalPoST.g:1434:1: entryRuleStopProcessStatement returns [EObject current=null] : iv_ruleStopProcessStatement= ruleStopProcessStatement EOF ;
    public final EObject entryRuleStopProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopProcessStatement = null;


        try {
            // InternalPoST.g:1434:61: (iv_ruleStopProcessStatement= ruleStopProcessStatement EOF )
            // InternalPoST.g:1435:2: iv_ruleStopProcessStatement= ruleStopProcessStatement EOF
            {
             newCompositeNode(grammarAccess.getStopProcessStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopProcessStatement=ruleStopProcessStatement();

            state._fsp--;

             current =iv_ruleStopProcessStatement; 
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
    // $ANTLR end "entryRuleStopProcessStatement"


    // $ANTLR start "ruleStopProcessStatement"
    // InternalPoST.g:1441:1: ruleStopProcessStatement returns [EObject current=null] : ( () otherlv_1= 'STOP' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleStopProcessStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPoST.g:1447:2: ( ( () otherlv_1= 'STOP' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? ) )
            // InternalPoST.g:1448:2: ( () otherlv_1= 'STOP' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? )
            {
            // InternalPoST.g:1448:2: ( () otherlv_1= 'STOP' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? )
            // InternalPoST.g:1449:3: () otherlv_1= 'STOP' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )?
            {
            // InternalPoST.g:1449:3: ()
            // InternalPoST.g:1450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStopProcessStatementAccess().getStopProcessStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getStopProcessStatementAccess().getSTOPKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getStopProcessStatementAccess().getPROCESSKeyword_2());
            		
            // InternalPoST.g:1464:3: ( (otherlv_3= RULE_ID ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPoST.g:1465:4: (otherlv_3= RULE_ID )
                    {
                    // InternalPoST.g:1465:4: (otherlv_3= RULE_ID )
                    // InternalPoST.g:1466:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStopProcessStatementRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getStopProcessStatementAccess().getProcessProcessCrossReference_3_0());
                    				

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
    // $ANTLR end "ruleStopProcessStatement"


    // $ANTLR start "entryRuleErrorProcessStatement"
    // InternalPoST.g:1481:1: entryRuleErrorProcessStatement returns [EObject current=null] : iv_ruleErrorProcessStatement= ruleErrorProcessStatement EOF ;
    public final EObject entryRuleErrorProcessStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleErrorProcessStatement = null;


        try {
            // InternalPoST.g:1481:62: (iv_ruleErrorProcessStatement= ruleErrorProcessStatement EOF )
            // InternalPoST.g:1482:2: iv_ruleErrorProcessStatement= ruleErrorProcessStatement EOF
            {
             newCompositeNode(grammarAccess.getErrorProcessStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleErrorProcessStatement=ruleErrorProcessStatement();

            state._fsp--;

             current =iv_ruleErrorProcessStatement; 
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
    // $ANTLR end "entryRuleErrorProcessStatement"


    // $ANTLR start "ruleErrorProcessStatement"
    // InternalPoST.g:1488:1: ruleErrorProcessStatement returns [EObject current=null] : ( () otherlv_1= 'ERROR' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? ) ;
    public final EObject ruleErrorProcessStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPoST.g:1494:2: ( ( () otherlv_1= 'ERROR' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? ) )
            // InternalPoST.g:1495:2: ( () otherlv_1= 'ERROR' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? )
            {
            // InternalPoST.g:1495:2: ( () otherlv_1= 'ERROR' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )? )
            // InternalPoST.g:1496:3: () otherlv_1= 'ERROR' otherlv_2= 'PROCESS' ( (otherlv_3= RULE_ID ) )?
            {
            // InternalPoST.g:1496:3: ()
            // InternalPoST.g:1497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getErrorProcessStatementAccess().getErrorProcessStatementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getErrorProcessStatementAccess().getERRORKeyword_1());
            		
            otherlv_2=(Token)match(input,57,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getErrorProcessStatementAccess().getPROCESSKeyword_2());
            		
            // InternalPoST.g:1511:3: ( (otherlv_3= RULE_ID ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalPoST.g:1512:4: (otherlv_3= RULE_ID )
                    {
                    // InternalPoST.g:1512:4: (otherlv_3= RULE_ID )
                    // InternalPoST.g:1513:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getErrorProcessStatementRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getErrorProcessStatementAccess().getProcessProcessCrossReference_3_0());
                    				

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
    // $ANTLR end "ruleErrorProcessStatement"


    // $ANTLR start "entryRuleTimeoutStatement"
    // InternalPoST.g:1528:1: entryRuleTimeoutStatement returns [EObject current=null] : iv_ruleTimeoutStatement= ruleTimeoutStatement EOF ;
    public final EObject entryRuleTimeoutStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeoutStatement = null;


        try {
            // InternalPoST.g:1528:57: (iv_ruleTimeoutStatement= ruleTimeoutStatement EOF )
            // InternalPoST.g:1529:2: iv_ruleTimeoutStatement= ruleTimeoutStatement EOF
            {
             newCompositeNode(grammarAccess.getTimeoutStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimeoutStatement=ruleTimeoutStatement();

            state._fsp--;

             current =iv_ruleTimeoutStatement; 
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
    // $ANTLR end "entryRuleTimeoutStatement"


    // $ANTLR start "ruleTimeoutStatement"
    // InternalPoST.g:1535:1: ruleTimeoutStatement returns [EObject current=null] : (otherlv_0= 'TIMEOUT' ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'THEN' ( (lv_statement_4_0= ruleStatementList ) ) otherlv_5= 'END_TIMEOUT' ) ;
    public final EObject ruleTimeoutStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_const_1_0 = null;

        EObject lv_statement_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1541:2: ( (otherlv_0= 'TIMEOUT' ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'THEN' ( (lv_statement_4_0= ruleStatementList ) ) otherlv_5= 'END_TIMEOUT' ) )
            // InternalPoST.g:1542:2: (otherlv_0= 'TIMEOUT' ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'THEN' ( (lv_statement_4_0= ruleStatementList ) ) otherlv_5= 'END_TIMEOUT' )
            {
            // InternalPoST.g:1542:2: (otherlv_0= 'TIMEOUT' ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'THEN' ( (lv_statement_4_0= ruleStatementList ) ) otherlv_5= 'END_TIMEOUT' )
            // InternalPoST.g:1543:3: otherlv_0= 'TIMEOUT' ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) ) otherlv_3= 'THEN' ( (lv_statement_4_0= ruleStatementList ) ) otherlv_5= 'END_TIMEOUT'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getTimeoutStatementAccess().getTIMEOUTKeyword_0());
            		
            // InternalPoST.g:1547:3: ( ( (lv_const_1_0= ruleConstant ) ) | ( (otherlv_2= RULE_ID ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INTEGER||LA23_0==RULE_TIME_PREF_LITERAL||(LA23_0>=RULE_REAL_TYPE_NAME && LA23_0<=RULE_REAL)||LA23_0==100) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalPoST.g:1548:4: ( (lv_const_1_0= ruleConstant ) )
                    {
                    // InternalPoST.g:1548:4: ( (lv_const_1_0= ruleConstant ) )
                    // InternalPoST.g:1549:5: (lv_const_1_0= ruleConstant )
                    {
                    // InternalPoST.g:1549:5: (lv_const_1_0= ruleConstant )
                    // InternalPoST.g:1550:6: lv_const_1_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getTimeoutStatementAccess().getConstConstantParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_const_1_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTimeoutStatementRule());
                    						}
                    						set(
                    							current,
                    							"const",
                    							lv_const_1_0,
                    							"su.nsk.iae.post.PoST.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:1568:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalPoST.g:1568:4: ( (otherlv_2= RULE_ID ) )
                    // InternalPoST.g:1569:5: (otherlv_2= RULE_ID )
                    {
                    // InternalPoST.g:1569:5: (otherlv_2= RULE_ID )
                    // InternalPoST.g:1570:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTimeoutStatementRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(otherlv_2, grammarAccess.getTimeoutStatementAccess().getVariableSymbolicVariableCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,68,FOLLOW_42); 

            			newLeafNode(otherlv_3, grammarAccess.getTimeoutStatementAccess().getTHENKeyword_2());
            		
            // InternalPoST.g:1586:3: ( (lv_statement_4_0= ruleStatementList ) )
            // InternalPoST.g:1587:4: (lv_statement_4_0= ruleStatementList )
            {
            // InternalPoST.g:1587:4: (lv_statement_4_0= ruleStatementList )
            // InternalPoST.g:1588:5: lv_statement_4_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getTimeoutStatementAccess().getStatementStatementListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_43);
            lv_statement_4_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTimeoutStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_4_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,69,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTimeoutStatementAccess().getEND_TIMEOUTKeyword_4());
            		

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
    // $ANTLR end "ruleTimeoutStatement"


    // $ANTLR start "entryRuleResetTimerStatement"
    // InternalPoST.g:1613:1: entryRuleResetTimerStatement returns [String current=null] : iv_ruleResetTimerStatement= ruleResetTimerStatement EOF ;
    public final String entryRuleResetTimerStatement() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleResetTimerStatement = null;


        try {
            // InternalPoST.g:1613:59: (iv_ruleResetTimerStatement= ruleResetTimerStatement EOF )
            // InternalPoST.g:1614:2: iv_ruleResetTimerStatement= ruleResetTimerStatement EOF
            {
             newCompositeNode(grammarAccess.getResetTimerStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResetTimerStatement=ruleResetTimerStatement();

            state._fsp--;

             current =iv_ruleResetTimerStatement.getText(); 
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
    // $ANTLR end "entryRuleResetTimerStatement"


    // $ANTLR start "ruleResetTimerStatement"
    // InternalPoST.g:1620:1: ruleResetTimerStatement returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'RESET' kw= 'TIMER' ) ;
    public final AntlrDatatypeRuleToken ruleResetTimerStatement() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPoST.g:1626:2: ( (kw= 'RESET' kw= 'TIMER' ) )
            // InternalPoST.g:1627:2: (kw= 'RESET' kw= 'TIMER' )
            {
            // InternalPoST.g:1627:2: (kw= 'RESET' kw= 'TIMER' )
            // InternalPoST.g:1628:3: kw= 'RESET' kw= 'TIMER'
            {
            kw=(Token)match(input,70,FOLLOW_44); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getResetTimerStatementAccess().getRESETKeyword_0());
            		
            kw=(Token)match(input,71,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getResetTimerStatementAccess().getTIMERKeyword_1());
            		

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
    // $ANTLR end "ruleResetTimerStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalPoST.g:1642:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalPoST.g:1642:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalPoST.g:1643:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalPoST.g:1649:1: ruleExpression returns [EObject current=null] : (this_XorExpression_0= ruleXorExpression ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )* ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        Token this_OR_OPERATOR_2=null;
        EObject this_XorExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1655:2: ( (this_XorExpression_0= ruleXorExpression ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )* ) )
            // InternalPoST.g:1656:2: (this_XorExpression_0= ruleXorExpression ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )* )
            {
            // InternalPoST.g:1656:2: (this_XorExpression_0= ruleXorExpression ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )* )
            // InternalPoST.g:1657:3: this_XorExpression_0= ruleXorExpression ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpressionAccess().getXorExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_45);
            this_XorExpression_0=ruleXorExpression();

            state._fsp--;


            			current = this_XorExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1665:3: ( () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_OR_OPERATOR) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalPoST.g:1666:4: () this_OR_OPERATOR_2= RULE_OR_OPERATOR ( (lv_right_3_0= ruleXorExpression ) )
            	    {
            	    // InternalPoST.g:1666:4: ()
            	    // InternalPoST.g:1667:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpressionAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_OR_OPERATOR_2=(Token)match(input,RULE_OR_OPERATOR,FOLLOW_46); 

            	    				newLeafNode(this_OR_OPERATOR_2, grammarAccess.getExpressionAccess().getOR_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalPoST.g:1677:4: ( (lv_right_3_0= ruleXorExpression ) )
            	    // InternalPoST.g:1678:5: (lv_right_3_0= ruleXorExpression )
            	    {
            	    // InternalPoST.g:1678:5: (lv_right_3_0= ruleXorExpression )
            	    // InternalPoST.g:1679:6: lv_right_3_0= ruleXorExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExpressionAccess().getRightXorExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_45);
            	    lv_right_3_0=ruleXorExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.XorExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleXorExpression"
    // InternalPoST.g:1701:1: entryRuleXorExpression returns [EObject current=null] : iv_ruleXorExpression= ruleXorExpression EOF ;
    public final EObject entryRuleXorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpression = null;


        try {
            // InternalPoST.g:1701:54: (iv_ruleXorExpression= ruleXorExpression EOF )
            // InternalPoST.g:1702:2: iv_ruleXorExpression= ruleXorExpression EOF
            {
             newCompositeNode(grammarAccess.getXorExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXorExpression=ruleXorExpression();

            state._fsp--;

             current =iv_ruleXorExpression; 
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
    // $ANTLR end "entryRuleXorExpression"


    // $ANTLR start "ruleXorExpression"
    // InternalPoST.g:1708:1: ruleXorExpression returns [EObject current=null] : (this_AndExpression_0= ruleAndExpression ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) ;
    public final EObject ruleXorExpression() throws RecognitionException {
        EObject current = null;

        Token this_XOR_OPERATOR_2=null;
        EObject this_AndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1714:2: ( (this_AndExpression_0= ruleAndExpression ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* ) )
            // InternalPoST.g:1715:2: (this_AndExpression_0= ruleAndExpression ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            {
            // InternalPoST.g:1715:2: (this_AndExpression_0= ruleAndExpression ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )* )
            // InternalPoST.g:1716:3: this_AndExpression_0= ruleAndExpression ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getXorExpressionAccess().getAndExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_AndExpression_0=ruleAndExpression();

            state._fsp--;


            			current = this_AndExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1724:3: ( () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_XOR_OPERATOR) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalPoST.g:1725:4: () this_XOR_OPERATOR_2= RULE_XOR_OPERATOR ( (lv_right_3_0= ruleAndExpression ) )
            	    {
            	    // InternalPoST.g:1725:4: ()
            	    // InternalPoST.g:1726:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getXorExpressionAccess().getXorExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_XOR_OPERATOR_2=(Token)match(input,RULE_XOR_OPERATOR,FOLLOW_46); 

            	    				newLeafNode(this_XOR_OPERATOR_2, grammarAccess.getXorExpressionAccess().getXOR_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalPoST.g:1736:4: ( (lv_right_3_0= ruleAndExpression ) )
            	    // InternalPoST.g:1737:5: (lv_right_3_0= ruleAndExpression )
            	    {
            	    // InternalPoST.g:1737:5: (lv_right_3_0= ruleAndExpression )
            	    // InternalPoST.g:1738:6: lv_right_3_0= ruleAndExpression
            	    {

            	    						newCompositeNode(grammarAccess.getXorExpressionAccess().getRightAndExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_47);
            	    lv_right_3_0=ruleAndExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getXorExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.AndExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // $ANTLR end "ruleXorExpression"


    // $ANTLR start "entryRuleAndExpression"
    // InternalPoST.g:1760:1: entryRuleAndExpression returns [EObject current=null] : iv_ruleAndExpression= ruleAndExpression EOF ;
    public final EObject entryRuleAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpression = null;


        try {
            // InternalPoST.g:1760:54: (iv_ruleAndExpression= ruleAndExpression EOF )
            // InternalPoST.g:1761:2: iv_ruleAndExpression= ruleAndExpression EOF
            {
             newCompositeNode(grammarAccess.getAndExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndExpression=ruleAndExpression();

            state._fsp--;

             current =iv_ruleAndExpression; 
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
    // $ANTLR end "entryRuleAndExpression"


    // $ANTLR start "ruleAndExpression"
    // InternalPoST.g:1767:1: ruleAndExpression returns [EObject current=null] : (this_CompExpression_0= ruleCompExpression ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )* ) ;
    public final EObject ruleAndExpression() throws RecognitionException {
        EObject current = null;

        Token this_AND_OPERATOR_2=null;
        EObject this_CompExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1773:2: ( (this_CompExpression_0= ruleCompExpression ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )* ) )
            // InternalPoST.g:1774:2: (this_CompExpression_0= ruleCompExpression ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )* )
            {
            // InternalPoST.g:1774:2: (this_CompExpression_0= ruleCompExpression ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )* )
            // InternalPoST.g:1775:3: this_CompExpression_0= ruleCompExpression ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndExpressionAccess().getCompExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_48);
            this_CompExpression_0=ruleCompExpression();

            state._fsp--;


            			current = this_CompExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1783:3: ( () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_AND_OPERATOR) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalPoST.g:1784:4: () this_AND_OPERATOR_2= RULE_AND_OPERATOR ( (lv_right_3_0= ruleCompExpression ) )
            	    {
            	    // InternalPoST.g:1784:4: ()
            	    // InternalPoST.g:1785:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndExpressionAccess().getAndExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_AND_OPERATOR_2=(Token)match(input,RULE_AND_OPERATOR,FOLLOW_46); 

            	    				newLeafNode(this_AND_OPERATOR_2, grammarAccess.getAndExpressionAccess().getAND_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalPoST.g:1795:4: ( (lv_right_3_0= ruleCompExpression ) )
            	    // InternalPoST.g:1796:5: (lv_right_3_0= ruleCompExpression )
            	    {
            	    // InternalPoST.g:1796:5: (lv_right_3_0= ruleCompExpression )
            	    // InternalPoST.g:1797:6: lv_right_3_0= ruleCompExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAndExpressionAccess().getRightCompExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_48);
            	    lv_right_3_0=ruleCompExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.CompExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // $ANTLR end "ruleAndExpression"


    // $ANTLR start "entryRuleCompExpression"
    // InternalPoST.g:1819:1: entryRuleCompExpression returns [EObject current=null] : iv_ruleCompExpression= ruleCompExpression EOF ;
    public final EObject entryRuleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompExpression = null;


        try {
            // InternalPoST.g:1819:55: (iv_ruleCompExpression= ruleCompExpression EOF )
            // InternalPoST.g:1820:2: iv_ruleCompExpression= ruleCompExpression EOF
            {
             newCompositeNode(grammarAccess.getCompExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompExpression=ruleCompExpression();

            state._fsp--;

             current =iv_ruleCompExpression; 
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
    // $ANTLR end "entryRuleCompExpression"


    // $ANTLR start "ruleCompExpression"
    // InternalPoST.g:1826:1: ruleCompExpression returns [EObject current=null] : (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) ;
    public final EObject ruleCompExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EquExpression_0 = null;

        Enumerator lv_compOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1832:2: ( (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* ) )
            // InternalPoST.g:1833:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            {
            // InternalPoST.g:1833:2: (this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )* )
            // InternalPoST.g:1834:3: this_EquExpression_0= ruleEquExpression ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getCompExpressionAccess().getEquExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_49);
            this_EquExpression_0=ruleEquExpression();

            state._fsp--;


            			current = this_EquExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1842:3: ( () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=102 && LA27_0<=103)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPoST.g:1843:4: () ( (lv_compOp_2_0= ruleCompOperator ) ) ( (lv_right_3_0= ruleEquExpression ) )
            	    {
            	    // InternalPoST.g:1843:4: ()
            	    // InternalPoST.g:1844:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getCompExpressionAccess().getCompExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPoST.g:1850:4: ( (lv_compOp_2_0= ruleCompOperator ) )
            	    // InternalPoST.g:1851:5: (lv_compOp_2_0= ruleCompOperator )
            	    {
            	    // InternalPoST.g:1851:5: (lv_compOp_2_0= ruleCompOperator )
            	    // InternalPoST.g:1852:6: lv_compOp_2_0= ruleCompOperator
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getCompOpCompOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_compOp_2_0=ruleCompOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"compOp",
            	    							lv_compOp_2_0,
            	    							"su.nsk.iae.post.PoST.CompOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPoST.g:1869:4: ( (lv_right_3_0= ruleEquExpression ) )
            	    // InternalPoST.g:1870:5: (lv_right_3_0= ruleEquExpression )
            	    {
            	    // InternalPoST.g:1870:5: (lv_right_3_0= ruleEquExpression )
            	    // InternalPoST.g:1871:6: lv_right_3_0= ruleEquExpression
            	    {

            	    						newCompositeNode(grammarAccess.getCompExpressionAccess().getRightEquExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_right_3_0=ruleEquExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.EquExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // $ANTLR end "ruleCompExpression"


    // $ANTLR start "entryRuleEquExpression"
    // InternalPoST.g:1893:1: entryRuleEquExpression returns [EObject current=null] : iv_ruleEquExpression= ruleEquExpression EOF ;
    public final EObject entryRuleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquExpression = null;


        try {
            // InternalPoST.g:1893:54: (iv_ruleEquExpression= ruleEquExpression EOF )
            // InternalPoST.g:1894:2: iv_ruleEquExpression= ruleEquExpression EOF
            {
             newCompositeNode(grammarAccess.getEquExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquExpression=ruleEquExpression();

            state._fsp--;

             current =iv_ruleEquExpression; 
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
    // $ANTLR end "entryRuleEquExpression"


    // $ANTLR start "ruleEquExpression"
    // InternalPoST.g:1900:1: ruleEquExpression returns [EObject current=null] : (this_AddExpression_0= ruleAddExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) ;
    public final EObject ruleEquExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AddExpression_0 = null;

        Enumerator lv_equOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1906:2: ( (this_AddExpression_0= ruleAddExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* ) )
            // InternalPoST.g:1907:2: (this_AddExpression_0= ruleAddExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            {
            // InternalPoST.g:1907:2: (this_AddExpression_0= ruleAddExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )* )
            // InternalPoST.g:1908:3: this_AddExpression_0= ruleAddExpression ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getEquExpressionAccess().getAddExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_50);
            this_AddExpression_0=ruleAddExpression();

            state._fsp--;


            			current = this_AddExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1916:3: ( () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=104 && LA28_0<=107)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPoST.g:1917:4: () ( (lv_equOp_2_0= ruleEquOperator ) ) ( (lv_right_3_0= ruleAddExpression ) )
            	    {
            	    // InternalPoST.g:1917:4: ()
            	    // InternalPoST.g:1918:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEquExpressionAccess().getEquExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPoST.g:1924:4: ( (lv_equOp_2_0= ruleEquOperator ) )
            	    // InternalPoST.g:1925:5: (lv_equOp_2_0= ruleEquOperator )
            	    {
            	    // InternalPoST.g:1925:5: (lv_equOp_2_0= ruleEquOperator )
            	    // InternalPoST.g:1926:6: lv_equOp_2_0= ruleEquOperator
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getEquOpEquOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_equOp_2_0=ruleEquOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"equOp",
            	    							lv_equOp_2_0,
            	    							"su.nsk.iae.post.PoST.EquOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPoST.g:1943:4: ( (lv_right_3_0= ruleAddExpression ) )
            	    // InternalPoST.g:1944:5: (lv_right_3_0= ruleAddExpression )
            	    {
            	    // InternalPoST.g:1944:5: (lv_right_3_0= ruleAddExpression )
            	    // InternalPoST.g:1945:6: lv_right_3_0= ruleAddExpression
            	    {

            	    						newCompositeNode(grammarAccess.getEquExpressionAccess().getRightAddExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleAddExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEquExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.AddExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // $ANTLR end "ruleEquExpression"


    // $ANTLR start "entryRuleAddExpression"
    // InternalPoST.g:1967:1: entryRuleAddExpression returns [EObject current=null] : iv_ruleAddExpression= ruleAddExpression EOF ;
    public final EObject entryRuleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddExpression = null;


        try {
            // InternalPoST.g:1967:54: (iv_ruleAddExpression= ruleAddExpression EOF )
            // InternalPoST.g:1968:2: iv_ruleAddExpression= ruleAddExpression EOF
            {
             newCompositeNode(grammarAccess.getAddExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddExpression=ruleAddExpression();

            state._fsp--;

             current =iv_ruleAddExpression; 
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
    // $ANTLR end "entryRuleAddExpression"


    // $ANTLR start "ruleAddExpression"
    // InternalPoST.g:1974:1: ruleAddExpression returns [EObject current=null] : (this_MulExpression_0= ruleMulExpression ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )* ) ;
    public final EObject ruleAddExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MulExpression_0 = null;

        Enumerator lv_addOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:1980:2: ( (this_MulExpression_0= ruleMulExpression ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )* ) )
            // InternalPoST.g:1981:2: (this_MulExpression_0= ruleMulExpression ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )* )
            {
            // InternalPoST.g:1981:2: (this_MulExpression_0= ruleMulExpression ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )* )
            // InternalPoST.g:1982:3: this_MulExpression_0= ruleMulExpression ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getAddExpressionAccess().getMulExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_51);
            this_MulExpression_0=ruleMulExpression();

            state._fsp--;


            			current = this_MulExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:1990:3: ( () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==100||LA29_0==108) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalPoST.g:1991:4: () ( (lv_addOp_2_0= ruleAddOperator ) ) ( (lv_right_3_0= ruleMulExpression ) )
            	    {
            	    // InternalPoST.g:1991:4: ()
            	    // InternalPoST.g:1992:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAddExpressionAccess().getAddExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPoST.g:1998:4: ( (lv_addOp_2_0= ruleAddOperator ) )
            	    // InternalPoST.g:1999:5: (lv_addOp_2_0= ruleAddOperator )
            	    {
            	    // InternalPoST.g:1999:5: (lv_addOp_2_0= ruleAddOperator )
            	    // InternalPoST.g:2000:6: lv_addOp_2_0= ruleAddOperator
            	    {

            	    						newCompositeNode(grammarAccess.getAddExpressionAccess().getAddOpAddOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_addOp_2_0=ruleAddOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"addOp",
            	    							lv_addOp_2_0,
            	    							"su.nsk.iae.post.PoST.AddOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPoST.g:2017:4: ( (lv_right_3_0= ruleMulExpression ) )
            	    // InternalPoST.g:2018:5: (lv_right_3_0= ruleMulExpression )
            	    {
            	    // InternalPoST.g:2018:5: (lv_right_3_0= ruleMulExpression )
            	    // InternalPoST.g:2019:6: lv_right_3_0= ruleMulExpression
            	    {

            	    						newCompositeNode(grammarAccess.getAddExpressionAccess().getRightMulExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_51);
            	    lv_right_3_0=ruleMulExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAddExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.MulExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // $ANTLR end "ruleAddExpression"


    // $ANTLR start "entryRuleMulExpression"
    // InternalPoST.g:2041:1: entryRuleMulExpression returns [EObject current=null] : iv_ruleMulExpression= ruleMulExpression EOF ;
    public final EObject entryRuleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulExpression = null;


        try {
            // InternalPoST.g:2041:54: (iv_ruleMulExpression= ruleMulExpression EOF )
            // InternalPoST.g:2042:2: iv_ruleMulExpression= ruleMulExpression EOF
            {
             newCompositeNode(grammarAccess.getMulExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMulExpression=ruleMulExpression();

            state._fsp--;

             current =iv_ruleMulExpression; 
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
    // $ANTLR end "entryRuleMulExpression"


    // $ANTLR start "ruleMulExpression"
    // InternalPoST.g:2048:1: ruleMulExpression returns [EObject current=null] : (this_PowerExpression_0= rulePowerExpression ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) ;
    public final EObject ruleMulExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PowerExpression_0 = null;

        Enumerator lv_mulOp_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2054:2: ( (this_PowerExpression_0= rulePowerExpression ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* ) )
            // InternalPoST.g:2055:2: (this_PowerExpression_0= rulePowerExpression ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            {
            // InternalPoST.g:2055:2: (this_PowerExpression_0= rulePowerExpression ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )* )
            // InternalPoST.g:2056:3: this_PowerExpression_0= rulePowerExpression ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getMulExpressionAccess().getPowerExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_52);
            this_PowerExpression_0=rulePowerExpression();

            state._fsp--;


            			current = this_PowerExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:2064:3: ( () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=109 && LA30_0<=111)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalPoST.g:2065:4: () ( (lv_mulOp_2_0= ruleMulOperator ) ) ( (lv_right_3_0= rulePowerExpression ) )
            	    {
            	    // InternalPoST.g:2065:4: ()
            	    // InternalPoST.g:2066:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMulExpressionAccess().getMulExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalPoST.g:2072:4: ( (lv_mulOp_2_0= ruleMulOperator ) )
            	    // InternalPoST.g:2073:5: (lv_mulOp_2_0= ruleMulOperator )
            	    {
            	    // InternalPoST.g:2073:5: (lv_mulOp_2_0= ruleMulOperator )
            	    // InternalPoST.g:2074:6: lv_mulOp_2_0= ruleMulOperator
            	    {

            	    						newCompositeNode(grammarAccess.getMulExpressionAccess().getMulOpMulOperatorEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_mulOp_2_0=ruleMulOperator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"mulOp",
            	    							lv_mulOp_2_0,
            	    							"su.nsk.iae.post.PoST.MulOperator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPoST.g:2091:4: ( (lv_right_3_0= rulePowerExpression ) )
            	    // InternalPoST.g:2092:5: (lv_right_3_0= rulePowerExpression )
            	    {
            	    // InternalPoST.g:2092:5: (lv_right_3_0= rulePowerExpression )
            	    // InternalPoST.g:2093:6: lv_right_3_0= rulePowerExpression
            	    {

            	    						newCompositeNode(grammarAccess.getMulExpressionAccess().getRightPowerExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_52);
            	    lv_right_3_0=rulePowerExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMulExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.PowerExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleMulExpression"


    // $ANTLR start "entryRulePowerExpression"
    // InternalPoST.g:2115:1: entryRulePowerExpression returns [EObject current=null] : iv_rulePowerExpression= rulePowerExpression EOF ;
    public final EObject entryRulePowerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePowerExpression = null;


        try {
            // InternalPoST.g:2115:56: (iv_rulePowerExpression= rulePowerExpression EOF )
            // InternalPoST.g:2116:2: iv_rulePowerExpression= rulePowerExpression EOF
            {
             newCompositeNode(grammarAccess.getPowerExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePowerExpression=rulePowerExpression();

            state._fsp--;

             current =iv_rulePowerExpression; 
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
    // $ANTLR end "entryRulePowerExpression"


    // $ANTLR start "rulePowerExpression"
    // InternalPoST.g:2122:1: rulePowerExpression returns [EObject current=null] : (this_UnaryExpression_0= ruleUnaryExpression ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) ;
    public final EObject rulePowerExpression() throws RecognitionException {
        EObject current = null;

        Token this_POWER_OPERATOR_2=null;
        EObject this_UnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2128:2: ( (this_UnaryExpression_0= ruleUnaryExpression ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )* ) )
            // InternalPoST.g:2129:2: (this_UnaryExpression_0= ruleUnaryExpression ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            {
            // InternalPoST.g:2129:2: (this_UnaryExpression_0= ruleUnaryExpression ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )* )
            // InternalPoST.g:2130:3: this_UnaryExpression_0= ruleUnaryExpression ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            {

            			newCompositeNode(grammarAccess.getPowerExpressionAccess().getUnaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_53);
            this_UnaryExpression_0=ruleUnaryExpression();

            state._fsp--;


            			current = this_UnaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalPoST.g:2138:3: ( () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_POWER_OPERATOR) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPoST.g:2139:4: () this_POWER_OPERATOR_2= RULE_POWER_OPERATOR ( (lv_right_3_0= ruleUnaryExpression ) )
            	    {
            	    // InternalPoST.g:2139:4: ()
            	    // InternalPoST.g:2140:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getPowerExpressionAccess().getPowerExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    this_POWER_OPERATOR_2=(Token)match(input,RULE_POWER_OPERATOR,FOLLOW_46); 

            	    				newLeafNode(this_POWER_OPERATOR_2, grammarAccess.getPowerExpressionAccess().getPOWER_OPERATORTerminalRuleCall_1_1());
            	    			
            	    // InternalPoST.g:2150:4: ( (lv_right_3_0= ruleUnaryExpression ) )
            	    // InternalPoST.g:2151:5: (lv_right_3_0= ruleUnaryExpression )
            	    {
            	    // InternalPoST.g:2151:5: (lv_right_3_0= ruleUnaryExpression )
            	    // InternalPoST.g:2152:6: lv_right_3_0= ruleUnaryExpression
            	    {

            	    						newCompositeNode(grammarAccess.getPowerExpressionAccess().getRightUnaryExpressionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=ruleUnaryExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPowerExpressionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"su.nsk.iae.post.PoST.UnaryExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "rulePowerExpression"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalPoST.g:2174:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalPoST.g:2174:56: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalPoST.g:2175:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
             newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;

             current =iv_ruleUnaryExpression; 
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
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalPoST.g:2181:1: ruleUnaryExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression | (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        Token this_UNARY_OPERATOR_1=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2187:2: ( (this_PrimaryExpression_0= rulePrimaryExpression | (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) ) ) )
            // InternalPoST.g:2188:2: (this_PrimaryExpression_0= rulePrimaryExpression | (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            {
            // InternalPoST.g:2188:2: (this_PrimaryExpression_0= rulePrimaryExpression | (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==RULE_INTEGER||LA32_0==RULE_TIME_PREF_LITERAL||(LA32_0>=RULE_REAL_TYPE_NAME && LA32_0<=RULE_REAL)||LA32_0==49||LA32_0==57||LA32_0==100) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_UNARY_OPERATOR) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalPoST.g:2189:3: this_PrimaryExpression_0= rulePrimaryExpression
                    {

                    			newCompositeNode(grammarAccess.getUnaryExpressionAccess().getPrimaryExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimaryExpression_0=rulePrimaryExpression();

                    state._fsp--;


                    			current = this_PrimaryExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:2198:3: (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    {
                    // InternalPoST.g:2198:3: (this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) ) )
                    // InternalPoST.g:2199:4: this_UNARY_OPERATOR_1= RULE_UNARY_OPERATOR ( (lv_right_2_0= rulePrimaryExpression ) )
                    {
                    this_UNARY_OPERATOR_1=(Token)match(input,RULE_UNARY_OPERATOR,FOLLOW_54); 

                    				newLeafNode(this_UNARY_OPERATOR_1, grammarAccess.getUnaryExpressionAccess().getUNARY_OPERATORTerminalRuleCall_1_0());
                    			
                    // InternalPoST.g:2203:4: ( (lv_right_2_0= rulePrimaryExpression ) )
                    // InternalPoST.g:2204:5: (lv_right_2_0= rulePrimaryExpression )
                    {
                    // InternalPoST.g:2204:5: (lv_right_2_0= rulePrimaryExpression )
                    // InternalPoST.g:2205:6: lv_right_2_0= rulePrimaryExpression
                    {

                    						newCompositeNode(grammarAccess.getUnaryExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_2_0=rulePrimaryExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_2_0,
                    							"su.nsk.iae.post.PoST.PrimaryExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalPoST.g:2227:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalPoST.g:2227:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalPoST.g:2228:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalPoST.g:2234:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_procStatus_2_0= ruleProcessStatusExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_const_0_0 = null;

        EObject lv_procStatus_2_0 = null;

        EObject lv_nestExpr_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2240:2: ( ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_procStatus_2_0= ruleProcessStatusExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) ) )
            // InternalPoST.g:2241:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_procStatus_2_0= ruleProcessStatusExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            {
            // InternalPoST.g:2241:2: ( ( (lv_const_0_0= ruleConstant ) ) | ( (otherlv_1= RULE_ID ) ) | ( (lv_procStatus_2_0= ruleProcessStatusExpression ) ) | (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_TIME_PREF_LITERAL:
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
            case RULE_BINARY_INTEGER:
            case RULE_OCTAL_INTEGER:
            case RULE_HEX_INTEGER:
            case RULE_BOOLEAN_LITERAL:
            case RULE_REAL:
            case 100:
                {
                alt33=1;
                }
                break;
            case RULE_ID:
                {
                alt33=2;
                }
                break;
            case 57:
                {
                alt33=3;
                }
                break;
            case 49:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalPoST.g:2242:3: ( (lv_const_0_0= ruleConstant ) )
                    {
                    // InternalPoST.g:2242:3: ( (lv_const_0_0= ruleConstant ) )
                    // InternalPoST.g:2243:4: (lv_const_0_0= ruleConstant )
                    {
                    // InternalPoST.g:2243:4: (lv_const_0_0= ruleConstant )
                    // InternalPoST.g:2244:5: lv_const_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getConstConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_const_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"const",
                    						lv_const_0_0,
                    						"su.nsk.iae.post.PoST.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2262:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPoST.g:2262:3: ( (otherlv_1= RULE_ID ) )
                    // InternalPoST.g:2263:4: (otherlv_1= RULE_ID )
                    {
                    // InternalPoST.g:2263:4: (otherlv_1= RULE_ID )
                    // InternalPoST.g:2264:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimaryExpressionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getPrimaryExpressionAccess().getVariableSymbolicVariableCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:2276:3: ( (lv_procStatus_2_0= ruleProcessStatusExpression ) )
                    {
                    // InternalPoST.g:2276:3: ( (lv_procStatus_2_0= ruleProcessStatusExpression ) )
                    // InternalPoST.g:2277:4: (lv_procStatus_2_0= ruleProcessStatusExpression )
                    {
                    // InternalPoST.g:2277:4: (lv_procStatus_2_0= ruleProcessStatusExpression )
                    // InternalPoST.g:2278:5: lv_procStatus_2_0= ruleProcessStatusExpression
                    {

                    					newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getProcStatusProcessStatusExpressionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_procStatus_2_0=ruleProcessStatusExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    					}
                    					set(
                    						current,
                    						"procStatus",
                    						lv_procStatus_2_0,
                    						"su.nsk.iae.post.PoST.ProcessStatusExpression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:2296:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    {
                    // InternalPoST.g:2296:3: (otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')' )
                    // InternalPoST.g:2297:4: otherlv_3= '(' ( (lv_nestExpr_4_0= ruleExpression ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalPoST.g:2301:4: ( (lv_nestExpr_4_0= ruleExpression ) )
                    // InternalPoST.g:2302:5: (lv_nestExpr_4_0= ruleExpression )
                    {
                    // InternalPoST.g:2302:5: (lv_nestExpr_4_0= ruleExpression )
                    // InternalPoST.g:2303:6: lv_nestExpr_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNestExprExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_nestExpr_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    						}
                    						set(
                    							current,
                    							"nestExpr",
                    							lv_nestExpr_4_0,
                    							"su.nsk.iae.post.PoST.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,50,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_3_2());
                    			

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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleStatementList"
    // InternalPoST.g:2329:1: entryRuleStatementList returns [EObject current=null] : iv_ruleStatementList= ruleStatementList EOF ;
    public final EObject entryRuleStatementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementList = null;


        try {
            // InternalPoST.g:2329:54: (iv_ruleStatementList= ruleStatementList EOF )
            // InternalPoST.g:2330:2: iv_ruleStatementList= ruleStatementList EOF
            {
             newCompositeNode(grammarAccess.getStatementListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatementList=ruleStatementList();

            state._fsp--;

             current =iv_ruleStatementList; 
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
    // $ANTLR end "entryRuleStatementList"


    // $ANTLR start "ruleStatementList"
    // InternalPoST.g:2336:1: ruleStatementList returns [EObject current=null] : ( () ( (lv_statements_1_0= ruleStatement ) )* ) ;
    public final EObject ruleStatementList() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2342:2: ( ( () ( (lv_statements_1_0= ruleStatement ) )* ) )
            // InternalPoST.g:2343:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            {
            // InternalPoST.g:2343:2: ( () ( (lv_statements_1_0= ruleStatement ) )* )
            // InternalPoST.g:2344:3: () ( (lv_statements_1_0= ruleStatement ) )*
            {
            // InternalPoST.g:2344:3: ()
            // InternalPoST.g:2345:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatementListAccess().getStatementListAction_0(),
            					current);
            			

            }

            // InternalPoST.g:2351:3: ( (lv_statements_1_0= ruleStatement ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||(LA34_0>=RULE_SUBPROGRAM_CONTROL_STATEMENT && LA34_0<=RULE_EXIT_STATEMENT)||LA34_0==61||(LA34_0>=64 && LA34_0<=66)||LA34_0==70||LA34_0==72||LA34_0==76||LA34_0==79||LA34_0==84||LA34_0==86) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPoST.g:2352:4: (lv_statements_1_0= ruleStatement )
            	    {
            	    // InternalPoST.g:2352:4: (lv_statements_1_0= ruleStatement )
            	    // InternalPoST.g:2353:5: lv_statements_1_0= ruleStatement
            	    {

            	    					newCompositeNode(grammarAccess.getStatementListAccess().getStatementsStatementParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_55);
            	    lv_statements_1_0=ruleStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatementListRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_1_0,
            	    						"su.nsk.iae.post.PoST.Statement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleStatementList"


    // $ANTLR start "entryRuleStatement"
    // InternalPoST.g:2374:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalPoST.g:2374:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalPoST.g:2375:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalPoST.g:2381:1: ruleStatement returns [EObject current=null] : ( (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' ) | this_SelectionStatement_2= ruleSelectionStatement | this_IterationStatement_3= ruleIterationStatement | ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) ) | ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) ) | (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' ) | (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' ) | ( () ( ruleResetTimerStatement otherlv_16= ';' ) ) ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_SUBPROGRAM_CONTROL_STATEMENT_5=null;
        Token otherlv_6=null;
        Token this_EXIT_STATEMENT_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        EObject this_AssignmentStatement_0 = null;

        EObject this_SelectionStatement_2 = null;

        EObject this_IterationStatement_3 = null;

        EObject this_ProcessStatements_10 = null;

        EObject this_SetStateStatement_12 = null;



        	enterRule();

        try {
            // InternalPoST.g:2387:2: ( ( (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' ) | this_SelectionStatement_2= ruleSelectionStatement | this_IterationStatement_3= ruleIterationStatement | ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) ) | ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) ) | (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' ) | (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' ) | ( () ( ruleResetTimerStatement otherlv_16= ';' ) ) ) )
            // InternalPoST.g:2388:2: ( (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' ) | this_SelectionStatement_2= ruleSelectionStatement | this_IterationStatement_3= ruleIterationStatement | ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) ) | ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) ) | (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' ) | (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' ) | ( () ( ruleResetTimerStatement otherlv_16= ';' ) ) )
            {
            // InternalPoST.g:2388:2: ( (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' ) | this_SelectionStatement_2= ruleSelectionStatement | this_IterationStatement_3= ruleIterationStatement | ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) ) | ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) ) | (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' ) | (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' ) | ( () ( ruleResetTimerStatement otherlv_16= ';' ) ) )
            int alt35=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt35=1;
                }
                break;
            case 72:
            case 76:
                {
                alt35=2;
                }
                break;
            case 79:
            case 84:
            case 86:
                {
                alt35=3;
                }
                break;
            case RULE_SUBPROGRAM_CONTROL_STATEMENT:
                {
                alt35=4;
                }
                break;
            case RULE_EXIT_STATEMENT:
                {
                alt35=5;
                }
                break;
            case 64:
            case 65:
            case 66:
                {
                alt35=6;
                }
                break;
            case 61:
                {
                alt35=7;
                }
                break;
            case 70:
                {
                alt35=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalPoST.g:2389:3: (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' )
                    {
                    // InternalPoST.g:2389:3: (this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';' )
                    // InternalPoST.g:2390:4: this_AssignmentStatement_0= ruleAssignmentStatement otherlv_1= ';'
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getAssignmentStatementParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_AssignmentStatement_0=ruleAssignmentStatement();

                    state._fsp--;


                    				current = this_AssignmentStatement_0;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getStatementAccess().getSemicolonKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2404:3: this_SelectionStatement_2= ruleSelectionStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSelectionStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SelectionStatement_2=ruleSelectionStatement();

                    state._fsp--;


                    			current = this_SelectionStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:2413:3: this_IterationStatement_3= ruleIterationStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getIterationStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IterationStatement_3=ruleIterationStatement();

                    state._fsp--;


                    			current = this_IterationStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalPoST.g:2422:3: ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) )
                    {
                    // InternalPoST.g:2422:3: ( () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' ) )
                    // InternalPoST.g:2423:4: () (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' )
                    {
                    // InternalPoST.g:2423:4: ()
                    // InternalPoST.g:2424:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_3_0(),
                    						current);
                    				

                    }

                    // InternalPoST.g:2430:4: (this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';' )
                    // InternalPoST.g:2431:5: this_SUBPROGRAM_CONTROL_STATEMENT_5= RULE_SUBPROGRAM_CONTROL_STATEMENT otherlv_6= ';'
                    {
                    this_SUBPROGRAM_CONTROL_STATEMENT_5=(Token)match(input,RULE_SUBPROGRAM_CONTROL_STATEMENT,FOLLOW_12); 

                    					newLeafNode(this_SUBPROGRAM_CONTROL_STATEMENT_5, grammarAccess.getStatementAccess().getSUBPROGRAM_CONTROL_STATEMENTTerminalRuleCall_3_1_0());
                    				
                    otherlv_6=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getStatementAccess().getSemicolonKeyword_3_1_1());
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalPoST.g:2442:3: ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) )
                    {
                    // InternalPoST.g:2442:3: ( () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' ) )
                    // InternalPoST.g:2443:4: () (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' )
                    {
                    // InternalPoST.g:2443:4: ()
                    // InternalPoST.g:2444:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_4_0(),
                    						current);
                    				

                    }

                    // InternalPoST.g:2450:4: (this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';' )
                    // InternalPoST.g:2451:5: this_EXIT_STATEMENT_8= RULE_EXIT_STATEMENT otherlv_9= ';'
                    {
                    this_EXIT_STATEMENT_8=(Token)match(input,RULE_EXIT_STATEMENT,FOLLOW_12); 

                    					newLeafNode(this_EXIT_STATEMENT_8, grammarAccess.getStatementAccess().getEXIT_STATEMENTTerminalRuleCall_4_1_0());
                    				
                    otherlv_9=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getStatementAccess().getSemicolonKeyword_4_1_1());
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalPoST.g:2462:3: (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' )
                    {
                    // InternalPoST.g:2462:3: (this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';' )
                    // InternalPoST.g:2463:4: this_ProcessStatements_10= ruleProcessStatements otherlv_11= ';'
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getProcessStatementsParserRuleCall_5_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_ProcessStatements_10=ruleProcessStatements();

                    state._fsp--;


                    				current = this_ProcessStatements_10;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_11=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_11, grammarAccess.getStatementAccess().getSemicolonKeyword_5_1());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalPoST.g:2477:3: (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' )
                    {
                    // InternalPoST.g:2477:3: (this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';' )
                    // InternalPoST.g:2478:4: this_SetStateStatement_12= ruleSetStateStatement otherlv_13= ';'
                    {

                    				newCompositeNode(grammarAccess.getStatementAccess().getSetStateStatementParserRuleCall_6_0());
                    			
                    pushFollow(FOLLOW_12);
                    this_SetStateStatement_12=ruleSetStateStatement();

                    state._fsp--;


                    				current = this_SetStateStatement_12;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_13=(Token)match(input,47,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getStatementAccess().getSemicolonKeyword_6_1());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalPoST.g:2492:3: ( () ( ruleResetTimerStatement otherlv_16= ';' ) )
                    {
                    // InternalPoST.g:2492:3: ( () ( ruleResetTimerStatement otherlv_16= ';' ) )
                    // InternalPoST.g:2493:4: () ( ruleResetTimerStatement otherlv_16= ';' )
                    {
                    // InternalPoST.g:2493:4: ()
                    // InternalPoST.g:2494:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getStatementAccess().getStatementAction_7_0(),
                    						current);
                    				

                    }

                    // InternalPoST.g:2500:4: ( ruleResetTimerStatement otherlv_16= ';' )
                    // InternalPoST.g:2501:5: ruleResetTimerStatement otherlv_16= ';'
                    {

                    					newCompositeNode(grammarAccess.getStatementAccess().getResetTimerStatementParserRuleCall_7_1_0());
                    				
                    pushFollow(FOLLOW_12);
                    ruleResetTimerStatement();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				
                    otherlv_16=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(otherlv_16, grammarAccess.getStatementAccess().getSemicolonKeyword_7_1_1());
                    				

                    }


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAssignmentStatement"
    // InternalPoST.g:2518:1: entryRuleAssignmentStatement returns [EObject current=null] : iv_ruleAssignmentStatement= ruleAssignmentStatement EOF ;
    public final EObject entryRuleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignmentStatement = null;


        try {
            // InternalPoST.g:2518:60: (iv_ruleAssignmentStatement= ruleAssignmentStatement EOF )
            // InternalPoST.g:2519:2: iv_ruleAssignmentStatement= ruleAssignmentStatement EOF
            {
             newCompositeNode(grammarAccess.getAssignmentStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignmentStatement=ruleAssignmentStatement();

            state._fsp--;

             current =iv_ruleAssignmentStatement; 
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
    // $ANTLR end "entryRuleAssignmentStatement"


    // $ANTLR start "ruleAssignmentStatement"
    // InternalPoST.g:2525:1: ruleAssignmentStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) ;
    public final EObject ruleAssignmentStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2531:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) ) )
            // InternalPoST.g:2532:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            {
            // InternalPoST.g:2532:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) ) )
            // InternalPoST.g:2533:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= ':=' ( (lv_value_2_0= ruleExpression ) )
            {
            // InternalPoST.g:2533:3: ( (otherlv_0= RULE_ID ) )
            // InternalPoST.g:2534:4: (otherlv_0= RULE_ID )
            {
            // InternalPoST.g:2534:4: (otherlv_0= RULE_ID )
            // InternalPoST.g:2535:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssignmentStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_0, grammarAccess.getAssignmentStatementAccess().getVariableSymbolicVariableCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentStatementAccess().getColonEqualsSignKeyword_1());
            		
            // InternalPoST.g:2550:3: ( (lv_value_2_0= ruleExpression ) )
            // InternalPoST.g:2551:4: (lv_value_2_0= ruleExpression )
            {
            // InternalPoST.g:2551:4: (lv_value_2_0= ruleExpression )
            // InternalPoST.g:2552:5: lv_value_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getAssignmentStatementAccess().getValueExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"su.nsk.iae.post.PoST.Expression");
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
    // $ANTLR end "ruleAssignmentStatement"


    // $ANTLR start "entryRuleSelectionStatement"
    // InternalPoST.g:2573:1: entryRuleSelectionStatement returns [EObject current=null] : iv_ruleSelectionStatement= ruleSelectionStatement EOF ;
    public final EObject entryRuleSelectionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionStatement = null;


        try {
            // InternalPoST.g:2573:59: (iv_ruleSelectionStatement= ruleSelectionStatement EOF )
            // InternalPoST.g:2574:2: iv_ruleSelectionStatement= ruleSelectionStatement EOF
            {
             newCompositeNode(grammarAccess.getSelectionStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectionStatement=ruleSelectionStatement();

            state._fsp--;

             current =iv_ruleSelectionStatement; 
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
    // $ANTLR end "entryRuleSelectionStatement"


    // $ANTLR start "ruleSelectionStatement"
    // InternalPoST.g:2580:1: ruleSelectionStatement returns [EObject current=null] : (this_IfStatement_0= ruleIfStatement | this_CaseStatement_1= ruleCaseStatement ) ;
    public final EObject ruleSelectionStatement() throws RecognitionException {
        EObject current = null;

        EObject this_IfStatement_0 = null;

        EObject this_CaseStatement_1 = null;



        	enterRule();

        try {
            // InternalPoST.g:2586:2: ( (this_IfStatement_0= ruleIfStatement | this_CaseStatement_1= ruleCaseStatement ) )
            // InternalPoST.g:2587:2: (this_IfStatement_0= ruleIfStatement | this_CaseStatement_1= ruleCaseStatement )
            {
            // InternalPoST.g:2587:2: (this_IfStatement_0= ruleIfStatement | this_CaseStatement_1= ruleCaseStatement )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==72) ) {
                alt36=1;
            }
            else if ( (LA36_0==76) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPoST.g:2588:3: this_IfStatement_0= ruleIfStatement
                    {

                    			newCompositeNode(grammarAccess.getSelectionStatementAccess().getIfStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IfStatement_0=ruleIfStatement();

                    state._fsp--;


                    			current = this_IfStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:2597:3: this_CaseStatement_1= ruleCaseStatement
                    {

                    			newCompositeNode(grammarAccess.getSelectionStatementAccess().getCaseStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CaseStatement_1=ruleCaseStatement();

                    state._fsp--;


                    			current = this_CaseStatement_1;
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
    // $ANTLR end "ruleSelectionStatement"


    // $ANTLR start "entryRuleIfStatement"
    // InternalPoST.g:2609:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // InternalPoST.g:2609:52: (iv_ruleIfStatement= ruleIfStatement EOF )
            // InternalPoST.g:2610:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
             newCompositeNode(grammarAccess.getIfStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;

             current =iv_ruleIfStatement; 
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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalPoST.g:2616:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'IF' ( (lv_mainCond_1_0= ruleExpression ) ) otherlv_2= 'THEN' ( (lv_mainStatement_3_0= ruleStatementList ) ) (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )* (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )? otherlv_10= 'END_IF' ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_mainCond_1_0 = null;

        EObject lv_mainStatement_3_0 = null;

        EObject lv_elseIfCond_5_0 = null;

        EObject lv_elseIfStatements_7_0 = null;

        EObject lv_elseStatement_9_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2622:2: ( (otherlv_0= 'IF' ( (lv_mainCond_1_0= ruleExpression ) ) otherlv_2= 'THEN' ( (lv_mainStatement_3_0= ruleStatementList ) ) (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )* (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )? otherlv_10= 'END_IF' ) )
            // InternalPoST.g:2623:2: (otherlv_0= 'IF' ( (lv_mainCond_1_0= ruleExpression ) ) otherlv_2= 'THEN' ( (lv_mainStatement_3_0= ruleStatementList ) ) (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )* (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )? otherlv_10= 'END_IF' )
            {
            // InternalPoST.g:2623:2: (otherlv_0= 'IF' ( (lv_mainCond_1_0= ruleExpression ) ) otherlv_2= 'THEN' ( (lv_mainStatement_3_0= ruleStatementList ) ) (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )* (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )? otherlv_10= 'END_IF' )
            // InternalPoST.g:2624:3: otherlv_0= 'IF' ( (lv_mainCond_1_0= ruleExpression ) ) otherlv_2= 'THEN' ( (lv_mainStatement_3_0= ruleStatementList ) ) (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )* (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )? otherlv_10= 'END_IF'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIFKeyword_0());
            		
            // InternalPoST.g:2628:3: ( (lv_mainCond_1_0= ruleExpression ) )
            // InternalPoST.g:2629:4: (lv_mainCond_1_0= ruleExpression )
            {
            // InternalPoST.g:2629:4: (lv_mainCond_1_0= ruleExpression )
            // InternalPoST.g:2630:5: lv_mainCond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getMainCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_41);
            lv_mainCond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"mainCond",
            						lv_mainCond_1_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,68,FOLLOW_56); 

            			newLeafNode(otherlv_2, grammarAccess.getIfStatementAccess().getTHENKeyword_2());
            		
            // InternalPoST.g:2651:3: ( (lv_mainStatement_3_0= ruleStatementList ) )
            // InternalPoST.g:2652:4: (lv_mainStatement_3_0= ruleStatementList )
            {
            // InternalPoST.g:2652:4: (lv_mainStatement_3_0= ruleStatementList )
            // InternalPoST.g:2653:5: lv_mainStatement_3_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getIfStatementAccess().getMainStatementStatementListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_57);
            lv_mainStatement_3_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfStatementRule());
            					}
            					set(
            						current,
            						"mainStatement",
            						lv_mainStatement_3_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:2670:3: (otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==73) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalPoST.g:2671:4: otherlv_4= 'ELSEIF' ( (lv_elseIfCond_5_0= ruleExpression ) ) otherlv_6= 'THEN' ( (lv_elseIfStatements_7_0= ruleStatementList ) )
            	    {
            	    otherlv_4=(Token)match(input,73,FOLLOW_46); 

            	    				newLeafNode(otherlv_4, grammarAccess.getIfStatementAccess().getELSEIFKeyword_4_0());
            	    			
            	    // InternalPoST.g:2675:4: ( (lv_elseIfCond_5_0= ruleExpression ) )
            	    // InternalPoST.g:2676:5: (lv_elseIfCond_5_0= ruleExpression )
            	    {
            	    // InternalPoST.g:2676:5: (lv_elseIfCond_5_0= ruleExpression )
            	    // InternalPoST.g:2677:6: lv_elseIfCond_5_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfCondExpressionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_elseIfCond_5_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elseIfCond",
            	    							lv_elseIfCond_5_0,
            	    							"su.nsk.iae.post.PoST.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_6=(Token)match(input,68,FOLLOW_56); 

            	    				newLeafNode(otherlv_6, grammarAccess.getIfStatementAccess().getTHENKeyword_4_2());
            	    			
            	    // InternalPoST.g:2698:4: ( (lv_elseIfStatements_7_0= ruleStatementList ) )
            	    // InternalPoST.g:2699:5: (lv_elseIfStatements_7_0= ruleStatementList )
            	    {
            	    // InternalPoST.g:2699:5: (lv_elseIfStatements_7_0= ruleStatementList )
            	    // InternalPoST.g:2700:6: lv_elseIfStatements_7_0= ruleStatementList
            	    {

            	    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseIfStatementsStatementListParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_57);
            	    lv_elseIfStatements_7_0=ruleStatementList();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"elseIfStatements",
            	    							lv_elseIfStatements_7_0,
            	    							"su.nsk.iae.post.PoST.StatementList");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            // InternalPoST.g:2718:3: (otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==74) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalPoST.g:2719:4: otherlv_8= 'ELSE' ( (lv_elseStatement_9_0= ruleStatementList ) )
                    {
                    otherlv_8=(Token)match(input,74,FOLLOW_58); 

                    				newLeafNode(otherlv_8, grammarAccess.getIfStatementAccess().getELSEKeyword_5_0());
                    			
                    // InternalPoST.g:2723:4: ( (lv_elseStatement_9_0= ruleStatementList ) )
                    // InternalPoST.g:2724:5: (lv_elseStatement_9_0= ruleStatementList )
                    {
                    // InternalPoST.g:2724:5: (lv_elseStatement_9_0= ruleStatementList )
                    // InternalPoST.g:2725:6: lv_elseStatement_9_0= ruleStatementList
                    {

                    						newCompositeNode(grammarAccess.getIfStatementAccess().getElseStatementStatementListParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_59);
                    lv_elseStatement_9_0=ruleStatementList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIfStatementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_9_0,
                    							"su.nsk.iae.post.PoST.StatementList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,75,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getIfStatementAccess().getEND_IFKeyword_6());
            		

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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleCaseStatement"
    // InternalPoST.g:2751:1: entryRuleCaseStatement returns [EObject current=null] : iv_ruleCaseStatement= ruleCaseStatement EOF ;
    public final EObject entryRuleCaseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseStatement = null;


        try {
            // InternalPoST.g:2751:54: (iv_ruleCaseStatement= ruleCaseStatement EOF )
            // InternalPoST.g:2752:2: iv_ruleCaseStatement= ruleCaseStatement EOF
            {
             newCompositeNode(grammarAccess.getCaseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseStatement=ruleCaseStatement();

            state._fsp--;

             current =iv_ruleCaseStatement; 
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
    // $ANTLR end "entryRuleCaseStatement"


    // $ANTLR start "ruleCaseStatement"
    // InternalPoST.g:2758:1: ruleCaseStatement returns [EObject current=null] : (otherlv_0= 'CASE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'OF' ( (lv_caseElements_3_0= ruleCaseElement ) )+ (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )? otherlv_6= 'END_CASE' ) ;
    public final EObject ruleCaseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_cond_1_0 = null;

        EObject lv_caseElements_3_0 = null;

        EObject lv_elseStatement_5_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2764:2: ( (otherlv_0= 'CASE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'OF' ( (lv_caseElements_3_0= ruleCaseElement ) )+ (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )? otherlv_6= 'END_CASE' ) )
            // InternalPoST.g:2765:2: (otherlv_0= 'CASE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'OF' ( (lv_caseElements_3_0= ruleCaseElement ) )+ (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )? otherlv_6= 'END_CASE' )
            {
            // InternalPoST.g:2765:2: (otherlv_0= 'CASE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'OF' ( (lv_caseElements_3_0= ruleCaseElement ) )+ (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )? otherlv_6= 'END_CASE' )
            // InternalPoST.g:2766:3: otherlv_0= 'CASE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'OF' ( (lv_caseElements_3_0= ruleCaseElement ) )+ (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )? otherlv_6= 'END_CASE'
            {
            otherlv_0=(Token)match(input,76,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getCaseStatementAccess().getCASEKeyword_0());
            		
            // InternalPoST.g:2770:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalPoST.g:2771:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalPoST.g:2771:4: (lv_cond_1_0= ruleExpression )
            // InternalPoST.g:2772:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getCaseStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_60);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,77,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getCaseStatementAccess().getOFKeyword_2());
            		
            // InternalPoST.g:2793:3: ( (lv_caseElements_3_0= ruleCaseElement ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_INTEGER||LA39_0==100) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalPoST.g:2794:4: (lv_caseElements_3_0= ruleCaseElement )
            	    {
            	    // InternalPoST.g:2794:4: (lv_caseElements_3_0= ruleCaseElement )
            	    // InternalPoST.g:2795:5: lv_caseElements_3_0= ruleCaseElement
            	    {

            	    					newCompositeNode(grammarAccess.getCaseStatementAccess().getCaseElementsCaseElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_caseElements_3_0=ruleCaseElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCaseStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"caseElements",
            	    						lv_caseElements_3_0,
            	    						"su.nsk.iae.post.PoST.CaseElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            // InternalPoST.g:2812:3: (otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==74) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalPoST.g:2813:4: otherlv_4= 'ELSE' ( (lv_elseStatement_5_0= ruleStatementList ) )
                    {
                    otherlv_4=(Token)match(input,74,FOLLOW_63); 

                    				newLeafNode(otherlv_4, grammarAccess.getCaseStatementAccess().getELSEKeyword_4_0());
                    			
                    // InternalPoST.g:2817:4: ( (lv_elseStatement_5_0= ruleStatementList ) )
                    // InternalPoST.g:2818:5: (lv_elseStatement_5_0= ruleStatementList )
                    {
                    // InternalPoST.g:2818:5: (lv_elseStatement_5_0= ruleStatementList )
                    // InternalPoST.g:2819:6: lv_elseStatement_5_0= ruleStatementList
                    {

                    						newCompositeNode(grammarAccess.getCaseStatementAccess().getElseStatementStatementListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_64);
                    lv_elseStatement_5_0=ruleStatementList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCaseStatementRule());
                    						}
                    						set(
                    							current,
                    							"elseStatement",
                    							lv_elseStatement_5_0,
                    							"su.nsk.iae.post.PoST.StatementList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,78,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getCaseStatementAccess().getEND_CASEKeyword_5());
            		

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
    // $ANTLR end "ruleCaseStatement"


    // $ANTLR start "entryRuleCaseElement"
    // InternalPoST.g:2845:1: entryRuleCaseElement returns [EObject current=null] : iv_ruleCaseElement= ruleCaseElement EOF ;
    public final EObject entryRuleCaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseElement = null;


        try {
            // InternalPoST.g:2845:52: (iv_ruleCaseElement= ruleCaseElement EOF )
            // InternalPoST.g:2846:2: iv_ruleCaseElement= ruleCaseElement EOF
            {
             newCompositeNode(grammarAccess.getCaseElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseElement=ruleCaseElement();

            state._fsp--;

             current =iv_ruleCaseElement; 
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
    // $ANTLR end "entryRuleCaseElement"


    // $ANTLR start "ruleCaseElement"
    // InternalPoST.g:2852:1: ruleCaseElement returns [EObject current=null] : ( ( (lv_caseList_0_0= ruleCaseList ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatementList ) ) ) ;
    public final EObject ruleCaseElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_caseList_0_0 = null;

        EObject lv_statement_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2858:2: ( ( ( (lv_caseList_0_0= ruleCaseList ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatementList ) ) ) )
            // InternalPoST.g:2859:2: ( ( (lv_caseList_0_0= ruleCaseList ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatementList ) ) )
            {
            // InternalPoST.g:2859:2: ( ( (lv_caseList_0_0= ruleCaseList ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatementList ) ) )
            // InternalPoST.g:2860:3: ( (lv_caseList_0_0= ruleCaseList ) ) otherlv_1= ':' ( (lv_statement_2_0= ruleStatementList ) )
            {
            // InternalPoST.g:2860:3: ( (lv_caseList_0_0= ruleCaseList ) )
            // InternalPoST.g:2861:4: (lv_caseList_0_0= ruleCaseList )
            {
            // InternalPoST.g:2861:4: (lv_caseList_0_0= ruleCaseList )
            // InternalPoST.g:2862:5: lv_caseList_0_0= ruleCaseList
            {

            					newCompositeNode(grammarAccess.getCaseElementAccess().getCaseListCaseListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
            lv_caseList_0_0=ruleCaseList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseElementRule());
            					}
            					set(
            						current,
            						"caseList",
            						lv_caseList_0_0,
            						"su.nsk.iae.post.PoST.CaseList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,55,FOLLOW_65); 

            			newLeafNode(otherlv_1, grammarAccess.getCaseElementAccess().getColonKeyword_1());
            		
            // InternalPoST.g:2883:3: ( (lv_statement_2_0= ruleStatementList ) )
            // InternalPoST.g:2884:4: (lv_statement_2_0= ruleStatementList )
            {
            // InternalPoST.g:2884:4: (lv_statement_2_0= ruleStatementList )
            // InternalPoST.g:2885:5: lv_statement_2_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getCaseElementAccess().getStatementStatementListParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_statement_2_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseElementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_2_0,
            						"su.nsk.iae.post.PoST.StatementList");
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
    // $ANTLR end "ruleCaseElement"


    // $ANTLR start "entryRuleCaseList"
    // InternalPoST.g:2906:1: entryRuleCaseList returns [EObject current=null] : iv_ruleCaseList= ruleCaseList EOF ;
    public final EObject entryRuleCaseList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseList = null;


        try {
            // InternalPoST.g:2906:49: (iv_ruleCaseList= ruleCaseList EOF )
            // InternalPoST.g:2907:2: iv_ruleCaseList= ruleCaseList EOF
            {
             newCompositeNode(grammarAccess.getCaseListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCaseList=ruleCaseList();

            state._fsp--;

             current =iv_ruleCaseList; 
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
    // $ANTLR end "entryRuleCaseList"


    // $ANTLR start "ruleCaseList"
    // InternalPoST.g:2913:1: ruleCaseList returns [EObject current=null] : ( ( (lv_caseListElement_0_0= ruleSignedInteger ) ) (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )* ) ;
    public final EObject ruleCaseList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_caseListElement_0_0 = null;

        EObject lv_caseListElement_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:2919:2: ( ( ( (lv_caseListElement_0_0= ruleSignedInteger ) ) (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )* ) )
            // InternalPoST.g:2920:2: ( ( (lv_caseListElement_0_0= ruleSignedInteger ) ) (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )* )
            {
            // InternalPoST.g:2920:2: ( ( (lv_caseListElement_0_0= ruleSignedInteger ) ) (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )* )
            // InternalPoST.g:2921:3: ( (lv_caseListElement_0_0= ruleSignedInteger ) ) (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )*
            {
            // InternalPoST.g:2921:3: ( (lv_caseListElement_0_0= ruleSignedInteger ) )
            // InternalPoST.g:2922:4: (lv_caseListElement_0_0= ruleSignedInteger )
            {
            // InternalPoST.g:2922:4: (lv_caseListElement_0_0= ruleSignedInteger )
            // InternalPoST.g:2923:5: lv_caseListElement_0_0= ruleSignedInteger
            {

            					newCompositeNode(grammarAccess.getCaseListAccess().getCaseListElementSignedIntegerParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
            lv_caseListElement_0_0=ruleSignedInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCaseListRule());
            					}
            					add(
            						current,
            						"caseListElement",
            						lv_caseListElement_0_0,
            						"su.nsk.iae.post.PoST.SignedInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:2940:3: (otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==52) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalPoST.g:2941:4: otherlv_1= ',' ( (lv_caseListElement_2_0= ruleSignedInteger ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_61); 

            	    				newLeafNode(otherlv_1, grammarAccess.getCaseListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPoST.g:2945:4: ( (lv_caseListElement_2_0= ruleSignedInteger ) )
            	    // InternalPoST.g:2946:5: (lv_caseListElement_2_0= ruleSignedInteger )
            	    {
            	    // InternalPoST.g:2946:5: (lv_caseListElement_2_0= ruleSignedInteger )
            	    // InternalPoST.g:2947:6: lv_caseListElement_2_0= ruleSignedInteger
            	    {

            	    						newCompositeNode(grammarAccess.getCaseListAccess().getCaseListElementSignedIntegerParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
            	    lv_caseListElement_2_0=ruleSignedInteger();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCaseListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"caseListElement",
            	    							lv_caseListElement_2_0,
            	    							"su.nsk.iae.post.PoST.SignedInteger");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleCaseList"


    // $ANTLR start "entryRuleIterationStatement"
    // InternalPoST.g:2969:1: entryRuleIterationStatement returns [EObject current=null] : iv_ruleIterationStatement= ruleIterationStatement EOF ;
    public final EObject entryRuleIterationStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIterationStatement = null;


        try {
            // InternalPoST.g:2969:59: (iv_ruleIterationStatement= ruleIterationStatement EOF )
            // InternalPoST.g:2970:2: iv_ruleIterationStatement= ruleIterationStatement EOF
            {
             newCompositeNode(grammarAccess.getIterationStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIterationStatement=ruleIterationStatement();

            state._fsp--;

             current =iv_ruleIterationStatement; 
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
    // $ANTLR end "entryRuleIterationStatement"


    // $ANTLR start "ruleIterationStatement"
    // InternalPoST.g:2976:1: ruleIterationStatement returns [EObject current=null] : (this_ForStatement_0= ruleForStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement ) ;
    public final EObject ruleIterationStatement() throws RecognitionException {
        EObject current = null;

        EObject this_ForStatement_0 = null;

        EObject this_WhileStatement_1 = null;

        EObject this_RepeatStatement_2 = null;



        	enterRule();

        try {
            // InternalPoST.g:2982:2: ( (this_ForStatement_0= ruleForStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement ) )
            // InternalPoST.g:2983:2: (this_ForStatement_0= ruleForStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement )
            {
            // InternalPoST.g:2983:2: (this_ForStatement_0= ruleForStatement | this_WhileStatement_1= ruleWhileStatement | this_RepeatStatement_2= ruleRepeatStatement )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt42=1;
                }
                break;
            case 84:
                {
                alt42=2;
                }
                break;
            case 86:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalPoST.g:2984:3: this_ForStatement_0= ruleForStatement
                    {

                    			newCompositeNode(grammarAccess.getIterationStatementAccess().getForStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ForStatement_0=ruleForStatement();

                    state._fsp--;


                    			current = this_ForStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:2993:3: this_WhileStatement_1= ruleWhileStatement
                    {

                    			newCompositeNode(grammarAccess.getIterationStatementAccess().getWhileStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WhileStatement_1=ruleWhileStatement();

                    state._fsp--;


                    			current = this_WhileStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:3002:3: this_RepeatStatement_2= ruleRepeatStatement
                    {

                    			newCompositeNode(grammarAccess.getIterationStatementAccess().getRepeatStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_RepeatStatement_2=ruleRepeatStatement();

                    state._fsp--;


                    			current = this_RepeatStatement_2;
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
    // $ANTLR end "ruleIterationStatement"


    // $ANTLR start "entryRuleForStatement"
    // InternalPoST.g:3014:1: entryRuleForStatement returns [EObject current=null] : iv_ruleForStatement= ruleForStatement EOF ;
    public final EObject entryRuleForStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForStatement = null;


        try {
            // InternalPoST.g:3014:53: (iv_ruleForStatement= ruleForStatement EOF )
            // InternalPoST.g:3015:2: iv_ruleForStatement= ruleForStatement EOF
            {
             newCompositeNode(grammarAccess.getForStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForStatement=ruleForStatement();

            state._fsp--;

             current =iv_ruleForStatement; 
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
    // $ANTLR end "entryRuleForStatement"


    // $ANTLR start "ruleForStatement"
    // InternalPoST.g:3021:1: ruleForStatement returns [EObject current=null] : (otherlv_0= 'FOR' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_forList_3_0= ruleForList ) ) otherlv_4= 'DO' ( (lv_statement_5_0= ruleStatementList ) ) otherlv_6= 'END_FOR' ) ;
    public final EObject ruleForStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_forList_3_0 = null;

        EObject lv_statement_5_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3027:2: ( (otherlv_0= 'FOR' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_forList_3_0= ruleForList ) ) otherlv_4= 'DO' ( (lv_statement_5_0= ruleStatementList ) ) otherlv_6= 'END_FOR' ) )
            // InternalPoST.g:3028:2: (otherlv_0= 'FOR' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_forList_3_0= ruleForList ) ) otherlv_4= 'DO' ( (lv_statement_5_0= ruleStatementList ) ) otherlv_6= 'END_FOR' )
            {
            // InternalPoST.g:3028:2: (otherlv_0= 'FOR' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_forList_3_0= ruleForList ) ) otherlv_4= 'DO' ( (lv_statement_5_0= ruleStatementList ) ) otherlv_6= 'END_FOR' )
            // InternalPoST.g:3029:3: otherlv_0= 'FOR' ( (otherlv_1= RULE_ID ) ) otherlv_2= ':=' ( (lv_forList_3_0= ruleForList ) ) otherlv_4= 'DO' ( (lv_statement_5_0= ruleStatementList ) ) otherlv_6= 'END_FOR'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getForStatementAccess().getFORKeyword_0());
            		
            // InternalPoST.g:3033:3: ( (otherlv_1= RULE_ID ) )
            // InternalPoST.g:3034:4: (otherlv_1= RULE_ID )
            {
            // InternalPoST.g:3034:4: (otherlv_1= RULE_ID )
            // InternalPoST.g:3035:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getForStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_1, grammarAccess.getForStatementAccess().getVariableSymbolicVariableCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,51,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getForStatementAccess().getColonEqualsSignKeyword_2());
            		
            // InternalPoST.g:3050:3: ( (lv_forList_3_0= ruleForList ) )
            // InternalPoST.g:3051:4: (lv_forList_3_0= ruleForList )
            {
            // InternalPoST.g:3051:4: (lv_forList_3_0= ruleForList )
            // InternalPoST.g:3052:5: lv_forList_3_0= ruleForList
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getForListForListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_66);
            lv_forList_3_0=ruleForList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStatementRule());
            					}
            					set(
            						current,
            						"forList",
            						lv_forList_3_0,
            						"su.nsk.iae.post.PoST.ForList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_67); 

            			newLeafNode(otherlv_4, grammarAccess.getForStatementAccess().getDOKeyword_4());
            		
            // InternalPoST.g:3073:3: ( (lv_statement_5_0= ruleStatementList ) )
            // InternalPoST.g:3074:4: (lv_statement_5_0= ruleStatementList )
            {
            // InternalPoST.g:3074:4: (lv_statement_5_0= ruleStatementList )
            // InternalPoST.g:3075:5: lv_statement_5_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getForStatementAccess().getStatementStatementListParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_68);
            lv_statement_5_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_5_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,81,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getForStatementAccess().getEND_FORKeyword_6());
            		

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
    // $ANTLR end "ruleForStatement"


    // $ANTLR start "entryRuleForList"
    // InternalPoST.g:3100:1: entryRuleForList returns [EObject current=null] : iv_ruleForList= ruleForList EOF ;
    public final EObject entryRuleForList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForList = null;


        try {
            // InternalPoST.g:3100:48: (iv_ruleForList= ruleForList EOF )
            // InternalPoST.g:3101:2: iv_ruleForList= ruleForList EOF
            {
             newCompositeNode(grammarAccess.getForListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForList=ruleForList();

            state._fsp--;

             current =iv_ruleForList; 
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
    // $ANTLR end "entryRuleForList"


    // $ANTLR start "ruleForList"
    // InternalPoST.g:3107:1: ruleForList returns [EObject current=null] : ( ( (lv_start_0_0= ruleExpression ) ) otherlv_1= 'TO' ( (lv_end_2_0= ruleExpression ) ) (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )? ) ;
    public final EObject ruleForList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_start_0_0 = null;

        EObject lv_end_2_0 = null;

        EObject lv_step_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3113:2: ( ( ( (lv_start_0_0= ruleExpression ) ) otherlv_1= 'TO' ( (lv_end_2_0= ruleExpression ) ) (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )? ) )
            // InternalPoST.g:3114:2: ( ( (lv_start_0_0= ruleExpression ) ) otherlv_1= 'TO' ( (lv_end_2_0= ruleExpression ) ) (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )? )
            {
            // InternalPoST.g:3114:2: ( ( (lv_start_0_0= ruleExpression ) ) otherlv_1= 'TO' ( (lv_end_2_0= ruleExpression ) ) (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )? )
            // InternalPoST.g:3115:3: ( (lv_start_0_0= ruleExpression ) ) otherlv_1= 'TO' ( (lv_end_2_0= ruleExpression ) ) (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )?
            {
            // InternalPoST.g:3115:3: ( (lv_start_0_0= ruleExpression ) )
            // InternalPoST.g:3116:4: (lv_start_0_0= ruleExpression )
            {
            // InternalPoST.g:3116:4: (lv_start_0_0= ruleExpression )
            // InternalPoST.g:3117:5: lv_start_0_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForListAccess().getStartExpressionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_69);
            lv_start_0_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForListRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_0_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,82,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getForListAccess().getTOKeyword_1());
            		
            // InternalPoST.g:3138:3: ( (lv_end_2_0= ruleExpression ) )
            // InternalPoST.g:3139:4: (lv_end_2_0= ruleExpression )
            {
            // InternalPoST.g:3139:4: (lv_end_2_0= ruleExpression )
            // InternalPoST.g:3140:5: lv_end_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getForListAccess().getEndExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_70);
            lv_end_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getForListRule());
            					}
            					set(
            						current,
            						"end",
            						lv_end_2_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPoST.g:3157:3: (otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==83) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalPoST.g:3158:4: otherlv_3= 'BY' ( (lv_step_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,83,FOLLOW_46); 

                    				newLeafNode(otherlv_3, grammarAccess.getForListAccess().getBYKeyword_3_0());
                    			
                    // InternalPoST.g:3162:4: ( (lv_step_4_0= ruleExpression ) )
                    // InternalPoST.g:3163:5: (lv_step_4_0= ruleExpression )
                    {
                    // InternalPoST.g:3163:5: (lv_step_4_0= ruleExpression )
                    // InternalPoST.g:3164:6: lv_step_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getForListAccess().getStepExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_step_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForListRule());
                    						}
                    						set(
                    							current,
                    							"step",
                    							lv_step_4_0,
                    							"su.nsk.iae.post.PoST.Expression");
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
    // $ANTLR end "ruleForList"


    // $ANTLR start "entryRuleWhileStatement"
    // InternalPoST.g:3186:1: entryRuleWhileStatement returns [EObject current=null] : iv_ruleWhileStatement= ruleWhileStatement EOF ;
    public final EObject entryRuleWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhileStatement = null;


        try {
            // InternalPoST.g:3186:55: (iv_ruleWhileStatement= ruleWhileStatement EOF )
            // InternalPoST.g:3187:2: iv_ruleWhileStatement= ruleWhileStatement EOF
            {
             newCompositeNode(grammarAccess.getWhileStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhileStatement=ruleWhileStatement();

            state._fsp--;

             current =iv_ruleWhileStatement; 
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
    // $ANTLR end "entryRuleWhileStatement"


    // $ANTLR start "ruleWhileStatement"
    // InternalPoST.g:3193:1: ruleWhileStatement returns [EObject current=null] : (otherlv_0= 'WHILE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'DO' ( (lv_statement_3_0= ruleStatementList ) ) otherlv_4= 'END_WHILE' ) ;
    public final EObject ruleWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_cond_1_0 = null;

        EObject lv_statement_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3199:2: ( (otherlv_0= 'WHILE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'DO' ( (lv_statement_3_0= ruleStatementList ) ) otherlv_4= 'END_WHILE' ) )
            // InternalPoST.g:3200:2: (otherlv_0= 'WHILE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'DO' ( (lv_statement_3_0= ruleStatementList ) ) otherlv_4= 'END_WHILE' )
            {
            // InternalPoST.g:3200:2: (otherlv_0= 'WHILE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'DO' ( (lv_statement_3_0= ruleStatementList ) ) otherlv_4= 'END_WHILE' )
            // InternalPoST.g:3201:3: otherlv_0= 'WHILE' ( (lv_cond_1_0= ruleExpression ) ) otherlv_2= 'DO' ( (lv_statement_3_0= ruleStatementList ) ) otherlv_4= 'END_WHILE'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getWhileStatementAccess().getWHILEKeyword_0());
            		
            // InternalPoST.g:3205:3: ( (lv_cond_1_0= ruleExpression ) )
            // InternalPoST.g:3206:4: (lv_cond_1_0= ruleExpression )
            {
            // InternalPoST.g:3206:4: (lv_cond_1_0= ruleExpression )
            // InternalPoST.g:3207:5: lv_cond_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getCondExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_66);
            lv_cond_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_1_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,80,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getWhileStatementAccess().getDOKeyword_2());
            		
            // InternalPoST.g:3228:3: ( (lv_statement_3_0= ruleStatementList ) )
            // InternalPoST.g:3229:4: (lv_statement_3_0= ruleStatementList )
            {
            // InternalPoST.g:3229:4: (lv_statement_3_0= ruleStatementList )
            // InternalPoST.g:3230:5: lv_statement_3_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getWhileStatementAccess().getStatementStatementListParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
            lv_statement_3_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWhileStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_3_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,85,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWhileStatementAccess().getEND_WHILEKeyword_4());
            		

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
    // $ANTLR end "ruleWhileStatement"


    // $ANTLR start "entryRuleRepeatStatement"
    // InternalPoST.g:3255:1: entryRuleRepeatStatement returns [EObject current=null] : iv_ruleRepeatStatement= ruleRepeatStatement EOF ;
    public final EObject entryRuleRepeatStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepeatStatement = null;


        try {
            // InternalPoST.g:3255:56: (iv_ruleRepeatStatement= ruleRepeatStatement EOF )
            // InternalPoST.g:3256:2: iv_ruleRepeatStatement= ruleRepeatStatement EOF
            {
             newCompositeNode(grammarAccess.getRepeatStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRepeatStatement=ruleRepeatStatement();

            state._fsp--;

             current =iv_ruleRepeatStatement; 
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
    // $ANTLR end "entryRuleRepeatStatement"


    // $ANTLR start "ruleRepeatStatement"
    // InternalPoST.g:3262:1: ruleRepeatStatement returns [EObject current=null] : (otherlv_0= 'REPEAT' ( (lv_statement_1_0= ruleStatementList ) ) otherlv_2= 'UNTIL' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= 'END_REPEAT' ) ;
    public final EObject ruleRepeatStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_statement_1_0 = null;

        EObject lv_cond_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3268:2: ( (otherlv_0= 'REPEAT' ( (lv_statement_1_0= ruleStatementList ) ) otherlv_2= 'UNTIL' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= 'END_REPEAT' ) )
            // InternalPoST.g:3269:2: (otherlv_0= 'REPEAT' ( (lv_statement_1_0= ruleStatementList ) ) otherlv_2= 'UNTIL' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= 'END_REPEAT' )
            {
            // InternalPoST.g:3269:2: (otherlv_0= 'REPEAT' ( (lv_statement_1_0= ruleStatementList ) ) otherlv_2= 'UNTIL' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= 'END_REPEAT' )
            // InternalPoST.g:3270:3: otherlv_0= 'REPEAT' ( (lv_statement_1_0= ruleStatementList ) ) otherlv_2= 'UNTIL' ( (lv_cond_3_0= ruleExpression ) ) otherlv_4= 'END_REPEAT'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_73); 

            			newLeafNode(otherlv_0, grammarAccess.getRepeatStatementAccess().getREPEATKeyword_0());
            		
            // InternalPoST.g:3274:3: ( (lv_statement_1_0= ruleStatementList ) )
            // InternalPoST.g:3275:4: (lv_statement_1_0= ruleStatementList )
            {
            // InternalPoST.g:3275:4: (lv_statement_1_0= ruleStatementList )
            // InternalPoST.g:3276:5: lv_statement_1_0= ruleStatementList
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getStatementStatementListParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_74);
            lv_statement_1_0=ruleStatementList();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"statement",
            						lv_statement_1_0,
            						"su.nsk.iae.post.PoST.StatementList");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,87,FOLLOW_46); 

            			newLeafNode(otherlv_2, grammarAccess.getRepeatStatementAccess().getUNTILKeyword_2());
            		
            // InternalPoST.g:3297:3: ( (lv_cond_3_0= ruleExpression ) )
            // InternalPoST.g:3298:4: (lv_cond_3_0= ruleExpression )
            {
            // InternalPoST.g:3298:4: (lv_cond_3_0= ruleExpression )
            // InternalPoST.g:3299:5: lv_cond_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getRepeatStatementAccess().getCondExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_75);
            lv_cond_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRepeatStatementRule());
            					}
            					set(
            						current,
            						"cond",
            						lv_cond_3_0,
            						"su.nsk.iae.post.PoST.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,88,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRepeatStatementAccess().getEND_REPEATKeyword_4());
            		

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
    // $ANTLR end "ruleRepeatStatement"


    // $ANTLR start "entryRuleSymbolicVariable"
    // InternalPoST.g:3324:1: entryRuleSymbolicVariable returns [EObject current=null] : iv_ruleSymbolicVariable= ruleSymbolicVariable EOF ;
    public final EObject entryRuleSymbolicVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymbolicVariable = null;


        try {
            // InternalPoST.g:3324:57: (iv_ruleSymbolicVariable= ruleSymbolicVariable EOF )
            // InternalPoST.g:3325:2: iv_ruleSymbolicVariable= ruleSymbolicVariable EOF
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
    // InternalPoST.g:3331:1: ruleSymbolicVariable returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleSymbolicVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalPoST.g:3337:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalPoST.g:3338:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalPoST.g:3338:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalPoST.g:3339:3: (lv_name_0_0= RULE_ID )
            {
            // InternalPoST.g:3339:3: (lv_name_0_0= RULE_ID )
            // InternalPoST.g:3340:4: lv_name_0_0= RULE_ID
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
    // InternalPoST.g:3359:1: entryRuleVarInitDeclaration returns [EObject current=null] : iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF ;
    public final EObject entryRuleVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarInitDeclaration = null;


        try {
            // InternalPoST.g:3359:59: (iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF )
            // InternalPoST.g:3360:2: iv_ruleVarInitDeclaration= ruleVarInitDeclaration EOF
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
    // InternalPoST.g:3366:1: ruleVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) ) ;
    public final EObject ruleVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        EObject lv_spec_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3372:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) ) )
            // InternalPoST.g:3373:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) )
            {
            // InternalPoST.g:3373:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) ) )
            // InternalPoST.g:3374:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_spec_2_0= ruleSimpleSpecificationInit ) )
            {
            // InternalPoST.g:3374:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:3375:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:3375:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:3376:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,55,FOLLOW_76); 

            			newLeafNode(otherlv_1, grammarAccess.getVarInitDeclarationAccess().getColonKeyword_1());
            		
            // InternalPoST.g:3397:3: ( (lv_spec_2_0= ruleSimpleSpecificationInit ) )
            // InternalPoST.g:3398:4: (lv_spec_2_0= ruleSimpleSpecificationInit )
            {
            // InternalPoST.g:3398:4: (lv_spec_2_0= ruleSimpleSpecificationInit )
            // InternalPoST.g:3399:5: lv_spec_2_0= ruleSimpleSpecificationInit
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
    // InternalPoST.g:3420:1: entryRuleVarList returns [EObject current=null] : iv_ruleVarList= ruleVarList EOF ;
    public final EObject entryRuleVarList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarList = null;


        try {
            // InternalPoST.g:3420:48: (iv_ruleVarList= ruleVarList EOF )
            // InternalPoST.g:3421:2: iv_ruleVarList= ruleVarList EOF
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
    // InternalPoST.g:3427:1: ruleVarList returns [EObject current=null] : ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* ) ;
    public final EObject ruleVarList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_vars_0_0 = null;

        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3433:2: ( ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* ) )
            // InternalPoST.g:3434:2: ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* )
            {
            // InternalPoST.g:3434:2: ( ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )* )
            // InternalPoST.g:3435:3: ( (lv_vars_0_0= ruleSymbolicVariable ) ) (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )*
            {
            // InternalPoST.g:3435:3: ( (lv_vars_0_0= ruleSymbolicVariable ) )
            // InternalPoST.g:3436:4: (lv_vars_0_0= ruleSymbolicVariable )
            {
            // InternalPoST.g:3436:4: (lv_vars_0_0= ruleSymbolicVariable )
            // InternalPoST.g:3437:5: lv_vars_0_0= ruleSymbolicVariable
            {

            					newCompositeNode(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_25);
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

            // InternalPoST.g:3454:3: (otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==52) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalPoST.g:3455:4: otherlv_1= ',' ( (lv_vars_2_0= ruleSymbolicVariable ) )
            	    {
            	    otherlv_1=(Token)match(input,52,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getVarListAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalPoST.g:3459:4: ( (lv_vars_2_0= ruleSymbolicVariable ) )
            	    // InternalPoST.g:3460:5: (lv_vars_2_0= ruleSymbolicVariable )
            	    {
            	    // InternalPoST.g:3460:5: (lv_vars_2_0= ruleSymbolicVariable )
            	    // InternalPoST.g:3461:6: lv_vars_2_0= ruleSymbolicVariable
            	    {

            	    						newCompositeNode(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_25);
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
            	    break loop44;
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


    // $ANTLR start "entryRuleInputVarDeclaration"
    // InternalPoST.g:3483:1: entryRuleInputVarDeclaration returns [EObject current=null] : iv_ruleInputVarDeclaration= ruleInputVarDeclaration EOF ;
    public final EObject entryRuleInputVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputVarDeclaration = null;


        try {
            // InternalPoST.g:3483:60: (iv_ruleInputVarDeclaration= ruleInputVarDeclaration EOF )
            // InternalPoST.g:3484:2: iv_ruleInputVarDeclaration= ruleInputVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInputVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputVarDeclaration=ruleInputVarDeclaration();

            state._fsp--;

             current =iv_ruleInputVarDeclaration; 
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
    // $ANTLR end "entryRuleInputVarDeclaration"


    // $ANTLR start "ruleInputVarDeclaration"
    // InternalPoST.g:3490:1: ruleInputVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_INPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) ;
    public final EObject ruleInputVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3496:2: ( (otherlv_0= 'VAR_INPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) )
            // InternalPoST.g:3497:2: (otherlv_0= 'VAR_INPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            {
            // InternalPoST.g:3497:2: (otherlv_0= 'VAR_INPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            // InternalPoST.g:3498:3: otherlv_0= 'VAR_INPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR'
            {
            otherlv_0=(Token)match(input,89,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputVarDeclarationAccess().getVAR_INPUTKeyword_0());
            		
            // InternalPoST.g:3502:3: ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalPoST.g:3503:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';'
            	    {
            	    // InternalPoST.g:3503:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3504:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3504:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3505:6: lv_vars_1_0= ruleVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getInputVarDeclarationAccess().getVarsVarInitDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_1_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_1_0,
            	    							"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_77); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInputVarDeclarationAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);

            otherlv_3=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInputVarDeclarationAccess().getEND_VARKeyword_2());
            		

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
    // $ANTLR end "ruleInputVarDeclaration"


    // $ANTLR start "entryRuleOutputVarDeclaration"
    // InternalPoST.g:3535:1: entryRuleOutputVarDeclaration returns [EObject current=null] : iv_ruleOutputVarDeclaration= ruleOutputVarDeclaration EOF ;
    public final EObject entryRuleOutputVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputVarDeclaration = null;


        try {
            // InternalPoST.g:3535:61: (iv_ruleOutputVarDeclaration= ruleOutputVarDeclaration EOF )
            // InternalPoST.g:3536:2: iv_ruleOutputVarDeclaration= ruleOutputVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getOutputVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputVarDeclaration=ruleOutputVarDeclaration();

            state._fsp--;

             current =iv_ruleOutputVarDeclaration; 
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
    // $ANTLR end "entryRuleOutputVarDeclaration"


    // $ANTLR start "ruleOutputVarDeclaration"
    // InternalPoST.g:3542:1: ruleOutputVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_OUTPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) ;
    public final EObject ruleOutputVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3548:2: ( (otherlv_0= 'VAR_OUTPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) )
            // InternalPoST.g:3549:2: (otherlv_0= 'VAR_OUTPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            {
            // InternalPoST.g:3549:2: (otherlv_0= 'VAR_OUTPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            // InternalPoST.g:3550:3: otherlv_0= 'VAR_OUTPUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR'
            {
            otherlv_0=(Token)match(input,91,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOutputVarDeclarationAccess().getVAR_OUTPUTKeyword_0());
            		
            // InternalPoST.g:3554:3: ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalPoST.g:3555:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';'
            	    {
            	    // InternalPoST.g:3555:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3556:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3556:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3557:6: lv_vars_1_0= ruleVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getOutputVarDeclarationAccess().getVarsVarInitDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_1_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOutputVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_1_0,
            	    							"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_77); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOutputVarDeclarationAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_3=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getOutputVarDeclarationAccess().getEND_VARKeyword_2());
            		

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
    // $ANTLR end "ruleOutputVarDeclaration"


    // $ANTLR start "entryRuleInputOutputVarDeclaration"
    // InternalPoST.g:3587:1: entryRuleInputOutputVarDeclaration returns [EObject current=null] : iv_ruleInputOutputVarDeclaration= ruleInputOutputVarDeclaration EOF ;
    public final EObject entryRuleInputOutputVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInputOutputVarDeclaration = null;


        try {
            // InternalPoST.g:3587:66: (iv_ruleInputOutputVarDeclaration= ruleInputOutputVarDeclaration EOF )
            // InternalPoST.g:3588:2: iv_ruleInputOutputVarDeclaration= ruleInputOutputVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getInputOutputVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInputOutputVarDeclaration=ruleInputOutputVarDeclaration();

            state._fsp--;

             current =iv_ruleInputOutputVarDeclaration; 
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
    // $ANTLR end "entryRuleInputOutputVarDeclaration"


    // $ANTLR start "ruleInputOutputVarDeclaration"
    // InternalPoST.g:3594:1: ruleInputOutputVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_IN_OUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) ;
    public final EObject ruleInputOutputVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3600:2: ( (otherlv_0= 'VAR_IN_OUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) )
            // InternalPoST.g:3601:2: (otherlv_0= 'VAR_IN_OUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            {
            // InternalPoST.g:3601:2: (otherlv_0= 'VAR_IN_OUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            // InternalPoST.g:3602:3: otherlv_0= 'VAR_IN_OUT' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR'
            {
            otherlv_0=(Token)match(input,92,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInputOutputVarDeclarationAccess().getVAR_IN_OUTKeyword_0());
            		
            // InternalPoST.g:3606:3: ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalPoST.g:3607:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';'
            	    {
            	    // InternalPoST.g:3607:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3608:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3608:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3609:6: lv_vars_1_0= ruleVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getInputOutputVarDeclarationAccess().getVarsVarInitDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_1_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInputOutputVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_1_0,
            	    							"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_77); 

            	    				newLeafNode(otherlv_2, grammarAccess.getInputOutputVarDeclarationAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_3=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInputOutputVarDeclarationAccess().getEND_VARKeyword_2());
            		

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
    // $ANTLR end "ruleInputOutputVarDeclaration"


    // $ANTLR start "entryRuleVarDeclaration"
    // InternalPoST.g:3639:1: entryRuleVarDeclaration returns [EObject current=null] : iv_ruleVarDeclaration= ruleVarDeclaration EOF ;
    public final EObject entryRuleVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDeclaration = null;


        try {
            // InternalPoST.g:3639:55: (iv_ruleVarDeclaration= ruleVarDeclaration EOF )
            // InternalPoST.g:3640:2: iv_ruleVarDeclaration= ruleVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDeclaration=ruleVarDeclaration();

            state._fsp--;

             current =iv_ruleVarDeclaration; 
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
    // $ANTLR end "entryRuleVarDeclaration"


    // $ANTLR start "ruleVarDeclaration"
    // InternalPoST.g:3646:1: ruleVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_const_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3652:2: ( (otherlv_0= 'VAR' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalPoST.g:3653:2: (otherlv_0= 'VAR' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalPoST.g:3653:2: (otherlv_0= 'VAR' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalPoST.g:3654:3: otherlv_0= 'VAR' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            otherlv_0=(Token)match(input,93,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDeclarationAccess().getVARKeyword_0());
            		
            // InternalPoST.g:3658:3: ( (lv_const_1_0= 'CONSTANT' ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==94) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalPoST.g:3659:4: (lv_const_1_0= 'CONSTANT' )
                    {
                    // InternalPoST.g:3659:4: (lv_const_1_0= 'CONSTANT' )
                    // InternalPoST.g:3660:5: lv_const_1_0= 'CONSTANT'
                    {
                    lv_const_1_0=(Token)match(input,94,FOLLOW_4); 

                    					newLeafNode(lv_const_1_0, grammarAccess.getVarDeclarationAccess().getConstCONSTANTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVarDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "const", true, "CONSTANT");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:3672:3: ( ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )+
            int cnt49=0;
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ID) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalPoST.g:3673:4: ( (lv_vars_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalPoST.g:3673:4: ( (lv_vars_2_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3674:5: (lv_vars_2_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3674:5: (lv_vars_2_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3675:6: lv_vars_2_0= ruleVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getVarDeclarationAccess().getVarsVarInitDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_2_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,47,FOLLOW_77); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVarDeclarationAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt49 >= 1 ) break loop49;
                        EarlyExitException eee =
                            new EarlyExitException(49, input);
                        throw eee;
                }
                cnt49++;
            } while (true);

            otherlv_4=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getVarDeclarationAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleVarDeclaration"


    // $ANTLR start "entryRuleTempVarDeclaration"
    // InternalPoST.g:3705:1: entryRuleTempVarDeclaration returns [EObject current=null] : iv_ruleTempVarDeclaration= ruleTempVarDeclaration EOF ;
    public final EObject entryRuleTempVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTempVarDeclaration = null;


        try {
            // InternalPoST.g:3705:59: (iv_ruleTempVarDeclaration= ruleTempVarDeclaration EOF )
            // InternalPoST.g:3706:2: iv_ruleTempVarDeclaration= ruleTempVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getTempVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTempVarDeclaration=ruleTempVarDeclaration();

            state._fsp--;

             current =iv_ruleTempVarDeclaration; 
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
    // $ANTLR end "entryRuleTempVarDeclaration"


    // $ANTLR start "ruleTempVarDeclaration"
    // InternalPoST.g:3712:1: ruleTempVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_TEMP' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) ;
    public final EObject ruleTempVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_vars_1_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3718:2: ( (otherlv_0= 'VAR_TEMP' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' ) )
            // InternalPoST.g:3719:2: (otherlv_0= 'VAR_TEMP' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            {
            // InternalPoST.g:3719:2: (otherlv_0= 'VAR_TEMP' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR' )
            // InternalPoST.g:3720:3: otherlv_0= 'VAR_TEMP' ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+ otherlv_3= 'END_VAR'
            {
            otherlv_0=(Token)match(input,95,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTempVarDeclarationAccess().getVAR_TEMPKeyword_0());
            		
            // InternalPoST.g:3724:3: ( ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';' )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalPoST.g:3725:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) ) otherlv_2= ';'
            	    {
            	    // InternalPoST.g:3725:4: ( (lv_vars_1_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3726:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3726:5: (lv_vars_1_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3727:6: lv_vars_1_0= ruleVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getTempVarDeclarationAccess().getVarsVarInitDeclarationParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_1_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTempVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_1_0,
            	    							"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_2=(Token)match(input,47,FOLLOW_77); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTempVarDeclarationAccess().getSemicolonKeyword_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);

            otherlv_3=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTempVarDeclarationAccess().getEND_VARKeyword_2());
            		

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
    // $ANTLR end "ruleTempVarDeclaration"


    // $ANTLR start "entryRuleExternalVarDeclaration"
    // InternalPoST.g:3757:1: entryRuleExternalVarDeclaration returns [EObject current=null] : iv_ruleExternalVarDeclaration= ruleExternalVarDeclaration EOF ;
    public final EObject entryRuleExternalVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVarDeclaration = null;


        try {
            // InternalPoST.g:3757:63: (iv_ruleExternalVarDeclaration= ruleExternalVarDeclaration EOF )
            // InternalPoST.g:3758:2: iv_ruleExternalVarDeclaration= ruleExternalVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getExternalVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalVarDeclaration=ruleExternalVarDeclaration();

            state._fsp--;

             current =iv_ruleExternalVarDeclaration; 
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
    // $ANTLR end "entryRuleExternalVarDeclaration"


    // $ANTLR start "ruleExternalVarDeclaration"
    // InternalPoST.g:3764:1: ruleExternalVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_EXTERNAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) ;
    public final EObject ruleExternalVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_const_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_vars_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3770:2: ( (otherlv_0= 'VAR_EXTERNAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' ) )
            // InternalPoST.g:3771:2: (otherlv_0= 'VAR_EXTERNAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            {
            // InternalPoST.g:3771:2: (otherlv_0= 'VAR_EXTERNAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR' )
            // InternalPoST.g:3772:3: otherlv_0= 'VAR_EXTERNAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+ otherlv_4= 'END_VAR'
            {
            otherlv_0=(Token)match(input,96,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalVarDeclarationAccess().getVAR_EXTERNALKeyword_0());
            		
            // InternalPoST.g:3776:3: ( (lv_const_1_0= 'CONSTANT' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==94) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalPoST.g:3777:4: (lv_const_1_0= 'CONSTANT' )
                    {
                    // InternalPoST.g:3777:4: (lv_const_1_0= 'CONSTANT' )
                    // InternalPoST.g:3778:5: lv_const_1_0= 'CONSTANT'
                    {
                    lv_const_1_0=(Token)match(input,94,FOLLOW_78); 

                    					newLeafNode(lv_const_1_0, grammarAccess.getExternalVarDeclarationAccess().getConstCONSTANTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getExternalVarDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "const", true, "CONSTANT");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:3790:3: ( ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';' )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_ID) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalPoST.g:3791:4: ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalPoST.g:3791:4: ( (lv_vars_2_0= ruleExternalVarInitDeclaration ) )
            	    // InternalPoST.g:3792:5: (lv_vars_2_0= ruleExternalVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3792:5: (lv_vars_2_0= ruleExternalVarInitDeclaration )
            	    // InternalPoST.g:3793:6: lv_vars_2_0= ruleExternalVarInitDeclaration
            	    {

            	    						newCompositeNode(grammarAccess.getExternalVarDeclarationAccess().getVarsExternalVarInitDeclarationParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_vars_2_0=ruleExternalVarInitDeclaration();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalVarDeclarationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"vars",
            	    							lv_vars_2_0,
            	    							"su.nsk.iae.post.PoST.ExternalVarInitDeclaration");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,47,FOLLOW_79); 

            	    				newLeafNode(otherlv_3, grammarAccess.getExternalVarDeclarationAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);

            otherlv_4=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getExternalVarDeclarationAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleExternalVarDeclaration"


    // $ANTLR start "entryRuleExternalVarInitDeclaration"
    // InternalPoST.g:3823:1: entryRuleExternalVarInitDeclaration returns [EObject current=null] : iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF ;
    public final EObject entryRuleExternalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalVarInitDeclaration = null;


        try {
            // InternalPoST.g:3823:67: (iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF )
            // InternalPoST.g:3824:2: iv_ruleExternalVarInitDeclaration= ruleExternalVarInitDeclaration EOF
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
    // InternalPoST.g:3830:1: ruleExternalVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) ) ;
    public final EObject ruleExternalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_varList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3836:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) ) )
            // InternalPoST.g:3837:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) )
            {
            // InternalPoST.g:3837:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) ) )
            // InternalPoST.g:3838:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= ':' ( (lv_type_2_0= ruleDataTypeName ) )
            {
            // InternalPoST.g:3838:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:3839:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:3839:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:3840:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getExternalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_23);
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

            otherlv_1=(Token)match(input,55,FOLLOW_76); 

            			newLeafNode(otherlv_1, grammarAccess.getExternalVarInitDeclarationAccess().getColonKeyword_1());
            		
            // InternalPoST.g:3861:3: ( (lv_type_2_0= ruleDataTypeName ) )
            // InternalPoST.g:3862:4: (lv_type_2_0= ruleDataTypeName )
            {
            // InternalPoST.g:3862:4: (lv_type_2_0= ruleDataTypeName )
            // InternalPoST.g:3863:5: lv_type_2_0= ruleDataTypeName
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


    // $ANTLR start "entryRuleGlobalVarDeclaration"
    // InternalPoST.g:3884:1: entryRuleGlobalVarDeclaration returns [EObject current=null] : iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF ;
    public final EObject entryRuleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVarDeclaration = null;


        try {
            // InternalPoST.g:3884:61: (iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF )
            // InternalPoST.g:3885:2: iv_ruleGlobalVarDeclaration= ruleGlobalVarDeclaration EOF
            {
             newCompositeNode(grammarAccess.getGlobalVarDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalVarDeclaration=ruleGlobalVarDeclaration();

            state._fsp--;

             current =iv_ruleGlobalVarDeclaration; 
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
    // $ANTLR end "entryRuleGlobalVarDeclaration"


    // $ANTLR start "ruleGlobalVarDeclaration"
    // InternalPoST.g:3891:1: ruleGlobalVarDeclaration returns [EObject current=null] : (otherlv_0= 'VAR_GLOBAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+ otherlv_6= 'END_VAR' ) ;
    public final EObject ruleGlobalVarDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_const_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_varsSimple_2_0 = null;

        EObject lv_varsAs_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3897:2: ( (otherlv_0= 'VAR_GLOBAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+ otherlv_6= 'END_VAR' ) )
            // InternalPoST.g:3898:2: (otherlv_0= 'VAR_GLOBAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+ otherlv_6= 'END_VAR' )
            {
            // InternalPoST.g:3898:2: (otherlv_0= 'VAR_GLOBAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+ otherlv_6= 'END_VAR' )
            // InternalPoST.g:3899:3: otherlv_0= 'VAR_GLOBAL' ( (lv_const_1_0= 'CONSTANT' ) )? ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+ otherlv_6= 'END_VAR'
            {
            otherlv_0=(Token)match(input,97,FOLLOW_78); 

            			newLeafNode(otherlv_0, grammarAccess.getGlobalVarDeclarationAccess().getVAR_GLOBALKeyword_0());
            		
            // InternalPoST.g:3903:3: ( (lv_const_1_0= 'CONSTANT' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==94) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalPoST.g:3904:4: (lv_const_1_0= 'CONSTANT' )
                    {
                    // InternalPoST.g:3904:4: (lv_const_1_0= 'CONSTANT' )
                    // InternalPoST.g:3905:5: lv_const_1_0= 'CONSTANT'
                    {
                    lv_const_1_0=(Token)match(input,94,FOLLOW_78); 

                    					newLeafNode(lv_const_1_0, grammarAccess.getGlobalVarDeclarationAccess().getConstCONSTANTKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getGlobalVarDeclarationRule());
                    					}
                    					setWithLastConsumed(current, "const", true, "CONSTANT");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:3917:3: ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=3;
                alt54 = dfa54.predict(input);
                switch (alt54) {
            	case 1 :
            	    // InternalPoST.g:3918:4: ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )
            	    {
            	    // InternalPoST.g:3918:4: ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' )
            	    // InternalPoST.g:3919:5: ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';'
            	    {
            	    // InternalPoST.g:3919:5: ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) )
            	    // InternalPoST.g:3920:6: (lv_varsSimple_2_0= ruleVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3920:6: (lv_varsSimple_2_0= ruleVarInitDeclaration )
            	    // InternalPoST.g:3921:7: lv_varsSimple_2_0= ruleVarInitDeclaration
            	    {

            	    							newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getVarsSimpleVarInitDeclarationParserRuleCall_2_0_0_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_varsSimple_2_0=ruleVarInitDeclaration();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"varsSimple",
            	    								lv_varsSimple_2_0,
            	    								"su.nsk.iae.post.PoST.VarInitDeclaration");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_3=(Token)match(input,47,FOLLOW_79); 

            	    					newLeafNode(otherlv_3, grammarAccess.getGlobalVarDeclarationAccess().getSemicolonKeyword_2_0_1());
            	    				

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalPoST.g:3944:4: ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' )
            	    {
            	    // InternalPoST.g:3944:4: ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' )
            	    // InternalPoST.g:3945:5: ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';'
            	    {
            	    // InternalPoST.g:3945:5: ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) )
            	    // InternalPoST.g:3946:6: (lv_varsAs_4_0= ruleGlobalVarInitDeclaration )
            	    {
            	    // InternalPoST.g:3946:6: (lv_varsAs_4_0= ruleGlobalVarInitDeclaration )
            	    // InternalPoST.g:3947:7: lv_varsAs_4_0= ruleGlobalVarInitDeclaration
            	    {

            	    							newCompositeNode(grammarAccess.getGlobalVarDeclarationAccess().getVarsAsGlobalVarInitDeclarationParserRuleCall_2_1_0_0());
            	    						
            	    pushFollow(FOLLOW_12);
            	    lv_varsAs_4_0=ruleGlobalVarInitDeclaration();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getGlobalVarDeclarationRule());
            	    							}
            	    							add(
            	    								current,
            	    								"varsAs",
            	    								lv_varsAs_4_0,
            	    								"su.nsk.iae.post.PoST.GlobalVarInitDeclaration");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    otherlv_5=(Token)match(input,47,FOLLOW_79); 

            	    					newLeafNode(otherlv_5, grammarAccess.getGlobalVarDeclarationAccess().getSemicolonKeyword_2_1_1());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            otherlv_6=(Token)match(input,90,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGlobalVarDeclarationAccess().getEND_VARKeyword_3());
            		

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
    // $ANTLR end "ruleGlobalVarDeclaration"


    // $ANTLR start "entryRuleGlobalVarInitDeclaration"
    // InternalPoST.g:3978:1: entryRuleGlobalVarInitDeclaration returns [EObject current=null] : iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF ;
    public final EObject entryRuleGlobalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalVarInitDeclaration = null;


        try {
            // InternalPoST.g:3978:65: (iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF )
            // InternalPoST.g:3979:2: iv_ruleGlobalVarInitDeclaration= ruleGlobalVarInitDeclaration EOF
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
    // InternalPoST.g:3985:1: ruleGlobalVarInitDeclaration returns [EObject current=null] : ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) ) ;
    public final EObject ruleGlobalVarInitDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_location_2_0=null;
        Token otherlv_3=null;
        EObject lv_varList_0_0 = null;

        AntlrDatatypeRuleToken lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:3991:2: ( ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) ) )
            // InternalPoST.g:3992:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) )
            {
            // InternalPoST.g:3992:2: ( ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) ) )
            // InternalPoST.g:3993:3: ( (lv_varList_0_0= ruleVarList ) ) otherlv_1= 'AT' ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) ) otherlv_3= ':' ( (lv_type_4_0= ruleDataTypeName ) )
            {
            // InternalPoST.g:3993:3: ( (lv_varList_0_0= ruleVarList ) )
            // InternalPoST.g:3994:4: (lv_varList_0_0= ruleVarList )
            {
            // InternalPoST.g:3994:4: (lv_varList_0_0= ruleVarList )
            // InternalPoST.g:3995:5: lv_varList_0_0= ruleVarList
            {

            					newCompositeNode(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_80);
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

            otherlv_1=(Token)match(input,98,FOLLOW_81); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalVarInitDeclarationAccess().getATKeyword_1());
            		
            // InternalPoST.g:4016:3: ( (lv_location_2_0= RULE_DIRECT_VARIABLE ) )
            // InternalPoST.g:4017:4: (lv_location_2_0= RULE_DIRECT_VARIABLE )
            {
            // InternalPoST.g:4017:4: (lv_location_2_0= RULE_DIRECT_VARIABLE )
            // InternalPoST.g:4018:5: lv_location_2_0= RULE_DIRECT_VARIABLE
            {
            lv_location_2_0=(Token)match(input,RULE_DIRECT_VARIABLE,FOLLOW_23); 

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

            otherlv_3=(Token)match(input,55,FOLLOW_76); 

            			newLeafNode(otherlv_3, grammarAccess.getGlobalVarInitDeclarationAccess().getColonKeyword_3());
            		
            // InternalPoST.g:4038:3: ( (lv_type_4_0= ruleDataTypeName ) )
            // InternalPoST.g:4039:4: (lv_type_4_0= ruleDataTypeName )
            {
            // InternalPoST.g:4039:4: (lv_type_4_0= ruleDataTypeName )
            // InternalPoST.g:4040:5: lv_type_4_0= ruleDataTypeName
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
    // InternalPoST.g:4061:1: entryRuleTimeLiteral returns [EObject current=null] : iv_ruleTimeLiteral= ruleTimeLiteral EOF ;
    public final EObject entryRuleTimeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeLiteral = null;


        try {
            // InternalPoST.g:4061:52: (iv_ruleTimeLiteral= ruleTimeLiteral EOF )
            // InternalPoST.g:4062:2: iv_ruleTimeLiteral= ruleTimeLiteral EOF
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
    // InternalPoST.g:4068:1: ruleTimeLiteral returns [EObject current=null] : (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) ) ;
    public final EObject ruleTimeLiteral() throws RecognitionException {
        EObject current = null;

        Token this_TIME_PREF_LITERAL_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_interval_3_0=null;


        	enterRule();

        try {
            // InternalPoST.g:4074:2: ( (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) ) )
            // InternalPoST.g:4075:2: (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) )
            {
            // InternalPoST.g:4075:2: (this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) ) )
            // InternalPoST.g:4076:3: this_TIME_PREF_LITERAL_0= RULE_TIME_PREF_LITERAL otherlv_1= '#' (otherlv_2= '-' )? ( (lv_interval_3_0= RULE_INTERVAL ) )
            {
            this_TIME_PREF_LITERAL_0=(Token)match(input,RULE_TIME_PREF_LITERAL,FOLLOW_82); 

            			newLeafNode(this_TIME_PREF_LITERAL_0, grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,99,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeLiteralAccess().getNumberSignKeyword_1());
            		
            // InternalPoST.g:4084:3: (otherlv_2= '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==100) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalPoST.g:4085:4: otherlv_2= '-'
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_84); 

                    				newLeafNode(otherlv_2, grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2());
                    			

                    }
                    break;

            }

            // InternalPoST.g:4090:3: ( (lv_interval_3_0= RULE_INTERVAL ) )
            // InternalPoST.g:4091:4: (lv_interval_3_0= RULE_INTERVAL )
            {
            // InternalPoST.g:4091:4: (lv_interval_3_0= RULE_INTERVAL )
            // InternalPoST.g:4092:5: lv_interval_3_0= RULE_INTERVAL
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
    // InternalPoST.g:4112:1: entryRuleDataTypeName returns [String current=null] : iv_ruleDataTypeName= ruleDataTypeName EOF ;
    public final String entryRuleDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDataTypeName = null;


        try {
            // InternalPoST.g:4112:52: (iv_ruleDataTypeName= ruleDataTypeName EOF )
            // InternalPoST.g:4113:2: iv_ruleDataTypeName= ruleDataTypeName EOF
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
    // InternalPoST.g:4119:1: ruleDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | this_TIME_TYPE_NAME_2= RULE_TIME_TYPE_NAME | this_STRING_TYPE_NAME_3= RULE_STRING_TYPE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BIT_STRING_TYPE_NAME_1=null;
        Token this_TIME_TYPE_NAME_2=null;
        Token this_STRING_TYPE_NAME_3=null;
        AntlrDatatypeRuleToken this_NumericTypeName_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:4125:2: ( (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | this_TIME_TYPE_NAME_2= RULE_TIME_TYPE_NAME | this_STRING_TYPE_NAME_3= RULE_STRING_TYPE_NAME ) )
            // InternalPoST.g:4126:2: (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | this_TIME_TYPE_NAME_2= RULE_TIME_TYPE_NAME | this_STRING_TYPE_NAME_3= RULE_STRING_TYPE_NAME )
            {
            // InternalPoST.g:4126:2: (this_NumericTypeName_0= ruleNumericTypeName | this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME | this_TIME_TYPE_NAME_2= RULE_TIME_TYPE_NAME | this_STRING_TYPE_NAME_3= RULE_STRING_TYPE_NAME )
            int alt56=4;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt56=1;
                }
                break;
            case RULE_BIT_STRING_TYPE_NAME:
                {
                alt56=2;
                }
                break;
            case RULE_TIME_TYPE_NAME:
                {
                alt56=3;
                }
                break;
            case RULE_STRING_TYPE_NAME:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalPoST.g:4127:3: this_NumericTypeName_0= ruleNumericTypeName
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
                    // InternalPoST.g:4138:3: this_BIT_STRING_TYPE_NAME_1= RULE_BIT_STRING_TYPE_NAME
                    {
                    this_BIT_STRING_TYPE_NAME_1=(Token)match(input,RULE_BIT_STRING_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_BIT_STRING_TYPE_NAME_1);
                    		

                    			newLeafNode(this_BIT_STRING_TYPE_NAME_1, grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPoST.g:4146:3: this_TIME_TYPE_NAME_2= RULE_TIME_TYPE_NAME
                    {
                    this_TIME_TYPE_NAME_2=(Token)match(input,RULE_TIME_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_TIME_TYPE_NAME_2);
                    		

                    			newLeafNode(this_TIME_TYPE_NAME_2, grammarAccess.getDataTypeNameAccess().getTIME_TYPE_NAMETerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPoST.g:4154:3: this_STRING_TYPE_NAME_3= RULE_STRING_TYPE_NAME
                    {
                    this_STRING_TYPE_NAME_3=(Token)match(input,RULE_STRING_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_STRING_TYPE_NAME_3);
                    		

                    			newLeafNode(this_STRING_TYPE_NAME_3, grammarAccess.getDataTypeNameAccess().getSTRING_TYPE_NAMETerminalRuleCall_3());
                    		

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
    // InternalPoST.g:4165:1: entryRuleNumericTypeName returns [String current=null] : iv_ruleNumericTypeName= ruleNumericTypeName EOF ;
    public final String entryRuleNumericTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumericTypeName = null;


        try {
            // InternalPoST.g:4165:55: (iv_ruleNumericTypeName= ruleNumericTypeName EOF )
            // InternalPoST.g:4166:2: iv_ruleNumericTypeName= ruleNumericTypeName EOF
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
    // InternalPoST.g:4172:1: ruleNumericTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleNumericTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_REAL_TYPE_NAME_1=null;
        AntlrDatatypeRuleToken this_IntegerTypeName_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:4178:2: ( (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME ) )
            // InternalPoST.g:4179:2: (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME )
            {
            // InternalPoST.g:4179:2: (this_IntegerTypeName_0= ruleIntegerTypeName | this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA57_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_REAL_TYPE_NAME) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalPoST.g:4180:3: this_IntegerTypeName_0= ruleIntegerTypeName
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
                    // InternalPoST.g:4191:3: this_REAL_TYPE_NAME_1= RULE_REAL_TYPE_NAME
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
    // InternalPoST.g:4202:1: entryRuleIntegerTypeName returns [String current=null] : iv_ruleIntegerTypeName= ruleIntegerTypeName EOF ;
    public final String entryRuleIntegerTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIntegerTypeName = null;


        try {
            // InternalPoST.g:4202:55: (iv_ruleIntegerTypeName= ruleIntegerTypeName EOF )
            // InternalPoST.g:4203:2: iv_ruleIntegerTypeName= ruleIntegerTypeName EOF
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
    // InternalPoST.g:4209:1: ruleIntegerTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleIntegerTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_SIGNED_INTEGER_TYPE_NAME_0=null;
        Token this_UNSIGNED_INTEGER_TYPE_NAME_1=null;


        	enterRule();

        try {
            // InternalPoST.g:4215:2: ( (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME ) )
            // InternalPoST.g:4216:2: (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME )
            {
            // InternalPoST.g:4216:2: (this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME | this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_SIGNED_INTEGER_TYPE_NAME) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_UNSIGNED_INTEGER_TYPE_NAME) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalPoST.g:4217:3: this_SIGNED_INTEGER_TYPE_NAME_0= RULE_SIGNED_INTEGER_TYPE_NAME
                    {
                    this_SIGNED_INTEGER_TYPE_NAME_0=(Token)match(input,RULE_SIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 

                    			current.merge(this_SIGNED_INTEGER_TYPE_NAME_0);
                    		

                    			newLeafNode(this_SIGNED_INTEGER_TYPE_NAME_0, grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPoST.g:4225:3: this_UNSIGNED_INTEGER_TYPE_NAME_1= RULE_UNSIGNED_INTEGER_TYPE_NAME
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
    // InternalPoST.g:4236:1: entryRuleSimpleSpecificationInit returns [EObject current=null] : iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF ;
    public final EObject entryRuleSimpleSpecificationInit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleSpecificationInit = null;


        try {
            // InternalPoST.g:4236:64: (iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF )
            // InternalPoST.g:4237:2: iv_ruleSimpleSpecificationInit= ruleSimpleSpecificationInit EOF
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
    // InternalPoST.g:4243:1: ruleSimpleSpecificationInit returns [EObject current=null] : ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? ) ;
    public final EObject ruleSimpleSpecificationInit() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:4249:2: ( ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? ) )
            // InternalPoST.g:4250:2: ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? )
            {
            // InternalPoST.g:4250:2: ( () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )? )
            // InternalPoST.g:4251:3: () ( (lv_type_1_0= ruleDataTypeName ) ) (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )?
            {
            // InternalPoST.g:4251:3: ()
            // InternalPoST.g:4252:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0(),
            					current);
            			

            }

            // InternalPoST.g:4258:3: ( (lv_type_1_0= ruleDataTypeName ) )
            // InternalPoST.g:4259:4: (lv_type_1_0= ruleDataTypeName )
            {
            // InternalPoST.g:4259:4: (lv_type_1_0= ruleDataTypeName )
            // InternalPoST.g:4260:5: lv_type_1_0= ruleDataTypeName
            {

            					newCompositeNode(grammarAccess.getSimpleSpecificationInitAccess().getTypeDataTypeNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_85);
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

            // InternalPoST.g:4277:3: (otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==51) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalPoST.g:4278:4: otherlv_2= ':=' ( (lv_value_3_0= ruleConstant ) )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0());
                    			
                    // InternalPoST.g:4282:4: ( (lv_value_3_0= ruleConstant ) )
                    // InternalPoST.g:4283:5: (lv_value_3_0= ruleConstant )
                    {
                    // InternalPoST.g:4283:5: (lv_value_3_0= ruleConstant )
                    // InternalPoST.g:4284:6: lv_value_3_0= ruleConstant
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
    // InternalPoST.g:4306:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalPoST.g:4306:49: (iv_ruleConstant= ruleConstant EOF )
            // InternalPoST.g:4307:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalPoST.g:4313:1: ruleConstant returns [EObject current=null] : (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER ) | ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER ) | ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER ) | ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token this_BINARY_INTEGER_3=null;
        Token this_OCTAL_INTEGER_5=null;
        Token this_HEX_INTEGER_7=null;
        Token this_BOOLEAN_LITERAL_9=null;
        EObject this_NumericLiteral_0 = null;

        EObject this_TimeLiteral_1 = null;



        	enterRule();

        try {
            // InternalPoST.g:4319:2: ( (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER ) | ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER ) | ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER ) | ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL ) ) )
            // InternalPoST.g:4320:2: (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER ) | ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER ) | ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER ) | ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL ) )
            {
            // InternalPoST.g:4320:2: (this_NumericLiteral_0= ruleNumericLiteral | this_TimeLiteral_1= ruleTimeLiteral | ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER ) | ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER ) | ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER ) | ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL ) )
            int alt60=6;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
            case RULE_REAL:
            case 100:
                {
                alt60=1;
                }
                break;
            case RULE_TIME_PREF_LITERAL:
                {
                alt60=2;
                }
                break;
            case RULE_BINARY_INTEGER:
                {
                alt60=3;
                }
                break;
            case RULE_OCTAL_INTEGER:
                {
                alt60=4;
                }
                break;
            case RULE_HEX_INTEGER:
                {
                alt60=5;
                }
                break;
            case RULE_BOOLEAN_LITERAL:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalPoST.g:4321:3: this_NumericLiteral_0= ruleNumericLiteral
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
                    // InternalPoST.g:4330:3: this_TimeLiteral_1= ruleTimeLiteral
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
                    // InternalPoST.g:4339:3: ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER )
                    {
                    // InternalPoST.g:4339:3: ( () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER )
                    // InternalPoST.g:4340:4: () this_BINARY_INTEGER_3= RULE_BINARY_INTEGER
                    {
                    // InternalPoST.g:4340:4: ()
                    // InternalPoST.g:4341:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_2_0(),
                    						current);
                    				

                    }

                    this_BINARY_INTEGER_3=(Token)match(input,RULE_BINARY_INTEGER,FOLLOW_2); 

                    				newLeafNode(this_BINARY_INTEGER_3, grammarAccess.getConstantAccess().getBINARY_INTEGERTerminalRuleCall_2_1());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:4353:3: ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER )
                    {
                    // InternalPoST.g:4353:3: ( () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER )
                    // InternalPoST.g:4354:4: () this_OCTAL_INTEGER_5= RULE_OCTAL_INTEGER
                    {
                    // InternalPoST.g:4354:4: ()
                    // InternalPoST.g:4355:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_3_0(),
                    						current);
                    				

                    }

                    this_OCTAL_INTEGER_5=(Token)match(input,RULE_OCTAL_INTEGER,FOLLOW_2); 

                    				newLeafNode(this_OCTAL_INTEGER_5, grammarAccess.getConstantAccess().getOCTAL_INTEGERTerminalRuleCall_3_1());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalPoST.g:4367:3: ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER )
                    {
                    // InternalPoST.g:4367:3: ( () this_HEX_INTEGER_7= RULE_HEX_INTEGER )
                    // InternalPoST.g:4368:4: () this_HEX_INTEGER_7= RULE_HEX_INTEGER
                    {
                    // InternalPoST.g:4368:4: ()
                    // InternalPoST.g:4369:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_4_0(),
                    						current);
                    				

                    }

                    this_HEX_INTEGER_7=(Token)match(input,RULE_HEX_INTEGER,FOLLOW_2); 

                    				newLeafNode(this_HEX_INTEGER_7, grammarAccess.getConstantAccess().getHEX_INTEGERTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalPoST.g:4381:3: ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL )
                    {
                    // InternalPoST.g:4381:3: ( () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL )
                    // InternalPoST.g:4382:4: () this_BOOLEAN_LITERAL_9= RULE_BOOLEAN_LITERAL
                    {
                    // InternalPoST.g:4382:4: ()
                    // InternalPoST.g:4383:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConstantAccess().getConstantAction_5_0(),
                    						current);
                    				

                    }

                    this_BOOLEAN_LITERAL_9=(Token)match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 

                    				newLeafNode(this_BOOLEAN_LITERAL_9, grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_5_1());
                    			

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
    // InternalPoST.g:4398:1: entryRuleSignedInteger returns [EObject current=null] : iv_ruleSignedInteger= ruleSignedInteger EOF ;
    public final EObject entryRuleSignedInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignedInteger = null;


        try {
            // InternalPoST.g:4398:54: (iv_ruleSignedInteger= ruleSignedInteger EOF )
            // InternalPoST.g:4399:2: iv_ruleSignedInteger= ruleSignedInteger EOF
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
    // InternalPoST.g:4405:1: ruleSignedInteger returns [EObject current=null] : ( ( (lv_iSig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) ;
    public final EObject ruleSignedInteger() throws RecognitionException {
        EObject current = null;

        Token lv_iSig_0_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalPoST.g:4411:2: ( ( ( (lv_iSig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) ) )
            // InternalPoST.g:4412:2: ( ( (lv_iSig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            {
            // InternalPoST.g:4412:2: ( ( (lv_iSig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) ) )
            // InternalPoST.g:4413:3: ( (lv_iSig_0_0= '-' ) )? ( (lv_value_1_0= RULE_INTEGER ) )
            {
            // InternalPoST.g:4413:3: ( (lv_iSig_0_0= '-' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==100) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalPoST.g:4414:4: (lv_iSig_0_0= '-' )
                    {
                    // InternalPoST.g:4414:4: (lv_iSig_0_0= '-' )
                    // InternalPoST.g:4415:5: lv_iSig_0_0= '-'
                    {
                    lv_iSig_0_0=(Token)match(input,100,FOLLOW_21); 

                    					newLeafNode(lv_iSig_0_0, grammarAccess.getSignedIntegerAccess().getISigHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSignedIntegerRule());
                    					}
                    					setWithLastConsumed(current, "iSig", true, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:4427:3: ( (lv_value_1_0= RULE_INTEGER ) )
            // InternalPoST.g:4428:4: (lv_value_1_0= RULE_INTEGER )
            {
            // InternalPoST.g:4428:4: (lv_value_1_0= RULE_INTEGER )
            // InternalPoST.g:4429:5: lv_value_1_0= RULE_INTEGER
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
    // InternalPoST.g:4449:1: entryRuleNumericLiteral returns [EObject current=null] : iv_ruleNumericLiteral= ruleNumericLiteral EOF ;
    public final EObject entryRuleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumericLiteral = null;


        try {
            // InternalPoST.g:4449:55: (iv_ruleNumericLiteral= ruleNumericLiteral EOF )
            // InternalPoST.g:4450:2: iv_ruleNumericLiteral= ruleNumericLiteral EOF
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
    // InternalPoST.g:4456:1: ruleNumericLiteral returns [EObject current=null] : (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) ;
    public final EObject ruleNumericLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntegerLiteral_0 = null;

        EObject this_RealLiteral_1 = null;



        	enterRule();

        try {
            // InternalPoST.g:4462:2: ( (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral ) )
            // InternalPoST.g:4463:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            {
            // InternalPoST.g:4463:2: (this_IntegerLiteral_0= ruleIntegerLiteral | this_RealLiteral_1= ruleRealLiteral )
            int alt62=2;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt62=1;
                }
                break;
            case 100:
                {
                int LA62_2 = input.LA(2);

                if ( (LA62_2==RULE_INTEGER) ) {
                    alt62=1;
                }
                else if ( (LA62_2==RULE_REAL) ) {
                    alt62=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 62, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REAL_TYPE_NAME:
            case RULE_REAL:
                {
                alt62=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalPoST.g:4464:3: this_IntegerLiteral_0= ruleIntegerLiteral
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
                    // InternalPoST.g:4473:3: this_RealLiteral_1= ruleRealLiteral
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
    // InternalPoST.g:4485:1: entryRuleIntegerLiteral returns [EObject current=null] : iv_ruleIntegerLiteral= ruleIntegerLiteral EOF ;
    public final EObject entryRuleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerLiteral = null;


        try {
            // InternalPoST.g:4485:55: (iv_ruleIntegerLiteral= ruleIntegerLiteral EOF )
            // InternalPoST.g:4486:2: iv_ruleIntegerLiteral= ruleIntegerLiteral EOF
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
    // InternalPoST.g:4492:1: ruleIntegerLiteral returns [EObject current=null] : ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) ) ;
    public final EObject ruleIntegerLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalPoST.g:4498:2: ( ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) ) )
            // InternalPoST.g:4499:2: ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) )
            {
            // InternalPoST.g:4499:2: ( ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) ) )
            // InternalPoST.g:4500:3: ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )? ( (lv_value_2_0= ruleSignedInteger ) )
            {
            // InternalPoST.g:4500:3: ( ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA63_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalPoST.g:4501:4: ( (lv_type_0_0= ruleIntegerTypeName ) ) otherlv_1= '#'
                    {
                    // InternalPoST.g:4501:4: ( (lv_type_0_0= ruleIntegerTypeName ) )
                    // InternalPoST.g:4502:5: (lv_type_0_0= ruleIntegerTypeName )
                    {
                    // InternalPoST.g:4502:5: (lv_type_0_0= ruleIntegerTypeName )
                    // InternalPoST.g:4503:6: lv_type_0_0= ruleIntegerTypeName
                    {

                    						newCompositeNode(grammarAccess.getIntegerLiteralAccess().getTypeIntegerTypeNameParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_82);
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

                    otherlv_1=(Token)match(input,99,FOLLOW_61); 

                    				newLeafNode(otherlv_1, grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPoST.g:4525:3: ( (lv_value_2_0= ruleSignedInteger ) )
            // InternalPoST.g:4526:4: (lv_value_2_0= ruleSignedInteger )
            {
            // InternalPoST.g:4526:4: (lv_value_2_0= ruleSignedInteger )
            // InternalPoST.g:4527:5: lv_value_2_0= ruleSignedInteger
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
    // InternalPoST.g:4548:1: entryRuleRealLiteral returns [EObject current=null] : iv_ruleRealLiteral= ruleRealLiteral EOF ;
    public final EObject entryRuleRealLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRealLiteral = null;


        try {
            // InternalPoST.g:4548:52: (iv_ruleRealLiteral= ruleRealLiteral EOF )
            // InternalPoST.g:4549:2: iv_ruleRealLiteral= ruleRealLiteral EOF
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
    // InternalPoST.g:4555:1: ruleRealLiteral returns [EObject current=null] : ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_rSig_2_0= '-' ) )? ( (lv_value_3_0= RULE_REAL ) ) ) ;
    public final EObject ruleRealLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token lv_rSig_2_0=null;
        Token lv_value_3_0=null;


        	enterRule();

        try {
            // InternalPoST.g:4561:2: ( ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_rSig_2_0= '-' ) )? ( (lv_value_3_0= RULE_REAL ) ) ) )
            // InternalPoST.g:4562:2: ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_rSig_2_0= '-' ) )? ( (lv_value_3_0= RULE_REAL ) ) )
            {
            // InternalPoST.g:4562:2: ( ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_rSig_2_0= '-' ) )? ( (lv_value_3_0= RULE_REAL ) ) )
            // InternalPoST.g:4563:3: ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )? ( (lv_rSig_2_0= '-' ) )? ( (lv_value_3_0= RULE_REAL ) )
            {
            // InternalPoST.g:4563:3: ( ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_REAL_TYPE_NAME) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalPoST.g:4564:4: ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) ) otherlv_1= '#'
                    {
                    // InternalPoST.g:4564:4: ( (lv_type_0_0= RULE_REAL_TYPE_NAME ) )
                    // InternalPoST.g:4565:5: (lv_type_0_0= RULE_REAL_TYPE_NAME )
                    {
                    // InternalPoST.g:4565:5: (lv_type_0_0= RULE_REAL_TYPE_NAME )
                    // InternalPoST.g:4566:6: lv_type_0_0= RULE_REAL_TYPE_NAME
                    {
                    lv_type_0_0=(Token)match(input,RULE_REAL_TYPE_NAME,FOLLOW_82); 

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

                    otherlv_1=(Token)match(input,99,FOLLOW_86); 

                    				newLeafNode(otherlv_1, grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalPoST.g:4587:3: ( (lv_rSig_2_0= '-' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==100) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalPoST.g:4588:4: (lv_rSig_2_0= '-' )
                    {
                    // InternalPoST.g:4588:4: (lv_rSig_2_0= '-' )
                    // InternalPoST.g:4589:5: lv_rSig_2_0= '-'
                    {
                    lv_rSig_2_0=(Token)match(input,100,FOLLOW_87); 

                    					newLeafNode(lv_rSig_2_0, grammarAccess.getRealLiteralAccess().getRSigHyphenMinusKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRealLiteralRule());
                    					}
                    					setWithLastConsumed(current, "rSig", true, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalPoST.g:4601:3: ( (lv_value_3_0= RULE_REAL ) )
            // InternalPoST.g:4602:4: (lv_value_3_0= RULE_REAL )
            {
            // InternalPoST.g:4602:4: (lv_value_3_0= RULE_REAL )
            // InternalPoST.g:4603:5: lv_value_3_0= RULE_REAL
            {
            lv_value_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); 

            					newLeafNode(lv_value_3_0, grammarAccess.getRealLiteralAccess().getValueREALTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRealLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_3_0,
            						"su.nsk.iae.post.PoST.REAL");
            				

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


    // $ANTLR start "ruleAssignmentType"
    // InternalPoST.g:4623:1: ruleAssignmentType returns [Enumerator current=null] : ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '=>' ) ) ;
    public final Enumerator ruleAssignmentType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPoST.g:4629:2: ( ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '=>' ) ) )
            // InternalPoST.g:4630:2: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '=>' ) )
            {
            // InternalPoST.g:4630:2: ( (enumLiteral_0= ':=' ) | (enumLiteral_1= '=>' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==51) ) {
                alt66=1;
            }
            else if ( (LA66_0==101) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalPoST.g:4631:3: (enumLiteral_0= ':=' )
                    {
                    // InternalPoST.g:4631:3: (enumLiteral_0= ':=' )
                    // InternalPoST.g:4632:4: enumLiteral_0= ':='
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getAssignmentTypeAccess().getInEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAssignmentTypeAccess().getInEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:4639:3: (enumLiteral_1= '=>' )
                    {
                    // InternalPoST.g:4639:3: (enumLiteral_1= '=>' )
                    // InternalPoST.g:4640:4: enumLiteral_1= '=>'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getAssignmentTypeAccess().getOutEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAssignmentTypeAccess().getOutEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAssignmentType"


    // $ANTLR start "ruleCompOperator"
    // InternalPoST.g:4650:1: ruleCompOperator returns [Enumerator current=null] : ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) ;
    public final Enumerator ruleCompOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPoST.g:4656:2: ( ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) ) )
            // InternalPoST.g:4657:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            {
            // InternalPoST.g:4657:2: ( (enumLiteral_0= '=' ) | (enumLiteral_1= '<>' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==102) ) {
                alt67=1;
            }
            else if ( (LA67_0==103) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalPoST.g:4658:3: (enumLiteral_0= '=' )
                    {
                    // InternalPoST.g:4658:3: (enumLiteral_0= '=' )
                    // InternalPoST.g:4659:4: enumLiteral_0= '='
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCompOperatorAccess().getEQUALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:4666:3: (enumLiteral_1= '<>' )
                    {
                    // InternalPoST.g:4666:3: (enumLiteral_1= '<>' )
                    // InternalPoST.g:4667:4: enumLiteral_1= '<>'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCompOperatorAccess().getNOT_EQUALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleCompOperator"


    // $ANTLR start "ruleEquOperator"
    // InternalPoST.g:4677:1: ruleEquOperator returns [Enumerator current=null] : ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) ;
    public final Enumerator ruleEquOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalPoST.g:4683:2: ( ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) ) )
            // InternalPoST.g:4684:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            {
            // InternalPoST.g:4684:2: ( (enumLiteral_0= '<' ) | (enumLiteral_1= '>' ) | (enumLiteral_2= '<=' ) | (enumLiteral_3= '>=' ) )
            int alt68=4;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt68=1;
                }
                break;
            case 105:
                {
                alt68=2;
                }
                break;
            case 106:
                {
                alt68=3;
                }
                break;
            case 107:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalPoST.g:4685:3: (enumLiteral_0= '<' )
                    {
                    // InternalPoST.g:4685:3: (enumLiteral_0= '<' )
                    // InternalPoST.g:4686:4: enumLiteral_0= '<'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getLESSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEquOperatorAccess().getLESSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:4693:3: (enumLiteral_1= '>' )
                    {
                    // InternalPoST.g:4693:3: (enumLiteral_1= '>' )
                    // InternalPoST.g:4694:4: enumLiteral_1= '>'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getGREATEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEquOperatorAccess().getGREATEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:4701:3: (enumLiteral_2= '<=' )
                    {
                    // InternalPoST.g:4701:3: (enumLiteral_2= '<=' )
                    // InternalPoST.g:4702:4: enumLiteral_2= '<='
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getEquOperatorAccess().getLESS_EQUEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:4709:3: (enumLiteral_3= '>=' )
                    {
                    // InternalPoST.g:4709:3: (enumLiteral_3= '>=' )
                    // InternalPoST.g:4710:4: enumLiteral_3= '>='
                    {
                    enumLiteral_3=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getEquOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getEquOperatorAccess().getGREATER_EQUEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleEquOperator"


    // $ANTLR start "ruleAddOperator"
    // InternalPoST.g:4720:1: ruleAddOperator returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) ;
    public final Enumerator ruleAddOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalPoST.g:4726:2: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) ) )
            // InternalPoST.g:4727:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            {
            // InternalPoST.g:4727:2: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==108) ) {
                alt69=1;
            }
            else if ( (LA69_0==100) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalPoST.g:4728:3: (enumLiteral_0= '+' )
                    {
                    // InternalPoST.g:4728:3: (enumLiteral_0= '+' )
                    // InternalPoST.g:4729:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAddOperatorAccess().getPLUSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:4736:3: (enumLiteral_1= '-' )
                    {
                    // InternalPoST.g:4736:3: (enumLiteral_1= '-' )
                    // InternalPoST.g:4737:4: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getAddOperatorAccess().getMINUSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAddOperatorAccess().getMINUSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAddOperator"


    // $ANTLR start "ruleMulOperator"
    // InternalPoST.g:4747:1: ruleMulOperator returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'MOD' ) ) ;
    public final Enumerator ruleMulOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalPoST.g:4753:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'MOD' ) ) )
            // InternalPoST.g:4754:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'MOD' ) )
            {
            // InternalPoST.g:4754:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '/' ) | (enumLiteral_2= 'MOD' ) )
            int alt70=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt70=1;
                }
                break;
            case 110:
                {
                alt70=2;
                }
                break;
            case 111:
                {
                alt70=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalPoST.g:4755:3: (enumLiteral_0= '*' )
                    {
                    // InternalPoST.g:4755:3: (enumLiteral_0= '*' )
                    // InternalPoST.g:4756:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMulOperatorAccess().getMULEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:4763:3: (enumLiteral_1= '/' )
                    {
                    // InternalPoST.g:4763:3: (enumLiteral_1= '/' )
                    // InternalPoST.g:4764:4: enumLiteral_1= '/'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMulOperatorAccess().getDIVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:4771:3: (enumLiteral_2= 'MOD' )
                    {
                    // InternalPoST.g:4771:3: (enumLiteral_2= 'MOD' )
                    // InternalPoST.g:4772:4: enumLiteral_2= 'MOD'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getMulOperatorAccess().getMODEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMulOperatorAccess().getMODEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleMulOperator"

    // Delegated rules


    protected DFA54 dfa54 = new DFA54(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\64\1\4\2\uffff\1\64";
    static final String dfa_3s = "\1\132\1\uffff\1\142\1\4\2\uffff\1\142";
    static final String dfa_4s = "\1\uffff\1\3\2\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\7\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\125\uffff\1\1",
            "",
            "\1\3\2\uffff\1\5\52\uffff\1\4",
            "\1\6",
            "",
            "",
            "\1\3\2\uffff\1\5\52\uffff\1\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()+ loopback of 3917:3: ( ( ( (lv_varsSimple_2_0= ruleVarInitDeclaration ) ) otherlv_3= ';' ) | ( ( (lv_varsAs_4_0= ruleGlobalVarInitDeclaration ) ) otherlv_5= ';' ) )+";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000180000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0021400000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0021400000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0021000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000007F840200L,0x0000001000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0300000000000000L,0x00000001BA000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0300000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0C00000000000000L,0x00000000A0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x3000000000018010L,0x000000000050914FL});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4800000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000007F840210L,0x0000001000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000018010L,0x0000000000509167L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x020200007F844210L,0x0000001000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x000000C000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000002L,0x00000F0000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000101000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000002L,0x0000E00000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x020200007F840210L,0x0000001000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x2000000000018012L,0x0000000000509147L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000018010L,0x0000000000509F47L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000E00L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2000000000018010L,0x0000000000509947L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000003000200L,0x0000001000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000003000200L,0x0000001000004400L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x2000000000018010L,0x000000000050D147L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x2000000000018010L,0x0000000000509147L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x2000000000018010L,0x0000000000529147L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2000000000018010L,0x0000000000709147L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x2000000000018010L,0x0000000000D09147L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000003F00000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000010L,0x0000000004000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000010L,0x0000000040000000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000010L,0x0000000044000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000080000L,0x0000001000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000040000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000040000000L});

}