// $ANTLR 3.4 Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g 2015-11-26 12:46:37

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BEGIN_TOKEN", "BLOCK_KOMMENTAR", "BOOLEAN", "BOOL_KONSTANTE", "BUCHSTABE", "COMPARE_OP", "ELSE", "END_TOKEN", "IDENTIFIER", "INTEGER", "INT_KONSTANTE", "LEERZEICHEN", "NEUE_ZEILE", "REAL", "REAL_KONSTANTE", "START_TOKEN", "STRING", "STRING_KONSTANTE", "THEN", "ZAHL", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'println'", "'read'", "'then'", "'while'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "elihw", "mult", "elseanweisung", "konstanten", "wertzuweisung", 
    "read", "ifanweisung", "vergleich", "wertzuweisungA", "println", "deklaration", 
    "atom", "s", "fi", "start", "anweisung", "arith_ausdruck"
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
    public String getGrammarFileName() { return "Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:9:1: start : START_TOKEN ! ( deklaration )* BEGIN_TOKEN ! ( anweisung )+ END_TOKEN !;
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
        dbg.location(9, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:2: ( START_TOKEN ! ( deklaration )* BEGIN_TOKEN ! ( anweisung )+ END_TOKEN !)
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:4: START_TOKEN ! ( deklaration )* BEGIN_TOKEN ! ( anweisung )+ END_TOKEN !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(10,15);
            START_TOKEN1=(Token)match(input,START_TOKEN,FOLLOW_START_TOKEN_in_start33); 
            dbg.location(10,17);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:17: ( deklaration )*
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

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:17: deklaration
            	    {
            	    dbg.location(10,17);
            	    pushFollow(FOLLOW_deklaration_in_start36);
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

            dbg.location(10,41);
            BEGIN_TOKEN3=(Token)match(input,BEGIN_TOKEN,FOLLOW_BEGIN_TOKEN_in_start39); 
            dbg.location(10,43);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:43: ( anweisung )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= IDENTIFIER && LA2_0 <= INTEGER)||LA2_0==REAL||LA2_0==24||LA2_0==27||LA2_0==29||LA2_0==36||(LA2_0 >= 38 && LA2_0 <= 39)||LA2_0==41) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:10:43: anweisung
            	    {
            	    dbg.location(10,43);
            	    pushFollow(FOLLOW_anweisung_in_start42);
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

            dbg.location(10,63);
            END_TOKEN5=(Token)match(input,END_TOKEN,FOLLOW_END_TOKEN_in_start45); 

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
        dbg.location(10, 64);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:12:1: deklaration : konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';' -> ( ^( konstanten IDENTIFIER ) )+ ;
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
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_konstanten=new RewriteRuleSubtreeStream(adaptor,"rule konstanten");
        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(12, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:2: ( konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';' -> ( ^( konstanten IDENTIFIER ) )+ )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:4: konstanten id= IDENTIFIER ( ',' IDENTIFIER )* ';'
            {
            dbg.location(13,4);
            pushFollow(FOLLOW_konstanten_in_deklaration59);
            konstanten6=konstanten();

            state._fsp--;

            stream_konstanten.add(konstanten6.getTree());
            dbg.location(13,17);
            id=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration63);  
            stream_IDENTIFIER.add(id);

            dbg.location(13,29);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:29: ( ',' IDENTIFIER )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==28) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:30: ',' IDENTIFIER
            	    {
            	    dbg.location(13,30);
            	    char_literal7=(Token)match(input,28,FOLLOW_28_in_deklaration66);  
            	    stream_28.add(char_literal7);

            	    dbg.location(13,34);
            	    IDENTIFIER8=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration68);  
            	    stream_IDENTIFIER.add(IDENTIFIER8);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(13,47);
            char_literal9=(Token)match(input,32,FOLLOW_32_in_deklaration72);  
            stream_32.add(char_literal9);


            // AST REWRITE
            // elements: IDENTIFIER, konstanten
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 13:51: -> ( ^( konstanten IDENTIFIER ) )+
            {
                dbg.location(13,54);
                if ( !(stream_IDENTIFIER.hasNext()||stream_konstanten.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext()||stream_konstanten.hasNext() ) {
                    dbg.location(13,54);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:13:54: ^( konstanten IDENTIFIER )
                    {
                    Object root_1 = (Object)adaptor.nil();
                    dbg.location(13,56);
                    root_1 = (Object)adaptor.becomeRoot(stream_konstanten.nextNode(), root_1);

                    dbg.location(13,67);
                    adaptor.addChild(root_1, 
                    stream_IDENTIFIER.nextNode()
                    );

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_IDENTIFIER.reset();
                stream_konstanten.reset();

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
        dbg.location(13, 78);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:15:1: konstanten : ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) ;
    public final MiniPParser.konstanten_return konstanten() throws RecognitionException {
        MiniPParser.konstanten_return retval = new MiniPParser.konstanten_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set10=null;

        Object set10_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "konstanten");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:16:2: ( ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(16,2);
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
        dbg.location(16, 72);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:18:1: anweisung : ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !;
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
        dbg.location(18, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:2: ( ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !)
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(19,4);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw )
            int alt4=6;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==31) ) {
                    alt4=1;
                }
                else if ( (LA4_1==COMPARE_OP||(LA4_1 >= 26 && LA4_1 <= 27)||(LA4_1 >= 29 && LA4_1 <= 30)||LA4_1==32) ) {
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
            case 24:
            case 27:
            case 29:
                {
                alt4=2;
                }
                break;
            case 39:
                {
                alt4=3;
                }
                break;
            case 38:
                {
                alt4=4;
                }
                break;
            case 36:
                {
                alt4=5;
                }
                break;
            case 41:
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:5: wertzuweisung
                    {
                    dbg.location(19,5);
                    pushFollow(FOLLOW_wertzuweisung_in_anweisung115);
                    wertzuweisung11=wertzuweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, wertzuweisung11.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:21: arith_ausdruck s
                    {
                    dbg.location(19,21);
                    pushFollow(FOLLOW_arith_ausdruck_in_anweisung119);
                    arith_ausdruck12=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck12.getTree());
                    dbg.location(19,36);
                    pushFollow(FOLLOW_s_in_anweisung121);
                    s13=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s13.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:40: read
                    {
                    dbg.location(19,40);
                    pushFollow(FOLLOW_read_in_anweisung125);
                    read14=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read14.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:47: println
                    {
                    dbg.location(19,47);
                    pushFollow(FOLLOW_println_in_anweisung129);
                    println15=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println15.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:57: fi
                    {
                    dbg.location(19,57);
                    pushFollow(FOLLOW_fi_in_anweisung133);
                    fi16=fi();

                    state._fsp--;

                    adaptor.addChild(root_0, fi16.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:19:62: elihw
                    {
                    dbg.location(19,62);
                    pushFollow(FOLLOW_elihw_in_anweisung137);
                    elihw17=elihw();

                    state._fsp--;

                    adaptor.addChild(root_0, elihw17.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(19,72);
            char_literal18=(Token)match(input,32,FOLLOW_32_in_anweisung140); 

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
        dbg.location(19, 73);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:21:1: wertzuweisung : IDENTIFIER ':=' wertzuweisungA -> ^( ':=' IDENTIFIER wertzuweisungA ) ;
    public final MiniPParser.wertzuweisung_return wertzuweisung() throws RecognitionException {
        MiniPParser.wertzuweisung_return retval = new MiniPParser.wertzuweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token IDENTIFIER19=null;
        Token string_literal20=null;
        MiniPParser.wertzuweisungA_return wertzuweisungA21 =null;


        Object IDENTIFIER19_tree=null;
        Object string_literal20_tree=null;
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_wertzuweisungA=new RewriteRuleSubtreeStream(adaptor,"rule wertzuweisungA");
        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(21, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:22:2: ( IDENTIFIER ':=' wertzuweisungA -> ^( ':=' IDENTIFIER wertzuweisungA ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:22:4: IDENTIFIER ':=' wertzuweisungA
            {
            dbg.location(22,4);
            IDENTIFIER19=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_wertzuweisung152);  
            stream_IDENTIFIER.add(IDENTIFIER19);

            dbg.location(22,15);
            string_literal20=(Token)match(input,31,FOLLOW_31_in_wertzuweisung154);  
            stream_31.add(string_literal20);

            dbg.location(22,20);
            pushFollow(FOLLOW_wertzuweisungA_in_wertzuweisung156);
            wertzuweisungA21=wertzuweisungA();

            state._fsp--;

            stream_wertzuweisungA.add(wertzuweisungA21.getTree());

            // AST REWRITE
            // elements: wertzuweisungA, 31, IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 22:35: -> ^( ':=' IDENTIFIER wertzuweisungA )
            {
                dbg.location(22,38);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:22:38: ^( ':=' IDENTIFIER wertzuweisungA )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(22,40);
                root_1 = (Object)adaptor.becomeRoot(
                stream_31.nextNode()
                , root_1);

                dbg.location(22,45);
                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );
                dbg.location(22,56);
                adaptor.addChild(root_1, stream_wertzuweisungA.nextTree());

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
        dbg.location(22, 70);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisung"


    public static class wertzuweisungA_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wertzuweisungA"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:24:1: wertzuweisungA : ( STRING | arith_ausdruck s );
    public final MiniPParser.wertzuweisungA_return wertzuweisungA() throws RecognitionException {
        MiniPParser.wertzuweisungA_return retval = new MiniPParser.wertzuweisungA_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING22=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck23 =null;

        MiniPParser.s_return s24 =null;


        Object STRING22_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wertzuweisungA");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(24, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:25:2: ( STRING | arith_ausdruck s )
            int alt5=2;
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            else if ( ((LA5_0 >= IDENTIFIER && LA5_0 <= INTEGER)||LA5_0==REAL||LA5_0==24||LA5_0==27||LA5_0==29) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:25:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(25,4);
                    STRING22=(Token)match(input,STRING,FOLLOW_STRING_in_wertzuweisungA177); 
                    STRING22_tree = 
                    (Object)adaptor.create(STRING22)
                    ;
                    adaptor.addChild(root_0, STRING22_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:26:4: arith_ausdruck s
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(26,4);
                    pushFollow(FOLLOW_arith_ausdruck_in_wertzuweisungA182);
                    arith_ausdruck23=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck23.getTree());
                    dbg.location(26,19);
                    pushFollow(FOLLOW_s_in_wertzuweisungA184);
                    s24=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s24.getTree());

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
        dbg.location(26, 19);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisungA");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisungA"


    public static class s_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:28:1: s : ( COMPARE_OP arith_ausdruck |);
    public final MiniPParser.s_return s() throws RecognitionException {
        MiniPParser.s_return retval = new MiniPParser.s_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPARE_OP25=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck26 =null;


        Object COMPARE_OP25_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "s");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(28, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:28:3: ( COMPARE_OP arith_ausdruck |)
            int alt6=2;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMPARE_OP) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:28:5: COMPARE_OP arith_ausdruck
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(28,5);
                    COMPARE_OP25=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_s192); 
                    COMPARE_OP25_tree = 
                    (Object)adaptor.create(COMPARE_OP25)
                    ;
                    adaptor.addChild(root_0, COMPARE_OP25_tree);

                    dbg.location(28,16);
                    pushFollow(FOLLOW_arith_ausdruck_in_s194);
                    arith_ausdruck26=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck26.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:29:5: 
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
        dbg.location(29, 4);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:31:1: arith_ausdruck : mult ( ( '+' | '-' ) ^ mult )* ;
    public final MiniPParser.arith_ausdruck_return arith_ausdruck() throws RecognitionException {
        MiniPParser.arith_ausdruck_return retval = new MiniPParser.arith_ausdruck_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set28=null;
        MiniPParser.mult_return mult27 =null;

        MiniPParser.mult_return mult29 =null;


        Object set28_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith_ausdruck");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(31, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:32:2: ( mult ( ( '+' | '-' ) ^ mult )* )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:32:4: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(32,4);
            pushFollow(FOLLOW_mult_in_arith_ausdruck209);
            mult27=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult27.getTree());
            dbg.location(32,9);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:32:9: ( ( '+' | '-' ) ^ mult )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==27||LA7_0==29) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:32:10: ( '+' | '-' ) ^ mult
            	    {
            	    dbg.location(32,21);
            	    set28=(Token)input.LT(1);

            	    set28=(Token)input.LT(1);

            	    if ( input.LA(1)==27||input.LA(1)==29 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set28)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(32,23);
            	    pushFollow(FOLLOW_mult_in_arith_ausdruck221);
            	    mult29=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult29.getTree());

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
        dbg.location(32, 29);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:34:1: mult : atom ( ( '*' | '/' ) ^ atom )* ;
    public final MiniPParser.mult_return mult() throws RecognitionException {
        MiniPParser.mult_return retval = new MiniPParser.mult_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set31=null;
        MiniPParser.atom_return atom30 =null;

        MiniPParser.atom_return atom32 =null;


        Object set31_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(34, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:35:2: ( atom ( ( '*' | '/' ) ^ atom )* )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:35:4: atom ( ( '*' | '/' ) ^ atom )*
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(35,4);
            pushFollow(FOLLOW_atom_in_mult236);
            atom30=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom30.getTree());
            dbg.location(35,9);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:35:9: ( ( '*' | '/' ) ^ atom )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==26||LA8_0==30) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:35:10: ( '*' | '/' ) ^ atom
            	    {
            	    dbg.location(35,21);
            	    set31=(Token)input.LT(1);

            	    set31=(Token)input.LT(1);

            	    if ( input.LA(1)==26||input.LA(1)==30 ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot(
            	        (Object)adaptor.create(set31)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(35,23);
            	    pushFollow(FOLLOW_atom_in_mult248);
            	    atom32=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom32.getTree());

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
        dbg.location(35, 29);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:37:1: atom : ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' ! arith_ausdruck ')' !);
    public final MiniPParser.atom_return atom() throws RecognitionException {
        MiniPParser.atom_return retval = new MiniPParser.atom_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set33=null;
        Token INTEGER34=null;
        Token set35=null;
        Token REAL36=null;
        Token IDENTIFIER37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck39 =null;


        Object set33_tree=null;
        Object INTEGER34_tree=null;
        Object set35_tree=null;
        Object REAL36_tree=null;
        Object IDENTIFIER37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:38:2: ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' ! arith_ausdruck ')' !)
            int alt11=4;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 27:
            case 29:
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
            case 24:
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:38:4: ( '+' | '-' )? INTEGER
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(38,4);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:38:4: ( '+' | '-' )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27||LA9_0==29) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
                            {
                            dbg.location(38,4);
                            set33=(Token)input.LT(1);

                            if ( input.LA(1)==27||input.LA(1)==29 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set33)
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

                    dbg.location(38,17);
                    INTEGER34=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom272); 
                    INTEGER34_tree = 
                    (Object)adaptor.create(INTEGER34)
                    ;
                    adaptor.addChild(root_0, INTEGER34_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:39:4: ( '+' | '-' )? REAL
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(39,4);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:39:4: ( '+' | '-' )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==27||LA10_0==29) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:
                            {
                            dbg.location(39,4);
                            set35=(Token)input.LT(1);

                            if ( input.LA(1)==27||input.LA(1)==29 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (Object)adaptor.create(set35)
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

                    dbg.location(39,17);
                    REAL36=(Token)match(input,REAL,FOLLOW_REAL_in_atom286); 
                    REAL36_tree = 
                    (Object)adaptor.create(REAL36)
                    ;
                    adaptor.addChild(root_0, REAL36_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:40:4: IDENTIFIER
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(40,4);
                    IDENTIFIER37=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom291); 
                    IDENTIFIER37_tree = 
                    (Object)adaptor.create(IDENTIFIER37)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER37_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:41:4: '(' ! arith_ausdruck ')' !
                    {
                    root_0 = (Object)adaptor.nil();


                    dbg.location(41,7);
                    char_literal38=(Token)match(input,24,FOLLOW_24_in_atom296); 
                    dbg.location(41,9);
                    pushFollow(FOLLOW_arith_ausdruck_in_atom299);
                    arith_ausdruck39=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck39.getTree());
                    dbg.location(41,27);
                    char_literal40=(Token)match(input,25,FOLLOW_25_in_atom301); 

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
        dbg.location(41, 28);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:43:1: fi : 'if' vergleich 'then' ( ifanweisung )+ ( 'else' ( elseanweisung )+ )? 'fi' -> ^( 'if' vergleich ^( THEN ( ifanweisung )+ ) ( ^( ELSE ( elseanweisung )+ ) )? ) ;
    public final MiniPParser.fi_return fi() throws RecognitionException {
        MiniPParser.fi_return retval = new MiniPParser.fi_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal43=null;
        Token string_literal45=null;
        Token string_literal47=null;
        MiniPParser.vergleich_return vergleich42 =null;

        MiniPParser.ifanweisung_return ifanweisung44 =null;

        MiniPParser.elseanweisung_return elseanweisung46 =null;


        Object string_literal41_tree=null;
        Object string_literal43_tree=null;
        Object string_literal45_tree=null;
        Object string_literal47_tree=null;
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_ifanweisung=new RewriteRuleSubtreeStream(adaptor,"rule ifanweisung");
        RewriteRuleSubtreeStream stream_elseanweisung=new RewriteRuleSubtreeStream(adaptor,"rule elseanweisung");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "fi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(43, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:2: ( 'if' vergleich 'then' ( ifanweisung )+ ( 'else' ( elseanweisung )+ )? 'fi' -> ^( 'if' vergleich ^( THEN ( ifanweisung )+ ) ( ^( ELSE ( elseanweisung )+ ) )? ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:4: 'if' vergleich 'then' ( ifanweisung )+ ( 'else' ( elseanweisung )+ )? 'fi'
            {
            dbg.location(44,4);
            string_literal41=(Token)match(input,36,FOLLOW_36_in_fi313);  
            stream_36.add(string_literal41);

            dbg.location(44,9);
            pushFollow(FOLLOW_vergleich_in_fi315);
            vergleich42=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich42.getTree());
            dbg.location(44,20);
            string_literal43=(Token)match(input,40,FOLLOW_40_in_fi318);  
            stream_40.add(string_literal43);

            dbg.location(44,27);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:27: ( ifanweisung )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( ((LA12_0 >= IDENTIFIER && LA12_0 <= INTEGER)||LA12_0==REAL||LA12_0==24||LA12_0==27||LA12_0==29||LA12_0==36||(LA12_0 >= 38 && LA12_0 <= 39)||LA12_0==41) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:27: ifanweisung
            	    {
            	    dbg.location(44,27);
            	    pushFollow(FOLLOW_ifanweisung_in_fi320);
            	    ifanweisung44=ifanweisung();

            	    state._fsp--;

            	    stream_ifanweisung.add(ifanweisung44.getTree());

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

            dbg.location(44,40);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:40: ( 'else' ( elseanweisung )+ )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==34) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:41: 'else' ( elseanweisung )+
                    {
                    dbg.location(44,41);
                    string_literal45=(Token)match(input,34,FOLLOW_34_in_fi324);  
                    stream_34.add(string_literal45);

                    dbg.location(44,48);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:48: ( elseanweisung )+
                    int cnt13=0;
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= IDENTIFIER && LA13_0 <= INTEGER)||LA13_0==REAL||LA13_0==24||LA13_0==27||LA13_0==29||LA13_0==36||(LA13_0 >= 38 && LA13_0 <= 39)||LA13_0==41) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:48: elseanweisung
                    	    {
                    	    dbg.location(44,48);
                    	    pushFollow(FOLLOW_elseanweisung_in_fi326);
                    	    elseanweisung46=elseanweisung();

                    	    state._fsp--;

                    	    stream_elseanweisung.add(elseanweisung46.getTree());

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

            dbg.location(44,65);
            string_literal47=(Token)match(input,35,FOLLOW_35_in_fi331);  
            stream_35.add(string_literal47);


            // AST REWRITE
            // elements: elseanweisung, vergleich, ifanweisung, 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 44:70: -> ^( 'if' vergleich ^( THEN ( ifanweisung )+ ) ( ^( ELSE ( elseanweisung )+ ) )? )
            {
                dbg.location(44,73);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:73: ^( 'if' vergleich ^( THEN ( ifanweisung )+ ) ( ^( ELSE ( elseanweisung )+ ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(44,75);
                root_1 = (Object)adaptor.becomeRoot(
                stream_36.nextNode()
                , root_1);

                dbg.location(44,80);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(44,90);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:90: ^( THEN ( ifanweisung )+ )
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(44,92);
                root_2 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(THEN, "THEN")
                , root_2);

                dbg.location(44,97);
                if ( !(stream_ifanweisung.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ifanweisung.hasNext() ) {
                    dbg.location(44,97);
                    adaptor.addChild(root_2, stream_ifanweisung.nextTree());

                }
                stream_ifanweisung.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(44,111);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:111: ( ^( ELSE ( elseanweisung )+ ) )?
                if ( stream_elseanweisung.hasNext() ) {
                    dbg.location(44,111);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:44:111: ^( ELSE ( elseanweisung )+ )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    dbg.location(44,113);
                    root_2 = (Object)adaptor.becomeRoot(
                    (Object)adaptor.create(ELSE, "ELSE")
                    , root_2);

                    dbg.location(44,118);
                    if ( !(stream_elseanweisung.hasNext()) ) {
                        throw new RewriteEarlyExitException();
                    }
                    while ( stream_elseanweisung.hasNext() ) {
                        dbg.location(44,118);
                        adaptor.addChild(root_2, stream_elseanweisung.nextTree());

                    }
                    stream_elseanweisung.reset();

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_elseanweisung.reset();

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
        dbg.location(44, 134);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "fi");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "fi"


    public static class ifanweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifanweisung"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:45:1: ifanweisung : anweisung ;
    public final MiniPParser.ifanweisung_return ifanweisung() throws RecognitionException {
        MiniPParser.ifanweisung_return retval = new MiniPParser.ifanweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniPParser.anweisung_return anweisung48 =null;



        try { dbg.enterRule(getGrammarFileName(), "ifanweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(45, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:46:2: ( anweisung )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:46:4: anweisung
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(46,4);
            pushFollow(FOLLOW_anweisung_in_ifanweisung362);
            anweisung48=anweisung();

            state._fsp--;

            adaptor.addChild(root_0, anweisung48.getTree());

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
        dbg.location(46, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "ifanweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "ifanweisung"


    public static class elseanweisung_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elseanweisung"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:47:1: elseanweisung : anweisung ;
    public final MiniPParser.elseanweisung_return elseanweisung() throws RecognitionException {
        MiniPParser.elseanweisung_return retval = new MiniPParser.elseanweisung_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        MiniPParser.anweisung_return anweisung49 =null;



        try { dbg.enterRule(getGrammarFileName(), "elseanweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:48:2: ( anweisung )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:48:4: anweisung
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(48,4);
            pushFollow(FOLLOW_anweisung_in_elseanweisung371);
            anweisung49=anweisung();

            state._fsp--;

            adaptor.addChild(root_0, anweisung49.getTree());

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
        dbg.location(48, 13);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "elseanweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "elseanweisung"


    public static class vergleich_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:50:1: vergleich : arith_ausdruck COMPARE_OP ^ arith_ausdruck ;
    public final MiniPParser.vergleich_return vergleich() throws RecognitionException {
        MiniPParser.vergleich_return retval = new MiniPParser.vergleich_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COMPARE_OP51=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck50 =null;

        MiniPParser.arith_ausdruck_return arith_ausdruck52 =null;


        Object COMPARE_OP51_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(50, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:51:2: ( arith_ausdruck COMPARE_OP ^ arith_ausdruck )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:51:4: arith_ausdruck COMPARE_OP ^ arith_ausdruck
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(51,4);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich381);
            arith_ausdruck50=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck50.getTree());
            dbg.location(51,29);
            COMPARE_OP51=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_vergleich383); 
            COMPARE_OP51_tree = 
            (Object)adaptor.create(COMPARE_OP51)
            ;
            root_0 = (Object)adaptor.becomeRoot(COMPARE_OP51_tree, root_0);

            dbg.location(51,31);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich386);
            arith_ausdruck52=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck52.getTree());

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
        dbg.location(51, 44);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:53:1: elihw : 'while' vergleich 'do' ( anweisung )+ 'od' -> ^( 'while' vergleich ( anweisung )+ ) ;
    public final MiniPParser.elihw_return elihw() throws RecognitionException {
        MiniPParser.elihw_return retval = new MiniPParser.elihw_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal53=null;
        Token string_literal55=null;
        Token string_literal57=null;
        MiniPParser.vergleich_return vergleich54 =null;

        MiniPParser.anweisung_return anweisung56 =null;


        Object string_literal53_tree=null;
        Object string_literal55_tree=null;
        Object string_literal57_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "elihw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(53, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:54:2: ( 'while' vergleich 'do' ( anweisung )+ 'od' -> ^( 'while' vergleich ( anweisung )+ ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:54:4: 'while' vergleich 'do' ( anweisung )+ 'od'
            {
            dbg.location(54,4);
            string_literal53=(Token)match(input,41,FOLLOW_41_in_elihw395);  
            stream_41.add(string_literal53);

            dbg.location(54,12);
            pushFollow(FOLLOW_vergleich_in_elihw397);
            vergleich54=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich54.getTree());
            dbg.location(54,22);
            string_literal55=(Token)match(input,33,FOLLOW_33_in_elihw399);  
            stream_33.add(string_literal55);

            dbg.location(54,27);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:54:27: ( anweisung )+
            int cnt15=0;
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( ((LA15_0 >= IDENTIFIER && LA15_0 <= INTEGER)||LA15_0==REAL||LA15_0==24||LA15_0==27||LA15_0==29||LA15_0==36||(LA15_0 >= 38 && LA15_0 <= 39)||LA15_0==41) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:54:27: anweisung
            	    {
            	    dbg.location(54,27);
            	    pushFollow(FOLLOW_anweisung_in_elihw401);
            	    anweisung56=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung56.getTree());

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

            dbg.location(54,38);
            string_literal57=(Token)match(input,37,FOLLOW_37_in_elihw404);  
            stream_37.add(string_literal57);


            // AST REWRITE
            // elements: 41, vergleich, anweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 54:43: -> ^( 'while' vergleich ( anweisung )+ )
            {
                dbg.location(54,46);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:54:46: ^( 'while' vergleich ( anweisung )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(54,48);
                root_1 = (Object)adaptor.becomeRoot(
                stream_41.nextNode()
                , root_1);

                dbg.location(54,56);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(54,66);
                if ( !(stream_anweisung.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(54,66);
                    adaptor.addChild(root_1, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

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
        dbg.location(54, 76);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:56:1: read : 'read' ^ '(' ! IDENTIFIER ')' !;
    public final MiniPParser.read_return read() throws RecognitionException {
        MiniPParser.read_return retval = new MiniPParser.read_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal59=null;
        Token IDENTIFIER60=null;
        Token char_literal61=null;

        Object string_literal58_tree=null;
        Object char_literal59_tree=null;
        Object IDENTIFIER60_tree=null;
        Object char_literal61_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(56, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:57:2: ( 'read' ^ '(' ! IDENTIFIER ')' !)
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:57:4: 'read' ^ '(' ! IDENTIFIER ')' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(57,10);
            string_literal58=(Token)match(input,39,FOLLOW_39_in_read426); 
            string_literal58_tree = 
            (Object)adaptor.create(string_literal58)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal58_tree, root_0);

            dbg.location(57,15);
            char_literal59=(Token)match(input,24,FOLLOW_24_in_read429); 
            dbg.location(57,17);
            IDENTIFIER60=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read432); 
            IDENTIFIER60_tree = 
            (Object)adaptor.create(IDENTIFIER60)
            ;
            adaptor.addChild(root_0, IDENTIFIER60_tree);

            dbg.location(57,31);
            char_literal61=(Token)match(input,25,FOLLOW_25_in_read434); 

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
        dbg.location(57, 32);

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
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:59:1: println : 'println' ^ '(' ! ( arith_ausdruck | STRING ) ')' !;
    public final MiniPParser.println_return println() throws RecognitionException {
        MiniPParser.println_return retval = new MiniPParser.println_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal62=null;
        Token char_literal63=null;
        Token STRING65=null;
        Token char_literal66=null;
        MiniPParser.arith_ausdruck_return arith_ausdruck64 =null;


        Object string_literal62_tree=null;
        Object char_literal63_tree=null;
        Object STRING65_tree=null;
        Object char_literal66_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:60:2: ( 'println' ^ '(' ! ( arith_ausdruck | STRING ) ')' !)
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:60:4: 'println' ^ '(' ! ( arith_ausdruck | STRING ) ')' !
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(60,13);
            string_literal62=(Token)match(input,38,FOLLOW_38_in_println447); 
            string_literal62_tree = 
            (Object)adaptor.create(string_literal62)
            ;
            root_0 = (Object)adaptor.becomeRoot(string_literal62_tree, root_0);

            dbg.location(60,18);
            char_literal63=(Token)match(input,24,FOLLOW_24_in_println450); 
            dbg.location(60,20);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:60:20: ( arith_ausdruck | STRING )
            int alt16=2;
            try { dbg.enterSubRule(16);
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= IDENTIFIER && LA16_0 <= INTEGER)||LA16_0==REAL||LA16_0==24||LA16_0==27||LA16_0==29) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:60:21: arith_ausdruck
                    {
                    dbg.location(60,21);
                    pushFollow(FOLLOW_arith_ausdruck_in_println454);
                    arith_ausdruck64=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck64.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Ralf\\MiniP.g:60:38: STRING
                    {
                    dbg.location(60,38);
                    STRING65=(Token)match(input,STRING,FOLLOW_STRING_in_println458); 
                    STRING65_tree = 
                    (Object)adaptor.create(STRING65)
                    ;
                    adaptor.addChild(root_0, STRING65_tree);


                    }
                    break;

            }
            } finally {dbg.exitSubRule(16);}

            dbg.location(60,49);
            char_literal66=(Token)match(input,25,FOLLOW_25_in_println461); 

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
        dbg.location(60, 50);

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


 

    public static final BitSet FOLLOW_START_TOKEN_in_start33 = new BitSet(new long[]{0x0000000000244090L});
    public static final BitSet FOLLOW_deklaration_in_start36 = new BitSet(new long[]{0x0000000000244090L});
    public static final BitSet FOLLOW_BEGIN_TOKEN_in_start39 = new BitSet(new long[]{0x000002D029023000L});
    public static final BitSet FOLLOW_anweisung_in_start42 = new BitSet(new long[]{0x000002D029023800L});
    public static final BitSet FOLLOW_END_TOKEN_in_start45 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstanten_in_deklaration59 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration63 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_28_in_deklaration66 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration68 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_32_in_deklaration72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung115 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_anweisung119 = new BitSet(new long[]{0x0000000100000200L});
    public static final BitSet FOLLOW_s_in_anweisung121 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_read_in_anweisung125 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_println_in_anweisung129 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_fi_in_anweisung133 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_elihw_in_anweisung137 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_anweisung140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_wertzuweisung152 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_wertzuweisung154 = new BitSet(new long[]{0x0000000029123000L});
    public static final BitSet FOLLOW_wertzuweisungA_in_wertzuweisung156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_wertzuweisungA177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_wertzuweisungA182 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_s_in_wertzuweisungA184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPARE_OP_in_s192 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_s194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck209 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_set_in_arith_ausdruck212 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck221 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_atom_in_mult236 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_set_in_mult239 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_atom_in_mult248 = new BitSet(new long[]{0x0000000044000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_atom296 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_atom299 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_atom301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_fi313 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_vergleich_in_fi315 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_fi318 = new BitSet(new long[]{0x000002D029023000L});
    public static final BitSet FOLLOW_ifanweisung_in_fi320 = new BitSet(new long[]{0x000002DC29023000L});
    public static final BitSet FOLLOW_34_in_fi324 = new BitSet(new long[]{0x000002D029023000L});
    public static final BitSet FOLLOW_elseanweisung_in_fi326 = new BitSet(new long[]{0x000002D829023000L});
    public static final BitSet FOLLOW_35_in_fi331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anweisung_in_ifanweisung362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_anweisung_in_elseanweisung371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich381 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMPARE_OP_in_vergleich383 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_elihw395 = new BitSet(new long[]{0x0000000029023000L});
    public static final BitSet FOLLOW_vergleich_in_elihw397 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_elihw399 = new BitSet(new long[]{0x000002D029023000L});
    public static final BitSet FOLLOW_anweisung_in_elihw401 = new BitSet(new long[]{0x000002F029023000L});
    public static final BitSet FOLLOW_37_in_elihw404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_read426 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_read429 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_read432 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_read434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_println447 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_println450 = new BitSet(new long[]{0x0000000029123000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_println454 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_STRING_in_println458 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_println461 = new BitSet(new long[]{0x0000000000000002L});

}