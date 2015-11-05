// $ANTLR 3.4 C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g 2015-11-05 13:51:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN_TOKEN", "BLOCK_KOMMENTAR", "BOOLEAN", "BOOL_KONSTANTE", "BUCHSTABE", "COMPARE_OP", "END_TOKEN", "IDENTIFIER", "INTEGER", "INT_KONSTANTE", "LEERZEICHEN", "NEUE_ZEILE", "REAL", "REAL_KONSTANTE", "START_TOKEN", "STRING", "STRING_KONSTANTE", "ZAHL", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'println('", "'read('", "'then'", "'while'"
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
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    "invalidRule", "arith_ausdruck", "vergleich", "s", "start", "mult", 
    "atom", "read", "wertzuweisung", "println", "anweisung", "konstanten", 
    "elihw", "deklaration", "fi"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false, false, false, false, false, false, false, false, 
        false, false, false, false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public MiniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public MiniPParser(TokenStream input, int port, RecognizerSharedState state) {
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

public MiniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g"; }



    // $ANTLR start "start"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:3:1: start : START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:2: ( START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:4: START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN
            {
            dbg.location(4,4);
            match(input,START_TOKEN,FOLLOW_START_TOKEN_in_start11); 
            dbg.location(4,16);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:16: ( deklaration )*
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

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:16: deklaration
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
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:41: ( anweisung )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= IDENTIFIER && LA2_0 <= INTEGER)||LA2_0==REAL||LA2_0==22||LA2_0==25||LA2_0==27||LA2_0==34||(LA2_0 >= 36 && LA2_0 <= 37)||LA2_0==39) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:4:41: anweisung
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
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:6:1: deklaration : konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' ;
    public final void deklaration() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:7:2: ( konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:7:4: konstanten IDENTIFIER ( ',' IDENTIFIER )* ';'
            {
            dbg.location(7,4);
            pushFollow(FOLLOW_konstanten_in_deklaration34);
            konstanten();

            state._fsp--;

            dbg.location(7,15);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration36); 
            dbg.location(7,26);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:7:26: ( ',' IDENTIFIER )*
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

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:7:27: ',' IDENTIFIER
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
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:9:1: konstanten : ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) ;
    public final void konstanten() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "konstanten");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(9, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:10:2: ( ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:
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
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:12:1: anweisung : ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' ;
    public final void anweisung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:2: ( ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';'
            {
            dbg.location(13,4);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw )
            int alt4=6;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==29) ) {
                    alt4=1;
                }
                else if ( (LA4_1==COMPARE_OP||(LA4_1 >= 24 && LA4_1 <= 25)||(LA4_1 >= 27 && LA4_1 <= 28)||LA4_1==30) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER:
            case REAL:
            case 22:
            case 25:
            case 27:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 36:
                {
                alt4=4;
                }
                break;
            case 34:
                {
                alt4=5;
                }
                break;
            case 39:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(4);}

            switch (alt4) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:5: wertzuweisung
                    {
                    dbg.location(13,5);
                    pushFollow(FOLLOW_wertzuweisung_in_anweisung83);
                    wertzuweisung();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:21: arith_ausdruck s
                    {
                    dbg.location(13,21);
                    pushFollow(FOLLOW_arith_ausdruck_in_anweisung87);
                    arith_ausdruck();

                    state._fsp--;

                    dbg.location(13,36);
                    pushFollow(FOLLOW_s_in_anweisung89);
                    s();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:40: read
                    {
                    dbg.location(13,40);
                    pushFollow(FOLLOW_read_in_anweisung93);
                    read();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:47: println
                    {
                    dbg.location(13,47);
                    pushFollow(FOLLOW_println_in_anweisung97);
                    println();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:57: fi
                    {
                    dbg.location(13,57);
                    pushFollow(FOLLOW_fi_in_anweisung101);
                    fi();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:13:62: elihw
                    {
                    dbg.location(13,62);
                    pushFollow(FOLLOW_elihw_in_anweisung105);
                    elihw();

                    state._fsp--;


                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(13,69);
            match(input,30,FOLLOW_30_in_anweisung108); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 72);

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
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:15:1: wertzuweisung : IDENTIFIER ':=' ( STRING | arith_ausdruck s ) ;
    public final void wertzuweisung() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:16:2: ( IDENTIFIER ':=' ( STRING | arith_ausdruck s ) )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:16:4: IDENTIFIER ':=' ( STRING | arith_ausdruck s )
            {
            dbg.location(16,4);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_wertzuweisung119); 
            dbg.location(16,15);
            match(input,29,FOLLOW_29_in_wertzuweisung121); 
            dbg.location(16,20);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:16:20: ( STRING | arith_ausdruck s )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= IDENTIFIER && LA5_0 <= INTEGER)||LA5_0==REAL||LA5_0==22||LA5_0==25||LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(5);}

            switch (alt5) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:16:22: STRING
                    {
                    dbg.location(16,22);
                    match(input,STRING,FOLLOW_STRING_in_wertzuweisung125); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:16:31: arith_ausdruck s
                    {
                    dbg.location(16,31);
                    pushFollow(FOLLOW_arith_ausdruck_in_wertzuweisung129);
                    arith_ausdruck();

                    state._fsp--;

                    dbg.location(16,46);
                    pushFollow(FOLLOW_s_in_wertzuweisung131);
                    s();

                    state._fsp--;


                    }
                    break;

            }
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
        dbg.location(16, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "wertzuweisung"



    // $ANTLR start "s"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:18:1: s : ( COMPARE_OP arith_ausdruck |);
    public final void s() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "s");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:18:3: ( COMPARE_OP arith_ausdruck |)
            int alt6=2;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMPARE_OP) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(6);}

            switch (alt6) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:18:5: COMPARE_OP arith_ausdruck
                    {
                    dbg.location(18,5);
                    match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_s141); 
                    dbg.location(18,16);
                    pushFollow(FOLLOW_arith_ausdruck_in_s143);
                    arith_ausdruck();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:19:5: 
                    {
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
        dbg.location(19, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "s");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "s"



    // $ANTLR start "arith_ausdruck"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:21:1: arith_ausdruck : mult ( ( '+' | '-' ) mult )* ;
    public final void arith_ausdruck() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "arith_ausdruck");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:22:2: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:22:4: mult ( ( '+' | '-' ) mult )*
            {
            dbg.location(22,4);
            pushFollow(FOLLOW_mult_in_arith_ausdruck158);
            mult();

            state._fsp--;

            dbg.location(22,9);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:22:9: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==25||LA7_0==27) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:22:10: ( '+' | '-' ) mult
            	    {
            	    dbg.location(22,10);
            	    if ( input.LA(1)==25||input.LA(1)==27 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(22,22);
            	    pushFollow(FOLLOW_mult_in_arith_ausdruck169);
            	    mult();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


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
            dbg.exitRule(getGrammarFileName(), "arith_ausdruck");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "arith_ausdruck"



    // $ANTLR start "mult"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:24:1: mult : atom ( ( '*' | '/' ) atom )* ;
    public final void mult() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:25:2: ( atom ( ( '*' | '/' ) atom )* )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:25:4: atom ( ( '*' | '/' ) atom )*
            {
            dbg.location(25,4);
            pushFollow(FOLLOW_atom_in_mult184);
            atom();

            state._fsp--;

            dbg.location(25,9);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:25:9: ( ( '*' | '/' ) atom )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==24||LA8_0==28) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:25:10: ( '*' | '/' ) atom
            	    {
            	    dbg.location(25,10);
            	    if ( input.LA(1)==24||input.LA(1)==28 ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(25,22);
            	    pushFollow(FOLLOW_atom_in_mult195);
            	    atom();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(25, 28);

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
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:27:1: atom : ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' );
    public final void atom() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(27, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:28:2: ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' )
            int alt11=4;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 25:
            case 27:
                {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==INTEGER) ) {
                    alt11=1;
                }
                else if ( (LA11_1==REAL) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
                }
                break;
            case INTEGER:
                {
                alt11=1;
                }
                break;
            case REAL:
                {
                alt11=2;
                }
                break;
            case IDENTIFIER:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }

            } finally {dbg.exitDecision(11);}

            switch (alt11) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:28:4: ( '+' | '-' )? INTEGER
                    {
                    dbg.location(28,4);
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:28:4: ( '+' | '-' )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25||LA9_0==27) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:
                            {
                            dbg.location(28,4);
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
                    } finally {dbg.exitSubRule(9);}

                    dbg.location(28,17);
                    match(input,INTEGER,FOLLOW_INTEGER_in_atom219); 

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:29:4: ( '+' | '-' )? REAL
                    {
                    dbg.location(29,4);
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:29:4: ( '+' | '-' )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==25||LA10_0==27) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:
                            {
                            dbg.location(29,4);
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
                    } finally {dbg.exitSubRule(10);}

                    dbg.location(29,17);
                    match(input,REAL,FOLLOW_REAL_in_atom233); 

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:30:4: IDENTIFIER
                    {
                    dbg.location(30,4);
                    match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom238); 

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:31:4: '(' arith_ausdruck ')'
                    {
                    dbg.location(31,4);
                    match(input,22,FOLLOW_22_in_atom243); 
                    dbg.location(31,8);
                    pushFollow(FOLLOW_arith_ausdruck_in_atom245);
                    arith_ausdruck();

                    state._fsp--;

                    dbg.location(31,23);
                    match(input,23,FOLLOW_23_in_atom247); 

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
        dbg.location(31, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "atom"



    // $ANTLR start "fi"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:33:1: fi : 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' ;
    public final void fi() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "fi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(33, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:2: ( 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:4: 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi'
            {
            dbg.location(34,4);
            match(input,34,FOLLOW_34_in_fi258); 
            dbg.location(34,9);
            pushFollow(FOLLOW_vergleich_in_fi260);
            vergleich();

            state._fsp--;

            dbg.location(34,20);
            match(input,38,FOLLOW_38_in_fi263); 
            dbg.location(34,27);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:27: ( anweisung )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= IDENTIFIER && LA12_0 <= INTEGER)||LA12_0==REAL||LA12_0==22||LA12_0==25||LA12_0==27||LA12_0==34||(LA12_0 >= 36 && LA12_0 <= 37)||LA12_0==39) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:27: anweisung
            	    {
            	    dbg.location(34,27);
            	    pushFollow(FOLLOW_anweisung_in_fi265);
            	    anweisung();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt12++;
            } while (true);
            } finally {dbg.exitSubRule(12);}

            dbg.location(34,38);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:38: ( 'else' ( anweisung )+ )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==32) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:39: 'else' ( anweisung )+
                    {
                    dbg.location(34,39);
                    match(input,32,FOLLOW_32_in_fi269); 
                    dbg.location(34,46);
                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:46: ( anweisung )+
                    int cnt13=0;
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= IDENTIFIER && LA13_0 <= INTEGER)||LA13_0==REAL||LA13_0==22||LA13_0==25||LA13_0==27||LA13_0==34||(LA13_0 >= 36 && LA13_0 <= 37)||LA13_0==39) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:34:46: anweisung
                    	    {
                    	    dbg.location(34,46);
                    	    pushFollow(FOLLOW_anweisung_in_fi271);
                    	    anweisung();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                dbg.recognitionException(eee);

                                throw eee;
                        }
                        cnt13++;
                    } while (true);
                    } finally {dbg.exitSubRule(13);}


                    }
                    break;

            }
            } finally {dbg.exitSubRule(14);}

            dbg.location(34,59);
            match(input,33,FOLLOW_33_in_fi276); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(34, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fi");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "fi"



    // $ANTLR start "vergleich"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:36:1: vergleich : arith_ausdruck COMPARE_OP arith_ausdruck ;
    public final void vergleich() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:37:2: ( arith_ausdruck COMPARE_OP arith_ausdruck )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:38:3: arith_ausdruck COMPARE_OP arith_ausdruck
            {
            dbg.location(38,3);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich287);
            arith_ausdruck();

            state._fsp--;

            dbg.location(38,18);
            match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_vergleich289); 
            dbg.location(38,29);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich291);
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
        dbg.location(38, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "vergleich"



    // $ANTLR start "elihw"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:40:1: elihw : 'while' vergleich 'do' ( anweisung )+ 'od' ;
    public final void elihw() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "elihw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(40, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:41:2: ( 'while' vergleich 'do' ( anweisung )+ 'od' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:41:4: 'while' vergleich 'do' ( anweisung )+ 'od'
            {
            dbg.location(41,4);
            match(input,39,FOLLOW_39_in_elihw300); 
            dbg.location(41,12);
            pushFollow(FOLLOW_vergleich_in_elihw302);
            vergleich();

            state._fsp--;

            dbg.location(41,22);
            match(input,31,FOLLOW_31_in_elihw304); 
            dbg.location(41,27);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:41:27: ( anweisung )+
            int cnt15=0;
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= IDENTIFIER && LA15_0 <= INTEGER)||LA15_0==REAL||LA15_0==22||LA15_0==25||LA15_0==27||LA15_0==34||(LA15_0 >= 36 && LA15_0 <= 37)||LA15_0==39) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:41:27: anweisung
            	    {
            	    dbg.location(41,27);
            	    pushFollow(FOLLOW_anweisung_in_elihw306);
            	    anweisung();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt15++;
            } while (true);
            } finally {dbg.exitSubRule(15);}

            dbg.location(41,38);
            match(input,35,FOLLOW_35_in_elihw309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(41, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elihw");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "elihw"



    // $ANTLR start "read"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:43:1: read : 'read(' IDENTIFIER ')' ;
    public final void read() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:44:2: ( 'read(' IDENTIFIER ')' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:44:4: 'read(' IDENTIFIER ')'
            {
            dbg.location(44,4);
            match(input,37,FOLLOW_37_in_read321); 
            dbg.location(44,12);
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read323); 
            dbg.location(44,23);
            match(input,23,FOLLOW_23_in_read325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(44, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "read"



    // $ANTLR start "println"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:46:1: println : 'println(' ( arith_ausdruck | STRING ) ')' ;
    public final void println() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(46, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:47:2: ( 'println(' ( arith_ausdruck | STRING ) ')' )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:47:4: 'println(' ( arith_ausdruck | STRING ) ')'
            {
            dbg.location(47,4);
            match(input,36,FOLLOW_36_in_println337); 
            dbg.location(47,15);
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:47:15: ( arith_ausdruck | STRING )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= IDENTIFIER && LA16_0 <= INTEGER)||LA16_0==REAL||LA16_0==22||LA16_0==25||LA16_0==27) ) {
                alt16=1;
            }
            else if ( (LA16_0==STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(16);}

            switch (alt16) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:47:16: arith_ausdruck
                    {
                    dbg.location(47,16);
                    pushFollow(FOLLOW_arith_ausdruck_in_println340);
                    arith_ausdruck();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\MiniP.g:47:33: STRING
                    {
                    dbg.location(47,33);
                    match(input,STRING,FOLLOW_STRING_in_println344); 

                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(47,41);
            match(input,23,FOLLOW_23_in_println347); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(47, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "println"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_TOKEN_in_start11 = new BitSet(new long[]{0x0000000000122090L});
    public static final BitSet FOLLOW_deklaration_in_start13 = new BitSet(new long[]{0x0000000000122090L});
    public static final BitSet FOLLOW_BEGIN_TOKEN_in_start16 = new BitSet(new long[]{0x000000B40A411800L});
    public static final BitSet FOLLOW_anweisung_in_start18 = new BitSet(new long[]{0x000000B40A411C00L});
    public static final BitSet FOLLOW_END_TOKEN_in_start21 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstanten_in_deklaration34 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration36 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_26_in_deklaration39 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration41 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_30_in_deklaration45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung83 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_anweisung87 = new BitSet(new long[]{0x0000000040000200L});
    public static final BitSet FOLLOW_s_in_anweisung89 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_read_in_anweisung93 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_println_in_anweisung97 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_fi_in_anweisung101 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_elihw_in_anweisung105 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_anweisung108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_wertzuweisung119 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_wertzuweisung121 = new BitSet(new long[]{0x000000000A491800L});
    public static final BitSet FOLLOW_STRING_in_wertzuweisung125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_wertzuweisung129 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_s_in_wertzuweisung131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPARE_OP_in_s141 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_s143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck158 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_set_in_arith_ausdruck161 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck169 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_atom_in_mult184 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_set_in_mult187 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_atom_in_mult195 = new BitSet(new long[]{0x0000000011000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_atom243 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_atom245 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_atom247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_fi258 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_vergleich_in_fi260 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_fi263 = new BitSet(new long[]{0x000000B40A411800L});
    public static final BitSet FOLLOW_anweisung_in_fi265 = new BitSet(new long[]{0x000000B70A411800L});
    public static final BitSet FOLLOW_32_in_fi269 = new BitSet(new long[]{0x000000B40A411800L});
    public static final BitSet FOLLOW_anweisung_in_fi271 = new BitSet(new long[]{0x000000B60A411800L});
    public static final BitSet FOLLOW_33_in_fi276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich287 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMPARE_OP_in_vergleich289 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_elihw300 = new BitSet(new long[]{0x000000000A411800L});
    public static final BitSet FOLLOW_vergleich_in_elihw302 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_elihw304 = new BitSet(new long[]{0x000000B40A411800L});
    public static final BitSet FOLLOW_anweisung_in_elihw306 = new BitSet(new long[]{0x000000BC0A411800L});
    public static final BitSet FOLLOW_35_in_elihw309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_read321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_read323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_read325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_println337 = new BitSet(new long[]{0x000000000A491800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_println340 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_STRING_in_println344 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_println347 = new BitSet(new long[]{0x0000000000000002L});

}