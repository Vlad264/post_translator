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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BIT_STRING_TYPE_NAME", "RULE_REAL_TYPE_NAME", "RULE_SIGNED_INTEGER_TYPE_NAME", "RULE_UNSIGNED_INTEGER_TYPE_NAME", "RULE_TIME_PREF_LITERAL", "RULE_BOOLEAN_LITERAL", "RULE_ID", "RULE_INTERVAL", "RULE_INTEGER", "RULE_DIGIT", "RULE_BIT", "RULE_BINARY_INTEGER", "RULE_OCTAL_DIGIT", "RULE_OCTAL_INTEGER", "RULE_HEX_DIGIT", "RULE_HEX_INTEGER", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'WSTRING'", "'Hello'", "'!'", "'#'", "'-'", "':='", "'.'"
    };
    public static final int RULE_INTERVAL=11;
    public static final int RULE_HEX_INTEGER=19;
    public static final int RULE_BINARY_INTEGER=15;
    public static final int RULE_SL_COMMENT=22;
    public static final int RULE_BIT=14;
    public static final int RULE_SIGNED_INTEGER_TYPE_NAME=6;
    public static final int RULE_TIME_PREF_LITERAL=8;
    public static final int RULE_OCTAL_INTEGER=17;
    public static final int RULE_UNSIGNED_INTEGER_TYPE_NAME=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=16;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=10;
    public static final int RULE_REAL_TYPE_NAME=5;
    public static final int RULE_BOOLEAN_LITERAL=9;
    public static final int RULE_WS=23;
    public static final int RULE_DIGIT=13;
    public static final int RULE_ANY_OTHER=24;
    public static final int RULE_LETTER=20;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=21;
    public static final int RULE_HEX_DIGIT=18;
    public static final int T__25=25;
    public static final int RULE_INTEGER=12;
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

                if ( (LA1_0==27) ) {
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


    // $ANTLR start "entryRuleTimeLiteral"
    // InternalPoST.g:103:1: entryRuleTimeLiteral : ruleTimeLiteral EOF ;
    public final void entryRuleTimeLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:104:1: ( ruleTimeLiteral EOF )
            // InternalPoST.g:105:1: ruleTimeLiteral EOF
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
    // InternalPoST.g:112:1: ruleTimeLiteral : ( ( rule__TimeLiteral__Group__0 ) ) ;
    public final void ruleTimeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:116:2: ( ( ( rule__TimeLiteral__Group__0 ) ) )
            // InternalPoST.g:117:2: ( ( rule__TimeLiteral__Group__0 ) )
            {
            // InternalPoST.g:117:2: ( ( rule__TimeLiteral__Group__0 ) )
            // InternalPoST.g:118:3: ( rule__TimeLiteral__Group__0 )
            {
             before(grammarAccess.getTimeLiteralAccess().getGroup()); 
            // InternalPoST.g:119:3: ( rule__TimeLiteral__Group__0 )
            // InternalPoST.g:119:4: rule__TimeLiteral__Group__0
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
    // InternalPoST.g:128:1: entryRuleDataTypeName : ruleDataTypeName EOF ;
    public final void entryRuleDataTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:129:1: ( ruleDataTypeName EOF )
            // InternalPoST.g:130:1: ruleDataTypeName EOF
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
    // InternalPoST.g:137:1: ruleDataTypeName : ( ( rule__DataTypeName__Alternatives ) ) ;
    public final void ruleDataTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:141:2: ( ( ( rule__DataTypeName__Alternatives ) ) )
            // InternalPoST.g:142:2: ( ( rule__DataTypeName__Alternatives ) )
            {
            // InternalPoST.g:142:2: ( ( rule__DataTypeName__Alternatives ) )
            // InternalPoST.g:143:3: ( rule__DataTypeName__Alternatives )
            {
             before(grammarAccess.getDataTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:144:3: ( rule__DataTypeName__Alternatives )
            // InternalPoST.g:144:4: rule__DataTypeName__Alternatives
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
    // InternalPoST.g:153:1: entryRuleNumericTypeName : ruleNumericTypeName EOF ;
    public final void entryRuleNumericTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:154:1: ( ruleNumericTypeName EOF )
            // InternalPoST.g:155:1: ruleNumericTypeName EOF
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
    // InternalPoST.g:162:1: ruleNumericTypeName : ( ( rule__NumericTypeName__Alternatives ) ) ;
    public final void ruleNumericTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:166:2: ( ( ( rule__NumericTypeName__Alternatives ) ) )
            // InternalPoST.g:167:2: ( ( rule__NumericTypeName__Alternatives ) )
            {
            // InternalPoST.g:167:2: ( ( rule__NumericTypeName__Alternatives ) )
            // InternalPoST.g:168:3: ( rule__NumericTypeName__Alternatives )
            {
             before(grammarAccess.getNumericTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:169:3: ( rule__NumericTypeName__Alternatives )
            // InternalPoST.g:169:4: rule__NumericTypeName__Alternatives
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
    // InternalPoST.g:178:1: entryRuleIntegerTypeName : ruleIntegerTypeName EOF ;
    public final void entryRuleIntegerTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:179:1: ( ruleIntegerTypeName EOF )
            // InternalPoST.g:180:1: ruleIntegerTypeName EOF
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
    // InternalPoST.g:187:1: ruleIntegerTypeName : ( ( rule__IntegerTypeName__Alternatives ) ) ;
    public final void ruleIntegerTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:191:2: ( ( ( rule__IntegerTypeName__Alternatives ) ) )
            // InternalPoST.g:192:2: ( ( rule__IntegerTypeName__Alternatives ) )
            {
            // InternalPoST.g:192:2: ( ( rule__IntegerTypeName__Alternatives ) )
            // InternalPoST.g:193:3: ( rule__IntegerTypeName__Alternatives )
            {
             before(grammarAccess.getIntegerTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:194:3: ( rule__IntegerTypeName__Alternatives )
            // InternalPoST.g:194:4: rule__IntegerTypeName__Alternatives
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
    // InternalPoST.g:203:1: entryRuleSimpleSpecificationInit : ruleSimpleSpecificationInit EOF ;
    public final void entryRuleSimpleSpecificationInit() throws RecognitionException {
        try {
            // InternalPoST.g:204:1: ( ruleSimpleSpecificationInit EOF )
            // InternalPoST.g:205:1: ruleSimpleSpecificationInit EOF
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
    // InternalPoST.g:212:1: ruleSimpleSpecificationInit : ( ( rule__SimpleSpecificationInit__Group__0 ) ) ;
    public final void ruleSimpleSpecificationInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:216:2: ( ( ( rule__SimpleSpecificationInit__Group__0 ) ) )
            // InternalPoST.g:217:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            {
            // InternalPoST.g:217:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            // InternalPoST.g:218:3: ( rule__SimpleSpecificationInit__Group__0 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup()); 
            // InternalPoST.g:219:3: ( rule__SimpleSpecificationInit__Group__0 )
            // InternalPoST.g:219:4: rule__SimpleSpecificationInit__Group__0
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
    // InternalPoST.g:228:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalPoST.g:229:1: ( ruleConstant EOF )
            // InternalPoST.g:230:1: ruleConstant EOF
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
    // InternalPoST.g:237:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:241:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPoST.g:242:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPoST.g:242:2: ( ( rule__Constant__Alternatives ) )
            // InternalPoST.g:243:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPoST.g:244:3: ( rule__Constant__Alternatives )
            // InternalPoST.g:244:4: rule__Constant__Alternatives
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
    // InternalPoST.g:253:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
        try {
            // InternalPoST.g:254:1: ( ruleSignedInteger EOF )
            // InternalPoST.g:255:1: ruleSignedInteger EOF
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
    // InternalPoST.g:262:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:266:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // InternalPoST.g:267:2: ( ( rule__SignedInteger__Group__0 ) )
            {
            // InternalPoST.g:267:2: ( ( rule__SignedInteger__Group__0 ) )
            // InternalPoST.g:268:3: ( rule__SignedInteger__Group__0 )
            {
             before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            // InternalPoST.g:269:3: ( rule__SignedInteger__Group__0 )
            // InternalPoST.g:269:4: rule__SignedInteger__Group__0
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
    // InternalPoST.g:278:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:279:1: ( ruleNumericLiteral EOF )
            // InternalPoST.g:280:1: ruleNumericLiteral EOF
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
    // InternalPoST.g:287:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:291:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPoST.g:292:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPoST.g:292:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPoST.g:293:3: ( rule__NumericLiteral__Alternatives )
            {
             before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            // InternalPoST.g:294:3: ( rule__NumericLiteral__Alternatives )
            // InternalPoST.g:294:4: rule__NumericLiteral__Alternatives
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
    // InternalPoST.g:303:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:304:1: ( ruleIntegerLiteral EOF )
            // InternalPoST.g:305:1: ruleIntegerLiteral EOF
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
    // InternalPoST.g:312:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__Group__0 ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:316:2: ( ( ( rule__IntegerLiteral__Group__0 ) ) )
            // InternalPoST.g:317:2: ( ( rule__IntegerLiteral__Group__0 ) )
            {
            // InternalPoST.g:317:2: ( ( rule__IntegerLiteral__Group__0 ) )
            // InternalPoST.g:318:3: ( rule__IntegerLiteral__Group__0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup()); 
            // InternalPoST.g:319:3: ( rule__IntegerLiteral__Group__0 )
            // InternalPoST.g:319:4: rule__IntegerLiteral__Group__0
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
    // InternalPoST.g:328:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:329:1: ( ruleRealLiteral EOF )
            // InternalPoST.g:330:1: ruleRealLiteral EOF
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
    // InternalPoST.g:337:1: ruleRealLiteral : ( ( rule__RealLiteral__Group__0 ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:341:2: ( ( ( rule__RealLiteral__Group__0 ) ) )
            // InternalPoST.g:342:2: ( ( rule__RealLiteral__Group__0 ) )
            {
            // InternalPoST.g:342:2: ( ( rule__RealLiteral__Group__0 ) )
            // InternalPoST.g:343:3: ( rule__RealLiteral__Group__0 )
            {
             before(grammarAccess.getRealLiteralAccess().getGroup()); 
            // InternalPoST.g:344:3: ( rule__RealLiteral__Group__0 )
            // InternalPoST.g:344:4: rule__RealLiteral__Group__0
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
    // InternalPoST.g:352:1: rule__DataTypeName__Alternatives : ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) );
    public final void rule__DataTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:356:1: ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) )
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
            case 25:
                {
                alt2=3;
                }
                break;
            case 26:
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
                    // InternalPoST.g:357:2: ( ruleNumericTypeName )
                    {
                    // InternalPoST.g:357:2: ( ruleNumericTypeName )
                    // InternalPoST.g:358:3: ruleNumericTypeName
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
                    // InternalPoST.g:363:2: ( RULE_BIT_STRING_TYPE_NAME )
                    {
                    // InternalPoST.g:363:2: ( RULE_BIT_STRING_TYPE_NAME )
                    // InternalPoST.g:364:3: RULE_BIT_STRING_TYPE_NAME
                    {
                     before(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 
                    match(input,RULE_BIT_STRING_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:369:2: ( 'STRING' )
                    {
                    // InternalPoST.g:369:2: ( 'STRING' )
                    // InternalPoST.g:370:3: 'STRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:375:2: ( 'WSTRING' )
                    {
                    // InternalPoST.g:375:2: ( 'WSTRING' )
                    // InternalPoST.g:376:3: 'WSTRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3()); 
                    match(input,26,FOLLOW_2); 
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
    // InternalPoST.g:385:1: rule__NumericTypeName__Alternatives : ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) );
    public final void rule__NumericTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:389:1: ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) )
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
                    // InternalPoST.g:390:2: ( ruleIntegerTypeName )
                    {
                    // InternalPoST.g:390:2: ( ruleIntegerTypeName )
                    // InternalPoST.g:391:3: ruleIntegerTypeName
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
                    // InternalPoST.g:396:2: ( RULE_REAL_TYPE_NAME )
                    {
                    // InternalPoST.g:396:2: ( RULE_REAL_TYPE_NAME )
                    // InternalPoST.g:397:3: RULE_REAL_TYPE_NAME
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
    // InternalPoST.g:406:1: rule__IntegerTypeName__Alternatives : ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) );
    public final void rule__IntegerTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:410:1: ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) )
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
                    // InternalPoST.g:411:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:411:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:412:3: RULE_SIGNED_INTEGER_TYPE_NAME
                    {
                     before(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 
                    match(input,RULE_SIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:417:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:417:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:418:3: RULE_UNSIGNED_INTEGER_TYPE_NAME
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
    // InternalPoST.g:427:1: rule__Constant__Alternatives : ( ( ruleNumericLiteral ) | ( ruleTimeLiteral ) | ( ( rule__Constant__Group_2__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:431:1: ( ( ruleNumericLiteral ) | ( ruleTimeLiteral ) | ( ( rule__Constant__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_REAL_TYPE_NAME:
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
            case RULE_INTEGER:
            case 30:
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
                    // InternalPoST.g:432:2: ( ruleNumericLiteral )
                    {
                    // InternalPoST.g:432:2: ( ruleNumericLiteral )
                    // InternalPoST.g:433:3: ruleNumericLiteral
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
                    // InternalPoST.g:438:2: ( ruleTimeLiteral )
                    {
                    // InternalPoST.g:438:2: ( ruleTimeLiteral )
                    // InternalPoST.g:439:3: ruleTimeLiteral
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
                    // InternalPoST.g:444:2: ( ( rule__Constant__Group_2__0 ) )
                    {
                    // InternalPoST.g:444:2: ( ( rule__Constant__Group_2__0 ) )
                    // InternalPoST.g:445:3: ( rule__Constant__Group_2__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_2()); 
                    // InternalPoST.g:446:3: ( rule__Constant__Group_2__0 )
                    // InternalPoST.g:446:4: rule__Constant__Group_2__0
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
    // InternalPoST.g:454:1: rule__NumericLiteral__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:458:1: ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case RULE_SIGNED_INTEGER_TYPE_NAME:
            case RULE_UNSIGNED_INTEGER_TYPE_NAME:
                {
                alt6=1;
                }
                break;
            case 30:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_INTEGER) ) {
                    int LA6_3 = input.LA(3);

                    if ( (LA6_3==32) ) {
                        alt6=2;
                    }
                    else if ( (LA6_3==EOF) ) {
                        alt6=1;
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

                if ( (LA6_3==32) ) {
                    alt6=2;
                }
                else if ( (LA6_3==EOF) ) {
                    alt6=1;
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
                    // InternalPoST.g:459:2: ( ruleIntegerLiteral )
                    {
                    // InternalPoST.g:459:2: ( ruleIntegerLiteral )
                    // InternalPoST.g:460:3: ruleIntegerLiteral
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
                    // InternalPoST.g:465:2: ( ruleRealLiteral )
                    {
                    // InternalPoST.g:465:2: ( ruleRealLiteral )
                    // InternalPoST.g:466:3: ruleRealLiteral
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
    // InternalPoST.g:475:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:479:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalPoST.g:480:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
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
    // InternalPoST.g:487:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:491:1: ( ( 'Hello' ) )
            // InternalPoST.g:492:1: ( 'Hello' )
            {
            // InternalPoST.g:492:1: ( 'Hello' )
            // InternalPoST.g:493:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPoST.g:502:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:506:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalPoST.g:507:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
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
    // InternalPoST.g:514:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:518:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalPoST.g:519:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalPoST.g:519:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalPoST.g:520:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalPoST.g:521:2: ( rule__Greeting__NameAssignment_1 )
            // InternalPoST.g:521:3: rule__Greeting__NameAssignment_1
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
    // InternalPoST.g:529:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:533:1: ( rule__Greeting__Group__2__Impl )
            // InternalPoST.g:534:2: rule__Greeting__Group__2__Impl
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
    // InternalPoST.g:540:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:544:1: ( ( '!' ) )
            // InternalPoST.g:545:1: ( '!' )
            {
            // InternalPoST.g:545:1: ( '!' )
            // InternalPoST.g:546:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,28,FOLLOW_2); 
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


    // $ANTLR start "rule__TimeLiteral__Group__0"
    // InternalPoST.g:556:1: rule__TimeLiteral__Group__0 : rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 ;
    public final void rule__TimeLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:560:1: ( rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1 )
            // InternalPoST.g:561:2: rule__TimeLiteral__Group__0__Impl rule__TimeLiteral__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPoST.g:568:1: rule__TimeLiteral__Group__0__Impl : ( RULE_TIME_PREF_LITERAL ) ;
    public final void rule__TimeLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:572:1: ( ( RULE_TIME_PREF_LITERAL ) )
            // InternalPoST.g:573:1: ( RULE_TIME_PREF_LITERAL )
            {
            // InternalPoST.g:573:1: ( RULE_TIME_PREF_LITERAL )
            // InternalPoST.g:574:2: RULE_TIME_PREF_LITERAL
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
    // InternalPoST.g:583:1: rule__TimeLiteral__Group__1 : rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2 ;
    public final void rule__TimeLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:587:1: ( rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2 )
            // InternalPoST.g:588:2: rule__TimeLiteral__Group__1__Impl rule__TimeLiteral__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPoST.g:595:1: rule__TimeLiteral__Group__1__Impl : ( '#' ) ;
    public final void rule__TimeLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:599:1: ( ( '#' ) )
            // InternalPoST.g:600:1: ( '#' )
            {
            // InternalPoST.g:600:1: ( '#' )
            // InternalPoST.g:601:2: '#'
            {
             before(grammarAccess.getTimeLiteralAccess().getNumberSignKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPoST.g:610:1: rule__TimeLiteral__Group__2 : rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3 ;
    public final void rule__TimeLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:614:1: ( rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3 )
            // InternalPoST.g:615:2: rule__TimeLiteral__Group__2__Impl rule__TimeLiteral__Group__3
            {
            pushFollow(FOLLOW_7);
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
    // InternalPoST.g:622:1: rule__TimeLiteral__Group__2__Impl : ( ( '-' )? ) ;
    public final void rule__TimeLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:626:1: ( ( ( '-' )? ) )
            // InternalPoST.g:627:1: ( ( '-' )? )
            {
            // InternalPoST.g:627:1: ( ( '-' )? )
            // InternalPoST.g:628:2: ( '-' )?
            {
             before(grammarAccess.getTimeLiteralAccess().getHyphenMinusKeyword_2()); 
            // InternalPoST.g:629:2: ( '-' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPoST.g:629:3: '-'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalPoST.g:637:1: rule__TimeLiteral__Group__3 : rule__TimeLiteral__Group__3__Impl ;
    public final void rule__TimeLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:641:1: ( rule__TimeLiteral__Group__3__Impl )
            // InternalPoST.g:642:2: rule__TimeLiteral__Group__3__Impl
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
    // InternalPoST.g:648:1: rule__TimeLiteral__Group__3__Impl : ( ( rule__TimeLiteral__IntervalAssignment_3 ) ) ;
    public final void rule__TimeLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:652:1: ( ( ( rule__TimeLiteral__IntervalAssignment_3 ) ) )
            // InternalPoST.g:653:1: ( ( rule__TimeLiteral__IntervalAssignment_3 ) )
            {
            // InternalPoST.g:653:1: ( ( rule__TimeLiteral__IntervalAssignment_3 ) )
            // InternalPoST.g:654:2: ( rule__TimeLiteral__IntervalAssignment_3 )
            {
             before(grammarAccess.getTimeLiteralAccess().getIntervalAssignment_3()); 
            // InternalPoST.g:655:2: ( rule__TimeLiteral__IntervalAssignment_3 )
            // InternalPoST.g:655:3: rule__TimeLiteral__IntervalAssignment_3
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
    // InternalPoST.g:664:1: rule__SimpleSpecificationInit__Group__0 : rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 ;
    public final void rule__SimpleSpecificationInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:668:1: ( rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 )
            // InternalPoST.g:669:2: rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPoST.g:676:1: rule__SimpleSpecificationInit__Group__0__Impl : ( () ) ;
    public final void rule__SimpleSpecificationInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:680:1: ( ( () ) )
            // InternalPoST.g:681:1: ( () )
            {
            // InternalPoST.g:681:1: ( () )
            // InternalPoST.g:682:2: ()
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0()); 
            // InternalPoST.g:683:2: ()
            // InternalPoST.g:683:3: 
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
    // InternalPoST.g:691:1: rule__SimpleSpecificationInit__Group__1 : rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 ;
    public final void rule__SimpleSpecificationInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:695:1: ( rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 )
            // InternalPoST.g:696:2: rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2
            {
            pushFollow(FOLLOW_9);
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
    // InternalPoST.g:703:1: rule__SimpleSpecificationInit__Group__1__Impl : ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:707:1: ( ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) )
            // InternalPoST.g:708:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            {
            // InternalPoST.g:708:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            // InternalPoST.g:709:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getTypeAssignment_1()); 
            // InternalPoST.g:710:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            // InternalPoST.g:710:3: rule__SimpleSpecificationInit__TypeAssignment_1
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
    // InternalPoST.g:718:1: rule__SimpleSpecificationInit__Group__2 : rule__SimpleSpecificationInit__Group__2__Impl ;
    public final void rule__SimpleSpecificationInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:722:1: ( rule__SimpleSpecificationInit__Group__2__Impl )
            // InternalPoST.g:723:2: rule__SimpleSpecificationInit__Group__2__Impl
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
    // InternalPoST.g:729:1: rule__SimpleSpecificationInit__Group__2__Impl : ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) ;
    public final void rule__SimpleSpecificationInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:733:1: ( ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) )
            // InternalPoST.g:734:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            {
            // InternalPoST.g:734:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            // InternalPoST.g:735:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup_2()); 
            // InternalPoST.g:736:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==31) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPoST.g:736:3: rule__SimpleSpecificationInit__Group_2__0
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
    // InternalPoST.g:745:1: rule__SimpleSpecificationInit__Group_2__0 : rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 ;
    public final void rule__SimpleSpecificationInit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:749:1: ( rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 )
            // InternalPoST.g:750:2: rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPoST.g:757:1: rule__SimpleSpecificationInit__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__SimpleSpecificationInit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:761:1: ( ( ':=' ) )
            // InternalPoST.g:762:1: ( ':=' )
            {
            // InternalPoST.g:762:1: ( ':=' )
            // InternalPoST.g:763:2: ':='
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalPoST.g:772:1: rule__SimpleSpecificationInit__Group_2__1 : rule__SimpleSpecificationInit__Group_2__1__Impl ;
    public final void rule__SimpleSpecificationInit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:776:1: ( rule__SimpleSpecificationInit__Group_2__1__Impl )
            // InternalPoST.g:777:2: rule__SimpleSpecificationInit__Group_2__1__Impl
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
    // InternalPoST.g:783:1: rule__SimpleSpecificationInit__Group_2__1__Impl : ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:787:1: ( ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) )
            // InternalPoST.g:788:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            {
            // InternalPoST.g:788:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            // InternalPoST.g:789:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getValueAssignment_2_1()); 
            // InternalPoST.g:790:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            // InternalPoST.g:790:3: rule__SimpleSpecificationInit__ValueAssignment_2_1
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
    // InternalPoST.g:799:1: rule__Constant__Group_2__0 : rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 ;
    public final void rule__Constant__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:803:1: ( rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1 )
            // InternalPoST.g:804:2: rule__Constant__Group_2__0__Impl rule__Constant__Group_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPoST.g:811:1: rule__Constant__Group_2__0__Impl : ( () ) ;
    public final void rule__Constant__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:815:1: ( ( () ) )
            // InternalPoST.g:816:1: ( () )
            {
            // InternalPoST.g:816:1: ( () )
            // InternalPoST.g:817:2: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_2_0()); 
            // InternalPoST.g:818:2: ()
            // InternalPoST.g:818:3: 
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
    // InternalPoST.g:826:1: rule__Constant__Group_2__1 : rule__Constant__Group_2__1__Impl ;
    public final void rule__Constant__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:830:1: ( rule__Constant__Group_2__1__Impl )
            // InternalPoST.g:831:2: rule__Constant__Group_2__1__Impl
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
    // InternalPoST.g:837:1: rule__Constant__Group_2__1__Impl : ( RULE_BOOLEAN_LITERAL ) ;
    public final void rule__Constant__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:841:1: ( ( RULE_BOOLEAN_LITERAL ) )
            // InternalPoST.g:842:1: ( RULE_BOOLEAN_LITERAL )
            {
            // InternalPoST.g:842:1: ( RULE_BOOLEAN_LITERAL )
            // InternalPoST.g:843:2: RULE_BOOLEAN_LITERAL
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
    // InternalPoST.g:853:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:857:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalPoST.g:858:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPoST.g:865:1: rule__SignedInteger__Group__0__Impl : ( ( rule__SignedInteger__SigAssignment_0 )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:869:1: ( ( ( rule__SignedInteger__SigAssignment_0 )? ) )
            // InternalPoST.g:870:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            {
            // InternalPoST.g:870:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            // InternalPoST.g:871:2: ( rule__SignedInteger__SigAssignment_0 )?
            {
             before(grammarAccess.getSignedIntegerAccess().getSigAssignment_0()); 
            // InternalPoST.g:872:2: ( rule__SignedInteger__SigAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:872:3: rule__SignedInteger__SigAssignment_0
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
    // InternalPoST.g:880:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:884:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalPoST.g:885:2: rule__SignedInteger__Group__1__Impl
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
    // InternalPoST.g:891:1: rule__SignedInteger__Group__1__Impl : ( ( rule__SignedInteger__ValueAssignment_1 ) ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:895:1: ( ( ( rule__SignedInteger__ValueAssignment_1 ) ) )
            // InternalPoST.g:896:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            {
            // InternalPoST.g:896:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            // InternalPoST.g:897:2: ( rule__SignedInteger__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntegerAccess().getValueAssignment_1()); 
            // InternalPoST.g:898:2: ( rule__SignedInteger__ValueAssignment_1 )
            // InternalPoST.g:898:3: rule__SignedInteger__ValueAssignment_1
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
    // InternalPoST.g:907:1: rule__IntegerLiteral__Group__0 : rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 ;
    public final void rule__IntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:911:1: ( rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 )
            // InternalPoST.g:912:2: rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPoST.g:919:1: rule__IntegerLiteral__Group__0__Impl : ( ( rule__IntegerLiteral__Group_0__0 )? ) ;
    public final void rule__IntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:923:1: ( ( ( rule__IntegerLiteral__Group_0__0 )? ) )
            // InternalPoST.g:924:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:924:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            // InternalPoST.g:925:2: ( rule__IntegerLiteral__Group_0__0 )?
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup_0()); 
            // InternalPoST.g:926:2: ( rule__IntegerLiteral__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA10_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPoST.g:926:3: rule__IntegerLiteral__Group_0__0
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
    // InternalPoST.g:934:1: rule__IntegerLiteral__Group__1 : rule__IntegerLiteral__Group__1__Impl ;
    public final void rule__IntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:938:1: ( rule__IntegerLiteral__Group__1__Impl )
            // InternalPoST.g:939:2: rule__IntegerLiteral__Group__1__Impl
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
    // InternalPoST.g:945:1: rule__IntegerLiteral__Group__1__Impl : ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__IntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:949:1: ( ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) )
            // InternalPoST.g:950:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            {
            // InternalPoST.g:950:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            // InternalPoST.g:951:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); 
            // InternalPoST.g:952:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            // InternalPoST.g:952:3: rule__IntegerLiteral__ValueAssignment_1
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
    // InternalPoST.g:961:1: rule__IntegerLiteral__Group_0__0 : rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 ;
    public final void rule__IntegerLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:965:1: ( rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 )
            // InternalPoST.g:966:2: rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPoST.g:973:1: rule__IntegerLiteral__Group_0__0__Impl : ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__IntegerLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:977:1: ( ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:978:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:978:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:979:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:980:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:980:3: rule__IntegerLiteral__TypeAssignment_0_0
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
    // InternalPoST.g:988:1: rule__IntegerLiteral__Group_0__1 : rule__IntegerLiteral__Group_0__1__Impl ;
    public final void rule__IntegerLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:992:1: ( rule__IntegerLiteral__Group_0__1__Impl )
            // InternalPoST.g:993:2: rule__IntegerLiteral__Group_0__1__Impl
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
    // InternalPoST.g:999:1: rule__IntegerLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__IntegerLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1003:1: ( ( '#' ) )
            // InternalPoST.g:1004:1: ( '#' )
            {
            // InternalPoST.g:1004:1: ( '#' )
            // InternalPoST.g:1005:2: '#'
            {
             before(grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPoST.g:1015:1: rule__RealLiteral__Group__0 : rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 ;
    public final void rule__RealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1019:1: ( rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 )
            // InternalPoST.g:1020:2: rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalPoST.g:1027:1: rule__RealLiteral__Group__0__Impl : ( ( rule__RealLiteral__Group_0__0 )? ) ;
    public final void rule__RealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1031:1: ( ( ( rule__RealLiteral__Group_0__0 )? ) )
            // InternalPoST.g:1032:1: ( ( rule__RealLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:1032:1: ( ( rule__RealLiteral__Group_0__0 )? )
            // InternalPoST.g:1033:2: ( rule__RealLiteral__Group_0__0 )?
            {
             before(grammarAccess.getRealLiteralAccess().getGroup_0()); 
            // InternalPoST.g:1034:2: ( rule__RealLiteral__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_REAL_TYPE_NAME) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalPoST.g:1034:3: rule__RealLiteral__Group_0__0
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
    // InternalPoST.g:1042:1: rule__RealLiteral__Group__1 : rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 ;
    public final void rule__RealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1046:1: ( rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 )
            // InternalPoST.g:1047:2: rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalPoST.g:1054:1: rule__RealLiteral__Group__1__Impl : ( ( rule__RealLiteral__DivAssignment_1 ) ) ;
    public final void rule__RealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1058:1: ( ( ( rule__RealLiteral__DivAssignment_1 ) ) )
            // InternalPoST.g:1059:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            {
            // InternalPoST.g:1059:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            // InternalPoST.g:1060:2: ( rule__RealLiteral__DivAssignment_1 )
            {
             before(grammarAccess.getRealLiteralAccess().getDivAssignment_1()); 
            // InternalPoST.g:1061:2: ( rule__RealLiteral__DivAssignment_1 )
            // InternalPoST.g:1061:3: rule__RealLiteral__DivAssignment_1
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
    // InternalPoST.g:1069:1: rule__RealLiteral__Group__2 : rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 ;
    public final void rule__RealLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1073:1: ( rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 )
            // InternalPoST.g:1074:2: rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalPoST.g:1081:1: rule__RealLiteral__Group__2__Impl : ( '.' ) ;
    public final void rule__RealLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1085:1: ( ( '.' ) )
            // InternalPoST.g:1086:1: ( '.' )
            {
            // InternalPoST.g:1086:1: ( '.' )
            // InternalPoST.g:1087:2: '.'
            {
             before(grammarAccess.getRealLiteralAccess().getFullStopKeyword_2()); 
            match(input,32,FOLLOW_2); 
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
    // InternalPoST.g:1096:1: rule__RealLiteral__Group__3 : rule__RealLiteral__Group__3__Impl ;
    public final void rule__RealLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1100:1: ( rule__RealLiteral__Group__3__Impl )
            // InternalPoST.g:1101:2: rule__RealLiteral__Group__3__Impl
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
    // InternalPoST.g:1107:1: rule__RealLiteral__Group__3__Impl : ( ( rule__RealLiteral__ModAssignment_3 ) ) ;
    public final void rule__RealLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1111:1: ( ( ( rule__RealLiteral__ModAssignment_3 ) ) )
            // InternalPoST.g:1112:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            {
            // InternalPoST.g:1112:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            // InternalPoST.g:1113:2: ( rule__RealLiteral__ModAssignment_3 )
            {
             before(grammarAccess.getRealLiteralAccess().getModAssignment_3()); 
            // InternalPoST.g:1114:2: ( rule__RealLiteral__ModAssignment_3 )
            // InternalPoST.g:1114:3: rule__RealLiteral__ModAssignment_3
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
    // InternalPoST.g:1123:1: rule__RealLiteral__Group_0__0 : rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 ;
    public final void rule__RealLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1127:1: ( rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 )
            // InternalPoST.g:1128:2: rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPoST.g:1135:1: rule__RealLiteral__Group_0__0__Impl : ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__RealLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1139:1: ( ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:1140:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:1140:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:1141:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getRealLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:1142:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:1142:3: rule__RealLiteral__TypeAssignment_0_0
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
    // InternalPoST.g:1150:1: rule__RealLiteral__Group_0__1 : rule__RealLiteral__Group_0__1__Impl ;
    public final void rule__RealLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1154:1: ( rule__RealLiteral__Group_0__1__Impl )
            // InternalPoST.g:1155:2: rule__RealLiteral__Group_0__1__Impl
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
    // InternalPoST.g:1161:1: rule__RealLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__RealLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1165:1: ( ( '#' ) )
            // InternalPoST.g:1166:1: ( '#' )
            {
            // InternalPoST.g:1166:1: ( '#' )
            // InternalPoST.g:1167:2: '#'
            {
             before(grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPoST.g:1177:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1181:1: ( ( ruleGreeting ) )
            // InternalPoST.g:1182:2: ( ruleGreeting )
            {
            // InternalPoST.g:1182:2: ( ruleGreeting )
            // InternalPoST.g:1183:3: ruleGreeting
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
    // InternalPoST.g:1192:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1196:1: ( ( RULE_ID ) )
            // InternalPoST.g:1197:2: ( RULE_ID )
            {
            // InternalPoST.g:1197:2: ( RULE_ID )
            // InternalPoST.g:1198:3: RULE_ID
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


    // $ANTLR start "rule__TimeLiteral__IntervalAssignment_3"
    // InternalPoST.g:1207:1: rule__TimeLiteral__IntervalAssignment_3 : ( RULE_INTERVAL ) ;
    public final void rule__TimeLiteral__IntervalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1211:1: ( ( RULE_INTERVAL ) )
            // InternalPoST.g:1212:2: ( RULE_INTERVAL )
            {
            // InternalPoST.g:1212:2: ( RULE_INTERVAL )
            // InternalPoST.g:1213:3: RULE_INTERVAL
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
    // InternalPoST.g:1222:1: rule__SimpleSpecificationInit__TypeAssignment_1 : ( ruleDataTypeName ) ;
    public final void rule__SimpleSpecificationInit__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1226:1: ( ( ruleDataTypeName ) )
            // InternalPoST.g:1227:2: ( ruleDataTypeName )
            {
            // InternalPoST.g:1227:2: ( ruleDataTypeName )
            // InternalPoST.g:1228:3: ruleDataTypeName
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
    // InternalPoST.g:1237:1: rule__SimpleSpecificationInit__ValueAssignment_2_1 : ( ruleConstant ) ;
    public final void rule__SimpleSpecificationInit__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1241:1: ( ( ruleConstant ) )
            // InternalPoST.g:1242:2: ( ruleConstant )
            {
            // InternalPoST.g:1242:2: ( ruleConstant )
            // InternalPoST.g:1243:3: ruleConstant
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
    // InternalPoST.g:1252:1: rule__SignedInteger__SigAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInteger__SigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1256:1: ( ( ( '-' ) ) )
            // InternalPoST.g:1257:2: ( ( '-' ) )
            {
            // InternalPoST.g:1257:2: ( ( '-' ) )
            // InternalPoST.g:1258:3: ( '-' )
            {
             before(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 
            // InternalPoST.g:1259:3: ( '-' )
            // InternalPoST.g:1260:4: '-'
            {
             before(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalPoST.g:1271:1: rule__SignedInteger__ValueAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__SignedInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1275:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:1276:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:1276:2: ( RULE_INTEGER )
            // InternalPoST.g:1277:3: RULE_INTEGER
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
    // InternalPoST.g:1286:1: rule__IntegerLiteral__TypeAssignment_0_0 : ( ruleIntegerTypeName ) ;
    public final void rule__IntegerLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1290:1: ( ( ruleIntegerTypeName ) )
            // InternalPoST.g:1291:2: ( ruleIntegerTypeName )
            {
            // InternalPoST.g:1291:2: ( ruleIntegerTypeName )
            // InternalPoST.g:1292:3: ruleIntegerTypeName
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
    // InternalPoST.g:1301:1: rule__IntegerLiteral__ValueAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__IntegerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1305:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:1306:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:1306:2: ( ruleSignedInteger )
            // InternalPoST.g:1307:3: ruleSignedInteger
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
    // InternalPoST.g:1316:1: rule__RealLiteral__TypeAssignment_0_0 : ( RULE_REAL_TYPE_NAME ) ;
    public final void rule__RealLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1320:1: ( ( RULE_REAL_TYPE_NAME ) )
            // InternalPoST.g:1321:2: ( RULE_REAL_TYPE_NAME )
            {
            // InternalPoST.g:1321:2: ( RULE_REAL_TYPE_NAME )
            // InternalPoST.g:1322:3: RULE_REAL_TYPE_NAME
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
    // InternalPoST.g:1331:1: rule__RealLiteral__DivAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__RealLiteral__DivAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1335:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:1336:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:1336:2: ( ruleSignedInteger )
            // InternalPoST.g:1337:3: ruleSignedInteger
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
    // InternalPoST.g:1346:1: rule__RealLiteral__ModAssignment_3 : ( RULE_INTEGER ) ;
    public final void rule__RealLiteral__ModAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1350:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:1351:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:1351:2: ( RULE_INTEGER )
            // InternalPoST.g:1352:3: RULE_INTEGER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000060000F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000400013E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000400010C0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000400010E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});

}