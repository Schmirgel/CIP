// $ANTLR 3.4 /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g 2015-11-11 12:27:55

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN_TOKEN", "BLOCK_KOMMENTAR", "BOOLEAN", "BOOL_KONSTANTE", "BUCHSTABE", "COMPARE_OP", "END_TOKEN", "IDENTIFIER", "INTEGER", "INT_KONSTANTE", "LEERZEICHEN", "NEUE_ZEILE", "REAL", "REAL_KONSTANTE", "SLIST", "START_TOKEN", "STRING", "STRING_KONSTANTE", "ZAHL", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'println('", "'read('", "'then'", "'while'"
    };

    public static final int EOF=-1;
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
    public static final int T__40=40;
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
    public static final int SLIST=18;
    public static final int START_TOKEN=19;
    public static final int STRING=20;
    public static final int STRING_KONSTANTE=21;
    public static final int ZAHL=22;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "start", "println", "vergleich", "s", "konstanten", "fi", 
    "elihw", "read", "atom", "mult", "arith_ausdruck", "deklaration", "anweisung", 
    "wertzuweisung"
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
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public MiniPParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:8:1: start : START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN ;
    public final MiniPParser.start_return start() throws RecognitionException {
        MiniPParser.start_return retval = new MiniPParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token START_TOKEN1=null;
        Token BEGIN_TOKEN3=null;
        Token END_TOKEN5=null;
        MiniPParser.deklaration_return deklaration2 =null;

        MiniPParser.anweisung_return anweisung4 =null;


        Object START_TOKEN1_tree=null;
        Object BEGIN_TOKEN3_tree=null;
        Object END_TOKEN5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:2: ( START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:4: START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(9,4);
            START_TOKEN1=(Token)match(input,START_TOKEN,FOLLOW_START_TOKEN_in_start29); 
            START_TOKEN1_tree = 
            (Object)adaptor.create(START_TOKEN1)
            ;
            adaptor.addChild(root_0, START_TOKEN1_tree);

            dbg.location(9,16);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:16: ( deklaration )*
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

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:16: deklaration
            	    {
            	    dbg.location(9,16);
            	    pushFollow(FOLLOW_deklaration_in_start31);
            	    deklaration2=deklaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, deklaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(9,29);
            BEGIN_TOKEN3=(Token)match(input,BEGIN_TOKEN,FOLLOW_BEGIN_TOKEN_in_start34); 
            BEGIN_TOKEN3_tree = 
            (Object)adaptor.create(BEGIN_TOKEN3)
            ;
            adaptor.addChild(root_0, BEGIN_TOKEN3_tree);

            dbg.location(9,41);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:41: ( anweisung )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= IDENTIFIER && LA2_0 <= INTEGER)||LA2_0==REAL||LA2_0==23||LA2_0==26||LA2_0==28||LA2_0==35||(LA2_0 >= 37 && LA2_0 <= 38)||LA2_0==40) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:9:41: anweisung
            	    {
            	    dbg.location(9,41);
            	    pushFollow(FOLLOW_anweisung_in_start36);
            	    anweisung4=anweisung();

            	    state._fsp--;

            	    adaptor.addChild(root_0, anweisung4.getTree());

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

            dbg.location(9,52);
            END_TOKEN5=(Token)match(input,END_TOKEN,FOLLOW_END_TOKEN_in_start39); 
            END_TOKEN5_tree = 
            (Object)adaptor.create(END_TOKEN5)
            ;
            adaptor.addChild(root_0, END_TOKEN5_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(9, 61);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"


    public static class deklaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deklaration"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:11:1: deklaration : konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';' -> ^( SLIST[$id] ( IDENTIFIER )+ ) ;
    public final MiniPParser.deklaration_return deklaration() throws RecognitionException {
        MiniPParser.deklaration_return retval = new MiniPParser.deklaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token id=null;
        Token char_literal7=null;
        Token IDENTIFIER8=null;
        Token char_literal9=null;
        MiniPParser.konstanten_return konstanten6 =null;


        Object id_tree=null;
        Object char_literal7_tree=null;
        Object IDENTIFIER8_tree=null;
        Object char_literal9_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_konstanten=new RewriteRuleSubtreeStream(adaptor,"rule konstanten");
        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:12:2: ( konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';' -> ^( SLIST[$id] ( IDENTIFIER )+ ) )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:12:4: konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';'
            {
            dbg.location(12,4);
            pushFollow(FOLLOW_konstanten_in_deklaration52);
            konstanten6=konstanten();

            state._fsp--;

            stream_konstanten.add(konstanten6.getTree());
            dbg.location(12,17);
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration56);  
            stream_IDENTIFIER.add(id);

            dbg.location(12,29);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:12:29: ( ',' IDENTIFIER )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==27) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:12:30: ',' IDENTIFIER
            	    {
            	    dbg.location(12,30);
            	    char_literal7=(Token)match(input,27,FOLLOW_27_in_deklaration59);  
            	    stream_27.add(char_literal7);

            	    dbg.location(12,34);
            	    IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration61);  
            	    stream_IDENTIFIER.add(IDENTIFIER8);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(12,47);
            char_literal9=(Token)match(input,31,FOLLOW_31_in_deklaration65);  
            stream_31.add(char_literal9);


            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 12:51: -> ^( SLIST[$id] ( IDENTIFIER )+ )
            {
                dbg.location(12,54);
                // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:12:54: ^( SLIST[$id] ( IDENTIFIER )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(12,56);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SLIST, id)
                , root_1);

                dbg.location(12,67);
                if ( !(stream_IDENTIFIER.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext() ) {
                    dbg.location(12,67);
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                }
                stream_IDENTIFIER.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(12, 78);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "deklaration");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "deklaration"


    public static class konstanten_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "konstanten"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:14:1: konstanten : ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) ;
    public final MiniPParser.konstanten_return konstanten() throws RecognitionException {
        MiniPParser.konstanten_return retval = new MiniPParser.konstanten_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "konstanten");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(14, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:15:2: ( ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(15,2);
            set10=(Token)input.LT(1);

            if ( input.LA(1)==BOOL_KONSTANTE||input.LA(1)==INT_KONSTANTE||input.LA(1)==REAL_KONSTANTE||input.LA(1)==STRING_KONSTANTE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set10)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(15, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "konstanten");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "konstanten"


    public static class anweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anweisung"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:17:1: anweisung : ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' ;
    public final MiniPParser.anweisung_return anweisung() throws RecognitionException {
        MiniPParser.anweisung_return retval = new MiniPParser.anweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal18=null;
        MiniPParser.wertzuweisung_return wertzuweisung11 =null;

        MiniPParser.arith_ausdruck_return arith_ausdruck12 =null;

        MiniPParser.s_return s13 =null;

        MiniPParser.read_return read14 =null;

        MiniPParser.println_return println15 =null;

        MiniPParser.fi_return fi16 =null;

        MiniPParser.elihw_return elihw17 =null;


        Object char_literal18_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:2: ( ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(18,4);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw )
            int alt4=6;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==30) ) {
                    alt4=1;
                }
                else if ( (LA4_1==COMPARE_OP||(LA4_1 >= 25 && LA4_1 <= 26)||(LA4_1 >= 28 && LA4_1 <= 29)||LA4_1==31) ) {
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
            case 23:
            case 26:
            case 28:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 40:
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

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:5: wertzuweisung
                    {
                    dbg.location(18,5);
                    pushFollow(FOLLOW_wertzuweisung_in_anweisung109);
                    wertzuweisung11=wertzuweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, wertzuweisung11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:21: arith_ausdruck s
                    {
                    dbg.location(18,21);
                    pushFollow(FOLLOW_arith_ausdruck_in_anweisung113);
                    arith_ausdruck12=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck12.getTree());
                    dbg.location(18,36);
                    pushFollow(FOLLOW_s_in_anweisung115);
                    s13=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s13.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:40: read
                    {
                    dbg.location(18,40);
                    pushFollow(FOLLOW_read_in_anweisung119);
                    read14=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read14.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:47: println
                    {
                    dbg.location(18,47);
                    pushFollow(FOLLOW_println_in_anweisung123);
                    println15=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println15.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:57: fi
                    {
                    dbg.location(18,57);
                    pushFollow(FOLLOW_fi_in_anweisung127);
                    fi16=fi();

                    state._fsp--;

                    adaptor.addChild(root_0, fi16.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:18:62: elihw
                    {
                    dbg.location(18,62);
                    pushFollow(FOLLOW_elihw_in_anweisung131);
                    elihw17=elihw();

                    state._fsp--;

                    adaptor.addChild(root_0, elihw17.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(18,69);
            char_literal18=(Token)match(input,31,FOLLOW_31_in_anweisung134); 
            char_literal18_tree = 
            (Object)adaptor.create(char_literal18)
            ;
            adaptor.addChild(root_0, char_literal18_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(18, 72);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "anweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "anweisung"


    public static class wertzuweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wertzuweisung"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:20:1: wertzuweisung : IDENTIFIER ':=' ( STRING | arith_ausdruck s ) ;
    public final MiniPParser.wertzuweisung_return wertzuweisung() throws RecognitionException {
        MiniPParser.wertzuweisung_return retval = new MiniPParser.wertzuweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER19=null;
        Token string_literal20=null;
        Token STRING21=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck22 =null;

        MiniPParser.s_return s23 =null;


        Object IDENTIFIER19_tree=null;
        Object string_literal20_tree=null;
        Object STRING21_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(20, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:21:2: ( IDENTIFIER ':=' ( STRING | arith_ausdruck s ) )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:21:4: IDENTIFIER ':=' ( STRING | arith_ausdruck s )
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(21,4);
            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_wertzuweisung145); 
            IDENTIFIER19_tree = 
            (Object)adaptor.create(IDENTIFIER19)
            ;
            adaptor.addChild(root_0, IDENTIFIER19_tree);

            dbg.location(21,15);
            string_literal20=(Token)match(input,30,FOLLOW_30_in_wertzuweisung147); 
            string_literal20_tree = 
            (Object)adaptor.create(string_literal20)
            ;
            adaptor.addChild(root_0, string_literal20_tree);

            dbg.location(21,20);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:21:20: ( STRING | arith_ausdruck s )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= IDENTIFIER && LA5_0 <= INTEGER)||LA5_0==REAL||LA5_0==23||LA5_0==26||LA5_0==28) ) {
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

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:21:22: STRING
                    {
                    dbg.location(21,22);
                    STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_wertzuweisung151); 
                    STRING21_tree = 
                    (Object)adaptor.create(STRING21)
                    ;
                    adaptor.addChild(root_0, STRING21_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:21:31: arith_ausdruck s
                    {
                    dbg.location(21,31);
                    pushFollow(FOLLOW_arith_ausdruck_in_wertzuweisung155);
                    arith_ausdruck22=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck22.getTree());
                    dbg.location(21,46);
                    pushFollow(FOLLOW_s_in_wertzuweisung157);
                    s23=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s23.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(21, 48);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisung"


    public static class s_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:23:1: s : ( COMPARE_OP arith_ausdruck |);
    public final MiniPParser.s_return s() throws RecognitionException {
        MiniPParser.s_return retval = new MiniPParser.s_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPARE_OP24=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck25 =null;


        Object COMPARE_OP24_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "s");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(23, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:23:3: ( COMPARE_OP arith_ausdruck |)
            int alt6=2;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMPARE_OP) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
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

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:23:5: COMPARE_OP arith_ausdruck
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(23,5);
                    COMPARE_OP24=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_s167); 
                    COMPARE_OP24_tree = 
                    (Object)adaptor.create(COMPARE_OP24)
                    ;
                    adaptor.addChild(root_0, COMPARE_OP24_tree);

                    dbg.location(23,16);
                    pushFollow(FOLLOW_arith_ausdruck_in_s169);
                    arith_ausdruck25=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck25.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:24:5: 
                    {
                    root_0 = (Object)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(24, 4);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "s");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "s"


    public static class arith_ausdruck_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith_ausdruck"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:26:1: arith_ausdruck : mult ( ( '+' | '-' ) mult )* ;
    public final MiniPParser.arith_ausdruck_return arith_ausdruck() throws RecognitionException {
        MiniPParser.arith_ausdruck_return retval = new MiniPParser.arith_ausdruck_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set27=null;
        MiniPParser.mult_return mult26 =null;

        MiniPParser.mult_return mult28 =null;


        Object set27_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith_ausdruck");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(26, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:27:2: ( mult ( ( '+' | '-' ) mult )* )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:27:4: mult ( ( '+' | '-' ) mult )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(27,4);
            pushFollow(FOLLOW_mult_in_arith_ausdruck184);
            mult26=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult26.getTree());
            dbg.location(27,9);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:27:9: ( ( '+' | '-' ) mult )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==26||LA7_0==28) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:27:10: ( '+' | '-' ) mult
            	    {
            	    dbg.location(27,10);
            	    set27=(Token)input.LT(1);

            	    if ( input.LA(1)==26||input.LA(1)==28 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set27)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(27,22);
            	    pushFollow(FOLLOW_mult_in_arith_ausdruck195);
            	    mult28=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult28.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "arith_ausdruck");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "arith_ausdruck"


    public static class mult_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:29:1: mult : atom ( ( '*' | '/' ) atom )* ;
    public final MiniPParser.mult_return mult() throws RecognitionException {
        MiniPParser.mult_return retval = new MiniPParser.mult_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set30=null;
        MiniPParser.atom_return atom29 =null;

        MiniPParser.atom_return atom31 =null;


        Object set30_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:30:2: ( atom ( ( '*' | '/' ) atom )* )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:30:4: atom ( ( '*' | '/' ) atom )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(30,4);
            pushFollow(FOLLOW_atom_in_mult210);
            atom29=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom29.getTree());
            dbg.location(30,9);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:30:9: ( ( '*' | '/' ) atom )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==29) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:30:10: ( '*' | '/' ) atom
            	    {
            	    dbg.location(30,10);
            	    set30=(Token)input.LT(1);

            	    if ( input.LA(1)==25||input.LA(1)==29 ) {
            	        input.consume();
            	        adaptor.addChild(root_0, 
            	        (Object)adaptor.create(set30)
            	        );
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(30,22);
            	    pushFollow(FOLLOW_atom_in_mult221);
            	    atom31=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom31.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 28);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "mult");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "mult"


    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:32:1: atom : ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' );
    public final MiniPParser.atom_return atom() throws RecognitionException {
        MiniPParser.atom_return retval = new MiniPParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set32=null;
        Token INTEGER33=null;
        Token set34=null;
        Token REAL35=null;
        Token IDENTIFIER36=null;
        Token char_literal37=null;
        Token char_literal39=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck38 =null;


        Object set32_tree=null;
        Object INTEGER33_tree=null;
        Object set34_tree=null;
        Object REAL35_tree=null;
        Object IDENTIFIER36_tree=null;
        Object char_literal37_tree=null;
        Object char_literal39_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:33:2: ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' arith_ausdruck ')' )
            int alt11=4;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 26:
            case 28:
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
            case 23:
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

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:33:4: ( '+' | '-' )? INTEGER
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(33,4);
                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:33:4: ( '+' | '-' )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==26||LA9_0==28) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:
                            {
                            dbg.location(33,4);
                            set32=(Token)input.LT(1);

                            if ( input.LA(1)==26||input.LA(1)==28 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set32)
                                );
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

                    dbg.location(33,17);
                    INTEGER33=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom245); 
                    INTEGER33_tree = 
                    (Object)adaptor.create(INTEGER33)
                    ;
                    adaptor.addChild(root_0, INTEGER33_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:34:4: ( '+' | '-' )? REAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(34,4);
                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:34:4: ( '+' | '-' )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26||LA10_0==28) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:
                            {
                            dbg.location(34,4);
                            set34=(Token)input.LT(1);

                            if ( input.LA(1)==26||input.LA(1)==28 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set34)
                                );
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

                    dbg.location(34,17);
                    REAL35=(Token)match(input,REAL,FOLLOW_REAL_in_atom259); 
                    REAL35_tree = 
                    (Object)adaptor.create(REAL35)
                    ;
                    adaptor.addChild(root_0, REAL35_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:35:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(35,4);
                    IDENTIFIER36=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom264); 
                    IDENTIFIER36_tree = 
                    (Object)adaptor.create(IDENTIFIER36)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER36_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:36:4: '(' arith_ausdruck ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(36,4);
                    char_literal37=(Token)match(input,23,FOLLOW_23_in_atom269); 
                    char_literal37_tree = 
                    (Object)adaptor.create(char_literal37)
                    ;
                    adaptor.addChild(root_0, char_literal37_tree);

                    dbg.location(36,8);
                    pushFollow(FOLLOW_arith_ausdruck_in_atom271);
                    arith_ausdruck38=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck38.getTree());
                    dbg.location(36,23);
                    char_literal39=(Token)match(input,24,FOLLOW_24_in_atom273); 
                    char_literal39_tree = 
                    (Object)adaptor.create(char_literal39)
                    ;
                    adaptor.addChild(root_0, char_literal39_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(36, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"


    public static class fi_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fi"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:38:1: fi : 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' ;
    public final MiniPParser.fi_return fi() throws RecognitionException {
        MiniPParser.fi_return retval = new MiniPParser.fi_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal40=null;
        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        MiniPParser.vergleich_return vergleich41 =null;

        MiniPParser.anweisung_return anweisung43 =null;

        MiniPParser.anweisung_return anweisung45 =null;


        Object string_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal44_tree=null;
        Object string_literal46_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "fi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:2: ( 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:4: 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(39,4);
            string_literal40=(Token)match(input,35,FOLLOW_35_in_fi284); 
            string_literal40_tree = 
            (Object)adaptor.create(string_literal40)
            ;
            adaptor.addChild(root_0, string_literal40_tree);

            dbg.location(39,9);
            pushFollow(FOLLOW_vergleich_in_fi286);
            vergleich41=vergleich();

            state._fsp--;

            adaptor.addChild(root_0, vergleich41.getTree());
            dbg.location(39,20);
            string_literal42=(Token)match(input,39,FOLLOW_39_in_fi289); 
            string_literal42_tree = 
            (Object)adaptor.create(string_literal42)
            ;
            adaptor.addChild(root_0, string_literal42_tree);

            dbg.location(39,27);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:27: ( anweisung )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= IDENTIFIER && LA12_0 <= INTEGER)||LA12_0==REAL||LA12_0==23||LA12_0==26||LA12_0==28||LA12_0==35||(LA12_0 >= 37 && LA12_0 <= 38)||LA12_0==40) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:27: anweisung
            	    {
            	    dbg.location(39,27);
            	    pushFollow(FOLLOW_anweisung_in_fi291);
            	    anweisung43=anweisung();

            	    state._fsp--;

            	    adaptor.addChild(root_0, anweisung43.getTree());

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

            dbg.location(39,38);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:38: ( 'else' ( anweisung )+ )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:39: 'else' ( anweisung )+
                    {
                    dbg.location(39,39);
                    string_literal44=(Token)match(input,33,FOLLOW_33_in_fi295); 
                    string_literal44_tree = 
                    (Object)adaptor.create(string_literal44)
                    ;
                    adaptor.addChild(root_0, string_literal44_tree);

                    dbg.location(39,46);
                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:46: ( anweisung )+
                    int cnt13=0;
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= IDENTIFIER && LA13_0 <= INTEGER)||LA13_0==REAL||LA13_0==23||LA13_0==26||LA13_0==28||LA13_0==35||(LA13_0 >= 37 && LA13_0 <= 38)||LA13_0==40) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:39:46: anweisung
                    	    {
                    	    dbg.location(39,46);
                    	    pushFollow(FOLLOW_anweisung_in_fi297);
                    	    anweisung45=anweisung();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, anweisung45.getTree());

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

            dbg.location(39,59);
            string_literal46=(Token)match(input,34,FOLLOW_34_in_fi302); 
            string_literal46_tree = 
            (Object)adaptor.create(string_literal46)
            ;
            adaptor.addChild(root_0, string_literal46_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 62);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fi");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fi"


    public static class vergleich_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:41:1: vergleich : arith_ausdruck COMPARE_OP arith_ausdruck ;
    public final MiniPParser.vergleich_return vergleich() throws RecognitionException {
        MiniPParser.vergleich_return retval = new MiniPParser.vergleich_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPARE_OP48=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck47 =null;

        MiniPParser.arith_ausdruck_return arith_ausdruck49 =null;


        Object COMPARE_OP48_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:42:2: ( arith_ausdruck COMPARE_OP arith_ausdruck )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:43:3: arith_ausdruck COMPARE_OP arith_ausdruck
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(43,3);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich313);
            arith_ausdruck47=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck47.getTree());
            dbg.location(43,18);
            COMPARE_OP48=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_vergleich315); 
            COMPARE_OP48_tree = 
            (Object)adaptor.create(COMPARE_OP48)
            ;
            adaptor.addChild(root_0, COMPARE_OP48_tree);

            dbg.location(43,29);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich317);
            arith_ausdruck49=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck49.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(43, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "vergleich");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "vergleich"


    public static class elihw_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elihw"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:45:1: elihw : 'while' vergleich 'do' ( anweisung )+ 'od' ;
    public final MiniPParser.elihw_return elihw() throws RecognitionException {
        MiniPParser.elihw_return retval = new MiniPParser.elihw_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal50=null;
        Token string_literal52=null;
        Token string_literal54=null;
        MiniPParser.vergleich_return vergleich51 =null;

        MiniPParser.anweisung_return anweisung53 =null;


        Object string_literal50_tree=null;
        Object string_literal52_tree=null;
        Object string_literal54_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "elihw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:46:2: ( 'while' vergleich 'do' ( anweisung )+ 'od' )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:46:4: 'while' vergleich 'do' ( anweisung )+ 'od'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(46,4);
            string_literal50=(Token)match(input,40,FOLLOW_40_in_elihw326); 
            string_literal50_tree = 
            (Object)adaptor.create(string_literal50)
            ;
            adaptor.addChild(root_0, string_literal50_tree);

            dbg.location(46,12);
            pushFollow(FOLLOW_vergleich_in_elihw328);
            vergleich51=vergleich();

            state._fsp--;

            adaptor.addChild(root_0, vergleich51.getTree());
            dbg.location(46,22);
            string_literal52=(Token)match(input,32,FOLLOW_32_in_elihw330); 
            string_literal52_tree = 
            (Object)adaptor.create(string_literal52)
            ;
            adaptor.addChild(root_0, string_literal52_tree);

            dbg.location(46,27);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:46:27: ( anweisung )+
            int cnt15=0;
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= IDENTIFIER && LA15_0 <= INTEGER)||LA15_0==REAL||LA15_0==23||LA15_0==26||LA15_0==28||LA15_0==35||(LA15_0 >= 37 && LA15_0 <= 38)||LA15_0==40) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:46:27: anweisung
            	    {
            	    dbg.location(46,27);
            	    pushFollow(FOLLOW_anweisung_in_elihw332);
            	    anweisung53=anweisung();

            	    state._fsp--;

            	    adaptor.addChild(root_0, anweisung53.getTree());

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

            dbg.location(46,38);
            string_literal54=(Token)match(input,36,FOLLOW_36_in_elihw335); 
            string_literal54_tree = 
            (Object)adaptor.create(string_literal54)
            ;
            adaptor.addChild(root_0, string_literal54_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(46, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elihw");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elihw"


    public static class read_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:48:1: read : 'read(' IDENTIFIER ')' ;
    public final MiniPParser.read_return read() throws RecognitionException {
        MiniPParser.read_return retval = new MiniPParser.read_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal55=null;
        Token IDENTIFIER56=null;
        Token char_literal57=null;

        Object string_literal55_tree=null;
        Object IDENTIFIER56_tree=null;
        Object char_literal57_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(48, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:49:2: ( 'read(' IDENTIFIER ')' )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:49:4: 'read(' IDENTIFIER ')'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(49,4);
            string_literal55=(Token)match(input,38,FOLLOW_38_in_read347); 
            string_literal55_tree = 
            (Object)adaptor.create(string_literal55)
            ;
            adaptor.addChild(root_0, string_literal55_tree);

            dbg.location(49,12);
            IDENTIFIER56=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read349); 
            IDENTIFIER56_tree = 
            (Object)adaptor.create(IDENTIFIER56)
            ;
            adaptor.addChild(root_0, IDENTIFIER56_tree);

            dbg.location(49,23);
            char_literal57=(Token)match(input,24,FOLLOW_24_in_read351); 
            char_literal57_tree = 
            (Object)adaptor.create(char_literal57)
            ;
            adaptor.addChild(root_0, char_literal57_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "read");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "read"


    public static class println_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "println"
    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:51:1: println : 'println(' ( arith_ausdruck | STRING ) ')' ;
    public final MiniPParser.println_return println() throws RecognitionException {
        MiniPParser.println_return retval = new MiniPParser.println_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        Token STRING60=null;
        Token char_literal61=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck59 =null;


        Object string_literal58_tree=null;
        Object STRING60_tree=null;
        Object char_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:52:2: ( 'println(' ( arith_ausdruck | STRING ) ')' )
            dbg.enterAlt(1);

            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:52:4: 'println(' ( arith_ausdruck | STRING ) ')'
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(52,4);
            string_literal58=(Token)match(input,37,FOLLOW_37_in_println363); 
            string_literal58_tree = 
            (Object)adaptor.create(string_literal58)
            ;
            adaptor.addChild(root_0, string_literal58_tree);

            dbg.location(52,15);
            // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:52:15: ( arith_ausdruck | STRING )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= IDENTIFIER && LA16_0 <= INTEGER)||LA16_0==REAL||LA16_0==23||LA16_0==26||LA16_0==28) ) {
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

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:52:16: arith_ausdruck
                    {
                    dbg.location(52,16);
                    pushFollow(FOLLOW_arith_ausdruck_in_println366);
                    arith_ausdruck59=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck59.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // /Users/lewis/FH/CIP/Aufgabe 2/Ralf/MiniP.g:52:33: STRING
                    {
                    dbg.location(52,33);
                    STRING60=(Token)match(input,STRING,FOLLOW_STRING_in_println370); 
                    STRING60_tree = 
                    (Object)adaptor.create(STRING60)
                    ;
                    adaptor.addChild(root_0, STRING60_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(52,41);
            char_literal61=(Token)match(input,24,FOLLOW_24_in_println373); 
            char_literal61_tree = 
            (Object)adaptor.create(char_literal61)
            ;
            adaptor.addChild(root_0, char_literal61_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(52, 44);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "println"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_TOKEN_in_start29 = new BitSet(new long[]{0x0000000000222090L});
    public static final BitSet FOLLOW_deklaration_in_start31 = new BitSet(new long[]{0x0000000000222090L});
    public static final BitSet FOLLOW_BEGIN_TOKEN_in_start34 = new BitSet(new long[]{0x0000016814811800L});
    public static final BitSet FOLLOW_anweisung_in_start36 = new BitSet(new long[]{0x0000016814811C00L});
    public static final BitSet FOLLOW_END_TOKEN_in_start39 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstanten_in_deklaration52 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration56 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_27_in_deklaration59 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration61 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_31_in_deklaration65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_anweisung113 = new BitSet(new long[]{0x0000000080000200L});
    public static final BitSet FOLLOW_s_in_anweisung115 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_read_in_anweisung119 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_println_in_anweisung123 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_fi_in_anweisung127 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_elihw_in_anweisung131 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_anweisung134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_wertzuweisung145 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_wertzuweisung147 = new BitSet(new long[]{0x0000000014911800L});
    public static final BitSet FOLLOW_STRING_in_wertzuweisung151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_wertzuweisung155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_s_in_wertzuweisung157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPARE_OP_in_s167 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_s169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck184 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_set_in_arith_ausdruck187 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck195 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_atom_in_mult210 = new BitSet(new long[]{0x0000000022000002L});
    public static final BitSet FOLLOW_set_in_mult213 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_atom_in_mult221 = new BitSet(new long[]{0x0000000022000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_atom269 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_atom271 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_atom273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_fi284 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_vergleich_in_fi286 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_fi289 = new BitSet(new long[]{0x0000016814811800L});
    public static final BitSet FOLLOW_anweisung_in_fi291 = new BitSet(new long[]{0x0000016E14811800L});
    public static final BitSet FOLLOW_33_in_fi295 = new BitSet(new long[]{0x0000016814811800L});
    public static final BitSet FOLLOW_anweisung_in_fi297 = new BitSet(new long[]{0x0000016C14811800L});
    public static final BitSet FOLLOW_34_in_fi302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich313 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMPARE_OP_in_vergleich315 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_elihw326 = new BitSet(new long[]{0x0000000014811800L});
    public static final BitSet FOLLOW_vergleich_in_elihw328 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_elihw330 = new BitSet(new long[]{0x0000016814811800L});
    public static final BitSet FOLLOW_anweisung_in_elihw332 = new BitSet(new long[]{0x0000017814811800L});
    public static final BitSet FOLLOW_36_in_elihw335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_read347 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_IDENTIFIER_in_read349 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_read351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_println363 = new BitSet(new long[]{0x0000000014911800L});
    public static final BitSet FOLLOW_arith_ausdruck_in_println366 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_STRING_in_println370 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_println373 = new BitSet(new long[]{0x0000000000000002L});

}