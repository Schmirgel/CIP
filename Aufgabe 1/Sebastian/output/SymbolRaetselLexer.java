// $ANTLR 3.4 C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g 2015-11-05 12:55:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRaetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int EQUALS=4;
    public static final int OPERATOR=5;
    public static final int WORD=6;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SymbolRaetselLexer() {} 
    public SymbolRaetselLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolRaetselLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g"; }

    // $ANTLR start "WORD"
    public final void mWORD() throws RecognitionException {
        try {
            int _type = WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:9:6: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:9:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:9:8: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:
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
    // $ANTLR end "WORD"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:10:9: ( '+' | '-' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:
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
    // $ANTLR end "OPERATOR"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:11:8: ( '=' )
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:11:10: '='
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
    // $ANTLR end "EQUALS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:1:8: ( WORD | OPERATOR | EQUALS )
        int alt2=3;
        switch ( input.LA(1) ) {
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
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'v':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
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
        case '=':
            {
            alt2=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:1:10: WORD
                {
                mWORD(); 


                }
                break;
            case 2 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:1:15: OPERATOR
                {
                mOPERATOR(); 


                }
                break;
            case 3 :
                // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:1:24: EQUALS
                {
                mEQUALS(); 


                }
                break;

        }

    }


 

}