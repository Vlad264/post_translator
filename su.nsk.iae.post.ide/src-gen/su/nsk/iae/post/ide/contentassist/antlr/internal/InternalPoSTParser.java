package su.nsk.iae.post.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import su.nsk.iae.post.services.PoSTGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPoSTParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BIT_STRING_TYPE_NAME", "RULE_REAL_TYPE_NAME", "RULE_SIGNED_INTEGER_TYPE_NAME", "RULE_UNSIGNED_INTEGER_TYPE_NAME", "RULE_TIME_PREF_LITERAL", "RULE_BOOLEAN_LITERAL", "RULE_ID", "RULE_DIRECT_VARIABLE", "RULE_INTERVAL", "RULE_INTEGER", "RULE_DIRECT_TYPE_PREFIX", "RULE_DIRECT_SIZE_PREFIX", "RULE_DIGIT", "RULE_BIT", "RULE_BINARY_INTEGER", "RULE_OCTAL_DIGIT", "RULE_OCTAL_INTEGER", "RULE_HEX_DIGIT", "RULE_HEX_INTEGER", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'WSTRING'", "'Hello'", "'!'", "':'", "','", "'AT'", "'#'", "'-'", "':='", "'.'"
    };
    public static final int RULE_INTERVAL=12;
    public static final int RULE_DIRECT_VARIABLE=11;
    public static final int RULE_DIRECT_TYPE_PREFIX=14;
    public static final int RULE_HEX_INTEGER=22;
    public static final int RULE_BINARY_INTEGER=18;
    public static final int RULE_SL_COMMENT=25;
    public static final int RULE_BIT=17;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_SIGNED_INTEGER_TYPE_NAME=6;
    public static final int RULE_TIME_PREF_LITERAL=8;
    public static final int T__33=33;
    public static final int RULE_OCTAL_INTEGER=20;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_UNSIGNED_INTEGER_TYPE_NAME=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=19;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_DIRECT_SIZE_PREFIX=15;
    public static final int RULE_ID=10;
    public static final int RULE_REAL_TYPE_NAME=5;
    public static final int RULE_BOOLEAN_LITERAL=9;
    public static final int RULE_WS=26;
    public static final int RULE_DIGIT=16;
    public static final int RULE_ANY_OTHER=27;
    public static final int RULE_LETTER=23;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=24;
    public static final int RULE_HEX_DIGIT=21;
    public static final int RULE_INTEGER=13;
    public static final int RULE_BIT_STRING_TYPE_NAME=4;

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

    	public void setGrammarAccess(PoSTGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalPoST.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalPoST.g:54:1: ( ruleModel EOF )
            // InternalPoST.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalPoST.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalPoST.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalPoST.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalPoST.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalPoST.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==30) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPoST.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleGreeting"
    // InternalPoST.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalPoST.g:79:1: ( ruleGreeting EOF )
            // InternalPoST.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalPoST.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalPoST.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalPoST.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalPoST.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalPoST.g:94:3: ( rule__Greeting__Group__0 )
            // InternalPoST.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "entryRuleSymbolicVariable"
    // InternalPoST.g:103:1: entryRuleSymbolicVariable : ruleSymbolicVariable EOF ;
    public final void entryRuleSymbolicVariable() throws RecognitionException {
        try {
            // InternalPoST.g:104:1: ( ruleSymbolicVariable EOF )
            // InternalPoST.g:105:1: ruleSymbolicVariable EOF
            {
             before(grammarAccess.getSymbolicVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleSymbolicVariable();

            state._fsp--;

             after(grammarAccess.getSymbolicVariableRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymbolicVariable"


    // $ANTLR start "ruleSymbolicVariable"
    // InternalPoST.g:112:1: ruleSymbolicVariable : ( ( rule__SymbolicVariable__NameAssignment ) ) ;
    public final void ruleSymbolicVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:116:2: ( ( ( rule__SymbolicVariable__NameAssignment ) ) )
            // InternalPoST.g:117:2: ( ( rule__SymbolicVariable__NameAssignment ) )
            {
            // InternalPoST.g:117:2: ( ( rule__SymbolicVariable__NameAssignment ) )
            // InternalPoST.g:118:3: ( rule__SymbolicVariable__NameAssignment )
            {
             before(grammarAccess.getSymbolicVariableAccess().getNameAssignment()); 
            // InternalPoST.g:119:3: ( rule__SymbolicVariable__NameAssignment )
            // InternalPoST.g:119:4: rule__SymbolicVariable__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__SymbolicVariable__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSymbolicVariableAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymbolicVariable"


    // $ANTLR start "entryRuleVarInitDeclaration"
    // InternalPoST.g:128:1: entryRuleVarInitDeclaration : ruleVarInitDeclaration EOF ;
    public final void entryRuleVarInitDeclaration() throws RecognitionException {
        try {
            // InternalPoST.g:129:1: ( ruleVarInitDeclaration EOF )
            // InternalPoST.g:130:1: ruleVarInitDeclaration EOF
            {
             before(grammarAccess.getVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVarInitDeclaration();

            state._fsp--;

             after(grammarAccess.getVarInitDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarInitDeclaration"


    // $ANTLR start "ruleVarInitDeclaration"
    // InternalPoST.g:137:1: ruleVarInitDeclaration : ( ( rule__VarInitDeclaration__Group__0 ) ) ;
    public final void ruleVarInitDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:141:2: ( ( ( rule__VarInitDeclaration__Group__0 ) ) )
            // InternalPoST.g:142:2: ( ( rule__VarInitDeclaration__Group__0 ) )
            {
            // InternalPoST.g:142:2: ( ( rule__VarInitDeclaration__Group__0 ) )
            // InternalPoST.g:143:3: ( rule__VarInitDeclaration__Group__0 )
            {
             before(grammarAccess.getVarInitDeclarationAccess().getGroup()); 
            // InternalPoST.g:144:3: ( rule__VarInitDeclaration__Group__0 )
            // InternalPoST.g:144:4: rule__VarInitDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarInitDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarInitDeclaration"


    // $ANTLR start "entryRuleVarList"
    // InternalPoST.g:153:1: entryRuleVarList : ruleVarList EOF ;
    public final void entryRuleVarList() throws RecognitionException {
        try {
            // InternalPoST.g:154:1: ( ruleVarList EOF )
            // InternalPoST.g:155:1: ruleVarList EOF
            {
             before(grammarAccess.getVarListRule()); 
            pushFollow(FOLLOW_1);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getVarListRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVarList"


    // $ANTLR start "ruleVarList"
    // InternalPoST.g:162:1: ruleVarList : ( ( rule__VarList__Group__0 ) ) ;
    public final void ruleVarList() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:166:2: ( ( ( rule__VarList__Group__0 ) ) )
            // InternalPoST.g:167:2: ( ( rule__VarList__Group__0 ) )
            {
            // InternalPoST.g:167:2: ( ( rule__VarList__Group__0 ) )
            // InternalPoST.g:168:3: ( rule__VarList__Group__0 )
            {
             before(grammarAccess.getVarListAccess().getGroup()); 
            // InternalPoST.g:169:3: ( rule__VarList__Group__0 )
            // InternalPoST.g:169:4: rule__VarList__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarList"


    // $ANTLR start "entryRuleExternalVarInitDeclaration"
    // InternalPoST.g:178:1: entryRuleExternalVarInitDeclaration : ruleExternalVarInitDeclaration EOF ;
    public final void entryRuleExternalVarInitDeclaration() throws RecognitionException {
        try {
            // InternalPoST.g:179:1: ( ruleExternalVarInitDeclaration EOF )
            // InternalPoST.g:180:1: ruleExternalVarInitDeclaration EOF
            {
             before(grammarAccess.getExternalVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalVarInitDeclaration();

            state._fsp--;

             after(grammarAccess.getExternalVarInitDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalVarInitDeclaration"


    // $ANTLR start "ruleExternalVarInitDeclaration"
    // InternalPoST.g:187:1: ruleExternalVarInitDeclaration : ( ( rule__ExternalVarInitDeclaration__Group__0 ) ) ;
    public final void ruleExternalVarInitDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:191:2: ( ( ( rule__ExternalVarInitDeclaration__Group__0 ) ) )
            // InternalPoST.g:192:2: ( ( rule__ExternalVarInitDeclaration__Group__0 ) )
            {
            // InternalPoST.g:192:2: ( ( rule__ExternalVarInitDeclaration__Group__0 ) )
            // InternalPoST.g:193:3: ( rule__ExternalVarInitDeclaration__Group__0 )
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getGroup()); 
            // InternalPoST.g:194:3: ( rule__ExternalVarInitDeclaration__Group__0 )
            // InternalPoST.g:194:4: rule__ExternalVarInitDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalVarInitDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalVarInitDeclaration"


    // $ANTLR start "entryRuleGlobalVarInitDeclaration"
    // InternalPoST.g:203:1: entryRuleGlobalVarInitDeclaration : ruleGlobalVarInitDeclaration EOF ;
    public final void entryRuleGlobalVarInitDeclaration() throws RecognitionException {
        try {
            // InternalPoST.g:204:1: ( ruleGlobalVarInitDeclaration EOF )
            // InternalPoST.g:205:1: ruleGlobalVarInitDeclaration EOF
            {
             before(grammarAccess.getGlobalVarInitDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleGlobalVarInitDeclaration();

            state._fsp--;

             after(grammarAccess.getGlobalVarInitDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGlobalVarInitDeclaration"


    // $ANTLR start "ruleGlobalVarInitDeclaration"
    // InternalPoST.g:212:1: ruleGlobalVarInitDeclaration : ( ( rule__GlobalVarInitDeclaration__Group__0 ) ) ;
    public final void ruleGlobalVarInitDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:216:2: ( ( ( rule__GlobalVarInitDeclaration__Group__0 ) ) )
            // InternalPoST.g:217:2: ( ( rule__GlobalVarInitDeclaration__Group__0 ) )
            {
            // InternalPoST.g:217:2: ( ( rule__GlobalVarInitDeclaration__Group__0 ) )
            // InternalPoST.g:218:3: ( rule__GlobalVarInitDeclaration__Group__0 )
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getGroup()); 
            // InternalPoST.g:219:3: ( rule__GlobalVarInitDeclaration__Group__0 )
            // InternalPoST.g:219:4: rule__GlobalVarInitDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGlobalVarInitDeclaration"


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalPoST.g:228:1: entryRuleTimeLiteral : ruleTimeLiteral EOF ;
    public final void entryRuleTimeLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:229:1: ( ruleTimeLiteral EOF )
            // InternalPoST.g:230:1: ruleTimeLiteral EOF
            {
             before(grammarAccess.getTimeLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeLiteral();

            state._fsp--;

             after(grammarAccess.getTimeLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeLiteral"


    // $ANTLR start "ruleTimeLiteral"
    // InternalPoST.g:237:1: ruleTimeLiteral : ( ( rule__TimeLiteral__Group__0 ) ) ;
    public final void ruleTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:241:2: ( ( ( rule__TimeLiteral__Group__0 ) ) )
            // InternalPoST.g:242:2: ( ( rule__TimeLiteral__Group__0 ) )
            {
            // InternalPoST.g:242:2: ( ( rule__TimeLiteral__Group__0 ) )
            // InternalPoST.g:243:3: ( rule__TimeLiteral__Group__0 )
            {
             before(grammarAccess.getTimeLiteralAccess().getGroup()); 
            // InternalPoST.g:244:3: ( rule__TimeLiteral__Group__0 )
            // InternalPoST.g:244:4: rule__TimeLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeLiteral"


    // $ANTLR start "entryRuleDataTypeName"
    // InternalPoST.g:253:1: entryRuleDataTypeName : ruleDataTypeName EOF ;
    public final void entryRuleDataTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:254:1: ( ruleDataTypeName EOF )
            // InternalPoST.g:255:1: ruleDataTypeName EOF
            {
             before(grammarAccess.getDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTypeName();

            state._fsp--;

             after(grammarAccess.getDataTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeName"


    // $ANTLR start "ruleDataTypeName"
    // InternalPoST.g:262:1: ruleDataTypeName : ( ( rule__DataTypeName__Alternatives ) ) ;
    public final void ruleDataTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:266:2: ( ( ( rule__DataTypeName__Alternatives ) ) )
            // InternalPoST.g:267:2: ( ( rule__DataTypeName__Alternatives ) )
            {
            // InternalPoST.g:267:2: ( ( rule__DataTypeName__Alternatives ) )
            // InternalPoST.g:268:3: ( rule__DataTypeName__Alternatives )
            {
             before(grammarAccess.getDataTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:269:3: ( rule__DataTypeName__Alternatives )
            // InternalPoST.g:269:4: rule__DataTypeName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataTypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeName"


    // $ANTLR start "entryRuleNumericTypeName"
    // InternalPoST.g:278:1: entryRuleNumericTypeName : ruleNumericTypeName EOF ;
    public final void entryRuleNumericTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:279:1: ( ruleNumericTypeName EOF )
            // InternalPoST.g:280:1: ruleNumericTypeName EOF
            {
             before(grammarAccess.getNumericTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericTypeName();

            state._fsp--;

             after(grammarAccess.getNumericTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericTypeName"


    // $ANTLR start "ruleNumericTypeName"
    // InternalPoST.g:287:1: ruleNumericTypeName : ( ( rule__NumericTypeName__Alternatives ) ) ;
    public final void ruleNumericTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:291:2: ( ( ( rule__NumericTypeName__Alternatives ) ) )
            // InternalPoST.g:292:2: ( ( rule__NumericTypeName__Alternatives ) )
            {
            // InternalPoST.g:292:2: ( ( rule__NumericTypeName__Alternatives ) )
            // InternalPoST.g:293:3: ( rule__NumericTypeName__Alternatives )
            {
             before(grammarAccess.getNumericTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:294:3: ( rule__NumericTypeName__Alternatives )
            // InternalPoST.g:294:4: rule__NumericTypeName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericTypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericTypeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericTypeName"


    // $ANTLR start "entryRuleIntegerTypeName"
    // InternalPoST.g:303:1: entryRuleIntegerTypeName : ruleIntegerTypeName EOF ;
    public final void entryRuleIntegerTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:304:1: ( ruleIntegerTypeName EOF )
            // InternalPoST.g:305:1: ruleIntegerTypeName EOF
            {
             before(grammarAccess.getIntegerTypeNameRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerTypeName();

            state._fsp--;

             after(grammarAccess.getIntegerTypeNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerTypeName"


    // $ANTLR start "ruleIntegerTypeName"
    // InternalPoST.g:312:1: ruleIntegerTypeName : ( ( rule__IntegerTypeName__Alternatives ) ) ;
    public final void ruleIntegerTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:316:2: ( ( ( rule__IntegerTypeName__Alternatives ) ) )
            // InternalPoST.g:317:2: ( ( rule__IntegerTypeName__Alternatives ) )
            {
            // InternalPoST.g:317:2: ( ( rule__IntegerTypeName__Alternatives ) )
            // InternalPoST.g:318:3: ( rule__IntegerTypeName__Alternatives )
            {
             before(grammarAccess.getIntegerTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:319:3: ( rule__IntegerTypeName__Alternatives )
            // InternalPoST.g:319:4: rule__IntegerTypeName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IntegerTypeName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntegerTypeNameAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerTypeName"


    // $ANTLR start "entryRuleSimpleSpecificationInit"
    // InternalPoST.g:328:1: entryRuleSimpleSpecificationInit : ruleSimpleSpecificationInit EOF ;
    public final void entryRuleSimpleSpecificationInit() throws RecognitionException {
        try {
            // InternalPoST.g:329:1: ( ruleSimpleSpecificationInit EOF )
            // InternalPoST.g:330:1: ruleSimpleSpecificationInit EOF
            {
             before(grammarAccess.getSimpleSpecificationInitRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleSpecificationInit();

            state._fsp--;

             after(grammarAccess.getSimpleSpecificationInitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleSpecificationInit"


    // $ANTLR start "ruleSimpleSpecificationInit"
    // InternalPoST.g:337:1: ruleSimpleSpecificationInit : ( ( rule__SimpleSpecificationInit__Group__0 ) ) ;
    public final void ruleSimpleSpecificationInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:341:2: ( ( ( rule__SimpleSpecificationInit__Group__0 ) ) )
            // InternalPoST.g:342:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            {
            // InternalPoST.g:342:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            // InternalPoST.g:343:3: ( rule__SimpleSpecificationInit__Group__0 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup()); 
            // InternalPoST.g:344:3: ( rule__SimpleSpecificationInit__Group__0 )
            // InternalPoST.g:344:4: rule__SimpleSpecificationInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSpecificationInitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleSpecificationInit"


    // $ANTLR start "entryRuleConstant"
    // InternalPoST.g:353:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalPoST.g:354:1: ( ruleConstant EOF )
            // InternalPoST.g:355:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalPoST.g:362:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:366:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPoST.g:367:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPoST.g:367:2: ( ( rule__Constant__Alternatives ) )
            // InternalPoST.g:368:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPoST.g:369:3: ( rule__Constant__Alternatives )
            // InternalPoST.g:369:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleSignedInteger"
    // InternalPoST.g:378:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
        try {
            // InternalPoST.g:379:1: ( ruleSignedInteger EOF )
            // InternalPoST.g:380:1: ruleSignedInteger EOF
            {
             before(grammarAccess.getSignedIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleSignedInteger();

            state._fsp--;

             after(grammarAccess.getSignedIntegerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignedInteger"


    // $ANTLR start "ruleSignedInteger"
    // InternalPoST.g:387:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:391:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // InternalPoST.g:392:2: ( ( rule__SignedInteger__Group__0 ) )
            {
            // InternalPoST.g:392:2: ( ( rule__SignedInteger__Group__0 ) )
            // InternalPoST.g:393:3: ( rule__SignedInteger__Group__0 )
            {
             before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            // InternalPoST.g:394:3: ( rule__SignedInteger__Group__0 )
            // InternalPoST.g:394:4: rule__SignedInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignedInteger"


    // $ANTLR start "entryRuleNumericLiteral"
    // InternalPoST.g:403:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:404:1: ( ruleNumericLiteral EOF )
            // InternalPoST.g:405:1: ruleNumericLiteral EOF
            {
             before(grammarAccess.getNumericLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumericLiteral();

            state._fsp--;

             after(grammarAccess.getNumericLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumericLiteral"


    // $ANTLR start "ruleNumericLiteral"
    // InternalPoST.g:412:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:416:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPoST.g:417:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPoST.g:417:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPoST.g:418:3: ( rule__NumericLiteral__Alternatives )
            {
             before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            // InternalPoST.g:419:3: ( rule__NumericLiteral__Alternatives )
            // InternalPoST.g:419:4: rule__NumericLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumericLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumericLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumericLiteral"


    // $ANTLR start "entryRuleIntegerLiteral"
    // InternalPoST.g:428:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:429:1: ( ruleIntegerLiteral EOF )
            // InternalPoST.g:430:1: ruleIntegerLiteral EOF
            {
             before(grammarAccess.getIntegerLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntegerLiteral();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerLiteral"


    // $ANTLR start "ruleIntegerLiteral"
    // InternalPoST.g:437:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__Group__0 ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:441:2: ( ( ( rule__IntegerLiteral__Group__0 ) ) )
            // InternalPoST.g:442:2: ( ( rule__IntegerLiteral__Group__0 ) )
            {
            // InternalPoST.g:442:2: ( ( rule__IntegerLiteral__Group__0 ) )
            // InternalPoST.g:443:3: ( rule__IntegerLiteral__Group__0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup()); 
            // InternalPoST.g:444:3: ( rule__IntegerLiteral__Group__0 )
            // InternalPoST.g:444:4: rule__IntegerLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerLiteral"


    // $ANTLR start "entryRuleRealLiteral"
    // InternalPoST.g:453:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:454:1: ( ruleRealLiteral EOF )
            // InternalPoST.g:455:1: ruleRealLiteral EOF
            {
             before(grammarAccess.getRealLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleRealLiteral();

            state._fsp--;

             after(grammarAccess.getRealLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRealLiteral"


    // $ANTLR start "ruleRealLiteral"
    // InternalPoST.g:462:1: ruleRealLiteral : ( ( rule__RealLiteral__Group__0 ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:466:2: ( ( ( rule__RealLiteral__Group__0 ) ) )
            // InternalPoST.g:467:2: ( ( rule__RealLiteral__Group__0 ) )
            {
            // InternalPoST.g:467:2: ( ( rule__RealLiteral__Group__0 ) )
            // InternalPoST.g:468:3: ( rule__RealLiteral__Group__0 )
            {
             before(grammarAccess.getRealLiteralAccess().getGroup()); 
            // InternalPoST.g:469:3: ( rule__RealLiteral__Group__0 )
            // InternalPoST.g:469:4: rule__RealLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRealLiteral"


    // $ANTLR start "rule__DataTypeName__Alternatives"
    // InternalPoST.g:477:1: rule__DataTypeName__Alternatives : ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) );
    public final void rule__DataTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:481:1: ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt2=1;
                }
                break;
            case RULE_BIT_STRING_TYPE_NAME:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalPoST.g:482:2: ( ruleNumericTypeName )
                    {
                    // InternalPoST.g:482:2: ( ruleNumericTypeName )
                    // InternalPoST.g:483:3: ruleNumericTypeName
                    {
                     before(grammarAccess.getDataTypeNameAccess().getNumericTypeNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericTypeName();

                    state._fsp--;

                     after(grammarAccess.getDataTypeNameAccess().getNumericTypeNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:488:2: ( RULE_BIT_STRING_TYPE_NAME )
                    {
                    // InternalPoST.g:488:2: ( RULE_BIT_STRING_TYPE_NAME )
                    // InternalPoST.g:489:3: RULE_BIT_STRING_TYPE_NAME
                    {
                     before(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 
                    match(input,RULE_BIT_STRING_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:494:2: ( 'STRING' )
                    {
                    // InternalPoST.g:494:2: ( 'STRING' )
                    // InternalPoST.g:495:3: 'STRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:500:2: ( 'WSTRING' )
                    {
                    // InternalPoST.g:500:2: ( 'WSTRING' )
                    // InternalPoST.g:501:3: 'WSTRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeName__Alternatives"


    // $ANTLR start "rule__NumericTypeName__Alternatives"
    // InternalPoST.g:510:1: rule__NumericTypeName__Alternatives : ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) );
    public final void rule__NumericTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:514:1: ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA3_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_REAL_TYPE_NAME) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalPoST.g:515:2: ( ruleIntegerTypeName )
                    {
                    // InternalPoST.g:515:2: ( ruleIntegerTypeName )
                    // InternalPoST.g:516:3: ruleIntegerTypeName
                    {
                     before(grammarAccess.getNumericTypeNameAccess().getIntegerTypeNameParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerTypeName();

                    state._fsp--;

                     after(grammarAccess.getNumericTypeNameAccess().getIntegerTypeNameParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:521:2: ( RULE_REAL_TYPE_NAME )
                    {
                    // InternalPoST.g:521:2: ( RULE_REAL_TYPE_NAME )
                    // InternalPoST.g:522:3: RULE_REAL_TYPE_NAME
                    {
                     before(grammarAccess.getNumericTypeNameAccess().getREAL_TYPE_NAMETerminalRuleCall_1()); 
                    match(input,RULE_REAL_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getNumericTypeNameAccess().getREAL_TYPE_NAMETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericTypeName__Alternatives"


    // $ANTLR start "rule__IntegerTypeName__Alternatives"
    // InternalPoST.g:531:1: rule__IntegerTypeName__Alternatives : ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) );
    public final void rule__IntegerTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:535:1: ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_SIGNED_INTEGER_TYPE_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_UNSIGNED_INTEGER_TYPE_NAME) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalPoST.g:536:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:536:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:537:3: RULE_SIGNED_INTEGER_TYPE_NAME
                    {
                     before(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 
                    match(input,RULE_SIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:542:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:542:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:543:3: RULE_UNSIGNED_INTEGER_TYPE_NAME
                    {
                     before(grammarAccess.getIntegerTypeNameAccess().getUNSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_1()); 
                    match(input,RULE_UNSIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeNameAccess().getUNSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerTypeName__Alternatives"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalPoST.g:552:1: rule__Constant__Alternatives : ( ( ruleNumericLiteral ) | ( ruleTimeLiteral ) | ( ( rule__Constant__Group_2__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:556:1: ( ( ruleNumericLiteral ) | ( ruleTimeLiteral ) | ( ( rule__Constant__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
            case RULE_INTEGER:
            case 36:
                {
                alt5=1;
                }
                break;
            case RULE_TIME_PREF_LITERAL:
                {
                alt5=2;
                }
                break;
            case RULE_BOOLEAN_LITERAL:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPoST.g:557:2: ( ruleNumericLiteral )
                    {
                    // InternalPoST.g:557:2: ( ruleNumericLiteral )
                    // InternalPoST.g:558:3: ruleNumericLiteral
                    {
                     before(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumericLiteral();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getNumericLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:563:2: ( ruleTimeLiteral )
                    {
                    // InternalPoST.g:563:2: ( ruleTimeLiteral )
                    // InternalPoST.g:564:3: ruleTimeLiteral
                    {
                     before(grammarAccess.getConstantAccess().getTimeLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTimeLiteral();

                    state._fsp--;

                     after(grammarAccess.getConstantAccess().getTimeLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:569:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalPoST.g:569:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalPoST.g:570:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalPoST.g:571:3: ( rule__Constant__Group_2__0 )
                    // InternalPoST.g:571:4: rule__Constant__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__NumericLiteral__Alternatives"
    // InternalPoST.g:579:1: rule__NumericLiteral__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:583:1: ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_INTEGER) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==EOF) ) {
                        alt6=1;
                    }
                    else if ( (LA6_3==38) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INTEGER:
                {
                int LA6_3 = input.LA(2);

                if ( (LA6_3==EOF) ) {
                    alt6=1;
                }
                else if ( (LA6_3==38) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_REAL_TYPE_NAME:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalPoST.g:584:2: ( ruleIntegerLiteral )
                    {
                    // InternalPoST.g:584:2: ( ruleIntegerLiteral )
                    // InternalPoST.g:585:3: ruleIntegerLiteral
                    {
                     before(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntegerLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumericLiteralAccess().getIntegerLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:590:2: ( ruleRealLiteral )
                    {
                    // InternalPoST.g:590:2: ( ruleRealLiteral )
                    // InternalPoST.g:591:3: ruleRealLiteral
                    {
                     before(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRealLiteral();

                    state._fsp--;

                     after(grammarAccess.getNumericLiteralAccess().getRealLiteralParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumericLiteral__Alternatives"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalPoST.g:600:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:604:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalPoST.g:605:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalPoST.g:612:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:616:1: ( ( 'Hello' ) )
            // InternalPoST.g:617:1: ( 'Hello' )
            {
            // InternalPoST.g:617:1: ( 'Hello' )
            // InternalPoST.g:618:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalPoST.g:627:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:631:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalPoST.g:632:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalPoST.g:639:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:643:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalPoST.g:644:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalPoST.g:644:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalPoST.g:645:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalPoST.g:646:2: ( rule__Greeting__NameAssignment_1 )
            // InternalPoST.g:646:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalPoST.g:654:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:658:1: ( rule__Greeting__Group__2__Impl )
            // InternalPoST.g:659:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalPoST.g:665:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:669:1: ( ( '!' ) )
            // InternalPoST.g:670:1: ( '!' )
            {
            // InternalPoST.g:670:1: ( '!' )
            // InternalPoST.g:671:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__VarInitDeclaration__Group__0"
    // InternalPoST.g:681:1: rule__VarInitDeclaration__Group__0 : rule__VarInitDeclaration__Group__0__Impl rule__VarInitDeclaration__Group__1 ;
    public final void rule__VarInitDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:685:1: ( rule__VarInitDeclaration__Group__0__Impl rule__VarInitDeclaration__Group__1 )
            // InternalPoST.g:686:2: rule__VarInitDeclaration__Group__0__Impl rule__VarInitDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VarInitDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__0"


    // $ANTLR start "rule__VarInitDeclaration__Group__0__Impl"
    // InternalPoST.g:693:1: rule__VarInitDeclaration__Group__0__Impl : ( ( rule__VarInitDeclaration__VarListAssignment_0 ) ) ;
    public final void rule__VarInitDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:697:1: ( ( ( rule__VarInitDeclaration__VarListAssignment_0 ) ) )
            // InternalPoST.g:698:1: ( ( rule__VarInitDeclaration__VarListAssignment_0 ) )
            {
            // InternalPoST.g:698:1: ( ( rule__VarInitDeclaration__VarListAssignment_0 ) )
            // InternalPoST.g:699:2: ( rule__VarInitDeclaration__VarListAssignment_0 )
            {
             before(grammarAccess.getVarInitDeclarationAccess().getVarListAssignment_0()); 
            // InternalPoST.g:700:2: ( rule__VarInitDeclaration__VarListAssignment_0 )
            // InternalPoST.g:700:3: rule__VarInitDeclaration__VarListAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__VarListAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarInitDeclarationAccess().getVarListAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VarInitDeclaration__Group__1"
    // InternalPoST.g:708:1: rule__VarInitDeclaration__Group__1 : rule__VarInitDeclaration__Group__1__Impl rule__VarInitDeclaration__Group__2 ;
    public final void rule__VarInitDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:712:1: ( rule__VarInitDeclaration__Group__1__Impl rule__VarInitDeclaration__Group__2 )
            // InternalPoST.g:713:2: rule__VarInitDeclaration__Group__1__Impl rule__VarInitDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__VarInitDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__1"


    // $ANTLR start "rule__VarInitDeclaration__Group__1__Impl"
    // InternalPoST.g:720:1: rule__VarInitDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__VarInitDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:724:1: ( ( ':' ) )
            // InternalPoST.g:725:1: ( ':' )
            {
            // InternalPoST.g:725:1: ( ':' )
            // InternalPoST.g:726:2: ':'
            {
             before(grammarAccess.getVarInitDeclarationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVarInitDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VarInitDeclaration__Group__2"
    // InternalPoST.g:735:1: rule__VarInitDeclaration__Group__2 : rule__VarInitDeclaration__Group__2__Impl ;
    public final void rule__VarInitDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:739:1: ( rule__VarInitDeclaration__Group__2__Impl )
            // InternalPoST.g:740:2: rule__VarInitDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__2"


    // $ANTLR start "rule__VarInitDeclaration__Group__2__Impl"
    // InternalPoST.g:746:1: rule__VarInitDeclaration__Group__2__Impl : ( ( rule__VarInitDeclaration__SpecAssignment_2 ) ) ;
    public final void rule__VarInitDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:750:1: ( ( ( rule__VarInitDeclaration__SpecAssignment_2 ) ) )
            // InternalPoST.g:751:1: ( ( rule__VarInitDeclaration__SpecAssignment_2 ) )
            {
            // InternalPoST.g:751:1: ( ( rule__VarInitDeclaration__SpecAssignment_2 ) )
            // InternalPoST.g:752:2: ( rule__VarInitDeclaration__SpecAssignment_2 )
            {
             before(grammarAccess.getVarInitDeclarationAccess().getSpecAssignment_2()); 
            // InternalPoST.g:753:2: ( rule__VarInitDeclaration__SpecAssignment_2 )
            // InternalPoST.g:753:3: rule__VarInitDeclaration__SpecAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VarInitDeclaration__SpecAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVarInitDeclarationAccess().getSpecAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VarList__Group__0"
    // InternalPoST.g:762:1: rule__VarList__Group__0 : rule__VarList__Group__0__Impl rule__VarList__Group__1 ;
    public final void rule__VarList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:766:1: ( rule__VarList__Group__0__Impl rule__VarList__Group__1 )
            // InternalPoST.g:767:2: rule__VarList__Group__0__Impl rule__VarList__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VarList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__0"


    // $ANTLR start "rule__VarList__Group__0__Impl"
    // InternalPoST.g:774:1: rule__VarList__Group__0__Impl : ( ( rule__VarList__VarsAssignment_0 ) ) ;
    public final void rule__VarList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:778:1: ( ( ( rule__VarList__VarsAssignment_0 ) ) )
            // InternalPoST.g:779:1: ( ( rule__VarList__VarsAssignment_0 ) )
            {
            // InternalPoST.g:779:1: ( ( rule__VarList__VarsAssignment_0 ) )
            // InternalPoST.g:780:2: ( rule__VarList__VarsAssignment_0 )
            {
             before(grammarAccess.getVarListAccess().getVarsAssignment_0()); 
            // InternalPoST.g:781:2: ( rule__VarList__VarsAssignment_0 )
            // InternalPoST.g:781:3: rule__VarList__VarsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__VarList__VarsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getVarListAccess().getVarsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__0__Impl"


    // $ANTLR start "rule__VarList__Group__1"
    // InternalPoST.g:789:1: rule__VarList__Group__1 : rule__VarList__Group__1__Impl ;
    public final void rule__VarList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:793:1: ( rule__VarList__Group__1__Impl )
            // InternalPoST.g:794:2: rule__VarList__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__1"


    // $ANTLR start "rule__VarList__Group__1__Impl"
    // InternalPoST.g:800:1: rule__VarList__Group__1__Impl : ( ( rule__VarList__Group_1__0 )* ) ;
    public final void rule__VarList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:804:1: ( ( ( rule__VarList__Group_1__0 )* ) )
            // InternalPoST.g:805:1: ( ( rule__VarList__Group_1__0 )* )
            {
            // InternalPoST.g:805:1: ( ( rule__VarList__Group_1__0 )* )
            // InternalPoST.g:806:2: ( rule__VarList__Group_1__0 )*
            {
             before(grammarAccess.getVarListAccess().getGroup_1()); 
            // InternalPoST.g:807:2: ( rule__VarList__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==33) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalPoST.g:807:3: rule__VarList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__VarList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getVarListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group__1__Impl"


    // $ANTLR start "rule__VarList__Group_1__0"
    // InternalPoST.g:816:1: rule__VarList__Group_1__0 : rule__VarList__Group_1__0__Impl rule__VarList__Group_1__1 ;
    public final void rule__VarList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:820:1: ( rule__VarList__Group_1__0__Impl rule__VarList__Group_1__1 )
            // InternalPoST.g:821:2: rule__VarList__Group_1__0__Impl rule__VarList__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__VarList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group_1__0"


    // $ANTLR start "rule__VarList__Group_1__0__Impl"
    // InternalPoST.g:828:1: rule__VarList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__VarList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:832:1: ( ( ',' ) )
            // InternalPoST.g:833:1: ( ',' )
            {
            // InternalPoST.g:833:1: ( ',' )
            // InternalPoST.g:834:2: ','
            {
             before(grammarAccess.getVarListAccess().getCommaKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVarListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group_1__0__Impl"


    // $ANTLR start "rule__VarList__Group_1__1"
    // InternalPoST.g:843:1: rule__VarList__Group_1__1 : rule__VarList__Group_1__1__Impl ;
    public final void rule__VarList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:847:1: ( rule__VarList__Group_1__1__Impl )
            // InternalPoST.g:848:2: rule__VarList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group_1__1"


    // $ANTLR start "rule__VarList__Group_1__1__Impl"
    // InternalPoST.g:854:1: rule__VarList__Group_1__1__Impl : ( ( rule__VarList__VarsAssignment_1_1 ) ) ;
    public final void rule__VarList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:858:1: ( ( ( rule__VarList__VarsAssignment_1_1 ) ) )
            // InternalPoST.g:859:1: ( ( rule__VarList__VarsAssignment_1_1 ) )
            {
            // InternalPoST.g:859:1: ( ( rule__VarList__VarsAssignment_1_1 ) )
            // InternalPoST.g:860:2: ( rule__VarList__VarsAssignment_1_1 )
            {
             before(grammarAccess.getVarListAccess().getVarsAssignment_1_1()); 
            // InternalPoST.g:861:2: ( rule__VarList__VarsAssignment_1_1 )
            // InternalPoST.g:861:3: rule__VarList__VarsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VarList__VarsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVarListAccess().getVarsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__Group_1__1__Impl"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__0"
    // InternalPoST.g:870:1: rule__ExternalVarInitDeclaration__Group__0 : rule__ExternalVarInitDeclaration__Group__0__Impl rule__ExternalVarInitDeclaration__Group__1 ;
    public final void rule__ExternalVarInitDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:874:1: ( rule__ExternalVarInitDeclaration__Group__0__Impl rule__ExternalVarInitDeclaration__Group__1 )
            // InternalPoST.g:875:2: rule__ExternalVarInitDeclaration__Group__0__Impl rule__ExternalVarInitDeclaration__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ExternalVarInitDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__0"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__0__Impl"
    // InternalPoST.g:882:1: rule__ExternalVarInitDeclaration__Group__0__Impl : ( ( rule__ExternalVarInitDeclaration__VarListAssignment_0 ) ) ;
    public final void rule__ExternalVarInitDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:886:1: ( ( ( rule__ExternalVarInitDeclaration__VarListAssignment_0 ) ) )
            // InternalPoST.g:887:1: ( ( rule__ExternalVarInitDeclaration__VarListAssignment_0 ) )
            {
            // InternalPoST.g:887:1: ( ( rule__ExternalVarInitDeclaration__VarListAssignment_0 ) )
            // InternalPoST.g:888:2: ( rule__ExternalVarInitDeclaration__VarListAssignment_0 )
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getVarListAssignment_0()); 
            // InternalPoST.g:889:2: ( rule__ExternalVarInitDeclaration__VarListAssignment_0 )
            // InternalPoST.g:889:3: rule__ExternalVarInitDeclaration__VarListAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__VarListAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalVarInitDeclarationAccess().getVarListAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__1"
    // InternalPoST.g:897:1: rule__ExternalVarInitDeclaration__Group__1 : rule__ExternalVarInitDeclaration__Group__1__Impl rule__ExternalVarInitDeclaration__Group__2 ;
    public final void rule__ExternalVarInitDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:901:1: ( rule__ExternalVarInitDeclaration__Group__1__Impl rule__ExternalVarInitDeclaration__Group__2 )
            // InternalPoST.g:902:2: rule__ExternalVarInitDeclaration__Group__1__Impl rule__ExternalVarInitDeclaration__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ExternalVarInitDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__1"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__1__Impl"
    // InternalPoST.g:909:1: rule__ExternalVarInitDeclaration__Group__1__Impl : ( ':' ) ;
    public final void rule__ExternalVarInitDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:913:1: ( ( ':' ) )
            // InternalPoST.g:914:1: ( ':' )
            {
            // InternalPoST.g:914:1: ( ':' )
            // InternalPoST.g:915:2: ':'
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getColonKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getExternalVarInitDeclarationAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__1__Impl"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__2"
    // InternalPoST.g:924:1: rule__ExternalVarInitDeclaration__Group__2 : rule__ExternalVarInitDeclaration__Group__2__Impl ;
    public final void rule__ExternalVarInitDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:928:1: ( rule__ExternalVarInitDeclaration__Group__2__Impl )
            // InternalPoST.g:929:2: rule__ExternalVarInitDeclaration__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__2"


    // $ANTLR start "rule__ExternalVarInitDeclaration__Group__2__Impl"
    // InternalPoST.g:935:1: rule__ExternalVarInitDeclaration__Group__2__Impl : ( ( rule__ExternalVarInitDeclaration__TypeAssignment_2 ) ) ;
    public final void rule__ExternalVarInitDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:939:1: ( ( ( rule__ExternalVarInitDeclaration__TypeAssignment_2 ) ) )
            // InternalPoST.g:940:1: ( ( rule__ExternalVarInitDeclaration__TypeAssignment_2 ) )
            {
            // InternalPoST.g:940:1: ( ( rule__ExternalVarInitDeclaration__TypeAssignment_2 ) )
            // InternalPoST.g:941:2: ( rule__ExternalVarInitDeclaration__TypeAssignment_2 )
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getTypeAssignment_2()); 
            // InternalPoST.g:942:2: ( rule__ExternalVarInitDeclaration__TypeAssignment_2 )
            // InternalPoST.g:942:3: rule__ExternalVarInitDeclaration__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalVarInitDeclaration__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalVarInitDeclarationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__Group__2__Impl"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__0"
    // InternalPoST.g:951:1: rule__GlobalVarInitDeclaration__Group__0 : rule__GlobalVarInitDeclaration__Group__0__Impl rule__GlobalVarInitDeclaration__Group__1 ;
    public final void rule__GlobalVarInitDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:955:1: ( rule__GlobalVarInitDeclaration__Group__0__Impl rule__GlobalVarInitDeclaration__Group__1 )
            // InternalPoST.g:956:2: rule__GlobalVarInitDeclaration__Group__0__Impl rule__GlobalVarInitDeclaration__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__GlobalVarInitDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__0"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__0__Impl"
    // InternalPoST.g:963:1: rule__GlobalVarInitDeclaration__Group__0__Impl : ( ( rule__GlobalVarInitDeclaration__VarListAssignment_0 ) ) ;
    public final void rule__GlobalVarInitDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:967:1: ( ( ( rule__GlobalVarInitDeclaration__VarListAssignment_0 ) ) )
            // InternalPoST.g:968:1: ( ( rule__GlobalVarInitDeclaration__VarListAssignment_0 ) )
            {
            // InternalPoST.g:968:1: ( ( rule__GlobalVarInitDeclaration__VarListAssignment_0 ) )
            // InternalPoST.g:969:2: ( rule__GlobalVarInitDeclaration__VarListAssignment_0 )
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListAssignment_0()); 
            // InternalPoST.g:970:2: ( rule__GlobalVarInitDeclaration__VarListAssignment_0 )
            // InternalPoST.g:970:3: rule__GlobalVarInitDeclaration__VarListAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__VarListAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__0__Impl"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__1"
    // InternalPoST.g:978:1: rule__GlobalVarInitDeclaration__Group__1 : rule__GlobalVarInitDeclaration__Group__1__Impl rule__GlobalVarInitDeclaration__Group__2 ;
    public final void rule__GlobalVarInitDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:982:1: ( rule__GlobalVarInitDeclaration__Group__1__Impl rule__GlobalVarInitDeclaration__Group__2 )
            // InternalPoST.g:983:2: rule__GlobalVarInitDeclaration__Group__1__Impl rule__GlobalVarInitDeclaration__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__GlobalVarInitDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__1"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__1__Impl"
    // InternalPoST.g:990:1: rule__GlobalVarInitDeclaration__Group__1__Impl : ( 'AT' ) ;
    public final void rule__GlobalVarInitDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:994:1: ( ( 'AT' ) )
            // InternalPoST.g:995:1: ( 'AT' )
            {
            // InternalPoST.g:995:1: ( 'AT' )
            // InternalPoST.g:996:2: 'AT'
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getATKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getGlobalVarInitDeclarationAccess().getATKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__1__Impl"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__2"
    // InternalPoST.g:1005:1: rule__GlobalVarInitDeclaration__Group__2 : rule__GlobalVarInitDeclaration__Group__2__Impl rule__GlobalVarInitDeclaration__Group__3 ;
    public final void rule__GlobalVarInitDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1009:1: ( rule__GlobalVarInitDeclaration__Group__2__Impl rule__GlobalVarInitDeclaration__Group__3 )
            // InternalPoST.g:1010:2: rule__GlobalVarInitDeclaration__Group__2__Impl rule__GlobalVarInitDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__GlobalVarInitDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__2"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__2__Impl"
    // InternalPoST.g:1017:1: rule__GlobalVarInitDeclaration__Group__2__Impl : ( ( rule__GlobalVarInitDeclaration__LocationAssignment_2 ) ) ;
    public final void rule__GlobalVarInitDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1021:1: ( ( ( rule__GlobalVarInitDeclaration__LocationAssignment_2 ) ) )
            // InternalPoST.g:1022:1: ( ( rule__GlobalVarInitDeclaration__LocationAssignment_2 ) )
            {
            // InternalPoST.g:1022:1: ( ( rule__GlobalVarInitDeclaration__LocationAssignment_2 ) )
            // InternalPoST.g:1023:2: ( rule__GlobalVarInitDeclaration__LocationAssignment_2 )
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getLocationAssignment_2()); 
            // InternalPoST.g:1024:2: ( rule__GlobalVarInitDeclaration__LocationAssignment_2 )
            // InternalPoST.g:1024:3: rule__GlobalVarInitDeclaration__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__2__Impl"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__3"
    // InternalPoST.g:1032:1: rule__GlobalVarInitDeclaration__Group__3 : rule__GlobalVarInitDeclaration__Group__3__Impl rule__GlobalVarInitDeclaration__Group__4 ;
    public final void rule__GlobalVarInitDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1036:1: ( rule__GlobalVarInitDeclaration__Group__3__Impl rule__GlobalVarInitDeclaration__Group__4 )
            // InternalPoST.g:1037:2: rule__GlobalVarInitDeclaration__Group__3__Impl rule__GlobalVarInitDeclaration__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__GlobalVarInitDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__3"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__3__Impl"
    // InternalPoST.g:1044:1: rule__GlobalVarInitDeclaration__Group__3__Impl : ( ':' ) ;
    public final void rule__GlobalVarInitDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1048:1: ( ( ':' ) )
            // InternalPoST.g:1049:1: ( ':' )
            {
            // InternalPoST.g:1049:1: ( ':' )
            // InternalPoST.g:1050:2: ':'
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getGlobalVarInitDeclarationAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__3__Impl"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__4"
    // InternalPoST.g:1059:1: rule__GlobalVarInitDeclaration__Group__4 : rule__GlobalVarInitDeclaration__Group__4__Impl ;
    public final void rule__GlobalVarInitDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1063:1: ( rule__GlobalVarInitDeclaration__Group__4__Impl )
            // InternalPoST.g:1064:2: rule__GlobalVarInitDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__4"


    // $ANTLR start "rule__GlobalVarInitDeclaration__Group__4__Impl"
    // InternalPoST.g:1070:1: rule__GlobalVarInitDeclaration__Group__4__Impl : ( ( rule__GlobalVarInitDeclaration__TypeAssignment_4 ) ) ;
    public final void rule__GlobalVarInitDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1074:1: ( ( ( rule__GlobalVarInitDeclaration__TypeAssignment_4 ) ) )
            // InternalPoST.g:1075:1: ( ( rule__GlobalVarInitDeclaration__TypeAssignment_4 ) )
            {
            // InternalPoST.g:1075:1: ( ( rule__GlobalVarInitDeclaration__TypeAssignment_4 ) )
            // InternalPoST.g:1076:2: ( rule__GlobalVarInitDeclaration__TypeAssignment_4 )
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getTypeAssignment_4()); 
            // InternalPoST.g:1077:2: ( rule__GlobalVarInitDeclaration__TypeAssignment_4 )
            // InternalPoST.g:1077:3: rule__GlobalVarInitDeclaration__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__GlobalVarInitDeclaration__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__Group__4__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__0"
    // InternalPoST.g:1086:1: rule__TimeLiteral__Group__0 : rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 ;
    public final void rule__TimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1090:1: ( rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 )
            // InternalPoST.g:1091:2: rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__TimeLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0"


    // $ANTLR start "rule__TimeLiteral__Group__0__Impl"
    // InternalPoST.g:1098:1: rule__TimeLiteral__Group__0__Impl : ( RULE_TIME_PREF_LITERAL ) ;
    public final void rule__TimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1102:1: ( ( RULE_TIME_PREF_LITERAL ) )
            // InternalPoST.g:1103:1: ( RULE_TIME_PREF_LITERAL )
            {
            // InternalPoST.g:1103:1: ( RULE_TIME_PREF_LITERAL )
            // InternalPoST.g:1104:2: RULE_TIME_PREF_LITERAL
            {
             before(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALTerminalRuleCall_0()); 
            match(input,RULE_TIME_PREF_LITERAL,FOLLOW_2); 
             after(grammarAccess.getTimeLiteralAccess().getTIME_PREF_LITERALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__0__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__1"
    // InternalPoST.g:1113:1: rule__TimeLiteral__Group__1 : rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2 ;
    public final void rule__TimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1117:1: ( rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2 )
            // InternalPoST.g:1118:2: rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__TimeLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1"


    // $ANTLR start "rule__TimeLiteral__Group__1__Impl"
    // InternalPoST.g:1125:1: rule__TimeLiteral__Group__1__Impl : ( '#' ) ;
    public final void rule__TimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1129:1: ( ( '#' ) )
            // InternalPoST.g:1130:1: ( '#' )
            {
            // InternalPoST.g:1130:1: ( '#' )
            // InternalPoST.g:1131:2: '#'
            {
             before(grammarAccess.getTimeLiteralAccess().getNumberSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTimeLiteralAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__1__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__2"
    // InternalPoST.g:1140:1: rule__TimeLiteral__Group__2 : rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3 ;
    public final void rule__TimeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1144:1: ( rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3 )
            // InternalPoST.g:1145:2: rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TimeLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__2"


    // $ANTLR start "rule__TimeLiteral__Group__2__Impl"
    // InternalPoST.g:1152:1: rule__TimeLiteral__Group__2__Impl : ( ( '-' )? ) ;
    public final void rule__TimeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1156:1: ( ( ( '-' )? ) )
            // InternalPoST.g:1157:1: ( ( '-' )? )
            {
            // InternalPoST.g:1157:1: ( ( '-' )? )
            // InternalPoST.g:1158:2: ( '-' )?
            {
             before(grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2()); 
            // InternalPoST.g:1159:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPoST.g:1159:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__2__Impl"


    // $ANTLR start "rule__TimeLiteral__Group__3"
    // InternalPoST.g:1167:1: rule__TimeLiteral__Group__3 : rule__TimeLiteral__Group__3__Impl ;
    public final void rule__TimeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1171:1: ( rule__TimeLiteral__Group__3__Impl )
            // InternalPoST.g:1172:2: rule__TimeLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__3"


    // $ANTLR start "rule__TimeLiteral__Group__3__Impl"
    // InternalPoST.g:1178:1: rule__TimeLiteral__Group__3__Impl : ( ( rule__TimeLiteral__IntervalAssignment_3 ) ) ;
    public final void rule__TimeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1182:1: ( ( ( rule__TimeLiteral__IntervalAssignment_3 ) ) )
            // InternalPoST.g:1183:1: ( ( rule__TimeLiteral__IntervalAssignment_3 ) )
            {
            // InternalPoST.g:1183:1: ( ( rule__TimeLiteral__IntervalAssignment_3 ) )
            // InternalPoST.g:1184:2: ( rule__TimeLiteral__IntervalAssignment_3 )
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_3()); 
            // InternalPoST.g:1185:2: ( rule__TimeLiteral__IntervalAssignment_3 )
            // InternalPoST.g:1185:3: rule__TimeLiteral__IntervalAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TimeLiteral__IntervalAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__Group__3__Impl"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__0"
    // InternalPoST.g:1194:1: rule__SimpleSpecificationInit__Group__0 : rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 ;
    public final void rule__SimpleSpecificationInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1198:1: ( rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 )
            // InternalPoST.g:1199:2: rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SimpleSpecificationInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__0"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__0__Impl"
    // InternalPoST.g:1206:1: rule__SimpleSpecificationInit__Group__0__Impl : ( () ) ;
    public final void rule__SimpleSpecificationInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1210:1: ( ( () ) )
            // InternalPoST.g:1211:1: ( () )
            {
            // InternalPoST.g:1211:1: ( () )
            // InternalPoST.g:1212:2: ()
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0()); 
            // InternalPoST.g:1213:2: ()
            // InternalPoST.g:1213:3: 
            {
            }

             after(grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__0__Impl"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__1"
    // InternalPoST.g:1221:1: rule__SimpleSpecificationInit__Group__1 : rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 ;
    public final void rule__SimpleSpecificationInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1225:1: ( rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 )
            // InternalPoST.g:1226:2: rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__SimpleSpecificationInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__1"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__1__Impl"
    // InternalPoST.g:1233:1: rule__SimpleSpecificationInit__Group__1__Impl : ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1237:1: ( ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) )
            // InternalPoST.g:1238:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            {
            // InternalPoST.g:1238:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            // InternalPoST.g:1239:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getTypeAssignment_1()); 
            // InternalPoST.g:1240:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            // InternalPoST.g:1240:3: rule__SimpleSpecificationInit__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSpecificationInitAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__1__Impl"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__2"
    // InternalPoST.g:1248:1: rule__SimpleSpecificationInit__Group__2 : rule__SimpleSpecificationInit__Group__2__Impl ;
    public final void rule__SimpleSpecificationInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1252:1: ( rule__SimpleSpecificationInit__Group__2__Impl )
            // InternalPoST.g:1253:2: rule__SimpleSpecificationInit__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__2"


    // $ANTLR start "rule__SimpleSpecificationInit__Group__2__Impl"
    // InternalPoST.g:1259:1: rule__SimpleSpecificationInit__Group__2__Impl : ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) ;
    public final void rule__SimpleSpecificationInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1263:1: ( ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) )
            // InternalPoST.g:1264:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            {
            // InternalPoST.g:1264:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            // InternalPoST.g:1265:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup_2()); 
            // InternalPoST.g:1266:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:1266:3: rule__SimpleSpecificationInit__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SimpleSpecificationInit__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimpleSpecificationInitAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group__2__Impl"


    // $ANTLR start "rule__SimpleSpecificationInit__Group_2__0"
    // InternalPoST.g:1275:1: rule__SimpleSpecificationInit__Group_2__0 : rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 ;
    public final void rule__SimpleSpecificationInit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1279:1: ( rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 )
            // InternalPoST.g:1280:2: rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__SimpleSpecificationInit__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group_2__0"


    // $ANTLR start "rule__SimpleSpecificationInit__Group_2__0__Impl"
    // InternalPoST.g:1287:1: rule__SimpleSpecificationInit__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__SimpleSpecificationInit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1291:1: ( ( ':=' ) )
            // InternalPoST.g:1292:1: ( ':=' )
            {
            // InternalPoST.g:1292:1: ( ':=' )
            // InternalPoST.g:1293:2: ':='
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group_2__0__Impl"


    // $ANTLR start "rule__SimpleSpecificationInit__Group_2__1"
    // InternalPoST.g:1302:1: rule__SimpleSpecificationInit__Group_2__1 : rule__SimpleSpecificationInit__Group_2__1__Impl ;
    public final void rule__SimpleSpecificationInit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1306:1: ( rule__SimpleSpecificationInit__Group_2__1__Impl )
            // InternalPoST.g:1307:2: rule__SimpleSpecificationInit__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group_2__1"


    // $ANTLR start "rule__SimpleSpecificationInit__Group_2__1__Impl"
    // InternalPoST.g:1313:1: rule__SimpleSpecificationInit__Group_2__1__Impl : ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1317:1: ( ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) )
            // InternalPoST.g:1318:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            {
            // InternalPoST.g:1318:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            // InternalPoST.g:1319:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getValueAssignment_2_1()); 
            // InternalPoST.g:1320:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            // InternalPoST.g:1320:3: rule__SimpleSpecificationInit__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleSpecificationInit__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleSpecificationInitAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__Group_2__1__Impl"


    // $ANTLR start "rule__Constant__Group_2__0"
    // InternalPoST.g:1329:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1333:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalPoST.g:1334:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Constant__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0"


    // $ANTLR start "rule__Constant__Group_2__0__Impl"
    // InternalPoST.g:1341:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1345:1: ( ( () ) )
            // InternalPoST.g:1346:1: ( () )
            {
            // InternalPoST.g:1346:1: ( () )
            // InternalPoST.g:1347:2: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_2_0()); 
            // InternalPoST.g:1348:2: ()
            // InternalPoST.g:1348:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__0__Impl"


    // $ANTLR start "rule__Constant__Group_2__1"
    // InternalPoST.g:1356:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1360:1: ( rule__Constant__Group_2__1__Impl )
            // InternalPoST.g:1361:2: rule__Constant__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1"


    // $ANTLR start "rule__Constant__Group_2__1__Impl"
    // InternalPoST.g:1367:1: rule__Constant__Group_2__1__Impl : ( RULE_BOOLEAN_LITERAL ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1371:1: ( ( RULE_BOOLEAN_LITERAL ) )
            // InternalPoST.g:1372:1: ( RULE_BOOLEAN_LITERAL )
            {
            // InternalPoST.g:1372:1: ( RULE_BOOLEAN_LITERAL )
            // InternalPoST.g:1373:2: RULE_BOOLEAN_LITERAL
            {
             before(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_2_1()); 
            match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_2__1__Impl"


    // $ANTLR start "rule__SignedInteger__Group__0"
    // InternalPoST.g:1383:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1387:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalPoST.g:1388:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SignedInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__0"


    // $ANTLR start "rule__SignedInteger__Group__0__Impl"
    // InternalPoST.g:1395:1: rule__SignedInteger__Group__0__Impl : ( ( rule__SignedInteger__SigAssignment_0 )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1399:1: ( ( ( rule__SignedInteger__SigAssignment_0 )? ) )
            // InternalPoST.g:1400:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            {
            // InternalPoST.g:1400:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            // InternalPoST.g:1401:2: ( rule__SignedInteger__SigAssignment_0 )?
            {
             before(grammarAccess.getSignedIntegerAccess().getSigAssignment_0()); 
            // InternalPoST.g:1402:2: ( rule__SignedInteger__SigAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==36) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPoST.g:1402:3: rule__SignedInteger__SigAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SignedInteger__SigAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSignedIntegerAccess().getSigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__0__Impl"


    // $ANTLR start "rule__SignedInteger__Group__1"
    // InternalPoST.g:1410:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1414:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalPoST.g:1415:2: rule__SignedInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SignedInteger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__1"


    // $ANTLR start "rule__SignedInteger__Group__1__Impl"
    // InternalPoST.g:1421:1: rule__SignedInteger__Group__1__Impl : ( ( rule__SignedInteger__ValueAssignment_1 ) ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1425:1: ( ( ( rule__SignedInteger__ValueAssignment_1 ) ) )
            // InternalPoST.g:1426:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            {
            // InternalPoST.g:1426:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            // InternalPoST.g:1427:2: ( rule__SignedInteger__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntegerAccess().getValueAssignment_1()); 
            // InternalPoST.g:1428:2: ( rule__SignedInteger__ValueAssignment_1 )
            // InternalPoST.g:1428:3: rule__SignedInteger__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SignedInteger__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignedIntegerAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__Group__1__Impl"


    // $ANTLR start "rule__IntegerLiteral__Group__0"
    // InternalPoST.g:1437:1: rule__IntegerLiteral__Group__0 : rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 ;
    public final void rule__IntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1441:1: ( rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 )
            // InternalPoST.g:1442:2: rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__IntegerLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group__0"


    // $ANTLR start "rule__IntegerLiteral__Group__0__Impl"
    // InternalPoST.g:1449:1: rule__IntegerLiteral__Group__0__Impl : ( ( rule__IntegerLiteral__Group_0__0 )? ) ;
    public final void rule__IntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1453:1: ( ( ( rule__IntegerLiteral__Group_0__0 )? ) )
            // InternalPoST.g:1454:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:1454:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            // InternalPoST.g:1455:2: ( rule__IntegerLiteral__Group_0__0 )?
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup_0()); 
            // InternalPoST.g:1456:2: ( rule__IntegerLiteral__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA11_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPoST.g:1456:3: rule__IntegerLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntegerLiteral__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntegerLiteralAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group__0__Impl"


    // $ANTLR start "rule__IntegerLiteral__Group__1"
    // InternalPoST.g:1464:1: rule__IntegerLiteral__Group__1 : rule__IntegerLiteral__Group__1__Impl ;
    public final void rule__IntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1468:1: ( rule__IntegerLiteral__Group__1__Impl )
            // InternalPoST.g:1469:2: rule__IntegerLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group__1"


    // $ANTLR start "rule__IntegerLiteral__Group__1__Impl"
    // InternalPoST.g:1475:1: rule__IntegerLiteral__Group__1__Impl : ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__IntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1479:1: ( ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) )
            // InternalPoST.g:1480:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            {
            // InternalPoST.g:1480:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            // InternalPoST.g:1481:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); 
            // InternalPoST.g:1482:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            // InternalPoST.g:1482:3: rule__IntegerLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group__1__Impl"


    // $ANTLR start "rule__IntegerLiteral__Group_0__0"
    // InternalPoST.g:1491:1: rule__IntegerLiteral__Group_0__0 : rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 ;
    public final void rule__IntegerLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1495:1: ( rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 )
            // InternalPoST.g:1496:2: rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__IntegerLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group_0__0"


    // $ANTLR start "rule__IntegerLiteral__Group_0__0__Impl"
    // InternalPoST.g:1503:1: rule__IntegerLiteral__Group_0__0__Impl : ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__IntegerLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1507:1: ( ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:1508:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:1508:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:1509:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:1510:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:1510:3: rule__IntegerLiteral__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerLiteralAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__IntegerLiteral__Group_0__1"
    // InternalPoST.g:1518:1: rule__IntegerLiteral__Group_0__1 : rule__IntegerLiteral__Group_0__1__Impl ;
    public final void rule__IntegerLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1522:1: ( rule__IntegerLiteral__Group_0__1__Impl )
            // InternalPoST.g:1523:2: rule__IntegerLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntegerLiteral__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group_0__1"


    // $ANTLR start "rule__IntegerLiteral__Group_0__1__Impl"
    // InternalPoST.g:1529:1: rule__IntegerLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__IntegerLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1533:1: ( ( '#' ) )
            // InternalPoST.g:1534:1: ( '#' )
            {
            // InternalPoST.g:1534:1: ( '#' )
            // InternalPoST.g:1535:2: '#'
            {
             before(grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__RealLiteral__Group__0"
    // InternalPoST.g:1545:1: rule__RealLiteral__Group__0 : rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 ;
    public final void rule__RealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1549:1: ( rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 )
            // InternalPoST.g:1550:2: rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RealLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__0"


    // $ANTLR start "rule__RealLiteral__Group__0__Impl"
    // InternalPoST.g:1557:1: rule__RealLiteral__Group__0__Impl : ( ( rule__RealLiteral__Group_0__0 )? ) ;
    public final void rule__RealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1561:1: ( ( ( rule__RealLiteral__Group_0__0 )? ) )
            // InternalPoST.g:1562:1: ( ( rule__RealLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:1562:1: ( ( rule__RealLiteral__Group_0__0 )? )
            // InternalPoST.g:1563:2: ( rule__RealLiteral__Group_0__0 )?
            {
             before(grammarAccess.getRealLiteralAccess().getGroup_0()); 
            // InternalPoST.g:1564:2: ( rule__RealLiteral__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_REAL_TYPE_NAME) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalPoST.g:1564:3: rule__RealLiteral__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RealLiteral__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealLiteralAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__0__Impl"


    // $ANTLR start "rule__RealLiteral__Group__1"
    // InternalPoST.g:1572:1: rule__RealLiteral__Group__1 : rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 ;
    public final void rule__RealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1576:1: ( rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 )
            // InternalPoST.g:1577:2: rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__RealLiteral__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__1"


    // $ANTLR start "rule__RealLiteral__Group__1__Impl"
    // InternalPoST.g:1584:1: rule__RealLiteral__Group__1__Impl : ( ( rule__RealLiteral__DivAssignment_1 ) ) ;
    public final void rule__RealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1588:1: ( ( ( rule__RealLiteral__DivAssignment_1 ) ) )
            // InternalPoST.g:1589:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            {
            // InternalPoST.g:1589:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            // InternalPoST.g:1590:2: ( rule__RealLiteral__DivAssignment_1 )
            {
             before(grammarAccess.getRealLiteralAccess().getDivAssignment_1()); 
            // InternalPoST.g:1591:2: ( rule__RealLiteral__DivAssignment_1 )
            // InternalPoST.g:1591:3: rule__RealLiteral__DivAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__DivAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getDivAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__1__Impl"


    // $ANTLR start "rule__RealLiteral__Group__2"
    // InternalPoST.g:1599:1: rule__RealLiteral__Group__2 : rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 ;
    public final void rule__RealLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1603:1: ( rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 )
            // InternalPoST.g:1604:2: rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__RealLiteral__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__2"


    // $ANTLR start "rule__RealLiteral__Group__2__Impl"
    // InternalPoST.g:1611:1: rule__RealLiteral__Group__2__Impl : ( '.' ) ;
    public final void rule__RealLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1615:1: ( ( '.' ) )
            // InternalPoST.g:1616:1: ( '.' )
            {
            // InternalPoST.g:1616:1: ( '.' )
            // InternalPoST.g:1617:2: '.'
            {
             before(grammarAccess.getRealLiteralAccess().getFullStopKeyword_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRealLiteralAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__2__Impl"


    // $ANTLR start "rule__RealLiteral__Group__3"
    // InternalPoST.g:1626:1: rule__RealLiteral__Group__3 : rule__RealLiteral__Group__3__Impl ;
    public final void rule__RealLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1630:1: ( rule__RealLiteral__Group__3__Impl )
            // InternalPoST.g:1631:2: rule__RealLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__3"


    // $ANTLR start "rule__RealLiteral__Group__3__Impl"
    // InternalPoST.g:1637:1: rule__RealLiteral__Group__3__Impl : ( ( rule__RealLiteral__ModAssignment_3 ) ) ;
    public final void rule__RealLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1641:1: ( ( ( rule__RealLiteral__ModAssignment_3 ) ) )
            // InternalPoST.g:1642:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            {
            // InternalPoST.g:1642:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            // InternalPoST.g:1643:2: ( rule__RealLiteral__ModAssignment_3 )
            {
             before(grammarAccess.getRealLiteralAccess().getModAssignment_3()); 
            // InternalPoST.g:1644:2: ( rule__RealLiteral__ModAssignment_3 )
            // InternalPoST.g:1644:3: rule__RealLiteral__ModAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__ModAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getModAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group__3__Impl"


    // $ANTLR start "rule__RealLiteral__Group_0__0"
    // InternalPoST.g:1653:1: rule__RealLiteral__Group_0__0 : rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 ;
    public final void rule__RealLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1657:1: ( rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 )
            // InternalPoST.g:1658:2: rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1
            {
            pushFollow(FOLLOW_12);
            rule__RealLiteral__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group_0__0"


    // $ANTLR start "rule__RealLiteral__Group_0__0__Impl"
    // InternalPoST.g:1665:1: rule__RealLiteral__Group_0__0__Impl : ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__RealLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1669:1: ( ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:1670:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:1670:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:1671:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getRealLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:1672:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:1672:3: rule__RealLiteral__TypeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__TypeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRealLiteralAccess().getTypeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group_0__0__Impl"


    // $ANTLR start "rule__RealLiteral__Group_0__1"
    // InternalPoST.g:1680:1: rule__RealLiteral__Group_0__1 : rule__RealLiteral__Group_0__1__Impl ;
    public final void rule__RealLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1684:1: ( rule__RealLiteral__Group_0__1__Impl )
            // InternalPoST.g:1685:2: rule__RealLiteral__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RealLiteral__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group_0__1"


    // $ANTLR start "rule__RealLiteral__Group_0__1__Impl"
    // InternalPoST.g:1691:1: rule__RealLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__RealLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1695:1: ( ( '#' ) )
            // InternalPoST.g:1696:1: ( '#' )
            {
            // InternalPoST.g:1696:1: ( '#' )
            // InternalPoST.g:1697:2: '#'
            {
             before(grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__Group_0__1__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalPoST.g:1707:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1711:1: ( ( ruleGreeting ) )
            // InternalPoST.g:1712:2: ( ruleGreeting )
            {
            // InternalPoST.g:1712:2: ( ruleGreeting )
            // InternalPoST.g:1713:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalPoST.g:1722:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1726:1: ( ( RULE_ID ) )
            // InternalPoST.g:1727:2: ( RULE_ID )
            {
            // InternalPoST.g:1727:2: ( RULE_ID )
            // InternalPoST.g:1728:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Greeting__NameAssignment_1"


    // $ANTLR start "rule__SymbolicVariable__NameAssignment"
    // InternalPoST.g:1737:1: rule__SymbolicVariable__NameAssignment : ( RULE_ID ) ;
    public final void rule__SymbolicVariable__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1741:1: ( ( RULE_ID ) )
            // InternalPoST.g:1742:2: ( RULE_ID )
            {
            // InternalPoST.g:1742:2: ( RULE_ID )
            // InternalPoST.g:1743:3: RULE_ID
            {
             before(grammarAccess.getSymbolicVariableAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSymbolicVariableAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SymbolicVariable__NameAssignment"


    // $ANTLR start "rule__VarInitDeclaration__VarListAssignment_0"
    // InternalPoST.g:1752:1: rule__VarInitDeclaration__VarListAssignment_0 : ( ruleVarList ) ;
    public final void rule__VarInitDeclaration__VarListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1756:1: ( ( ruleVarList ) )
            // InternalPoST.g:1757:2: ( ruleVarList )
            {
            // InternalPoST.g:1757:2: ( ruleVarList )
            // InternalPoST.g:1758:3: ruleVarList
            {
             before(grammarAccess.getVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__VarListAssignment_0"


    // $ANTLR start "rule__VarInitDeclaration__SpecAssignment_2"
    // InternalPoST.g:1767:1: rule__VarInitDeclaration__SpecAssignment_2 : ( ruleSimpleSpecificationInit ) ;
    public final void rule__VarInitDeclaration__SpecAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1771:1: ( ( ruleSimpleSpecificationInit ) )
            // InternalPoST.g:1772:2: ( ruleSimpleSpecificationInit )
            {
            // InternalPoST.g:1772:2: ( ruleSimpleSpecificationInit )
            // InternalPoST.g:1773:3: ruleSimpleSpecificationInit
            {
             before(grammarAccess.getVarInitDeclarationAccess().getSpecSimpleSpecificationInitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleSpecificationInit();

            state._fsp--;

             after(grammarAccess.getVarInitDeclarationAccess().getSpecSimpleSpecificationInitParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarInitDeclaration__SpecAssignment_2"


    // $ANTLR start "rule__VarList__VarsAssignment_0"
    // InternalPoST.g:1782:1: rule__VarList__VarsAssignment_0 : ( ruleSymbolicVariable ) ;
    public final void rule__VarList__VarsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1786:1: ( ( ruleSymbolicVariable ) )
            // InternalPoST.g:1787:2: ( ruleSymbolicVariable )
            {
            // InternalPoST.g:1787:2: ( ruleSymbolicVariable )
            // InternalPoST.g:1788:3: ruleSymbolicVariable
            {
             before(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbolicVariable();

            state._fsp--;

             after(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__VarsAssignment_0"


    // $ANTLR start "rule__VarList__VarsAssignment_1_1"
    // InternalPoST.g:1797:1: rule__VarList__VarsAssignment_1_1 : ( ruleSymbolicVariable ) ;
    public final void rule__VarList__VarsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1801:1: ( ( ruleSymbolicVariable ) )
            // InternalPoST.g:1802:2: ( ruleSymbolicVariable )
            {
            // InternalPoST.g:1802:2: ( ruleSymbolicVariable )
            // InternalPoST.g:1803:3: ruleSymbolicVariable
            {
             before(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSymbolicVariable();

            state._fsp--;

             after(grammarAccess.getVarListAccess().getVarsSymbolicVariableParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarList__VarsAssignment_1_1"


    // $ANTLR start "rule__ExternalVarInitDeclaration__VarListAssignment_0"
    // InternalPoST.g:1812:1: rule__ExternalVarInitDeclaration__VarListAssignment_0 : ( ruleVarList ) ;
    public final void rule__ExternalVarInitDeclaration__VarListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1816:1: ( ( ruleVarList ) )
            // InternalPoST.g:1817:2: ( ruleVarList )
            {
            // InternalPoST.g:1817:2: ( ruleVarList )
            // InternalPoST.g:1818:3: ruleVarList
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getExternalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__VarListAssignment_0"


    // $ANTLR start "rule__ExternalVarInitDeclaration__TypeAssignment_2"
    // InternalPoST.g:1827:1: rule__ExternalVarInitDeclaration__TypeAssignment_2 : ( ruleDataTypeName ) ;
    public final void rule__ExternalVarInitDeclaration__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1831:1: ( ( ruleDataTypeName ) )
            // InternalPoST.g:1832:2: ( ruleDataTypeName )
            {
            // InternalPoST.g:1832:2: ( ruleDataTypeName )
            // InternalPoST.g:1833:3: ruleDataTypeName
            {
             before(grammarAccess.getExternalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeName();

            state._fsp--;

             after(grammarAccess.getExternalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalVarInitDeclaration__TypeAssignment_2"


    // $ANTLR start "rule__GlobalVarInitDeclaration__VarListAssignment_0"
    // InternalPoST.g:1842:1: rule__GlobalVarInitDeclaration__VarListAssignment_0 : ( ruleVarList ) ;
    public final void rule__GlobalVarInitDeclaration__VarListAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1846:1: ( ( ruleVarList ) )
            // InternalPoST.g:1847:2: ( ruleVarList )
            {
            // InternalPoST.g:1847:2: ( ruleVarList )
            // InternalPoST.g:1848:3: ruleVarList
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVarList();

            state._fsp--;

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getVarListVarListParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__VarListAssignment_0"


    // $ANTLR start "rule__GlobalVarInitDeclaration__LocationAssignment_2"
    // InternalPoST.g:1857:1: rule__GlobalVarInitDeclaration__LocationAssignment_2 : ( RULE_DIRECT_VARIABLE ) ;
    public final void rule__GlobalVarInitDeclaration__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1861:1: ( ( RULE_DIRECT_VARIABLE ) )
            // InternalPoST.g:1862:2: ( RULE_DIRECT_VARIABLE )
            {
            // InternalPoST.g:1862:2: ( RULE_DIRECT_VARIABLE )
            // InternalPoST.g:1863:3: RULE_DIRECT_VARIABLE
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_2_0()); 
            match(input,RULE_DIRECT_VARIABLE,FOLLOW_2); 
             after(grammarAccess.getGlobalVarInitDeclarationAccess().getLocationDIRECT_VARIABLETerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__LocationAssignment_2"


    // $ANTLR start "rule__GlobalVarInitDeclaration__TypeAssignment_4"
    // InternalPoST.g:1872:1: rule__GlobalVarInitDeclaration__TypeAssignment_4 : ( ruleDataTypeName ) ;
    public final void rule__GlobalVarInitDeclaration__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1876:1: ( ( ruleDataTypeName ) )
            // InternalPoST.g:1877:2: ( ruleDataTypeName )
            {
            // InternalPoST.g:1877:2: ( ruleDataTypeName )
            // InternalPoST.g:1878:3: ruleDataTypeName
            {
             before(grammarAccess.getGlobalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeName();

            state._fsp--;

             after(grammarAccess.getGlobalVarInitDeclarationAccess().getTypeDataTypeNameParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GlobalVarInitDeclaration__TypeAssignment_4"


    // $ANTLR start "rule__TimeLiteral__IntervalAssignment_3"
    // InternalPoST.g:1887:1: rule__TimeLiteral__IntervalAssignment_3 : ( RULE_INTERVAL ) ;
    public final void rule__TimeLiteral__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1891:1: ( ( RULE_INTERVAL ) )
            // InternalPoST.g:1892:2: ( RULE_INTERVAL )
            {
            // InternalPoST.g:1892:2: ( RULE_INTERVAL )
            // InternalPoST.g:1893:3: RULE_INTERVAL
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_3_0()); 
            match(input,RULE_INTERVAL,FOLLOW_2); 
             after(grammarAccess.getTimeLiteralAccess().getIntervalINTERVALTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeLiteral__IntervalAssignment_3"


    // $ANTLR start "rule__SimpleSpecificationInit__TypeAssignment_1"
    // InternalPoST.g:1902:1: rule__SimpleSpecificationInit__TypeAssignment_1 : ( ruleDataTypeName ) ;
    public final void rule__SimpleSpecificationInit__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1906:1: ( ( ruleDataTypeName ) )
            // InternalPoST.g:1907:2: ( ruleDataTypeName )
            {
            // InternalPoST.g:1907:2: ( ruleDataTypeName )
            // InternalPoST.g:1908:3: ruleDataTypeName
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getTypeDataTypeNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataTypeName();

            state._fsp--;

             after(grammarAccess.getSimpleSpecificationInitAccess().getTypeDataTypeNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__TypeAssignment_1"


    // $ANTLR start "rule__SimpleSpecificationInit__ValueAssignment_2_1"
    // InternalPoST.g:1917:1: rule__SimpleSpecificationInit__ValueAssignment_2_1 : ( ruleConstant ) ;
    public final void rule__SimpleSpecificationInit__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1921:1: ( ( ruleConstant ) )
            // InternalPoST.g:1922:2: ( ruleConstant )
            {
            // InternalPoST.g:1922:2: ( ruleConstant )
            // InternalPoST.g:1923:3: ruleConstant
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getValueConstantParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getSimpleSpecificationInitAccess().getValueConstantParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleSpecificationInit__ValueAssignment_2_1"


    // $ANTLR start "rule__SignedInteger__SigAssignment_0"
    // InternalPoST.g:1932:1: rule__SignedInteger__SigAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInteger__SigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1936:1: ( ( ( '-' ) ) )
            // InternalPoST.g:1937:2: ( ( '-' ) )
            {
            // InternalPoST.g:1937:2: ( ( '-' ) )
            // InternalPoST.g:1938:3: ( '-' )
            {
             before(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 
            // InternalPoST.g:1939:3: ( '-' )
            // InternalPoST.g:1940:4: '-'
            {
             before(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__SigAssignment_0"


    // $ANTLR start "rule__SignedInteger__ValueAssignment_1"
    // InternalPoST.g:1951:1: rule__SignedInteger__ValueAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__SignedInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1955:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:1956:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:1956:2: ( RULE_INTEGER )
            // InternalPoST.g:1957:3: RULE_INTEGER
            {
             before(grammarAccess.getSignedIntegerAccess().getValueINTEGERTerminalRuleCall_1_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getSignedIntegerAccess().getValueINTEGERTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignedInteger__ValueAssignment_1"


    // $ANTLR start "rule__IntegerLiteral__TypeAssignment_0_0"
    // InternalPoST.g:1966:1: rule__IntegerLiteral__TypeAssignment_0_0 : ( ruleIntegerTypeName ) ;
    public final void rule__IntegerLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1970:1: ( ( ruleIntegerTypeName ) )
            // InternalPoST.g:1971:2: ( ruleIntegerTypeName )
            {
            // InternalPoST.g:1971:2: ( ruleIntegerTypeName )
            // InternalPoST.g:1972:3: ruleIntegerTypeName
            {
             before(grammarAccess.getIntegerLiteralAccess().getTypeIntegerTypeNameParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntegerTypeName();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralAccess().getTypeIntegerTypeNameParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__TypeAssignment_0_0"


    // $ANTLR start "rule__IntegerLiteral__ValueAssignment_1"
    // InternalPoST.g:1981:1: rule__IntegerLiteral__ValueAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__IntegerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1985:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:1986:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:1986:2: ( ruleSignedInteger )
            // InternalPoST.g:1987:3: ruleSignedInteger
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueSignedIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignedInteger();

            state._fsp--;

             after(grammarAccess.getIntegerLiteralAccess().getValueSignedIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerLiteral__ValueAssignment_1"


    // $ANTLR start "rule__RealLiteral__TypeAssignment_0_0"
    // InternalPoST.g:1996:1: rule__RealLiteral__TypeAssignment_0_0 : ( RULE_REAL_TYPE_NAME ) ;
    public final void rule__RealLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:2000:1: ( ( RULE_REAL_TYPE_NAME ) )
            // InternalPoST.g:2001:2: ( RULE_REAL_TYPE_NAME )
            {
            // InternalPoST.g:2001:2: ( RULE_REAL_TYPE_NAME )
            // InternalPoST.g:2002:3: RULE_REAL_TYPE_NAME
            {
             before(grammarAccess.getRealLiteralAccess().getTypeREAL_TYPE_NAMETerminalRuleCall_0_0_0()); 
            match(input,RULE_REAL_TYPE_NAME,FOLLOW_2); 
             after(grammarAccess.getRealLiteralAccess().getTypeREAL_TYPE_NAMETerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__TypeAssignment_0_0"


    // $ANTLR start "rule__RealLiteral__DivAssignment_1"
    // InternalPoST.g:2011:1: rule__RealLiteral__DivAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__RealLiteral__DivAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:2015:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:2016:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:2016:2: ( ruleSignedInteger )
            // InternalPoST.g:2017:3: ruleSignedInteger
            {
             before(grammarAccess.getRealLiteralAccess().getDivSignedIntegerParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSignedInteger();

            state._fsp--;

             after(grammarAccess.getRealLiteralAccess().getDivSignedIntegerParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__DivAssignment_1"


    // $ANTLR start "rule__RealLiteral__ModAssignment_3"
    // InternalPoST.g:2026:1: rule__RealLiteral__ModAssignment_3 : ( RULE_INTEGER ) ;
    public final void rule__RealLiteral__ModAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:2030:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:2031:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:2031:2: ( RULE_INTEGER )
            // InternalPoST.g:2032:3: RULE_INTEGER
            {
             before(grammarAccess.getRealLiteralAccess().getModINTEGERTerminalRuleCall_3_0()); 
            match(input,RULE_INTEGER,FOLLOW_2); 
             after(grammarAccess.getRealLiteralAccess().getModINTEGERTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RealLiteral__ModAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000300000F0L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000010000023E0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000010000020C0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000010000020E0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});

}