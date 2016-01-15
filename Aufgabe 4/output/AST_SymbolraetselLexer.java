// $ANTLR 3.4 Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g 2016-01-15 14:20:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolraetselLexer extends Lexer {
    public static final int EOF=-1;
    public static final int A=4;
    public static final int B=5;
    public static final int BUCHSTABEN=6;
    public static final int C=7;
    public static final int D=8;
    public static final int E=9;
    public static final int EQ=10;
    public static final int F=11;
    public static final int G=12;
    public static final int H=13;
    public static final int I=14;
    public static final int J=15;
    public static final int K=16;
    public static final int L=17;
    public static final int M=18;
    public static final int MINUS=19;
    public static final int N=20;
    public static final int O=21;
    public static final int P=22;
    public static final int PLUS=23;
    public static final int Q=24;
    public static final int R=25;
    public static final int S=26;
    public static final int T=27;
    public static final int U=28;
    public static final int V=29;
    public static final int W=30;
    public static final int WORD=31;
    public static final int WS=32;
    public static final int X=33;
    public static final int Y=34;
    public static final int Z=35;

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
    public String getGrammarFileName() { return "Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g"; }

    // $ANTLR start "BUCHSTABEN"
    public final void mBUCHSTABEN() throws RecognitionException {
        try {
            int _type = BUCHSTABEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:33:2: ( ( A | B | C | D | E | F | G | H | I | J | K | L | N | M | O | P | Q | R | T | U | S | V | W | X | Y | Z ) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BUCHSTABEN"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:36:4: ( '=' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:36:6: '='
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

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:41:6: ( '+' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:41:8: '+'
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
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:43:7: ( '-' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:43:9: '-'
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
    // $ANTLR end "MINUS"

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:45:12: ( 'A' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:45:14: 'A'
            {
            match('A'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "A"

    // $ANTLR start "B"
    public final void mB() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:46:12: ( 'B' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:46:14: 'B'
            {
            match('B'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "B"

    // $ANTLR start "C"
    public final void mC() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:47:12: ( 'C' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:47:14: 'C'
            {
            match('C'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "C"

    // $ANTLR start "D"
    public final void mD() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:48:12: ( 'D' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:48:14: 'D'
            {
            match('D'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "D"

    // $ANTLR start "E"
    public final void mE() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:49:12: ( 'E' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:49:14: 'E'
            {
            match('E'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "E"

    // $ANTLR start "F"
    public final void mF() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:50:12: ( 'F' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:50:14: 'F'
            {
            match('F'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "F"

    // $ANTLR start "G"
    public final void mG() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:51:12: ( 'G' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:51:14: 'G'
            {
            match('G'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "G"

    // $ANTLR start "H"
    public final void mH() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:52:12: ( 'H' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:52:14: 'H'
            {
            match('H'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "H"

    // $ANTLR start "I"
    public final void mI() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:53:12: ( 'I' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:53:14: 'I'
            {
            match('I'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "I"

    // $ANTLR start "J"
    public final void mJ() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:54:12: ( 'J' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:54:14: 'J'
            {
            match('J'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "J"

    // $ANTLR start "K"
    public final void mK() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:55:12: ( 'K' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:55:14: 'K'
            {
            match('K'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "K"

    // $ANTLR start "L"
    public final void mL() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:56:12: ( 'L' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:56:14: 'L'
            {
            match('L'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "L"

    // $ANTLR start "M"
    public final void mM() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:57:12: ( 'M' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:57:14: 'M'
            {
            match('M'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "M"

    // $ANTLR start "N"
    public final void mN() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:58:12: ( 'N' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:58:14: 'N'
            {
            match('N'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "N"

    // $ANTLR start "O"
    public final void mO() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:59:12: ( 'O' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:59:14: 'O'
            {
            match('O'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "O"

    // $ANTLR start "P"
    public final void mP() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:60:12: ( 'P' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:60:14: 'P'
            {
            match('P'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "P"

    // $ANTLR start "Q"
    public final void mQ() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:61:12: ( 'Q' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:61:14: 'Q'
            {
            match('Q'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Q"

    // $ANTLR start "R"
    public final void mR() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:62:12: ( 'R' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:62:14: 'R'
            {
            match('R'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "R"

    // $ANTLR start "S"
    public final void mS() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:63:12: ( 'S' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:63:14: 'S'
            {
            match('S'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "S"

    // $ANTLR start "T"
    public final void mT() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:64:12: ( 'T' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:64:14: 'T'
            {
            match('T'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T"

    // $ANTLR start "U"
    public final void mU() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:65:12: ( 'U' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:65:14: 'U'
            {
            match('U'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "U"

    // $ANTLR start "V"
    public final void mV() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:66:12: ( 'V' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:66:14: 'V'
            {
            match('V'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "V"

    // $ANTLR start "W"
    public final void mW() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:67:12: ( 'W' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:67:14: 'W'
            {
            match('W'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "W"

    // $ANTLR start "X"
    public final void mX() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:68:12: ( 'X' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:68:14: 'X'
            {
            match('X'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "X"

    // $ANTLR start "Y"
    public final void mY() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:69:12: ( 'Y' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:69:14: 'Y'
            {
            match('Y'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Y"

    // $ANTLR start "Z"
    public final void mZ() throws RecognitionException {
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:70:12: ( 'Z' )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:70:14: 'Z'
            {
            match('Z'); 

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Z"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:72:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:72:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:8: ( BUCHSTABEN | EQ | PLUS | MINUS | WS )
        int alt1=5;
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
            {
            alt1=1;
            }
            break;
        case '=':
            {
            alt1=2;
            }
            break;
        case '+':
            {
            alt1=3;
            }
            break;
        case '-':
            {
            alt1=4;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=5;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:10: BUCHSTABEN
                {
                mBUCHSTABEN(); 


                }
                break;
            case 2 :
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:21: EQ
                {
                mEQ(); 


                }
                break;
            case 3 :
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:24: PLUS
                {
                mPLUS(); 


                }
                break;
            case 4 :
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:29: MINUS
                {
                mMINUS(); 


                }
                break;
            case 5 :
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:1:35: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}