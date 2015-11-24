// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g 2015-11-24 10:30:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_Erzeugung1Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int T__6=6;
    public static final int INT=4;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public AST_Erzeugung1Lexer() {} 
    public AST_Erzeugung1Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public AST_Erzeugung1Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:2:6: ( '+' )
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:2:8: '+'
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
    // $ANTLR end "T__5"

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:3:6: ( '-' )
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:3:8: '-'
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
    // $ANTLR end "T__6"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:14:6: ( ( '0' .. '9' )+ )
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:14:8: ( '0' .. '9' )+
            {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:14:8: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:
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
    // $ANTLR end "INT"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:1:8: ( T__5 | T__6 | INT )
        int alt2=3;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt2=1;
            }
            break;
        case '-':
            {
            alt2=2;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
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
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:1:10: T__5
                {
                mT__5(); 


                }
                break;
            case 2 :
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:1:15: T__6
                {
                mT__6(); 


                }
                break;
            case 3 :
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:1:20: INT
                {
                mINT(); 


                }
                break;

        }

    }


 

}