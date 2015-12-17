// $ANTLR 3.4 /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g 2015-12-16 11:46:45

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
    public static final int N=19;
    public static final int O=20;
    public static final int OP=21;
    public static final int P=22;
    public static final int Q=23;
    public static final int R=24;
    public static final int S=25;
    public static final int T=26;
    public static final int U=27;
    public static final int V=28;
    public static final int W=29;
    public static final int WORD=30;
    public static final int WS=31;
    public static final int X=32;
    public static final int Y=33;
    public static final int Z=34;

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
    public String getGrammarFileName() { return "/Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g"; }

    // $ANTLR start "BUCHSTABEN"
    public final void mBUCHSTABEN() throws RecognitionException {
        try {
            int _type = BUCHSTABEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:31:2: ( ( A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z ) )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:34:4: ( '=' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:34:6: '='
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:36:4: ( ( '+' | '-' ) )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:
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

    // $ANTLR start "A"
    public final void mA() throws RecognitionException {
        try {
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:38:12: ( 'A' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:38:14: 'A'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:39:12: ( 'B' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:39:14: 'B'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:40:12: ( 'C' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:40:14: 'C'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:41:12: ( 'D' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:41:14: 'D'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:42:12: ( 'E' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:42:14: 'E'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:43:12: ( 'F' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:43:14: 'F'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:44:12: ( 'G' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:44:14: 'G'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:45:12: ( 'H' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:45:14: 'H'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:46:12: ( 'I' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:46:14: 'I'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:47:12: ( 'J' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:47:14: 'J'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:48:12: ( 'K' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:48:14: 'K'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:49:12: ( 'L' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:49:14: 'L'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:50:12: ( 'M' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:50:14: 'M'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:51:12: ( 'N' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:51:14: 'N'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:52:12: ( 'O' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:52:14: 'O'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:53:12: ( 'P' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:53:14: 'P'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:54:12: ( 'Q' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:54:14: 'Q'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:55:12: ( 'R' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:55:14: 'R'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:56:12: ( 'S' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:56:14: 'S'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:57:12: ( 'T' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:57:14: 'T'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:58:12: ( 'U' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:58:14: 'U'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:59:12: ( 'V' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:59:14: 'V'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:60:12: ( 'W' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:60:14: 'W'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:61:12: ( 'X' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:61:14: 'X'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:62:12: ( 'Y' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:62:14: 'Y'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:63:12: ( 'Z' )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:63:14: 'Z'
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
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:65:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:65:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:1:8: ( BUCHSTABEN | EQ | OP | WS )
        int alt1=4;
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
        case '-':
            {
            alt1=3;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt1=4;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 1, 0, input);

            throw nvae;

        }

        switch (alt1) {
            case 1 :
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:1:10: BUCHSTABEN
                {
                mBUCHSTABEN(); 


                }
                break;
            case 2 :
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:1:21: EQ
                {
                mEQ(); 


                }
                break;
            case 3 :
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:1:24: OP
                {
                mOP(); 


                }
                break;
            case 4 :
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:1:27: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}