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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BIT_STRING_TYPE_NAME", "RULE_REAL_TYPE_NAME", "RULE_SIGNED_INTEGER_TYPE_NAME", "RULE_UNSIGNED_INTEGER_TYPE_NAME", "RULE_BOOLEAN_LITERAL", "RULE_ID", "RULE_INTEGER", "RULE_DIGIT", "RULE_BIT", "RULE_BINARY_INTEGER", "RULE_OCTAL_DIGIT", "RULE_OCTAL_INTEGER", "RULE_HEX_DIGIT", "RULE_HEX_INTEGER", "RULE_LETTER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'WSTRING'", "'Hello'", "'!'", "':='", "'#'", "'.'", "'-'"
    };
    public static final int RULE_HEX_INTEGER=17;
    public static final int RULE_BINARY_INTEGER=13;
    public static final int RULE_SL_COMMENT=20;
    public static final int RULE_BIT=12;
    public static final int RULE_SIGNED_INTEGER_TYPE_NAME=6;
    public static final int RULE_OCTAL_INTEGER=15;
    public static final int RULE_UNSIGNED_INTEGER_TYPE_NAME=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_OCTAL_DIGIT=14;
    public static final int RULE_ID=9;
    public static final int RULE_REAL_TYPE_NAME=5;
    public static final int RULE_BOOLEAN_LITERAL=8;
    public static final int RULE_WS=21;
    public static final int RULE_DIGIT=11;
    public static final int RULE_ANY_OTHER=22;
    public static final int RULE_LETTER=18;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ML_COMMENT=19;
    public static final int T__23=23;
    public static final int RULE_HEX_DIGIT=16;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_INTEGER=10;
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

                if ( (LA1_0==25) ) {
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


    // $ANTLR start "entryRuleDataTypeName"
    // InternalPoST.g:103:1: entryRuleDataTypeName : ruleDataTypeName EOF ;
    public final void entryRuleDataTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:104:1: ( ruleDataTypeName EOF )
            // InternalPoST.g:105:1: ruleDataTypeName EOF
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
    // InternalPoST.g:112:1: ruleDataTypeName : ( ( rule__DataTypeName__Alternatives ) ) ;
    public final void ruleDataTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:116:2: ( ( ( rule__DataTypeName__Alternatives ) ) )
            // InternalPoST.g:117:2: ( ( rule__DataTypeName__Alternatives ) )
            {
            // InternalPoST.g:117:2: ( ( rule__DataTypeName__Alternatives ) )
            // InternalPoST.g:118:3: ( rule__DataTypeName__Alternatives )
            {
             before(grammarAccess.getDataTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:119:3: ( rule__DataTypeName__Alternatives )
            // InternalPoST.g:119:4: rule__DataTypeName__Alternatives
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
    // InternalPoST.g:128:1: entryRuleNumericTypeName : ruleNumericTypeName EOF ;
    public final void entryRuleNumericTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:129:1: ( ruleNumericTypeName EOF )
            // InternalPoST.g:130:1: ruleNumericTypeName EOF
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
    // InternalPoST.g:137:1: ruleNumericTypeName : ( ( rule__NumericTypeName__Alternatives ) ) ;
    public final void ruleNumericTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:141:2: ( ( ( rule__NumericTypeName__Alternatives ) ) )
            // InternalPoST.g:142:2: ( ( rule__NumericTypeName__Alternatives ) )
            {
            // InternalPoST.g:142:2: ( ( rule__NumericTypeName__Alternatives ) )
            // InternalPoST.g:143:3: ( rule__NumericTypeName__Alternatives )
            {
             before(grammarAccess.getNumericTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:144:3: ( rule__NumericTypeName__Alternatives )
            // InternalPoST.g:144:4: rule__NumericTypeName__Alternatives
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
    // InternalPoST.g:153:1: entryRuleIntegerTypeName : ruleIntegerTypeName EOF ;
    public final void entryRuleIntegerTypeName() throws RecognitionException {
        try {
            // InternalPoST.g:154:1: ( ruleIntegerTypeName EOF )
            // InternalPoST.g:155:1: ruleIntegerTypeName EOF
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
    // InternalPoST.g:162:1: ruleIntegerTypeName : ( ( rule__IntegerTypeName__Alternatives ) ) ;
    public final void ruleIntegerTypeName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:166:2: ( ( ( rule__IntegerTypeName__Alternatives ) ) )
            // InternalPoST.g:167:2: ( ( rule__IntegerTypeName__Alternatives ) )
            {
            // InternalPoST.g:167:2: ( ( rule__IntegerTypeName__Alternatives ) )
            // InternalPoST.g:168:3: ( rule__IntegerTypeName__Alternatives )
            {
             before(grammarAccess.getIntegerTypeNameAccess().getAlternatives()); 
            // InternalPoST.g:169:3: ( rule__IntegerTypeName__Alternatives )
            // InternalPoST.g:169:4: rule__IntegerTypeName__Alternatives
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
    // InternalPoST.g:178:1: entryRuleSimpleSpecificationInit : ruleSimpleSpecificationInit EOF ;
    public final void entryRuleSimpleSpecificationInit() throws RecognitionException {
        try {
            // InternalPoST.g:179:1: ( ruleSimpleSpecificationInit EOF )
            // InternalPoST.g:180:1: ruleSimpleSpecificationInit EOF
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
    // InternalPoST.g:187:1: ruleSimpleSpecificationInit : ( ( rule__SimpleSpecificationInit__Group__0 ) ) ;
    public final void ruleSimpleSpecificationInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:191:2: ( ( ( rule__SimpleSpecificationInit__Group__0 ) ) )
            // InternalPoST.g:192:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            {
            // InternalPoST.g:192:2: ( ( rule__SimpleSpecificationInit__Group__0 ) )
            // InternalPoST.g:193:3: ( rule__SimpleSpecificationInit__Group__0 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup()); 
            // InternalPoST.g:194:3: ( rule__SimpleSpecificationInit__Group__0 )
            // InternalPoST.g:194:4: rule__SimpleSpecificationInit__Group__0
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
    // InternalPoST.g:203:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalPoST.g:204:1: ( ruleConstant EOF )
            // InternalPoST.g:205:1: ruleConstant EOF
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
    // InternalPoST.g:212:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:216:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalPoST.g:217:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalPoST.g:217:2: ( ( rule__Constant__Alternatives ) )
            // InternalPoST.g:218:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalPoST.g:219:3: ( rule__Constant__Alternatives )
            // InternalPoST.g:219:4: rule__Constant__Alternatives
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
    // InternalPoST.g:228:1: entryRuleSignedInteger : ruleSignedInteger EOF ;
    public final void entryRuleSignedInteger() throws RecognitionException {
        try {
            // InternalPoST.g:229:1: ( ruleSignedInteger EOF )
            // InternalPoST.g:230:1: ruleSignedInteger EOF
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
    // InternalPoST.g:237:1: ruleSignedInteger : ( ( rule__SignedInteger__Group__0 ) ) ;
    public final void ruleSignedInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:241:2: ( ( ( rule__SignedInteger__Group__0 ) ) )
            // InternalPoST.g:242:2: ( ( rule__SignedInteger__Group__0 ) )
            {
            // InternalPoST.g:242:2: ( ( rule__SignedInteger__Group__0 ) )
            // InternalPoST.g:243:3: ( rule__SignedInteger__Group__0 )
            {
             before(grammarAccess.getSignedIntegerAccess().getGroup()); 
            // InternalPoST.g:244:3: ( rule__SignedInteger__Group__0 )
            // InternalPoST.g:244:4: rule__SignedInteger__Group__0
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
    // InternalPoST.g:253:1: entryRuleNumericLiteral : ruleNumericLiteral EOF ;
    public final void entryRuleNumericLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:254:1: ( ruleNumericLiteral EOF )
            // InternalPoST.g:255:1: ruleNumericLiteral EOF
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
    // InternalPoST.g:262:1: ruleNumericLiteral : ( ( rule__NumericLiteral__Alternatives ) ) ;
    public final void ruleNumericLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:266:2: ( ( ( rule__NumericLiteral__Alternatives ) ) )
            // InternalPoST.g:267:2: ( ( rule__NumericLiteral__Alternatives ) )
            {
            // InternalPoST.g:267:2: ( ( rule__NumericLiteral__Alternatives ) )
            // InternalPoST.g:268:3: ( rule__NumericLiteral__Alternatives )
            {
             before(grammarAccess.getNumericLiteralAccess().getAlternatives()); 
            // InternalPoST.g:269:3: ( rule__NumericLiteral__Alternatives )
            // InternalPoST.g:269:4: rule__NumericLiteral__Alternatives
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
    // InternalPoST.g:278:1: entryRuleIntegerLiteral : ruleIntegerLiteral EOF ;
    public final void entryRuleIntegerLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:279:1: ( ruleIntegerLiteral EOF )
            // InternalPoST.g:280:1: ruleIntegerLiteral EOF
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
    // InternalPoST.g:287:1: ruleIntegerLiteral : ( ( rule__IntegerLiteral__Group__0 ) ) ;
    public final void ruleIntegerLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:291:2: ( ( ( rule__IntegerLiteral__Group__0 ) ) )
            // InternalPoST.g:292:2: ( ( rule__IntegerLiteral__Group__0 ) )
            {
            // InternalPoST.g:292:2: ( ( rule__IntegerLiteral__Group__0 ) )
            // InternalPoST.g:293:3: ( rule__IntegerLiteral__Group__0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup()); 
            // InternalPoST.g:294:3: ( rule__IntegerLiteral__Group__0 )
            // InternalPoST.g:294:4: rule__IntegerLiteral__Group__0
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
    // InternalPoST.g:303:1: entryRuleRealLiteral : ruleRealLiteral EOF ;
    public final void entryRuleRealLiteral() throws RecognitionException {
        try {
            // InternalPoST.g:304:1: ( ruleRealLiteral EOF )
            // InternalPoST.g:305:1: ruleRealLiteral EOF
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
    // InternalPoST.g:312:1: ruleRealLiteral : ( ( rule__RealLiteral__Group__0 ) ) ;
    public final void ruleRealLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:316:2: ( ( ( rule__RealLiteral__Group__0 ) ) )
            // InternalPoST.g:317:2: ( ( rule__RealLiteral__Group__0 ) )
            {
            // InternalPoST.g:317:2: ( ( rule__RealLiteral__Group__0 ) )
            // InternalPoST.g:318:3: ( rule__RealLiteral__Group__0 )
            {
             before(grammarAccess.getRealLiteralAccess().getGroup()); 
            // InternalPoST.g:319:3: ( rule__RealLiteral__Group__0 )
            // InternalPoST.g:319:4: rule__RealLiteral__Group__0
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
    // InternalPoST.g:327:1: rule__DataTypeName__Alternatives : ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) );
    public final void rule__DataTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:331:1: ( ( ruleNumericTypeName ) | ( RULE_BIT_STRING_TYPE_NAME ) | ( 'STRING' ) | ( 'WSTRING' ) )
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
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
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
                    // InternalPoST.g:332:2: ( ruleNumericTypeName )
                    {
                    // InternalPoST.g:332:2: ( ruleNumericTypeName )
                    // InternalPoST.g:333:3: ruleNumericTypeName
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
                    // InternalPoST.g:338:2: ( RULE_BIT_STRING_TYPE_NAME )
                    {
                    // InternalPoST.g:338:2: ( RULE_BIT_STRING_TYPE_NAME )
                    // InternalPoST.g:339:3: RULE_BIT_STRING_TYPE_NAME
                    {
                     before(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 
                    match(input,RULE_BIT_STRING_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getBIT_STRING_TYPE_NAMETerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalPoST.g:344:2: ( 'STRING' )
                    {
                    // InternalPoST.g:344:2: ( 'STRING' )
                    // InternalPoST.g:345:3: 'STRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getDataTypeNameAccess().getSTRINGKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalPoST.g:350:2: ( 'WSTRING' )
                    {
                    // InternalPoST.g:350:2: ( 'WSTRING' )
                    // InternalPoST.g:351:3: 'WSTRING'
                    {
                     before(grammarAccess.getDataTypeNameAccess().getWSTRINGKeyword_3()); 
                    match(input,24,FOLLOW_2); 
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
    // InternalPoST.g:360:1: rule__NumericTypeName__Alternatives : ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) );
    public final void rule__NumericTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:364:1: ( ( ruleIntegerTypeName ) | ( RULE_REAL_TYPE_NAME ) )
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
                    // InternalPoST.g:365:2: ( ruleIntegerTypeName )
                    {
                    // InternalPoST.g:365:2: ( ruleIntegerTypeName )
                    // InternalPoST.g:366:3: ruleIntegerTypeName
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
                    // InternalPoST.g:371:2: ( RULE_REAL_TYPE_NAME )
                    {
                    // InternalPoST.g:371:2: ( RULE_REAL_TYPE_NAME )
                    // InternalPoST.g:372:3: RULE_REAL_TYPE_NAME
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
    // InternalPoST.g:381:1: rule__IntegerTypeName__Alternatives : ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) );
    public final void rule__IntegerTypeName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:385:1: ( ( RULE_SIGNED_INTEGER_TYPE_NAME ) | ( RULE_UNSIGNED_INTEGER_TYPE_NAME ) )
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
                    // InternalPoST.g:386:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:386:2: ( RULE_SIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:387:3: RULE_SIGNED_INTEGER_TYPE_NAME
                    {
                     before(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 
                    match(input,RULE_SIGNED_INTEGER_TYPE_NAME,FOLLOW_2); 
                     after(grammarAccess.getIntegerTypeNameAccess().getSIGNED_INTEGER_TYPE_NAMETerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalPoST.g:392:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    {
                    // InternalPoST.g:392:2: ( RULE_UNSIGNED_INTEGER_TYPE_NAME )
                    // InternalPoST.g:393:3: RULE_UNSIGNED_INTEGER_TYPE_NAME
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
    // InternalPoST.g:402:1: rule__Constant__Alternatives : ( ( ruleNumericLiteral ) | ( ( rule__Constant__Group_1__0 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:406:1: ( ( ruleNumericLiteral ) | ( ( rule__Constant__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_REAL_TYPE_NAME && LA5_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)||LA5_0==RULE_INTEGER||LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BOOLEAN_LITERAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalPoST.g:407:2: ( ruleNumericLiteral )
                    {
                    // InternalPoST.g:407:2: ( ruleNumericLiteral )
                    // InternalPoST.g:408:3: ruleNumericLiteral
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
                    // InternalPoST.g:413:2: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // InternalPoST.g:413:2: ( ( rule__Constant__Group_1__0 ) )
                    // InternalPoST.g:414:3: ( rule__Constant__Group_1__0 )
                    {
                     before(grammarAccess.getConstantAccess().getGroup_1()); 
                    // InternalPoST.g:415:3: ( rule__Constant__Group_1__0 )
                    // InternalPoST.g:415:4: rule__Constant__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Constant__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConstantAccess().getGroup_1()); 

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
    // InternalPoST.g:423:1: rule__NumericLiteral__Alternatives : ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) );
    public final void rule__NumericLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:427:1: ( ( ruleIntegerLiteral ) | ( ruleRealLiteral ) )
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

                    if ( (LA6_3==29) ) {
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

                if ( (LA6_3==29) ) {
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
                    // InternalPoST.g:428:2: ( ruleIntegerLiteral )
                    {
                    // InternalPoST.g:428:2: ( ruleIntegerLiteral )
                    // InternalPoST.g:429:3: ruleIntegerLiteral
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
                    // InternalPoST.g:434:2: ( ruleRealLiteral )
                    {
                    // InternalPoST.g:434:2: ( ruleRealLiteral )
                    // InternalPoST.g:435:3: ruleRealLiteral
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
    // InternalPoST.g:444:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:448:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalPoST.g:449:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
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
    // InternalPoST.g:456:1: rule__Greeting__Group__0__Impl : ( 'Hello' ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:460:1: ( ( 'Hello' ) )
            // InternalPoST.g:461:1: ( 'Hello' )
            {
            // InternalPoST.g:461:1: ( 'Hello' )
            // InternalPoST.g:462:2: 'Hello'
            {
             before(grammarAccess.getGreetingAccess().getHelloKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalPoST.g:471:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:475:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalPoST.g:476:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
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
    // InternalPoST.g:483:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:487:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalPoST.g:488:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalPoST.g:488:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalPoST.g:489:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalPoST.g:490:2: ( rule__Greeting__NameAssignment_1 )
            // InternalPoST.g:490:3: rule__Greeting__NameAssignment_1
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
    // InternalPoST.g:498:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:502:1: ( rule__Greeting__Group__2__Impl )
            // InternalPoST.g:503:2: rule__Greeting__Group__2__Impl
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
    // InternalPoST.g:509:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:513:1: ( ( '!' ) )
            // InternalPoST.g:514:1: ( '!' )
            {
            // InternalPoST.g:514:1: ( '!' )
            // InternalPoST.g:515:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,26,FOLLOW_2); 
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


    // $ANTLR start "rule__SimpleSpecificationInit__Group__0"
    // InternalPoST.g:525:1: rule__SimpleSpecificationInit__Group__0 : rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 ;
    public final void rule__SimpleSpecificationInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:529:1: ( rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1 )
            // InternalPoST.g:530:2: rule__SimpleSpecificationInit__Group__0__Impl rule__SimpleSpecificationInit__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalPoST.g:537:1: rule__SimpleSpecificationInit__Group__0__Impl : ( () ) ;
    public final void rule__SimpleSpecificationInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:541:1: ( ( () ) )
            // InternalPoST.g:542:1: ( () )
            {
            // InternalPoST.g:542:1: ( () )
            // InternalPoST.g:543:2: ()
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getSimpleSpecificationInitAction_0()); 
            // InternalPoST.g:544:2: ()
            // InternalPoST.g:544:3: 
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
    // InternalPoST.g:552:1: rule__SimpleSpecificationInit__Group__1 : rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 ;
    public final void rule__SimpleSpecificationInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:556:1: ( rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2 )
            // InternalPoST.g:557:2: rule__SimpleSpecificationInit__Group__1__Impl rule__SimpleSpecificationInit__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalPoST.g:564:1: rule__SimpleSpecificationInit__Group__1__Impl : ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:568:1: ( ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) ) )
            // InternalPoST.g:569:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            {
            // InternalPoST.g:569:1: ( ( rule__SimpleSpecificationInit__TypeAssignment_1 ) )
            // InternalPoST.g:570:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getTypeAssignment_1()); 
            // InternalPoST.g:571:2: ( rule__SimpleSpecificationInit__TypeAssignment_1 )
            // InternalPoST.g:571:3: rule__SimpleSpecificationInit__TypeAssignment_1
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
    // InternalPoST.g:579:1: rule__SimpleSpecificationInit__Group__2 : rule__SimpleSpecificationInit__Group__2__Impl ;
    public final void rule__SimpleSpecificationInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:583:1: ( rule__SimpleSpecificationInit__Group__2__Impl )
            // InternalPoST.g:584:2: rule__SimpleSpecificationInit__Group__2__Impl
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
    // InternalPoST.g:590:1: rule__SimpleSpecificationInit__Group__2__Impl : ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) ;
    public final void rule__SimpleSpecificationInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:594:1: ( ( ( rule__SimpleSpecificationInit__Group_2__0 )? ) )
            // InternalPoST.g:595:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            {
            // InternalPoST.g:595:1: ( ( rule__SimpleSpecificationInit__Group_2__0 )? )
            // InternalPoST.g:596:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getGroup_2()); 
            // InternalPoST.g:597:2: ( rule__SimpleSpecificationInit__Group_2__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPoST.g:597:3: rule__SimpleSpecificationInit__Group_2__0
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
    // InternalPoST.g:606:1: rule__SimpleSpecificationInit__Group_2__0 : rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 ;
    public final void rule__SimpleSpecificationInit__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:610:1: ( rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1 )
            // InternalPoST.g:611:2: rule__SimpleSpecificationInit__Group_2__0__Impl rule__SimpleSpecificationInit__Group_2__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalPoST.g:618:1: rule__SimpleSpecificationInit__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__SimpleSpecificationInit__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:622:1: ( ( ':=' ) )
            // InternalPoST.g:623:1: ( ':=' )
            {
            // InternalPoST.g:623:1: ( ':=' )
            // InternalPoST.g:624:2: ':='
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalPoST.g:633:1: rule__SimpleSpecificationInit__Group_2__1 : rule__SimpleSpecificationInit__Group_2__1__Impl ;
    public final void rule__SimpleSpecificationInit__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:637:1: ( rule__SimpleSpecificationInit__Group_2__1__Impl )
            // InternalPoST.g:638:2: rule__SimpleSpecificationInit__Group_2__1__Impl
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
    // InternalPoST.g:644:1: rule__SimpleSpecificationInit__Group_2__1__Impl : ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) ;
    public final void rule__SimpleSpecificationInit__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:648:1: ( ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) ) )
            // InternalPoST.g:649:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            {
            // InternalPoST.g:649:1: ( ( rule__SimpleSpecificationInit__ValueAssignment_2_1 ) )
            // InternalPoST.g:650:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSimpleSpecificationInitAccess().getValueAssignment_2_1()); 
            // InternalPoST.g:651:2: ( rule__SimpleSpecificationInit__ValueAssignment_2_1 )
            // InternalPoST.g:651:3: rule__SimpleSpecificationInit__ValueAssignment_2_1
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


    // $ANTLR start "rule__Constant__Group_1__0"
    // InternalPoST.g:660:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:664:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // InternalPoST.g:665:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Constant__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__1();

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
    // $ANTLR end "rule__Constant__Group_1__0"


    // $ANTLR start "rule__Constant__Group_1__0__Impl"
    // InternalPoST.g:672:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:676:1: ( ( () ) )
            // InternalPoST.g:677:1: ( () )
            {
            // InternalPoST.g:677:1: ( () )
            // InternalPoST.g:678:2: ()
            {
             before(grammarAccess.getConstantAccess().getConstantAction_1_0()); 
            // InternalPoST.g:679:2: ()
            // InternalPoST.g:679:3: 
            {
            }

             after(grammarAccess.getConstantAccess().getConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Group_1__0__Impl"


    // $ANTLR start "rule__Constant__Group_1__1"
    // InternalPoST.g:687:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:691:1: ( rule__Constant__Group_1__1__Impl )
            // InternalPoST.g:692:2: rule__Constant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Group_1__1__Impl();

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
    // $ANTLR end "rule__Constant__Group_1__1"


    // $ANTLR start "rule__Constant__Group_1__1__Impl"
    // InternalPoST.g:698:1: rule__Constant__Group_1__1__Impl : ( RULE_BOOLEAN_LITERAL ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:702:1: ( ( RULE_BOOLEAN_LITERAL ) )
            // InternalPoST.g:703:1: ( RULE_BOOLEAN_LITERAL )
            {
            // InternalPoST.g:703:1: ( RULE_BOOLEAN_LITERAL )
            // InternalPoST.g:704:2: RULE_BOOLEAN_LITERAL
            {
             before(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1_1()); 
            match(input,RULE_BOOLEAN_LITERAL,FOLLOW_2); 
             after(grammarAccess.getConstantAccess().getBOOLEAN_LITERALTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Constant__Group_1__1__Impl"


    // $ANTLR start "rule__SignedInteger__Group__0"
    // InternalPoST.g:714:1: rule__SignedInteger__Group__0 : rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 ;
    public final void rule__SignedInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:718:1: ( rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1 )
            // InternalPoST.g:719:2: rule__SignedInteger__Group__0__Impl rule__SignedInteger__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPoST.g:726:1: rule__SignedInteger__Group__0__Impl : ( ( rule__SignedInteger__SigAssignment_0 )? ) ;
    public final void rule__SignedInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:730:1: ( ( ( rule__SignedInteger__SigAssignment_0 )? ) )
            // InternalPoST.g:731:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            {
            // InternalPoST.g:731:1: ( ( rule__SignedInteger__SigAssignment_0 )? )
            // InternalPoST.g:732:2: ( rule__SignedInteger__SigAssignment_0 )?
            {
             before(grammarAccess.getSignedIntegerAccess().getSigAssignment_0()); 
            // InternalPoST.g:733:2: ( rule__SignedInteger__SigAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPoST.g:733:3: rule__SignedInteger__SigAssignment_0
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
    // InternalPoST.g:741:1: rule__SignedInteger__Group__1 : rule__SignedInteger__Group__1__Impl ;
    public final void rule__SignedInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:745:1: ( rule__SignedInteger__Group__1__Impl )
            // InternalPoST.g:746:2: rule__SignedInteger__Group__1__Impl
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
    // InternalPoST.g:752:1: rule__SignedInteger__Group__1__Impl : ( ( rule__SignedInteger__ValueAssignment_1 ) ) ;
    public final void rule__SignedInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:756:1: ( ( ( rule__SignedInteger__ValueAssignment_1 ) ) )
            // InternalPoST.g:757:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            {
            // InternalPoST.g:757:1: ( ( rule__SignedInteger__ValueAssignment_1 ) )
            // InternalPoST.g:758:2: ( rule__SignedInteger__ValueAssignment_1 )
            {
             before(grammarAccess.getSignedIntegerAccess().getValueAssignment_1()); 
            // InternalPoST.g:759:2: ( rule__SignedInteger__ValueAssignment_1 )
            // InternalPoST.g:759:3: rule__SignedInteger__ValueAssignment_1
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
    // InternalPoST.g:768:1: rule__IntegerLiteral__Group__0 : rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 ;
    public final void rule__IntegerLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:772:1: ( rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1 )
            // InternalPoST.g:773:2: rule__IntegerLiteral__Group__0__Impl rule__IntegerLiteral__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalPoST.g:780:1: rule__IntegerLiteral__Group__0__Impl : ( ( rule__IntegerLiteral__Group_0__0 )? ) ;
    public final void rule__IntegerLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:784:1: ( ( ( rule__IntegerLiteral__Group_0__0 )? ) )
            // InternalPoST.g:785:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:785:1: ( ( rule__IntegerLiteral__Group_0__0 )? )
            // InternalPoST.g:786:2: ( rule__IntegerLiteral__Group_0__0 )?
            {
             before(grammarAccess.getIntegerLiteralAccess().getGroup_0()); 
            // InternalPoST.g:787:2: ( rule__IntegerLiteral__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_SIGNED_INTEGER_TYPE_NAME && LA9_0<=RULE_UNSIGNED_INTEGER_TYPE_NAME)) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:787:3: rule__IntegerLiteral__Group_0__0
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
    // InternalPoST.g:795:1: rule__IntegerLiteral__Group__1 : rule__IntegerLiteral__Group__1__Impl ;
    public final void rule__IntegerLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:799:1: ( rule__IntegerLiteral__Group__1__Impl )
            // InternalPoST.g:800:2: rule__IntegerLiteral__Group__1__Impl
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
    // InternalPoST.g:806:1: rule__IntegerLiteral__Group__1__Impl : ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) ;
    public final void rule__IntegerLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:810:1: ( ( ( rule__IntegerLiteral__ValueAssignment_1 ) ) )
            // InternalPoST.g:811:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            {
            // InternalPoST.g:811:1: ( ( rule__IntegerLiteral__ValueAssignment_1 ) )
            // InternalPoST.g:812:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getValueAssignment_1()); 
            // InternalPoST.g:813:2: ( rule__IntegerLiteral__ValueAssignment_1 )
            // InternalPoST.g:813:3: rule__IntegerLiteral__ValueAssignment_1
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
    // InternalPoST.g:822:1: rule__IntegerLiteral__Group_0__0 : rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 ;
    public final void rule__IntegerLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:826:1: ( rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1 )
            // InternalPoST.g:827:2: rule__IntegerLiteral__Group_0__0__Impl rule__IntegerLiteral__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPoST.g:834:1: rule__IntegerLiteral__Group_0__0__Impl : ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__IntegerLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:838:1: ( ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:839:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:839:1: ( ( rule__IntegerLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:840:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getIntegerLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:841:2: ( rule__IntegerLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:841:3: rule__IntegerLiteral__TypeAssignment_0_0
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
    // InternalPoST.g:849:1: rule__IntegerLiteral__Group_0__1 : rule__IntegerLiteral__Group_0__1__Impl ;
    public final void rule__IntegerLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:853:1: ( rule__IntegerLiteral__Group_0__1__Impl )
            // InternalPoST.g:854:2: rule__IntegerLiteral__Group_0__1__Impl
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
    // InternalPoST.g:860:1: rule__IntegerLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__IntegerLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:864:1: ( ( '#' ) )
            // InternalPoST.g:865:1: ( '#' )
            {
            // InternalPoST.g:865:1: ( '#' )
            // InternalPoST.g:866:2: '#'
            {
             before(grammarAccess.getIntegerLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPoST.g:876:1: rule__RealLiteral__Group__0 : rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 ;
    public final void rule__RealLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:880:1: ( rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1 )
            // InternalPoST.g:881:2: rule__RealLiteral__Group__0__Impl rule__RealLiteral__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalPoST.g:888:1: rule__RealLiteral__Group__0__Impl : ( ( rule__RealLiteral__Group_0__0 )? ) ;
    public final void rule__RealLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:892:1: ( ( ( rule__RealLiteral__Group_0__0 )? ) )
            // InternalPoST.g:893:1: ( ( rule__RealLiteral__Group_0__0 )? )
            {
            // InternalPoST.g:893:1: ( ( rule__RealLiteral__Group_0__0 )? )
            // InternalPoST.g:894:2: ( rule__RealLiteral__Group_0__0 )?
            {
             before(grammarAccess.getRealLiteralAccess().getGroup_0()); 
            // InternalPoST.g:895:2: ( rule__RealLiteral__Group_0__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_REAL_TYPE_NAME) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPoST.g:895:3: rule__RealLiteral__Group_0__0
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
    // InternalPoST.g:903:1: rule__RealLiteral__Group__1 : rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 ;
    public final void rule__RealLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:907:1: ( rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2 )
            // InternalPoST.g:908:2: rule__RealLiteral__Group__1__Impl rule__RealLiteral__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalPoST.g:915:1: rule__RealLiteral__Group__1__Impl : ( ( rule__RealLiteral__DivAssignment_1 ) ) ;
    public final void rule__RealLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:919:1: ( ( ( rule__RealLiteral__DivAssignment_1 ) ) )
            // InternalPoST.g:920:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            {
            // InternalPoST.g:920:1: ( ( rule__RealLiteral__DivAssignment_1 ) )
            // InternalPoST.g:921:2: ( rule__RealLiteral__DivAssignment_1 )
            {
             before(grammarAccess.getRealLiteralAccess().getDivAssignment_1()); 
            // InternalPoST.g:922:2: ( rule__RealLiteral__DivAssignment_1 )
            // InternalPoST.g:922:3: rule__RealLiteral__DivAssignment_1
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
    // InternalPoST.g:930:1: rule__RealLiteral__Group__2 : rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 ;
    public final void rule__RealLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:934:1: ( rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3 )
            // InternalPoST.g:935:2: rule__RealLiteral__Group__2__Impl rule__RealLiteral__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalPoST.g:942:1: rule__RealLiteral__Group__2__Impl : ( '.' ) ;
    public final void rule__RealLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:946:1: ( ( '.' ) )
            // InternalPoST.g:947:1: ( '.' )
            {
            // InternalPoST.g:947:1: ( '.' )
            // InternalPoST.g:948:2: '.'
            {
             before(grammarAccess.getRealLiteralAccess().getFullStopKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalPoST.g:957:1: rule__RealLiteral__Group__3 : rule__RealLiteral__Group__3__Impl ;
    public final void rule__RealLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:961:1: ( rule__RealLiteral__Group__3__Impl )
            // InternalPoST.g:962:2: rule__RealLiteral__Group__3__Impl
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
    // InternalPoST.g:968:1: rule__RealLiteral__Group__3__Impl : ( ( rule__RealLiteral__ModAssignment_3 ) ) ;
    public final void rule__RealLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:972:1: ( ( ( rule__RealLiteral__ModAssignment_3 ) ) )
            // InternalPoST.g:973:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            {
            // InternalPoST.g:973:1: ( ( rule__RealLiteral__ModAssignment_3 ) )
            // InternalPoST.g:974:2: ( rule__RealLiteral__ModAssignment_3 )
            {
             before(grammarAccess.getRealLiteralAccess().getModAssignment_3()); 
            // InternalPoST.g:975:2: ( rule__RealLiteral__ModAssignment_3 )
            // InternalPoST.g:975:3: rule__RealLiteral__ModAssignment_3
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
    // InternalPoST.g:984:1: rule__RealLiteral__Group_0__0 : rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 ;
    public final void rule__RealLiteral__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:988:1: ( rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1 )
            // InternalPoST.g:989:2: rule__RealLiteral__Group_0__0__Impl rule__RealLiteral__Group_0__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalPoST.g:996:1: rule__RealLiteral__Group_0__0__Impl : ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) ;
    public final void rule__RealLiteral__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1000:1: ( ( ( rule__RealLiteral__TypeAssignment_0_0 ) ) )
            // InternalPoST.g:1001:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            {
            // InternalPoST.g:1001:1: ( ( rule__RealLiteral__TypeAssignment_0_0 ) )
            // InternalPoST.g:1002:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            {
             before(grammarAccess.getRealLiteralAccess().getTypeAssignment_0_0()); 
            // InternalPoST.g:1003:2: ( rule__RealLiteral__TypeAssignment_0_0 )
            // InternalPoST.g:1003:3: rule__RealLiteral__TypeAssignment_0_0
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
    // InternalPoST.g:1011:1: rule__RealLiteral__Group_0__1 : rule__RealLiteral__Group_0__1__Impl ;
    public final void rule__RealLiteral__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1015:1: ( rule__RealLiteral__Group_0__1__Impl )
            // InternalPoST.g:1016:2: rule__RealLiteral__Group_0__1__Impl
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
    // InternalPoST.g:1022:1: rule__RealLiteral__Group_0__1__Impl : ( '#' ) ;
    public final void rule__RealLiteral__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1026:1: ( ( '#' ) )
            // InternalPoST.g:1027:1: ( '#' )
            {
            // InternalPoST.g:1027:1: ( '#' )
            // InternalPoST.g:1028:2: '#'
            {
             before(grammarAccess.getRealLiteralAccess().getNumberSignKeyword_0_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalPoST.g:1038:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1042:1: ( ( ruleGreeting ) )
            // InternalPoST.g:1043:2: ( ruleGreeting )
            {
            // InternalPoST.g:1043:2: ( ruleGreeting )
            // InternalPoST.g:1044:3: ruleGreeting
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
    // InternalPoST.g:1053:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1057:1: ( ( RULE_ID ) )
            // InternalPoST.g:1058:2: ( RULE_ID )
            {
            // InternalPoST.g:1058:2: ( RULE_ID )
            // InternalPoST.g:1059:3: RULE_ID
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


    // $ANTLR start "rule__SimpleSpecificationInit__TypeAssignment_1"
    // InternalPoST.g:1068:1: rule__SimpleSpecificationInit__TypeAssignment_1 : ( ruleDataTypeName ) ;
    public final void rule__SimpleSpecificationInit__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1072:1: ( ( ruleDataTypeName ) )
            // InternalPoST.g:1073:2: ( ruleDataTypeName )
            {
            // InternalPoST.g:1073:2: ( ruleDataTypeName )
            // InternalPoST.g:1074:3: ruleDataTypeName
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
    // InternalPoST.g:1083:1: rule__SimpleSpecificationInit__ValueAssignment_2_1 : ( ruleConstant ) ;
    public final void rule__SimpleSpecificationInit__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1087:1: ( ( ruleConstant ) )
            // InternalPoST.g:1088:2: ( ruleConstant )
            {
            // InternalPoST.g:1088:2: ( ruleConstant )
            // InternalPoST.g:1089:3: ruleConstant
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
    // InternalPoST.g:1098:1: rule__SignedInteger__SigAssignment_0 : ( ( '-' ) ) ;
    public final void rule__SignedInteger__SigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1102:1: ( ( ( '-' ) ) )
            // InternalPoST.g:1103:2: ( ( '-' ) )
            {
            // InternalPoST.g:1103:2: ( ( '-' ) )
            // InternalPoST.g:1104:3: ( '-' )
            {
             before(grammarAccess.getSignedIntegerAccess().getSigHyphenMinusKeyword_0_0()); 
            // InternalPoST.g:1105:3: ( '-' )
            // InternalPoST.g:1106:4: '-'
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
    // InternalPoST.g:1117:1: rule__SignedInteger__ValueAssignment_1 : ( RULE_INTEGER ) ;
    public final void rule__SignedInteger__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1121:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:1122:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:1122:2: ( RULE_INTEGER )
            // InternalPoST.g:1123:3: RULE_INTEGER
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
    // InternalPoST.g:1132:1: rule__IntegerLiteral__TypeAssignment_0_0 : ( ruleIntegerTypeName ) ;
    public final void rule__IntegerLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1136:1: ( ( ruleIntegerTypeName ) )
            // InternalPoST.g:1137:2: ( ruleIntegerTypeName )
            {
            // InternalPoST.g:1137:2: ( ruleIntegerTypeName )
            // InternalPoST.g:1138:3: ruleIntegerTypeName
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
    // InternalPoST.g:1147:1: rule__IntegerLiteral__ValueAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__IntegerLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1151:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:1152:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:1152:2: ( ruleSignedInteger )
            // InternalPoST.g:1153:3: ruleSignedInteger
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
    // InternalPoST.g:1162:1: rule__RealLiteral__TypeAssignment_0_0 : ( RULE_REAL_TYPE_NAME ) ;
    public final void rule__RealLiteral__TypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1166:1: ( ( RULE_REAL_TYPE_NAME ) )
            // InternalPoST.g:1167:2: ( RULE_REAL_TYPE_NAME )
            {
            // InternalPoST.g:1167:2: ( RULE_REAL_TYPE_NAME )
            // InternalPoST.g:1168:3: RULE_REAL_TYPE_NAME
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
    // InternalPoST.g:1177:1: rule__RealLiteral__DivAssignment_1 : ( ruleSignedInteger ) ;
    public final void rule__RealLiteral__DivAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1181:1: ( ( ruleSignedInteger ) )
            // InternalPoST.g:1182:2: ( ruleSignedInteger )
            {
            // InternalPoST.g:1182:2: ( ruleSignedInteger )
            // InternalPoST.g:1183:3: ruleSignedInteger
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
    // InternalPoST.g:1192:1: rule__RealLiteral__ModAssignment_3 : ( RULE_INTEGER ) ;
    public final void rule__RealLiteral__ModAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalPoST.g:1196:1: ( ( RULE_INTEGER ) )
            // InternalPoST.g:1197:2: ( RULE_INTEGER )
            {
            // InternalPoST.g:1197:2: ( RULE_INTEGER )
            // InternalPoST.g:1198:3: RULE_INTEGER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000018000F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000400005E0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000400004C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000400004E0L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000400L});

}