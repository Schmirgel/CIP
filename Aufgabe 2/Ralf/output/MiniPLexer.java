// $ANTLR 3.4 Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g 2015-11-26 12:46:38

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int BEGIN_TOKEN=4;
    public static final int BLOCK_KOMMENTAR=5;
    public static final int BOOLEAN=6;
    public static final int BOOL_KONSTANTE=7;
    public static final int BUCHSTABE=8;
    public static final int COMPARE_OP=9;
    public static final int ELSE=10;
    public static final int END_TOKEN=11;
    public static final int IDENTIFIER=12;
    public static final int INTEGER=13;
    public static final int INT_KONSTANTE=14;
    public static final int LEERZEICHEN=15;
    public static final int NEUE_ZEILE=16;
    public static final int REAL=17;
    public static final int REAL_KONSTANTE=18;
    public static final int START_TOKEN=19;
    public static final int STRING=20;
    public static final int STRING_KONSTANTE=21;
    public static final int THEN=22;
    public static final int ZAHL=23;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public MiniPLexer() {} 
    public MiniPLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniPLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g"; }

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:2:7: ( '(' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:2:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:3:7: ( ')' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:3:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:4:7: ( '*' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:4:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:5:7: ( '+' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:6:7: ( ',' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:7:7: ( '-' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:7:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:8:7: ( '/' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:8:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:9:7: ( ':=' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:9:9: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:7: ( ';' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:11:7: ( 'do' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:11:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:12:7: ( 'else' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:12:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:7: ( 'fi' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:9: 'fi'
            {
            match("fi"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:14:7: ( 'if' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:14:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:15:7: ( 'od' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:15:9: 'od'
            {
            match("od"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:16:7: ( 'println' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:16:9: 'println'
            {
            match("println"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:17:7: ( 'read' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:17:9: 'read'
            {
            match("read"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:18:7: ( 'then' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:18:9: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:7: ( 'while' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "START_TOKEN"
    public final void mSTART_TOKEN() throws RecognitionException {
        try {
            int _type = START_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:64:2: ( 'program' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:64:4: 'program'
            {
            match("program"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "START_TOKEN"

    // $ANTLR start "BEGIN_TOKEN"
    public final void mBEGIN_TOKEN() throws RecognitionException {
        try {
            int _type = BEGIN_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:66:2: ( 'begin' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:66:4: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BEGIN_TOKEN"

    // $ANTLR start "END_TOKEN"
    public final void mEND_TOKEN() throws RecognitionException {
        try {
            int _type = END_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:68:2: ( 'end' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:68:4: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END_TOKEN"

    // $ANTLR start "INT_KONSTANTE"
    public final void mINT_KONSTANTE() throws RecognitionException {
        try {
            int _type = INT_KONSTANTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:72:2: ( 'integer' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:72:4: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_KONSTANTE"

    // $ANTLR start "REAL_KONSTANTE"
    public final void mREAL_KONSTANTE() throws RecognitionException {
        try {
            int _type = REAL_KONSTANTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:74:2: ( 'real' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:74:4: 'real'
            {
            match("real"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL_KONSTANTE"

    // $ANTLR start "STRING_KONSTANTE"
    public final void mSTRING_KONSTANTE() throws RecognitionException {
        try {
            int _type = STRING_KONSTANTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:76:2: ( 'string' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:76:4: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_KONSTANTE"

    // $ANTLR start "BOOL_KONSTANTE"
    public final void mBOOL_KONSTANTE() throws RecognitionException {
        try {
            int _type = BOOL_KONSTANTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:78:2: ( 'boolean' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:78:4: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOL_KONSTANTE"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:81:2: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:81:5: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:81:14: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "COMPARE_OP"
    public final void mCOMPARE_OP() throws RecognitionException {
        try {
            int _type = COMPARE_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:2: ( ( '=' | '<' | '>' | '<>' | '<= ' | '>=' ) )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:5: ( '=' | '<' | '>' | '<>' | '<= ' | '>=' )
            {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:5: ( '=' | '<' | '>' | '<>' | '<= ' | '>=' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case '=':
                {
                alt2=1;
                }
                break;
            case '<':
                {
                switch ( input.LA(2) ) {
                case '>':
                    {
                    alt2=4;
                    }
                    break;
                case '=':
                    {
                    alt2=5;
                    }
                    break;
                default:
                    alt2=2;
                }

                }
                break;
            case '>':
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3=='=') ) {
                    alt2=6;
                }
                else {
                    alt2=3;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:6: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:12: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:18: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:24: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 5 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:31: '<= '
                    {
                    match("<= "); 



                    }
                    break;
                case 6 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:84:38: '>='
                    {
                    match(">="); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMPARE_OP"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:87:2: ( BUCHSTABE ( BUCHSTABE | ZAHL | '_' )* )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:87:4: BUCHSTABE ( BUCHSTABE | ZAHL | '_' )*
            {
            mBUCHSTABE(); 


            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:87:14: ( BUCHSTABE | ZAHL | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:90:2: ( ( ZAHL )+ )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:90:4: ( ZAHL )+
            {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:90:4: ( ZAHL )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:92:2: ( ( ZAHL )+ '.' ( ZAHL )+ )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:92:4: ( ZAHL )+ '.' ( ZAHL )+
            {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:92:4: ( ZAHL )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            match('.'); 

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:92:12: ( ZAHL )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:94:2: ( '\\'' ( BUCHSTABE | ZAHL | ' ' )* '\\'' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:94:3: '\\'' ( BUCHSTABE | ZAHL | ' ' )* '\\''
            {
            match('\''); 

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:94:8: ( BUCHSTABE | ZAHL | ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==' '||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            	    {
            	    if ( input.LA(1)==' '||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ZAHL"
    public final void mZAHL() throws RecognitionException {
        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:97:2: ( ( '0' .. '9' ) )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ZAHL"

    // $ANTLR start "BUCHSTABE"
    public final void mBUCHSTABE() throws RecognitionException {
        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:99:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BUCHSTABE"

    // $ANTLR start "BLOCK_KOMMENTAR"
    public final void mBLOCK_KOMMENTAR() throws RecognitionException {
        try {
            int _type = BLOCK_KOMMENTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:102:2: ( '/*' ( . )* '*/' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:102:4: '/*' ( . )* '*/'
            {
            match("/*"); 



            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:102:9: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:102:9: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match("*/"); 



             skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BLOCK_KOMMENTAR"

    // $ANTLR start "LEERZEICHEN"
    public final void mLEERZEICHEN() throws RecognitionException {
        try {
            int _type = LEERZEICHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:104:2: ( ( ' ' | '\\t' ) )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:104:4: ( ' ' | '\\t' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEERZEICHEN"

    // $ANTLR start "NEUE_ZEILE"
    public final void mNEUE_ZEILE() throws RecognitionException {
        try {
            int _type = NEUE_ZEILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:2: ( ( ( '\\r' )? '\\n' ) )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:4: ( ( '\\r' )? '\\n' )
            {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:4: ( ( '\\r' )? '\\n' )
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:5: ( '\\r' )? '\\n'
            {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:5: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:106:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }


             skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NEUE_ZEILE"

    public void mTokens() throws RecognitionException {
        // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:8: ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | START_TOKEN | BEGIN_TOKEN | END_TOKEN | INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE | BOOLEAN | COMPARE_OP | IDENTIFIER | INTEGER | REAL | STRING | BLOCK_KOMMENTAR | LEERZEICHEN | NEUE_ZEILE )
        int alt10=34;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:10: T__24
                {
                mT__24(); 


                }
                break;
            case 2 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:16: T__25
                {
                mT__25(); 


                }
                break;
            case 3 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:22: T__26
                {
                mT__26(); 


                }
                break;
            case 4 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:28: T__27
                {
                mT__27(); 


                }
                break;
            case 5 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:34: T__28
                {
                mT__28(); 


                }
                break;
            case 6 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:40: T__29
                {
                mT__29(); 


                }
                break;
            case 7 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:46: T__30
                {
                mT__30(); 


                }
                break;
            case 8 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:52: T__31
                {
                mT__31(); 


                }
                break;
            case 9 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:58: T__32
                {
                mT__32(); 


                }
                break;
            case 10 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:64: T__33
                {
                mT__33(); 


                }
                break;
            case 11 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:70: T__34
                {
                mT__34(); 


                }
                break;
            case 12 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:76: T__35
                {
                mT__35(); 


                }
                break;
            case 13 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:82: T__36
                {
                mT__36(); 


                }
                break;
            case 14 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:88: T__37
                {
                mT__37(); 


                }
                break;
            case 15 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:94: T__38
                {
                mT__38(); 


                }
                break;
            case 16 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:100: T__39
                {
                mT__39(); 


                }
                break;
            case 17 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:106: T__40
                {
                mT__40(); 


                }
                break;
            case 18 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:112: T__41
                {
                mT__41(); 


                }
                break;
            case 19 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:118: START_TOKEN
                {
                mSTART_TOKEN(); 


                }
                break;
            case 20 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:130: BEGIN_TOKEN
                {
                mBEGIN_TOKEN(); 


                }
                break;
            case 21 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:142: END_TOKEN
                {
                mEND_TOKEN(); 


                }
                break;
            case 22 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:152: INT_KONSTANTE
                {
                mINT_KONSTANTE(); 


                }
                break;
            case 23 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:166: REAL_KONSTANTE
                {
                mREAL_KONSTANTE(); 


                }
                break;
            case 24 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:181: STRING_KONSTANTE
                {
                mSTRING_KONSTANTE(); 


                }
                break;
            case 25 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:198: BOOL_KONSTANTE
                {
                mBOOL_KONSTANTE(); 


                }
                break;
            case 26 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:213: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 27 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:221: COMPARE_OP
                {
                mCOMPARE_OP(); 


                }
                break;
            case 28 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:232: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 29 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:243: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 30 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:251: REAL
                {
                mREAL(); 


                }
                break;
            case 31 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:256: STRING
                {
                mSTRING(); 


                }
                break;
            case 32 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:263: BLOCK_KOMMENTAR
                {
                mBLOCK_KOMMENTAR(); 


                }
                break;
            case 33 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:279: LEERZEICHEN
                {
                mLEERZEICHEN(); 


                }
                break;
            case 34 :
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:1:291: NEUE_ZEILE
                {
                mNEUE_ZEILE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff\1\34\2\uffff\13\26\2\uffff\1\55\5\uffff\1\57\2\26\1\62"+
        "\1\26\1\64\1\26\1\66\10\26\3\uffff\1\26\1\101\1\uffff\1\26\1\uffff"+
        "\1\26\1\uffff\11\26\1\116\1\uffff\4\26\1\123\1\124\1\125\1\126\4"+
        "\26\1\uffff\1\126\3\26\4\uffff\1\136\1\137\5\26\2\uffff\1\26\1\146"+
        "\1\147\1\150\1\151\1\152\5\uffff";
    static final String DFA10_eofS =
        "\153\uffff";
    static final String DFA10_minS =
        "\1\11\6\uffff\1\52\2\uffff\1\157\1\154\1\141\1\146\1\144\1\162\1"+
        "\145\2\150\1\145\1\164\2\uffff\1\56\5\uffff\1\60\1\163\1\144\1\60"+
        "\1\154\1\60\1\164\1\60\1\151\1\141\1\145\1\165\1\151\1\147\1\157"+
        "\1\162\3\uffff\1\145\1\60\1\uffff\1\163\1\uffff\1\145\1\uffff\1"+
        "\156\1\147\1\144\1\156\1\145\1\154\1\151\1\154\1\151\1\60\1\uffff"+
        "\1\145\1\147\1\164\1\162\4\60\1\145\1\156\1\145\1\156\1\uffff\1"+
        "\60\1\145\1\154\1\141\4\uffff\2\60\1\141\1\147\1\162\1\156\1\155"+
        "\2\uffff\1\156\5\60\5\uffff";
    static final String DFA10_maxS =
        "\1\172\6\uffff\1\52\2\uffff\1\157\1\156\1\151\1\156\1\144\1\162"+
        "\1\145\1\162\1\150\1\157\1\164\2\uffff\1\71\5\uffff\1\172\1\163"+
        "\1\144\1\172\1\154\1\172\1\164\1\172\1\157\1\141\1\145\1\165\1\151"+
        "\1\147\1\157\1\162\3\uffff\1\145\1\172\1\uffff\1\163\1\uffff\1\145"+
        "\1\uffff\1\156\1\147\1\154\1\156\1\145\1\154\1\151\1\154\1\151\1"+
        "\172\1\uffff\1\145\1\147\1\164\1\162\4\172\1\145\1\156\1\145\1\156"+
        "\1\uffff\1\172\1\145\1\154\1\141\4\uffff\2\172\1\141\1\147\1\162"+
        "\1\156\1\155\2\uffff\1\156\5\172\5\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\13\uffff\1\33"+
        "\1\34\1\uffff\1\37\1\41\1\42\1\40\1\7\20\uffff\1\35\1\36\1\12\2"+
        "\uffff\1\14\1\uffff\1\15\1\uffff\1\16\12\uffff\1\25\14\uffff\1\13"+
        "\4\uffff\1\20\1\27\1\21\1\32\7\uffff\1\22\1\24\6\uffff\1\30\1\26"+
        "\1\17\1\23\1\31";
    static final String DFA10_specialS =
        "\153\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\31\1\32\2\uffff\1\32\22\uffff\1\31\6\uffff\1\30\1\1\1\2\1"+
            "\3\1\4\1\5\1\6\1\uffff\1\7\12\27\1\10\1\11\3\25\2\uffff\32\26"+
            "\6\uffff\1\26\1\23\1\26\1\12\1\13\1\14\2\26\1\15\5\26\1\16\1"+
            "\17\1\26\1\20\1\24\1\21\2\26\1\22\3\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\33",
            "",
            "",
            "\1\35",
            "\1\36\1\uffff\1\37",
            "\1\41\7\uffff\1\40",
            "\1\42\7\uffff\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47\11\uffff\1\50",
            "\1\51",
            "\1\52\11\uffff\1\53",
            "\1\54",
            "",
            "",
            "\1\56\1\uffff\12\27",
            "",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\60",
            "\1\61",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\63",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\65",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\67\5\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "\1\100",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\102",
            "",
            "\1\103",
            "",
            "\1\104",
            "\1\105",
            "\1\106\7\uffff\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "",
            "\1\145",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "\12\26\7\uffff\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | START_TOKEN | BEGIN_TOKEN | END_TOKEN | INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE | BOOLEAN | COMPARE_OP | IDENTIFIER | INTEGER | REAL | STRING | BLOCK_KOMMENTAR | LEERZEICHEN | NEUE_ZEILE );";
        }
    }
 

}