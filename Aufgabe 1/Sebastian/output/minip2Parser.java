// $ANTLR 3.4 C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g 2015-11-05 13:10:34

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class minip2Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN_TOKEN", "BLOCK_KOMMENTAR", "BOOLEAN", "BOOL_KONSTANTE", "BUCHSTABE", "COMPARE_OP", "END_TOKEN", "IDENTIFIER", "INTEGER", "INT_KONSTANTE", "LEERZEICHEN", "NEUE_ZEILE", "REAL", "REAL_KONSTANTE", "START_TOKEN", "STRING", "STRING_KONSTANTE", "ZAHL", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "konstanten", "atom", "anweisung", "vergleich", "start", 
    "deklaration", "wertzuweisung", "arith_ausdruck", "mult"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public minip2Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public minip2Parser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public minip2Parser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return minip2Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g"; }



    // $ANTLR start "start"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:3:1: start : START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:2: ( START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:4: START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN
            {
            dbg.location(4,4);
            match(input,START_TOKEN,FOLLOW_START_TOKEN_in_start11); 
            dbg.location(4,16);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:16: ( deklaration )*
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==BOOL_KONSTANTE||LA1_0==INT_KONSTANTE||LA1_0==REAL_KONSTANTE||LA1_0==STRING_KONSTANTE) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:16: deklaration
            	    {
            	    dbg.location(4,16);
            	    pushFollow(FOLLOW_deklaration_in_start13);
            	    deklaration();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(4,29);
            match(input,BEGIN_TOKEN,FOLLOW_BEGIN_TOKEN_in_start16); 
            dbg.location(4,41);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:41: ( anweisung )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:4:41: anweisung
            	    {
            	    dbg.location(4,41);
            	    pushFollow(FOLLOW_anweisung_in_start18);
            	    anweisung();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}

            dbg.location(4,52);
            match(input,END_TOKEN,FOLLOW_END_TOKEN_in_start21); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(4, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "deklaration"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:6:1: deklaration : konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' ;
    public final void deklaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:2: ( konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:4: konstanten IDENTIFIER ( ',' IDENTIFIER )* ';'
            {
            dbg.location(7,4);
            pushFollow(FOLLOW_konstanten_in_deklaration34);
            konstanten();

            state._fsp--;

            dbg.location(7,15);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration36); 
            dbg.location(7,26);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:26: ( ',' IDENTIFIER )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==26) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:7:27: ',' IDENTIFIER
            	    {
            	    dbg.location(7,27);
            	    match(input,26,FOLLOW_26_in_deklaration39); 
            	    dbg.location(7,31);
            	    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration41); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(7,44);
            match(input,30,FOLLOW_30_in_deklaration45); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(7, 47);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deklaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "deklaration"



    // $ANTLR start "konstanten"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:9:1: konstanten : ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) ;
    public final void konstanten() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "konstanten");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:10:2: ( ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
            {
            dbg.location(10,2);
            if ( input.LA(1)==BOOL_KONSTANTE||input.LA(1)==INT_KONSTANTE||input.LA(1)==REAL_KONSTANTE||input.LA(1)==STRING_KONSTANTE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(10, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "konstanten");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "konstanten"



    // $ANTLR start "anweisung"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:12:1: anweisung : ( wertzuweisung ) ';' ;
    public final void anweisung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:13:2: ( ( wertzuweisung ) ';' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:13:4: ( wertzuweisung ) ';'
            {
            dbg.location(13,4);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:13:4: ( wertzuweisung )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:13:5: wertzuweisung
            {
            dbg.location(13,5);
            pushFollow(FOLLOW_wertzuweisung_in_anweisung83);
            wertzuweisung();

            state._fsp--;


            }

            dbg.location(13,20);
            match(input,30,FOLLOW_30_in_anweisung86); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 23);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "anweisung"



    // $ANTLR start "wertzuweisung"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:15:1: wertzuweisung : IDENTIFIER ':=' ( STRING | arith_ausdruck ) ;
    public final void wertzuweisung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:16:2: ( IDENTIFIER ':=' ( STRING | arith_ausdruck ) )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:16:4: IDENTIFIER ':=' ( STRING | arith_ausdruck )
            {
            dbg.location(16,4);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_wertzuweisung97); 
            dbg.location(16,15);
            match(input,29,FOLLOW_29_in_wertzuweisung99); 
            dbg.location(16,20);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:16:20: ( STRING | arith_ausdruck )
            int alt4=2;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            int LA4_0 = input.LA(1);

            if ( (LA4_0==STRING) ) {
                alt4=1;
            }
            else if ( ((LA4_0 >= IDENTIFIER && LA4_0 <= INTEGER)||LA4_0==REAL||LA4_0==22||LA4_0==25||LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:16:22: STRING
                    {
                    dbg.location(16,22);
                    match(input,STRING,FOLLOW_STRING_in_wertzuweisung103); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:16:31: arith_ausdruck
                    {
                    dbg.location(16,31);
                    pushFollow(FOLLOW_arith_ausdruck_in_wertzuweisung107);
                    arith_ausdruck();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(16, 45);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "wertzuweisung"



    // $ANTLR start "arith_ausdruck"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:18:1: arith_ausdruck : mult ( ( '+' | '-' ) mult )* ;
    public final void arith_ausdruck() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith_ausdruck");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:19:2: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:19:4: mult ( ( '+' | '-' ) mult )*
            {
            dbg.location(19,4);
            pushFollow(FOLLOW_mult_in_arith_ausdruck118);
            mult();

            state._fsp--;

            dbg.location(19,9);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:19:9: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(5);

            loop5:
            do {
                int alt5=2;
                try { dbg.enterDecision(5, decisionCanBacktrack[5]);

                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||LA5_0==27) ) {
                    alt5=1;
                }


                } finally {dbg.exitDecision(5);}

                switch (alt5) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:19:10: ( '+' | '-' ) mult
            	    {
            	    dbg.location(19,10);
            	    if ( input.LA(1)==25||input.LA(1)==27 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(19,22);
            	    pushFollow(FOLLOW_mult_in_arith_ausdruck129);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);
            } finally {dbg.exitSubRule(5);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith_ausdruck");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arith_ausdruck"



    // $ANTLR start "mult"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:21:1: mult : atom ( ( '*' | '/' ) atom )* ;
    public final void mult() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:22:2: ( atom ( ( '*' | '/' ) atom )* )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:22:4: atom ( ( '*' | '/' ) atom )*
            {
            dbg.location(22,4);
            pushFollow(FOLLOW_atom_in_mult144);
            atom();

            state._fsp--;

            dbg.location(22,9);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:22:9: ( ( '*' | '/' ) atom )*
            try { dbg.enterSubRule(6);

            loop6:
            do {
                int alt6=2;
                try { dbg.enterDecision(6, decisionCanBacktrack[6]);

                int LA6_0 = input.LA(1);

                if ( (LA6_0==24||LA6_0==28) ) {
                    alt6=1;
                }


                } finally {dbg.exitDecision(6);}

                switch (alt6) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:22:10: ( '*' | '/' ) atom
            	    {
            	    dbg.location(22,10);
            	    if ( input.LA(1)==24||input.LA(1)==28 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(22,22);
            	    pushFollow(FOLLOW_atom_in_mult155);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);
            } finally {dbg.exitSubRule(6);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(22, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "mult"



    // $ANTLR start "atom"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:24:1: atom : ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:25:2: ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' )
            int alt9=4;
            try { dbg.enterDecision(9, decisionCanBacktrack[9]);

            switch ( input.LA(1) ) {
            case 25:
            case 27:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==INTEGER) ) {
                    alt9=1;
                }
                else if ( (LA9_1==REAL) ) {
                    alt9=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER:
                {
                alt9=1;
                }
                break;
            case REAL:
                {
                alt9=2;
                }
                break;
            case IDENTIFIER:
                {
                alt9=3;
                }
                break;
            case 22:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(9);}

            switch (alt9) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:25:4: ( '+' | '-' )? INTEGER
                    {
                    dbg.location(25,4);
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:25:4: ( '+' | '-' )?
                    int alt7=2;
                    try { dbg.enterSubRule(7);
                    try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==25||LA7_0==27) ) {
                        alt7=1;
                    }
                    } finally {dbg.exitDecision(7);}

                    switch (alt7) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
                            {
                            dbg.location(25,4);
                            if ( input.LA(1)==25||input.LA(1)==27 ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                dbg.recognitionException(mse);
                                throw mse;
                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(7);}

                    dbg.location(25,17);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom178); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:26:4: ( '+' | '-' )? REAL
                    {
                    dbg.location(26,4);
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:26:4: ( '+' | '-' )?
                    int alt8=2;
                    try { dbg.enterSubRule(8);
                    try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==25||LA8_0==27) ) {
                        alt8=1;
                    }
                    } finally {dbg.exitDecision(8);}

                    switch (alt8) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:
                            {
                            dbg.location(26,4);
                            if ( input.LA(1)==25||input.LA(1)==27 ) {
                                input.consume();
                                state.errorRecovery=false;
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                dbg.recognitionException(mse);
                                throw mse;
                            }


                            }
                            break;

                    }
                    } finally {dbg.exitSubRule(8);}

                    dbg.location(26,17);
                    match(input,REAL,FOLLOW_REAL_in_atom192); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:27:4: IDENTIFIER
                    {
                    dbg.location(27,4);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom197); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:28:4: '(' arith_ausdruck ')'
                    {
                    dbg.location(28,4);
                    match(input,22,FOLLOW_22_in_atom202); 
                    dbg.location(28,8);
                    pushFollow(FOLLOW_arith_ausdruck_in_atom204);
                    arith_ausdruck();

                    state._fsp--;

                    dbg.location(28,23);
                    match(input,23,FOLLOW_23_in_atom206); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(28, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"



    // $ANTLR start "vergleich"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:30:1: vergleich : arith_ausdruck COMPARE_OP arith_ausdruck ;
    public final void vergleich() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(30, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:31:2: ( arith_ausdruck COMPARE_OP arith_ausdruck )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\minip2.g:32:2: arith_ausdruck COMPARE_OP arith_ausdruck
            {
            dbg.location(32,2);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich218);
            arith_ausdruck();

            state._fsp--;

            dbg.location(32,17);
            match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_vergleich220); 
            dbg.location(32,28);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich222);
            arith_ausdruck();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(32, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vergleich"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_TOKEN_in_start11 = new BitSet(new long[]{0x0000000000122090L});
    public static final BitSet FOLLOW_deklaration_in_start13 = new BitSet(new long[]{0x0000000000122090L});
    public static final BitSet FOLLOW_BEGIN_TOKEN_in_start16 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_anweisung_in_start18 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_END_TOKEN_in_start21 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstanten_in_deklaration34 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration36 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_26_in_deklaration39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration41 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_30_in_deklaration45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung83 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_anweisung86 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_wertzuweisung97 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_wertzuweisung99 = new BitSet(new long[]{0x000000000A491800L});
    public static final BitSet FOLLOW_STRING_in_wertzuweisung103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_wertzuweisung107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck118 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_set_in_arith_ausdruck121 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck129 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_atom_in_mult144 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_set_in_mult147 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_atom_in_mult155 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_atom202 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_atom204 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_atom206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich218 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMPARE_OP_in_vergleich220 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich222 = new BitSet(new long[]{0x0000000000000002L});

}