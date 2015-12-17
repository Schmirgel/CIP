// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g 2015-12-08 10:11:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int EQ=4;
    public static final int ID=5;
    public static final int OP=6;
    public static final int WS=7;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AST_SymbolraetselLexer() {} 
    public AST_SymbolraetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AST_SymbolraetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g"; }

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:29:4: ( '=' )
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:29:6: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "OP"
    public final void mOP() throws RecognitionException {
        try {
            int _type = OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:31:4: ( ( '+' | '-' ) )
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:33:5: ( ( 'A' .. 'Z' )+ )
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:33:7: ( 'A' .. 'Z' )+
            {
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:33:7: ( 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:
            	    {
            	    if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
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
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:35:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:35:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:1:8: ( EQ | OP | ID | WS )
        int alt2=4;
        switch ( input.LA(1) ) {
        case '=':
            {
            alt2=1;
            }
            break;
        case '+':
        case '-':
            {
            alt2=2;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
            {
            alt2=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
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
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:1:10: EQ
                {
                mEQ(); 


                }
                break;
            case 2 :
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:1:13: OP
                {
                mOP(); 


                }
                break;
            case 3 :
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:1:16: ID
                {
                mID(); 


                }
                break;
            case 4 :
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:1:19: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}