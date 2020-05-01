package su.nsk.iae.post.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPoSTLexer extends Lexer {
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

    public InternalPoSTLexer() {;} 
    public InternalPoSTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalPoSTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalPoST.g"; }

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:11:7: ( 'STRING' )
            // InternalPoST.g:11:9: 'STRING'
            {
            match("STRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:12:7: ( 'WSTRING' )
            // InternalPoST.g:12:9: 'WSTRING'
            {
            match("WSTRING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:13:7: ( 'Hello' )
            // InternalPoST.g:13:9: 'Hello'
            {
            match("Hello"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:14:7: ( '!' )
            // InternalPoST.g:14:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:15:7: ( ':' )
            // InternalPoST.g:15:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:16:7: ( ',' )
            // InternalPoST.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:17:7: ( 'AT' )
            // InternalPoST.g:17:9: 'AT'
            {
            match("AT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:18:7: ( '#' )
            // InternalPoST.g:18:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:19:7: ( '-' )
            // InternalPoST.g:19:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:20:7: ( ':=' )
            // InternalPoST.g:20:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:21:7: ( '.' )
            // InternalPoST.g:21:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_DIRECT_VARIABLE"
    public final void mRULE_DIRECT_VARIABLE() throws RecognitionException {
        try {
            int _type = RULE_DIRECT_VARIABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2041:22: ( '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_INTEGER ( '.' RULE_INTEGER )* )
            // InternalPoST.g:2041:24: '%' RULE_DIRECT_TYPE_PREFIX RULE_DIRECT_SIZE_PREFIX RULE_INTEGER ( '.' RULE_INTEGER )*
            {
            match('%'); 
            mRULE_DIRECT_TYPE_PREFIX(); 
            mRULE_DIRECT_SIZE_PREFIX(); 
            mRULE_INTEGER(); 
            // InternalPoST.g:2041:89: ( '.' RULE_INTEGER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='.') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPoST.g:2041:90: '.' RULE_INTEGER
            	    {
            	    match('.'); 
            	    mRULE_INTEGER(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_VARIABLE"

    // $ANTLR start "RULE_DIRECT_TYPE_PREFIX"
    public final void mRULE_DIRECT_TYPE_PREFIX() throws RecognitionException {
        try {
            // InternalPoST.g:2043:34: ( ( 'I' | 'Q' | 'M' ) )
            // InternalPoST.g:2043:36: ( 'I' | 'Q' | 'M' )
            {
            if ( input.LA(1)=='I'||input.LA(1)=='M'||input.LA(1)=='Q' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_TYPE_PREFIX"

    // $ANTLR start "RULE_DIRECT_SIZE_PREFIX"
    public final void mRULE_DIRECT_SIZE_PREFIX() throws RecognitionException {
        try {
            // InternalPoST.g:2045:34: ( ( 'X' | 'B' | 'W' | 'D' | 'L' ) )
            // InternalPoST.g:2045:36: ( 'X' | 'B' | 'W' | 'D' | 'L' )
            {
            if ( input.LA(1)=='B'||input.LA(1)=='D'||input.LA(1)=='L'||(input.LA(1)>='W' && input.LA(1)<='X') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIRECT_SIZE_PREFIX"

    // $ANTLR start "RULE_TIME_PREF_LITERAL"
    public final void mRULE_TIME_PREF_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_TIME_PREF_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2047:24: ( ( 'T' | 'TIME' ) )
            // InternalPoST.g:2047:26: ( 'T' | 'TIME' )
            {
            // InternalPoST.g:2047:26: ( 'T' | 'TIME' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='T') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='I') ) {
                    alt2=2;
                }
                else {
                    alt2=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalPoST.g:2047:27: 'T'
                    {
                    match('T'); 

                    }
                    break;
                case 2 :
                    // InternalPoST.g:2047:31: 'TIME'
                    {
                    match("TIME"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TIME_PREF_LITERAL"

    // $ANTLR start "RULE_INTERVAL"
    public final void mRULE_INTERVAL() throws RecognitionException {
        try {
            int _type = RULE_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2049:15: ( ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )? )
            // InternalPoST.g:2049:17: ( RULE_INTEGER 'd' )? ( RULE_INTEGER 'h' )? ( RULE_INTEGER 'm' )? ( RULE_INTEGER 's' )? ( RULE_INTEGER 'ms' )?
            {
            // InternalPoST.g:2049:17: ( RULE_INTEGER 'd' )?
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalPoST.g:2049:18: RULE_INTEGER 'd'
                    {
                    mRULE_INTEGER(); 
                    match('d'); 

                    }
                    break;

            }

            // InternalPoST.g:2049:37: ( RULE_INTEGER 'h' )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalPoST.g:2049:38: RULE_INTEGER 'h'
                    {
                    mRULE_INTEGER(); 
                    match('h'); 

                    }
                    break;

            }

            // InternalPoST.g:2049:57: ( RULE_INTEGER 'm' )?
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalPoST.g:2049:58: RULE_INTEGER 'm'
                    {
                    mRULE_INTEGER(); 
                    match('m'); 

                    }
                    break;

            }

            // InternalPoST.g:2049:77: ( RULE_INTEGER 's' )?
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalPoST.g:2049:78: RULE_INTEGER 's'
                    {
                    mRULE_INTEGER(); 
                    match('s'); 

                    }
                    break;

            }

            // InternalPoST.g:2049:97: ( RULE_INTEGER 'ms' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPoST.g:2049:98: RULE_INTEGER 'ms'
                    {
                    mRULE_INTEGER(); 
                    match("ms"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTERVAL"

    // $ANTLR start "RULE_SIGNED_INTEGER_TYPE_NAME"
    public final void mRULE_SIGNED_INTEGER_TYPE_NAME() throws RecognitionException {
        try {
            int _type = RULE_SIGNED_INTEGER_TYPE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2051:31: ( ( 'SINT' | 'INT' | 'DINT' | 'LINT' ) )
            // InternalPoST.g:2051:33: ( 'SINT' | 'INT' | 'DINT' | 'LINT' )
            {
            // InternalPoST.g:2051:33: ( 'SINT' | 'INT' | 'DINT' | 'LINT' )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 'S':
                {
                alt8=1;
                }
                break;
            case 'I':
                {
                alt8=2;
                }
                break;
            case 'D':
                {
                alt8=3;
                }
                break;
            case 'L':
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalPoST.g:2051:34: 'SINT'
                    {
                    match("SINT"); 


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2051:41: 'INT'
                    {
                    match("INT"); 


                    }
                    break;
                case 3 :
                    // InternalPoST.g:2051:47: 'DINT'
                    {
                    match("DINT"); 


                    }
                    break;
                case 4 :
                    // InternalPoST.g:2051:54: 'LINT'
                    {
                    match("LINT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SIGNED_INTEGER_TYPE_NAME"

    // $ANTLR start "RULE_UNSIGNED_INTEGER_TYPE_NAME"
    public final void mRULE_UNSIGNED_INTEGER_TYPE_NAME() throws RecognitionException {
        try {
            int _type = RULE_UNSIGNED_INTEGER_TYPE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2053:33: ( ( 'USINT' | 'UINT' | 'UDINT' | 'ULINT' ) )
            // InternalPoST.g:2053:35: ( 'USINT' | 'UINT' | 'UDINT' | 'ULINT' )
            {
            // InternalPoST.g:2053:35: ( 'USINT' | 'UINT' | 'UDINT' | 'ULINT' )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='U') ) {
                switch ( input.LA(2) ) {
                case 'S':
                    {
                    alt9=1;
                    }
                    break;
                case 'I':
                    {
                    alt9=2;
                    }
                    break;
                case 'D':
                    {
                    alt9=3;
                    }
                    break;
                case 'L':
                    {
                    alt9=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalPoST.g:2053:36: 'USINT'
                    {
                    match("USINT"); 


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2053:44: 'UINT'
                    {
                    match("UINT"); 


                    }
                    break;
                case 3 :
                    // InternalPoST.g:2053:51: 'UDINT'
                    {
                    match("UDINT"); 


                    }
                    break;
                case 4 :
                    // InternalPoST.g:2053:59: 'ULINT'
                    {
                    match("ULINT"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNSIGNED_INTEGER_TYPE_NAME"

    // $ANTLR start "RULE_REAL_TYPE_NAME"
    public final void mRULE_REAL_TYPE_NAME() throws RecognitionException {
        try {
            int _type = RULE_REAL_TYPE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2055:21: ( ( 'REAL' | 'LREAL' ) )
            // InternalPoST.g:2055:23: ( 'REAL' | 'LREAL' )
            {
            // InternalPoST.g:2055:23: ( 'REAL' | 'LREAL' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='R') ) {
                alt10=1;
            }
            else if ( (LA10_0=='L') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalPoST.g:2055:24: 'REAL'
                    {
                    match("REAL"); 


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2055:31: 'LREAL'
                    {
                    match("LREAL"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_TYPE_NAME"

    // $ANTLR start "RULE_BIT_STRING_TYPE_NAME"
    public final void mRULE_BIT_STRING_TYPE_NAME() throws RecognitionException {
        try {
            int _type = RULE_BIT_STRING_TYPE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2057:27: ( ( 'BOOL' | 'BYTE' | 'WORD' | 'DWORD' | 'LWORD' ) )
            // InternalPoST.g:2057:29: ( 'BOOL' | 'BYTE' | 'WORD' | 'DWORD' | 'LWORD' )
            {
            // InternalPoST.g:2057:29: ( 'BOOL' | 'BYTE' | 'WORD' | 'DWORD' | 'LWORD' )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 'B':
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='O') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='Y') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'W':
                {
                alt11=3;
                }
                break;
            case 'D':
                {
                alt11=4;
                }
                break;
            case 'L':
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalPoST.g:2057:30: 'BOOL'
                    {
                    match("BOOL"); 


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2057:37: 'BYTE'
                    {
                    match("BYTE"); 


                    }
                    break;
                case 3 :
                    // InternalPoST.g:2057:44: 'WORD'
                    {
                    match("WORD"); 


                    }
                    break;
                case 4 :
                    // InternalPoST.g:2057:51: 'DWORD'
                    {
                    match("DWORD"); 


                    }
                    break;
                case 5 :
                    // InternalPoST.g:2057:59: 'LWORD'
                    {
                    match("LWORD"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT_STRING_TYPE_NAME"

    // $ANTLR start "RULE_INTEGER"
    public final void mRULE_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2059:14: ( ( RULE_DIGIT )+ )
            // InternalPoST.g:2059:16: ( RULE_DIGIT )+
            {
            // InternalPoST.g:2059:16: ( RULE_DIGIT )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalPoST.g:2059:16: RULE_DIGIT
            	    {
            	    mRULE_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGER"

    // $ANTLR start "RULE_BINARY_INTEGER"
    public final void mRULE_BINARY_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_BINARY_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2061:21: ( '2#' ( RULE_BIT )+ )
            // InternalPoST.g:2061:23: '2#' ( RULE_BIT )+
            {
            match("2#"); 

            // InternalPoST.g:2061:28: ( RULE_BIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='1')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalPoST.g:2061:28: RULE_BIT
            	    {
            	    mRULE_BIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BINARY_INTEGER"

    // $ANTLR start "RULE_OCTAL_INTEGER"
    public final void mRULE_OCTAL_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_OCTAL_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2063:20: ( '8#' ( RULE_OCTAL_DIGIT )+ )
            // InternalPoST.g:2063:22: '8#' ( RULE_OCTAL_DIGIT )+
            {
            match("8#"); 

            // InternalPoST.g:2063:27: ( RULE_OCTAL_DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='7')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalPoST.g:2063:27: RULE_OCTAL_DIGIT
            	    {
            	    mRULE_OCTAL_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_INTEGER"

    // $ANTLR start "RULE_HEX_INTEGER"
    public final void mRULE_HEX_INTEGER() throws RecognitionException {
        try {
            int _type = RULE_HEX_INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2065:18: ( '16#' ( RULE_HEX_DIGIT )+ )
            // InternalPoST.g:2065:20: '16#' ( RULE_HEX_DIGIT )+
            {
            match("16#"); 

            // InternalPoST.g:2065:26: ( RULE_HEX_DIGIT )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='F')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalPoST.g:2065:26: RULE_HEX_DIGIT
            	    {
            	    mRULE_HEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_INTEGER"

    // $ANTLR start "RULE_BOOLEAN_LITERAL"
    public final void mRULE_BOOLEAN_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2067:22: ( ( 'TRUE' | 'FALSE' ) )
            // InternalPoST.g:2067:24: ( 'TRUE' | 'FALSE' )
            {
            // InternalPoST.g:2067:24: ( 'TRUE' | 'FALSE' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='T') ) {
                alt16=1;
            }
            else if ( (LA16_0=='F') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalPoST.g:2067:25: 'TRUE'
                    {
                    match("TRUE"); 


                    }
                    break;
                case 2 :
                    // InternalPoST.g:2067:32: 'FALSE'
                    {
                    match("FALSE"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_LITERAL"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // InternalPoST.g:2069:22: ( ( 'A' .. 'Z' | 'a' .. 'z' | '_' ) )
            // InternalPoST.g:2069:24: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_BIT"
    public final void mRULE_BIT() throws RecognitionException {
        try {
            // InternalPoST.g:2071:19: ( ( '0' | '1' ) )
            // InternalPoST.g:2071:21: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BIT"

    // $ANTLR start "RULE_OCTAL_DIGIT"
    public final void mRULE_OCTAL_DIGIT() throws RecognitionException {
        try {
            // InternalPoST.g:2073:27: ( '0' .. '7' )
            // InternalPoST.g:2073:29: '0' .. '7'
            {
            matchRange('0','7'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_DIGIT"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // InternalPoST.g:2075:21: ( '0' .. '9' )
            // InternalPoST.g:2075:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_HEX_DIGIT"
    public final void mRULE_HEX_DIGIT() throws RecognitionException {
        try {
            // InternalPoST.g:2077:25: ( ( RULE_DIGIT | 'A' .. 'F' ) )
            // InternalPoST.g:2077:27: ( RULE_DIGIT | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_DIGIT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2079:9: ( RULE_LETTER ( RULE_LETTER | RULE_DIGIT )* )
            // InternalPoST.g:2079:11: RULE_LETTER ( RULE_LETTER | RULE_DIGIT )*
            {
            mRULE_LETTER(); 
            // InternalPoST.g:2079:23: ( RULE_LETTER | RULE_DIGIT )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalPoST.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2081:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalPoST.g:2081:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalPoST.g:2081:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalPoST.g:2081:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2083:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalPoST.g:2083:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalPoST.g:2083:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalPoST.g:2083:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalPoST.g:2083:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalPoST.g:2083:41: ( '\\r' )? '\\n'
                    {
                    // InternalPoST.g:2083:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalPoST.g:2083:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2085:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalPoST.g:2085:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalPoST.g:2085:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalPoST.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalPoST.g:2087:16: ( . )
            // InternalPoST.g:2087:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalPoST.g:1:8: ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_DIRECT_VARIABLE | RULE_TIME_PREF_LITERAL | RULE_INTERVAL | RULE_SIGNED_INTEGER_TYPE_NAME | RULE_UNSIGNED_INTEGER_TYPE_NAME | RULE_REAL_TYPE_NAME | RULE_BIT_STRING_TYPE_NAME | RULE_INTEGER | RULE_BINARY_INTEGER | RULE_OCTAL_INTEGER | RULE_HEX_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=28;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // InternalPoST.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // InternalPoST.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // InternalPoST.g:1:22: T__30
                {
                mT__30(); 

                }
                break;
            case 4 :
                // InternalPoST.g:1:28: T__31
                {
                mT__31(); 

                }
                break;
            case 5 :
                // InternalPoST.g:1:34: T__32
                {
                mT__32(); 

                }
                break;
            case 6 :
                // InternalPoST.g:1:40: T__33
                {
                mT__33(); 

                }
                break;
            case 7 :
                // InternalPoST.g:1:46: T__34
                {
                mT__34(); 

                }
                break;
            case 8 :
                // InternalPoST.g:1:52: T__35
                {
                mT__35(); 

                }
                break;
            case 9 :
                // InternalPoST.g:1:58: T__36
                {
                mT__36(); 

                }
                break;
            case 10 :
                // InternalPoST.g:1:64: T__37
                {
                mT__37(); 

                }
                break;
            case 11 :
                // InternalPoST.g:1:70: T__38
                {
                mT__38(); 

                }
                break;
            case 12 :
                // InternalPoST.g:1:76: RULE_DIRECT_VARIABLE
                {
                mRULE_DIRECT_VARIABLE(); 

                }
                break;
            case 13 :
                // InternalPoST.g:1:97: RULE_TIME_PREF_LITERAL
                {
                mRULE_TIME_PREF_LITERAL(); 

                }
                break;
            case 14 :
                // InternalPoST.g:1:120: RULE_INTERVAL
                {
                mRULE_INTERVAL(); 

                }
                break;
            case 15 :
                // InternalPoST.g:1:134: RULE_SIGNED_INTEGER_TYPE_NAME
                {
                mRULE_SIGNED_INTEGER_TYPE_NAME(); 

                }
                break;
            case 16 :
                // InternalPoST.g:1:164: RULE_UNSIGNED_INTEGER_TYPE_NAME
                {
                mRULE_UNSIGNED_INTEGER_TYPE_NAME(); 

                }
                break;
            case 17 :
                // InternalPoST.g:1:196: RULE_REAL_TYPE_NAME
                {
                mRULE_REAL_TYPE_NAME(); 

                }
                break;
            case 18 :
                // InternalPoST.g:1:216: RULE_BIT_STRING_TYPE_NAME
                {
                mRULE_BIT_STRING_TYPE_NAME(); 

                }
                break;
            case 19 :
                // InternalPoST.g:1:242: RULE_INTEGER
                {
                mRULE_INTEGER(); 

                }
                break;
            case 20 :
                // InternalPoST.g:1:255: RULE_BINARY_INTEGER
                {
                mRULE_BINARY_INTEGER(); 

                }
                break;
            case 21 :
                // InternalPoST.g:1:275: RULE_OCTAL_INTEGER
                {
                mRULE_OCTAL_INTEGER(); 

                }
                break;
            case 22 :
                // InternalPoST.g:1:294: RULE_HEX_INTEGER
                {
                mRULE_HEX_INTEGER(); 

                }
                break;
            case 23 :
                // InternalPoST.g:1:311: RULE_BOOLEAN_LITERAL
                {
                mRULE_BOOLEAN_LITERAL(); 

                }
                break;
            case 24 :
                // InternalPoST.g:1:332: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalPoST.g:1:340: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalPoST.g:1:356: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalPoST.g:1:372: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalPoST.g:1:380: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA3_eotS =
        "\1\2\3\uffff";
    static final String DFA3_eofS =
        "\4\uffff";
    static final String DFA3_minS =
        "\2\60\2\uffff";
    static final String DFA3_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA3_specialS =
        "\4\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\1",
            "\12\1\52\uffff\1\3\3\uffff\1\2\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "2049:17: ( RULE_INTEGER 'd' )?";
        }
    }
    static final String DFA4_eotS =
        "\1\2\3\uffff";
    static final String DFA4_eofS =
        "\4\uffff";
    static final String DFA4_minS =
        "\2\60\2\uffff";
    static final String DFA4_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA4_specialS =
        "\4\uffff}>";
    static final String[] DFA4_transitionS = {
            "\12\1",
            "\12\1\56\uffff\1\3\4\uffff\1\2\5\uffff\1\2",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "2049:37: ( RULE_INTEGER 'h' )?";
        }
    }
    static final String DFA5_eotS =
        "\1\2\2\uffff\1\4\1\uffff";
    static final String DFA5_eofS =
        "\5\uffff";
    static final String DFA5_minS =
        "\2\60\1\uffff\1\163\1\uffff";
    static final String DFA5_maxS =
        "\1\71\1\163\1\uffff\1\163\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA5_specialS =
        "\5\uffff}>";
    static final String[] DFA5_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\3\5\uffff\1\2",
            "",
            "\1\2",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "2049:57: ( RULE_INTEGER 'm' )?";
        }
    }
    static final String DFA6_eotS =
        "\1\2\3\uffff";
    static final String DFA6_eofS =
        "\4\uffff";
    static final String DFA6_minS =
        "\2\60\2\uffff";
    static final String DFA6_maxS =
        "\1\71\1\163\2\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA6_specialS =
        "\4\uffff}>";
    static final String[] DFA6_transitionS = {
            "\12\1",
            "\12\1\63\uffff\1\2\5\uffff\1\3",
            "",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "2049:77: ( RULE_INTEGER 's' )?";
        }
    }
    static final String DFA23_eotS =
        "\1\16\3\37\1\uffff\1\45\1\uffff\1\37\3\uffff\1\34\1\56\1\60\1\uffff\6\37\3\60\1\37\1\uffff\1\34\2\uffff\2\37\1\uffff\3\37\4\uffff\1\112\4\uffff\2\37\3\uffff\1\60\15\37\1\uffff\1\60\1\37\3\uffff\5\37\1\uffff\2\37\1\143\14\37\1\uffff\2\37\1\143\1\37\1\163\1\37\1\56\1\165\1\uffff\1\143\1\37\1\143\3\37\1\172\2\37\1\175\2\163\3\37\1\uffff\1\u0081\1\uffff\1\163\1\175\1\163\1\172\1\uffff\2\172\1\uffff\1\165\1\u0082\1\37\2\uffff\1\u0084\1\uffff";
    static final String DFA23_eofS =
        "\u0085\uffff";
    static final String DFA23_minS =
        "\1\0\1\111\1\117\1\145\1\uffff\1\75\1\uffff\1\124\3\uffff\1\111\1\60\1\43\1\uffff\1\116\2\111\1\104\1\105\1\117\1\43\2\60\1\101\1\uffff\1\52\2\uffff\1\122\1\116\1\uffff\1\124\1\122\1\154\4\uffff\1\60\4\uffff\1\115\1\125\3\uffff\1\60\1\124\1\116\1\117\1\116\1\105\1\117\1\111\1\116\2\111\1\101\1\117\1\124\1\uffff\1\43\1\114\3\uffff\1\111\1\124\1\122\1\104\1\154\1\uffff\2\105\1\60\1\124\1\122\1\124\1\101\1\122\1\116\1\124\2\116\2\114\1\105\1\uffff\1\123\1\116\1\60\1\111\1\60\1\157\2\60\1\uffff\1\60\1\104\1\60\1\114\1\104\1\124\1\60\2\124\3\60\1\105\1\107\1\116\1\uffff\1\60\1\uffff\4\60\1\uffff\2\60\1\uffff\2\60\1\107\2\uffff\1\60\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\124\1\123\1\145\1\uffff\1\75\1\uffff\1\124\3\uffff\1\121\1\172\1\163\1\uffff\1\116\2\127\1\123\1\105\1\131\3\163\1\101\1\uffff\1\57\2\uffff\1\122\1\116\1\uffff\1\124\1\122\1\154\4\uffff\1\172\4\uffff\1\115\1\125\3\uffff\1\163\1\124\1\116\1\117\1\116\1\105\1\117\1\111\1\116\2\111\1\101\1\117\1\124\1\uffff\1\163\1\114\3\uffff\1\111\1\124\1\122\1\104\1\154\1\uffff\2\105\1\172\1\124\1\122\1\124\1\101\1\122\1\116\1\124\2\116\2\114\1\105\1\uffff\1\123\1\116\1\172\1\111\1\172\1\157\2\172\1\uffff\1\172\1\104\1\172\1\114\1\104\1\124\1\172\2\124\3\172\1\105\1\107\1\116\1\uffff\1\172\1\uffff\4\172\1\uffff\2\172\1\uffff\2\172\1\107\2\uffff\1\172\1\uffff";
    static final String DFA23_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\uffff\1\10\1\11\1\13\3\uffff\1\16\12\uffff\1\30\1\uffff\1\33\1\34\2\uffff\1\30\3\uffff\1\4\1\12\1\5\1\6\1\uffff\1\10\1\11\1\13\1\14\2\uffff\1\15\1\24\1\23\16\uffff\1\25\2\uffff\1\31\1\32\1\33\5\uffff\1\7\17\uffff\1\26\10\uffff\1\17\17\uffff\1\22\1\uffff\1\27\4\uffff\1\20\2\uffff\1\21\3\uffff\1\3\1\1\1\uffff\1\2";
    static final String DFA23_specialS =
        "\1\0\u0084\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\4\1\34\1\10\1\34\1\13\6\34\1\6\1\11\1\12\1\32\1\27\1\26\1\15\5\27\1\25\1\27\1\5\6\34\1\7\1\24\1\31\1\20\1\31\1\30\1\31\1\3\1\17\2\31\1\21\5\31\1\23\1\1\1\14\1\22\1\31\1\2\3\31\4\34\1\31\1\34\32\31\uff85\34",
            "\1\36\12\uffff\1\35",
            "\1\41\3\uffff\1\40",
            "\1\42",
            "",
            "\1\44",
            "",
            "\1\47",
            "",
            "",
            "",
            "\1\53\3\uffff\1\53\3\uffff\1\53",
            "\12\37\7\uffff\10\37\1\54\10\37\1\55\10\37\4\uffff\1\37\1\uffff\32\37",
            "\1\57\14\uffff\12\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "",
            "\1\62",
            "\1\63\15\uffff\1\64",
            "\1\65\10\uffff\1\66\4\uffff\1\67",
            "\1\72\4\uffff\1\71\2\uffff\1\73\6\uffff\1\70",
            "\1\74",
            "\1\75\11\uffff\1\76",
            "\1\77\14\uffff\12\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "\6\61\1\100\3\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "\12\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "\1\101",
            "",
            "\1\102\4\uffff\1\103",
            "",
            "",
            "\1\105",
            "\1\106",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "",
            "",
            "",
            "\12\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "\1\132\14\uffff\12\61\52\uffff\1\16\3\uffff\1\16\4\uffff\1\16\5\uffff\1\16",
            "\1\133",
            "",
            "",
            "",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "",
            "\1\141",
            "\1\142",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\162",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\164",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\166",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\173",
            "\1\174",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\u0083",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_DIRECT_VARIABLE | RULE_TIME_PREF_LITERAL | RULE_INTERVAL | RULE_SIGNED_INTEGER_TYPE_NAME | RULE_UNSIGNED_INTEGER_TYPE_NAME | RULE_REAL_TYPE_NAME | RULE_BIT_STRING_TYPE_NAME | RULE_INTEGER | RULE_BINARY_INTEGER | RULE_OCTAL_INTEGER | RULE_HEX_INTEGER | RULE_BOOLEAN_LITERAL | RULE_ID | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='S') ) {s = 1;}

                        else if ( (LA23_0=='W') ) {s = 2;}

                        else if ( (LA23_0=='H') ) {s = 3;}

                        else if ( (LA23_0=='!') ) {s = 4;}

                        else if ( (LA23_0==':') ) {s = 5;}

                        else if ( (LA23_0==',') ) {s = 6;}

                        else if ( (LA23_0=='A') ) {s = 7;}

                        else if ( (LA23_0=='#') ) {s = 8;}

                        else if ( (LA23_0=='-') ) {s = 9;}

                        else if ( (LA23_0=='.') ) {s = 10;}

                        else if ( (LA23_0=='%') ) {s = 11;}

                        else if ( (LA23_0=='T') ) {s = 12;}

                        else if ( (LA23_0=='2') ) {s = 13;}

                        else if ( (LA23_0=='I') ) {s = 15;}

                        else if ( (LA23_0=='D') ) {s = 16;}

                        else if ( (LA23_0=='L') ) {s = 17;}

                        else if ( (LA23_0=='U') ) {s = 18;}

                        else if ( (LA23_0=='R') ) {s = 19;}

                        else if ( (LA23_0=='B') ) {s = 20;}

                        else if ( (LA23_0=='8') ) {s = 21;}

                        else if ( (LA23_0=='1') ) {s = 22;}

                        else if ( (LA23_0=='0'||(LA23_0>='3' && LA23_0<='7')||LA23_0=='9') ) {s = 23;}

                        else if ( (LA23_0=='F') ) {s = 24;}

                        else if ( (LA23_0=='C'||LA23_0=='E'||LA23_0=='G'||(LA23_0>='J' && LA23_0<='K')||(LA23_0>='M' && LA23_0<='Q')||LA23_0=='V'||(LA23_0>='X' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {s = 25;}

                        else if ( (LA23_0=='/') ) {s = 26;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 27;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='\"'||LA23_0=='$'||(LA23_0>='&' && LA23_0<='+')||(LA23_0>=';' && LA23_0<='@')||(LA23_0>='[' && LA23_0<='^')||LA23_0=='`'||(LA23_0>='{' && LA23_0<='\uFFFF')) ) {s = 28;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}