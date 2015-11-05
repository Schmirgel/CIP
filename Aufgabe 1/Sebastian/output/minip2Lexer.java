// $ANTLR 3.4 C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g 2015-11-05 13:10:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class minip2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int BEGIN_TOKEN=4;
    public static final int BLOCK_KOMMENTAR=5;
    public static final int BOOLEAN=6;
    public static final int BOOL_KONSTANTE=7;
    public static final int BUCHSTABE=8;
    public static final int COMPARE_OP=9;
    public static final int END_TOKEN=10;
    public static final int IDENTIFIER=11;
    public static final int INTEGER=12;
    public static final int INT_KONSTANTE=13;
    public static final int LEERZEICHEN=14;
    public static final int NEUE_ZEILE=15;
    public static final int REAL=16;
    public static final int REAL_KONSTANTE=17;
    public static final int START_TOKEN=18;
    public static final int STRING=19;
    public static final int STRING_KONSTANTE=20;
    public static final int ZAHL=21;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public minip2Lexer() {} 
    public minip2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public minip2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g"; }

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:2:7: ( '(' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:2:9: '('
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:3:7: ( ')' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:3:9: ')'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:7: ( '*' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:9: '*'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:5:7: ( '+' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:5:9: '+'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:6:7: ( ',' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:6:9: ','
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
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:7: ( '-' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:9: '-'
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
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:8:7: ( '/' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:8:9: '/'
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
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:9:7: ( ':=' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:9:9: ':='
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
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:10:7: ( ';' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:10:9: ';'
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
    // $ANTLR end "T__30"

    // $ANTLR start "START_TOKEN"
    public final void mSTART_TOKEN() throws RecognitionException {
        try {
            int _type = START_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:37:2: ( 'program' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:37:4: 'program'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:39:2: ( 'begin' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:39:4: 'begin'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:41:2: ( 'end' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:41:4: 'end'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:45:2: ( 'integer' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:45:4: 'integer'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:47:2: ( 'real' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:47:4: 'real'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:49:2: ( 'string' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:49:4: 'string'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:51:2: ( 'boolean' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:51:4: 'boolean'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:54:2: ( 'true' | 'false' )
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
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:54:5: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:54:14: 'false'
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:2: ( ( '=' | '<' | '>' | '<>' | '<= ' | '>=' ) )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:5: ( '=' | '<' | '>' | '<>' | '<= ' | '>=' )
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:5: ( '=' | '<' | '>' | '<>' | '<= ' | '>=' )
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
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:6: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:12: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:18: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:24: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 5 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:31: '<= '
                    {
                    match("<= "); 



                    }
                    break;
                case 6 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:57:38: '>='
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:60:2: ( BUCHSTABE ( BUCHSTABE | ZAHL | '_' )* )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:60:4: BUCHSTABE ( BUCHSTABE | ZAHL | '_' )*
            {
            mBUCHSTABE(); 


            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:60:14: ( BUCHSTABE | ZAHL | '_' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:63:2: ( ( ZAHL )+ )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:63:4: ( ZAHL )+
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:63:4: ( ZAHL )+
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
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:65:2: ( ( ZAHL )+ '.' ( ZAHL )+ )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:65:4: ( ZAHL )+ '.' ( ZAHL )+
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:65:4: ( ZAHL )+
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
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:65:12: ( ZAHL )+
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
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:67:2: ( '\\'' ( BUCHSTABE | ZAHL | ' ' )* '\\'' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:67:3: '\\'' ( BUCHSTABE | ZAHL | ' ' )* '\\''
            {
            match('\''); 

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:67:8: ( BUCHSTABE | ZAHL | ' ' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==' '||(LA7_0 >= '0' && LA7_0 <= '9')||(LA7_0 >= 'A' && LA7_0 <= 'Z')||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:70:2: ( ( '0' .. '9' ) )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:72:2: ( 'a' .. 'z' | 'A' .. 'Z' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:75:2: ( '/*' ( . )* '*/' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:75:4: '/*' ( . )* '*/'
            {
            match("/*"); 



            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:75:9: ( . )*
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
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:75:9: .
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:77:2: ( ( ' ' | '\\t' ) )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:77:4: ( ' ' | '\\t' )
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:2: ( ( ( '\\r' )? '\\n' ) )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:4: ( ( '\\r' )? '\\n' )
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:4: ( ( '\\r' )? '\\n' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:5: ( '\\r' )? '\\n'
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:5: ( '\\r' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\r') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:79:5: '\\r'
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
        // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:8: ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | START_TOKEN | BEGIN_TOKEN | END_TOKEN | INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE | BOOLEAN | COMPARE_OP | IDENTIFIER | INTEGER | REAL | STRING | BLOCK_KOMMENTAR | LEERZEICHEN | NEUE_ZEILE )
        int alt10=25;
        alt10 = dfa10.predict(input);
        switch (alt10) {
            case 1 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:10: T__22
                {
                mT__22(); 


                }
                break;
            case 2 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:16: T__23
                {
                mT__23(); 


                }
                break;
            case 3 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:22: T__24
                {
                mT__24(); 


                }
                break;
            case 4 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:28: T__25
                {
                mT__25(); 


                }
                break;
            case 5 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:34: T__26
                {
                mT__26(); 


                }
                break;
            case 6 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:40: T__27
                {
                mT__27(); 


                }
                break;
            case 7 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:46: T__28
                {
                mT__28(); 


                }
                break;
            case 8 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:52: T__29
                {
                mT__29(); 


                }
                break;
            case 9 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:58: T__30
                {
                mT__30(); 


                }
                break;
            case 10 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:64: START_TOKEN
                {
                mSTART_TOKEN(); 


                }
                break;
            case 11 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:76: BEGIN_TOKEN
                {
                mBEGIN_TOKEN(); 


                }
                break;
            case 12 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:88: END_TOKEN
                {
                mEND_TOKEN(); 


                }
                break;
            case 13 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:98: INT_KONSTANTE
                {
                mINT_KONSTANTE(); 


                }
                break;
            case 14 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:112: REAL_KONSTANTE
                {
                mREAL_KONSTANTE(); 


                }
                break;
            case 15 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:127: STRING_KONSTANTE
                {
                mSTRING_KONSTANTE(); 


                }
                break;
            case 16 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:144: BOOL_KONSTANTE
                {
                mBOOL_KONSTANTE(); 


                }
                break;
            case 17 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:159: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 18 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:167: COMPARE_OP
                {
                mCOMPARE_OP(); 


                }
                break;
            case 19 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:178: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 20 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:189: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 21 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:197: REAL
                {
                mREAL(); 


                }
                break;
            case 22 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:202: STRING
                {
                mSTRING(); 


                }
                break;
            case 23 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:209: BLOCK_KOMMENTAR
                {
                mBLOCK_KOMMENTAR(); 


                }
                break;
            case 24 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:225: LEERZEICHEN
                {
                mLEERZEICHEN(); 


                }
                break;
            case 25 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:1:237: NEUE_ZEILE
                {
                mNEUE_ZEILE(); 


                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    static final String DFA10_eotS =
        "\7\uffff\1\31\2\uffff\10\23\2\uffff\1\43\5\uffff\11\23\2\uffff\3"+
        "\23\1\61\10\23\1\uffff\1\23\1\73\1\23\1\75\2\23\1\100\2\23\1\uffff"+
        "\1\23\1\uffff\1\75\1\23\1\uffff\2\23\1\107\1\110\1\111\1\112\4\uffff";
    static final String DFA10_eofS =
        "\113\uffff";
    static final String DFA10_minS =
        "\1\11\6\uffff\1\52\2\uffff\1\162\1\145\2\156\1\145\1\164\1\162\1"+
        "\141\2\uffff\1\56\5\uffff\1\157\1\147\1\157\1\144\1\164\1\141\1"+
        "\162\1\165\1\154\2\uffff\1\147\1\151\1\154\1\60\1\145\1\154\1\151"+
        "\1\145\1\163\1\162\1\156\1\145\1\uffff\1\147\1\60\1\156\1\60\1\145"+
        "\1\141\1\60\1\141\1\145\1\uffff\1\147\1\uffff\1\60\1\155\1\uffff"+
        "\1\156\1\162\4\60\4\uffff";
    static final String DFA10_maxS =
        "\1\172\6\uffff\1\52\2\uffff\1\162\1\157\2\156\1\145\1\164\1\162"+
        "\1\141\2\uffff\1\71\5\uffff\1\157\1\147\1\157\1\144\1\164\1\141"+
        "\1\162\1\165\1\154\2\uffff\1\147\1\151\1\154\1\172\1\145\1\154\1"+
        "\151\1\145\1\163\1\162\1\156\1\145\1\uffff\1\147\1\172\1\156\1\172"+
        "\1\145\1\141\1\172\1\141\1\145\1\uffff\1\147\1\uffff\1\172\1\155"+
        "\1\uffff\1\156\1\162\4\172\4\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\10\uffff\1\22"+
        "\1\23\1\uffff\1\26\1\30\1\31\1\27\1\7\11\uffff\1\24\1\25\14\uffff"+
        "\1\14\11\uffff\1\16\1\uffff\1\21\2\uffff\1\13\6\uffff\1\17\1\12"+
        "\1\20\1\15";
    static final String DFA10_specialS =
        "\113\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\26\1\27\2\uffff\1\27\22\uffff\1\26\6\uffff\1\25\1\1\1\2\1"+
            "\3\1\4\1\5\1\6\1\uffff\1\7\12\24\1\10\1\11\3\22\2\uffff\32\23"+
            "\6\uffff\1\23\1\13\2\23\1\14\1\21\2\23\1\15\6\23\1\12\1\23\1"+
            "\16\1\17\1\20\6\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30",
            "",
            "",
            "\1\32",
            "\1\33\11\uffff\1\34",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "",
            "",
            "\1\44\1\uffff\12\24",
            "",
            "",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "\1\72",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\74",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\76",
            "\1\77",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
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
            return "1:1: Tokens : ( T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | START_TOKEN | BEGIN_TOKEN | END_TOKEN | INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE | BOOLEAN | COMPARE_OP | IDENTIFIER | INTEGER | REAL | STRING | BLOCK_KOMMENTAR | LEERZEICHEN | NEUE_ZEILE );";
        }
    }
 

}