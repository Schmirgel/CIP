// $ANTLR 3.4 Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g 2015-11-26 13:49:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_MiniPParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANWEISUNG", "BEGIN_TOKEN", "BLOCK_KOMMENTAR", "BOOLEAN", "BOOL_KONSTANTE", "BUCHSTABE", "COMPARE", "COMPARE_OP", "ELSE", "END_TOKEN", "IDENTIFIER", "IF", "INTEGER", "INT_KONSTANTE", "LEERZEICHEN", "NEUE_ZEILE", "PRINT", "PROGRAM", "READ", "REAL", "REAL_KONSTANTE", "START_TOKEN", "STRING", "STRING_KONSTANTE", "VARDEF", "WERTZUWEISUNG", "WHILE", "ZAHL", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "':='", "';'", "'do'", "'else'", "'fi'", "'if'", "'od'", "'println('", "'read('", "'then'", "'while'"
    };

    public static final int EOF=-1;
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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int ANWEISUNG=4;
    public static final int BEGIN_TOKEN=5;
    public static final int BLOCK_KOMMENTAR=6;
    public static final int BOOLEAN=7;
    public static final int BOOL_KONSTANTE=8;
    public static final int BUCHSTABE=9;
    public static final int COMPARE=10;
    public static final int COMPARE_OP=11;
    public static final int ELSE=12;
    public static final int END_TOKEN=13;
    public static final int IDENTIFIER=14;
    public static final int IF=15;
    public static final int INTEGER=16;
    public static final int INT_KONSTANTE=17;
    public static final int LEERZEICHEN=18;
    public static final int NEUE_ZEILE=19;
    public static final int PRINT=20;
    public static final int PROGRAM=21;
    public static final int READ=22;
    public static final int REAL=23;
    public static final int REAL_KONSTANTE=24;
    public static final int START_TOKEN=25;
    public static final int STRING=26;
    public static final int STRING_KONSTANTE=27;
    public static final int VARDEF=28;
    public static final int WERTZUWEISUNG=29;
    public static final int WHILE=30;
    public static final int ZAHL=31;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "konstanten", "fi", "anweisung", "println", "deklaration", 
    "wertzuweisung_optionen", "elihw", "arith_ausdruck", "s", "start", "atom", 
    "wertzuweisung", "read", "vergleich", "mult", "drucken"
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
    public AST_MiniPParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AST_MiniPParser(TokenStream input, int port, RecognizerSharedState state) {
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

public AST_MiniPParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return AST_MiniPParser.tokenNames; }
    public String getGrammarFileName() { return "Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:13:1: start : START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN -> ^( PROGRAM ^( VARDEF ( deklaration )* ) ^( ANWEISUNG ( anweisung )+ ) ) ;
    public final AST_MiniPParser.start_return start() throws RecognitionException {
        AST_MiniPParser.start_return retval = new AST_MiniPParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token START_TOKEN1=null;
        Token BEGIN_TOKEN3=null;
        Token END_TOKEN5=null;
        AST_MiniPParser.deklaration_return deklaration2 =null;

        AST_MiniPParser.anweisung_return anweisung4 =null;


        CommonTree START_TOKEN1_tree=null;
        CommonTree BEGIN_TOKEN3_tree=null;
        CommonTree END_TOKEN5_tree=null;
        RewriteRuleTokenStream stream_START_TOKEN=new RewriteRuleTokenStream(adaptor,"token START_TOKEN");
        RewriteRuleTokenStream stream_END_TOKEN=new RewriteRuleTokenStream(adaptor,"token END_TOKEN");
        RewriteRuleTokenStream stream_BEGIN_TOKEN=new RewriteRuleTokenStream(adaptor,"token BEGIN_TOKEN");
        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        RewriteRuleSubtreeStream stream_deklaration=new RewriteRuleSubtreeStream(adaptor,"rule deklaration");
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:2: ( START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN -> ^( PROGRAM ^( VARDEF ( deklaration )* ) ^( ANWEISUNG ( anweisung )+ ) ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:4: START_TOKEN ( deklaration )* BEGIN_TOKEN ( anweisung )+ END_TOKEN
            {
            dbg.location(14,4);
            START_TOKEN1=(Token)match(input,START_TOKEN,FOLLOW_START_TOKEN_in_start61);  
            stream_START_TOKEN.add(START_TOKEN1);

            dbg.location(14,16);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:16: ( deklaration )*
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

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:16: deklaration
            	    {
            	    dbg.location(14,16);
            	    pushFollow(FOLLOW_deklaration_in_start63);
            	    deklaration2=deklaration();

            	    state._fsp--;

            	    stream_deklaration.add(deklaration2.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);
            } finally {dbg.exitSubRule(1);}

            dbg.location(14,29);
            BEGIN_TOKEN3=(Token)match(input,BEGIN_TOKEN,FOLLOW_BEGIN_TOKEN_in_start66);  
            stream_BEGIN_TOKEN.add(BEGIN_TOKEN3);

            dbg.location(14,41);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:41: ( anweisung )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==IDENTIFIER||LA2_0==INTEGER||LA2_0==REAL||LA2_0==32||LA2_0==35||LA2_0==37||LA2_0==44||(LA2_0 >= 46 && LA2_0 <= 47)||LA2_0==49) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:41: anweisung
            	    {
            	    dbg.location(14,41);
            	    pushFollow(FOLLOW_anweisung_in_start68);
            	    anweisung4=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung4.getTree());

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

            dbg.location(14,52);
            END_TOKEN5=(Token)match(input,END_TOKEN,FOLLOW_END_TOKEN_in_start71);  
            stream_END_TOKEN.add(END_TOKEN5);


            // AST REWRITE
            // elements: anweisung, deklaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 14:62: -> ^( PROGRAM ^( VARDEF ( deklaration )* ) ^( ANWEISUNG ( anweisung )+ ) )
            {
                dbg.location(14,65);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:65: ^( PROGRAM ^( VARDEF ( deklaration )* ) ^( ANWEISUNG ( anweisung )+ ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(14,67);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                dbg.location(14,75);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:75: ^( VARDEF ( deklaration )* )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(14,77);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(VARDEF, "VARDEF")
                , root_2);

                dbg.location(14,84);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:84: ( deklaration )*
                while ( stream_deklaration.hasNext() ) {
                    dbg.location(14,84);
                    adaptor.addChild(root_2, stream_deklaration.nextTree());

                }
                stream_deklaration.reset();

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(14,98);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:14:98: ^( ANWEISUNG ( anweisung )+ )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(14,100);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ANWEISUNG, "ANWEISUNG")
                , root_2);

                dbg.location(14,110);
                if ( !(stream_anweisung.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(14,110);
                    adaptor.addChild(root_2, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(14, 121);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "deklaration"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:16:1: deklaration : konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' -> ( ^( konstanten IDENTIFIER ) )+ ;
    public final AST_MiniPParser.deklaration_return deklaration() throws RecognitionException {
        AST_MiniPParser.deklaration_return retval = new AST_MiniPParser.deklaration_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER7=null;
        Token char_literal8=null;
        Token IDENTIFIER9=null;
        Token char_literal10=null;
        AST_MiniPParser.konstanten_return konstanten6 =null;


        CommonTree IDENTIFIER7_tree=null;
        CommonTree char_literal8_tree=null;
        CommonTree IDENTIFIER9_tree=null;
        CommonTree char_literal10_tree=null;
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleSubtreeStream stream_konstanten=new RewriteRuleSubtreeStream(adaptor,"rule konstanten");
        try { dbg.enterRule(getGrammarFileName(), "deklaration");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:17:2: ( konstanten IDENTIFIER ( ',' IDENTIFIER )* ';' -> ( ^( konstanten IDENTIFIER ) )+ )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:17:4: konstanten IDENTIFIER ( ',' IDENTIFIER )* ';'
            {
            dbg.location(17,4);
            pushFollow(FOLLOW_konstanten_in_deklaration101);
            konstanten6=konstanten();

            state._fsp--;

            stream_konstanten.add(konstanten6.getTree());
            dbg.location(17,15);
            IDENTIFIER7=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration103);  
            stream_IDENTIFIER.add(IDENTIFIER7);

            dbg.location(17,26);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:17:26: ( ',' IDENTIFIER )*
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:17:27: ',' IDENTIFIER
            	    {
            	    dbg.location(17,27);
            	    char_literal8=(Token)match(input,36,FOLLOW_36_in_deklaration106);  
            	    stream_36.add(char_literal8);

            	    dbg.location(17,31);
            	    IDENTIFIER9=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_deklaration108);  
            	    stream_IDENTIFIER.add(IDENTIFIER9);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);
            } finally {dbg.exitSubRule(3);}

            dbg.location(17,44);
            char_literal10=(Token)match(input,40,FOLLOW_40_in_deklaration112);  
            stream_40.add(char_literal10);


            // AST REWRITE
            // elements: IDENTIFIER, konstanten
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:48: -> ( ^( konstanten IDENTIFIER ) )+
            {
                dbg.location(17,51);
                if ( !(stream_IDENTIFIER.hasNext()||stream_konstanten.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_IDENTIFIER.hasNext()||stream_konstanten.hasNext() ) {
                    dbg.location(17,51);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:17:51: ^( konstanten IDENTIFIER )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(17,53);
                    root_1 = (CommonTree)adaptor.becomeRoot(stream_konstanten.nextNode(), root_1);

                    dbg.location(17,64);
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


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 75);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "konstanten"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:19:1: konstanten : ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) ;
    public final AST_MiniPParser.konstanten_return konstanten() throws RecognitionException {
        AST_MiniPParser.konstanten_return retval = new AST_MiniPParser.konstanten_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set11=null;

        CommonTree set11_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "konstanten");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:20:2: ( ( INT_KONSTANTE | REAL_KONSTANTE | STRING_KONSTANTE | BOOL_KONSTANTE ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(20,2);
            set11=(Token)input.LT(1);

            if ( input.LA(1)==BOOL_KONSTANTE||input.LA(1)==INT_KONSTANTE||input.LA(1)==REAL_KONSTANTE||input.LA(1)==STRING_KONSTANTE ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set11)
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


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(20, 72);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "anweisung"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:22:1: anweisung : ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !;
    public final AST_MiniPParser.anweisung_return anweisung() throws RecognitionException {
        AST_MiniPParser.anweisung_return retval = new AST_MiniPParser.anweisung_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal19=null;
        AST_MiniPParser.wertzuweisung_return wertzuweisung12 =null;

        AST_MiniPParser.arith_ausdruck_return arith_ausdruck13 =null;

        AST_MiniPParser.s_return s14 =null;

        AST_MiniPParser.read_return read15 =null;

        AST_MiniPParser.println_return println16 =null;

        AST_MiniPParser.fi_return fi17 =null;

        AST_MiniPParser.elihw_return elihw18 =null;


        CommonTree char_literal19_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "anweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:2: ( ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !)
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw ) ';' !
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(23,4);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:4: ( wertzuweisung | arith_ausdruck s | read | println | fi | elihw )
            int alt4=6;
            try { dbg.enterSubRule(4);
            try { dbg.enterDecision(4, decisionCanBacktrack[4]);

            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==39) ) {
                    alt4=1;
                }
                else if ( (LA4_1==COMPARE_OP||(LA4_1 >= 34 && LA4_1 <= 35)||(LA4_1 >= 37 && LA4_1 <= 38)||LA4_1==40) ) {
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
            case 32:
            case 35:
            case 37:
                {
                alt4=2;
                }
                break;
            case 47:
                {
                alt4=3;
                }
                break;
            case 46:
                {
                alt4=4;
                }
                break;
            case 44:
                {
                alt4=5;
                }
                break;
            case 49:
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:5: wertzuweisung
                    {
                    dbg.location(23,5);
                    pushFollow(FOLLOW_wertzuweisung_in_anweisung156);
                    wertzuweisung12=wertzuweisung();

                    state._fsp--;

                    adaptor.addChild(root_0, wertzuweisung12.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:21: arith_ausdruck s
                    {
                    dbg.location(23,21);
                    pushFollow(FOLLOW_arith_ausdruck_in_anweisung160);
                    arith_ausdruck13=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck13.getTree());
                    dbg.location(23,36);
                    pushFollow(FOLLOW_s_in_anweisung162);
                    s14=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s14.getTree());

                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:40: read
                    {
                    dbg.location(23,40);
                    pushFollow(FOLLOW_read_in_anweisung166);
                    read15=read();

                    state._fsp--;

                    adaptor.addChild(root_0, read15.getTree());

                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:47: println
                    {
                    dbg.location(23,47);
                    pushFollow(FOLLOW_println_in_anweisung170);
                    println16=println();

                    state._fsp--;

                    adaptor.addChild(root_0, println16.getTree());

                    }
                    break;
                case 5 :
                    dbg.enterAlt(5);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:57: fi
                    {
                    dbg.location(23,57);
                    pushFollow(FOLLOW_fi_in_anweisung174);
                    fi17=fi();

                    state._fsp--;

                    adaptor.addChild(root_0, fi17.getTree());

                    }
                    break;
                case 6 :
                    dbg.enterAlt(6);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:23:62: elihw
                    {
                    dbg.location(23,62);
                    pushFollow(FOLLOW_elihw_in_anweisung178);
                    elihw18=elihw();

                    state._fsp--;

                    adaptor.addChild(root_0, elihw18.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(4);}

            dbg.location(23,72);
            char_literal19=(Token)match(input,40,FOLLOW_40_in_anweisung181); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(23, 72);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wertzuweisung"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:25:1: wertzuweisung : IDENTIFIER ':=' wertzuweisung_optionen -> ^( WERTZUWEISUNG IDENTIFIER wertzuweisung_optionen ) ;
    public final AST_MiniPParser.wertzuweisung_return wertzuweisung() throws RecognitionException {
        AST_MiniPParser.wertzuweisung_return retval = new AST_MiniPParser.wertzuweisung_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token IDENTIFIER20=null;
        Token string_literal21=null;
        AST_MiniPParser.wertzuweisung_optionen_return wertzuweisung_optionen22 =null;


        CommonTree IDENTIFIER20_tree=null;
        CommonTree string_literal21_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");
        RewriteRuleSubtreeStream stream_wertzuweisung_optionen=new RewriteRuleSubtreeStream(adaptor,"rule wertzuweisung_optionen");
        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(25, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:26:2: ( IDENTIFIER ':=' wertzuweisung_optionen -> ^( WERTZUWEISUNG IDENTIFIER wertzuweisung_optionen ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:26:4: IDENTIFIER ':=' wertzuweisung_optionen
            {
            dbg.location(26,4);
            IDENTIFIER20=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_wertzuweisung193);  
            stream_IDENTIFIER.add(IDENTIFIER20);

            dbg.location(26,15);
            string_literal21=(Token)match(input,39,FOLLOW_39_in_wertzuweisung195);  
            stream_39.add(string_literal21);

            dbg.location(26,20);
            pushFollow(FOLLOW_wertzuweisung_optionen_in_wertzuweisung197);
            wertzuweisung_optionen22=wertzuweisung_optionen();

            state._fsp--;

            stream_wertzuweisung_optionen.add(wertzuweisung_optionen22.getTree());

            // AST REWRITE
            // elements: IDENTIFIER, wertzuweisung_optionen
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:2: -> ^( WERTZUWEISUNG IDENTIFIER wertzuweisung_optionen )
            {
                dbg.location(27,5);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:27:5: ^( WERTZUWEISUNG IDENTIFIER wertzuweisung_optionen )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(27,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WERTZUWEISUNG, "WERTZUWEISUNG")
                , root_1);

                dbg.location(27,21);
                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );
                dbg.location(27,32);
                adaptor.addChild(root_1, stream_wertzuweisung_optionen.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(27, 54);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisung"


    public static class wertzuweisung_optionen_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "wertzuweisung_optionen"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:29:1: wertzuweisung_optionen : ( STRING | arith_ausdruck s ) ;
    public final AST_MiniPParser.wertzuweisung_optionen_return wertzuweisung_optionen() throws RecognitionException {
        AST_MiniPParser.wertzuweisung_optionen_return retval = new AST_MiniPParser.wertzuweisung_optionen_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING23=null;
        AST_MiniPParser.arith_ausdruck_return arith_ausdruck24 =null;

        AST_MiniPParser.s_return s25 =null;


        CommonTree STRING23_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "wertzuweisung_optionen");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(29, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:30:2: ( ( STRING | arith_ausdruck s ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:30:4: ( STRING | arith_ausdruck s )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(30,4);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:30:4: ( STRING | arith_ausdruck s )
            int alt5=2;
            try { dbg.enterSubRule(5);
            try { dbg.enterDecision(5, decisionCanBacktrack[5]);

            int LA5_0 = input.LA(1);

            if ( (LA5_0==STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==IDENTIFIER||LA5_0==INTEGER||LA5_0==REAL||LA5_0==32||LA5_0==35||LA5_0==37) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:30:6: STRING
                    {
                    dbg.location(30,6);
                    STRING23=(Token)match(input,STRING,FOLLOW_STRING_in_wertzuweisung_optionen221); 
                    STRING23_tree = 
                    (CommonTree)adaptor.create(STRING23)
                    ;
                    adaptor.addChild(root_0, STRING23_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:30:15: arith_ausdruck s
                    {
                    dbg.location(30,15);
                    pushFollow(FOLLOW_arith_ausdruck_in_wertzuweisung_optionen225);
                    arith_ausdruck24=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck24.getTree());
                    dbg.location(30,30);
                    pushFollow(FOLLOW_s_in_wertzuweisung_optionen227);
                    s25=s();

                    state._fsp--;

                    adaptor.addChild(root_0, s25.getTree());

                    }
                    break;

            }
            } finally {dbg.exitSubRule(5);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(30, 31);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "wertzuweisung_optionen");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "wertzuweisung_optionen"


    public static class s_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "s"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:32:1: s : ( COMPARE_OP ^ arith_ausdruck |);
    public final AST_MiniPParser.s_return s() throws RecognitionException {
        AST_MiniPParser.s_return retval = new AST_MiniPParser.s_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMPARE_OP26=null;
        AST_MiniPParser.arith_ausdruck_return arith_ausdruck27 =null;


        CommonTree COMPARE_OP26_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "s");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(32, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:32:3: ( COMPARE_OP ^ arith_ausdruck |)
            int alt6=2;
            try { dbg.enterDecision(6, decisionCanBacktrack[6]);

            int LA6_0 = input.LA(1);

            if ( (LA6_0==COMPARE_OP) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:32:5: COMPARE_OP ^ arith_ausdruck
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(32,15);
                    COMPARE_OP26=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_s236); 
                    COMPARE_OP26_tree = 
                    (CommonTree)adaptor.create(COMPARE_OP26)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(COMPARE_OP26_tree, root_0);

                    dbg.location(32,17);
                    pushFollow(FOLLOW_arith_ausdruck_in_s239);
                    arith_ausdruck27=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck27.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:33:5: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 4);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arith_ausdruck"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:35:1: arith_ausdruck : mult ( ( '+' | '-' ) ^ mult )* ;
    public final AST_MiniPParser.arith_ausdruck_return arith_ausdruck() throws RecognitionException {
        AST_MiniPParser.arith_ausdruck_return retval = new AST_MiniPParser.arith_ausdruck_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;
        AST_MiniPParser.mult_return mult28 =null;

        AST_MiniPParser.mult_return mult30 =null;


        CommonTree set29_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "arith_ausdruck");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(35, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:36:2: ( mult ( ( '+' | '-' ) ^ mult )* )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:36:4: mult ( ( '+' | '-' ) ^ mult )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(36,4);
            pushFollow(FOLLOW_mult_in_arith_ausdruck254);
            mult28=mult();

            state._fsp--;

            adaptor.addChild(root_0, mult28.getTree());
            dbg.location(36,9);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:36:9: ( ( '+' | '-' ) ^ mult )*
            try { dbg.enterSubRule(7);

            loop7:
            do {
                int alt7=2;
                try { dbg.enterDecision(7, decisionCanBacktrack[7]);

                int LA7_0 = input.LA(1);

                if ( (LA7_0==35||LA7_0==37) ) {
                    alt7=1;
                }


                } finally {dbg.exitDecision(7);}

                switch (alt7) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:36:10: ( '+' | '-' ) ^ mult
            	    {
            	    dbg.location(36,21);
            	    set29=(Token)input.LT(1);

            	    set29=(Token)input.LT(1);

            	    if ( input.LA(1)==35||input.LA(1)==37 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set29)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(36,23);
            	    pushFollow(FOLLOW_mult_in_arith_ausdruck266);
            	    mult30=mult();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult30.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);
            } finally {dbg.exitSubRule(7);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(36, 30);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mult"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:38:1: mult : atom ( ( '*' | '/' ) ^ atom )* ;
    public final AST_MiniPParser.mult_return mult() throws RecognitionException {
        AST_MiniPParser.mult_return retval = new AST_MiniPParser.mult_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set32=null;
        AST_MiniPParser.atom_return atom31 =null;

        AST_MiniPParser.atom_return atom33 =null;


        CommonTree set32_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "mult");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:39:2: ( atom ( ( '*' | '/' ) ^ atom )* )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:39:4: atom ( ( '*' | '/' ) ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(39,4);
            pushFollow(FOLLOW_atom_in_mult282);
            atom31=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom31.getTree());
            dbg.location(39,9);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:39:9: ( ( '*' | '/' ) ^ atom )*
            try { dbg.enterSubRule(8);

            loop8:
            do {
                int alt8=2;
                try { dbg.enterDecision(8, decisionCanBacktrack[8]);

                int LA8_0 = input.LA(1);

                if ( (LA8_0==34||LA8_0==38) ) {
                    alt8=1;
                }


                } finally {dbg.exitDecision(8);}

                switch (alt8) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:39:10: ( '*' | '/' ) ^ atom
            	    {
            	    dbg.location(39,21);
            	    set32=(Token)input.LT(1);

            	    set32=(Token)input.LT(1);

            	    if ( input.LA(1)==34||input.LA(1)==38 ) {
            	        input.consume();
            	        root_0 = (CommonTree)adaptor.becomeRoot(
            	        (CommonTree)adaptor.create(set32)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        dbg.recognitionException(mse);
            	        throw mse;
            	    }

            	    dbg.location(39,23);
            	    pushFollow(FOLLOW_atom_in_mult294);
            	    atom33=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom33.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);
            } finally {dbg.exitSubRule(8);}


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(39, 29);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:41:1: atom : ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' ! arith_ausdruck ')' !);
    public final AST_MiniPParser.atom_return atom() throws RecognitionException {
        AST_MiniPParser.atom_return retval = new AST_MiniPParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set34=null;
        Token INTEGER35=null;
        Token set36=null;
        Token REAL37=null;
        Token IDENTIFIER38=null;
        Token char_literal39=null;
        Token char_literal41=null;
        AST_MiniPParser.arith_ausdruck_return arith_ausdruck40 =null;


        CommonTree set34_tree=null;
        CommonTree INTEGER35_tree=null;
        CommonTree set36_tree=null;
        CommonTree REAL37_tree=null;
        CommonTree IDENTIFIER38_tree=null;
        CommonTree char_literal39_tree=null;
        CommonTree char_literal41_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(41, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:42:2: ( ( '+' | '-' )? INTEGER | ( '+' | '-' )? REAL | IDENTIFIER | '(' ! arith_ausdruck ')' !)
            int alt11=4;
            try { dbg.enterDecision(11, decisionCanBacktrack[11]);

            switch ( input.LA(1) ) {
            case 35:
            case 37:
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
            case 32:
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:42:4: ( '+' | '-' )? INTEGER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(42,4);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:42:4: ( '+' | '-' )?
                    int alt9=2;
                    try { dbg.enterSubRule(9);
                    try { dbg.enterDecision(9, decisionCanBacktrack[9]);

                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==35||LA9_0==37) ) {
                        alt9=1;
                    }
                    } finally {dbg.exitDecision(9);}

                    switch (alt9) {
                        case 1 :
                            dbg.enterAlt(1);

                            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:
                            {
                            dbg.location(42,4);
                            set34=(Token)input.LT(1);

                            if ( input.LA(1)==35||input.LA(1)==37 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (CommonTree)adaptor.create(set34)
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

                    dbg.location(42,17);
                    INTEGER35=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_atom318); 
                    INTEGER35_tree = 
                    (CommonTree)adaptor.create(INTEGER35)
                    ;
                    adaptor.addChild(root_0, INTEGER35_tree);


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:43:4: ( '+' | '-' )? REAL
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(43,4);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:43:4: ( '+' | '-' )?
                    int alt10=2;
                    try { dbg.enterSubRule(10);
                    try { dbg.enterDecision(10, decisionCanBacktrack[10]);

                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==35||LA10_0==37) ) {
                        alt10=1;
                    }
                    } finally {dbg.exitDecision(10);}

                    switch (alt10) {
                        case 1 :
                            dbg.enterAlt(1);

                            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:
                            {
                            dbg.location(43,4);
                            set36=(Token)input.LT(1);

                            if ( input.LA(1)==35||input.LA(1)==37 ) {
                                input.consume();
                                adaptor.addChild(root_0, 
                                (CommonTree)adaptor.create(set36)
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

                    dbg.location(43,17);
                    REAL37=(Token)match(input,REAL,FOLLOW_REAL_in_atom332); 
                    REAL37_tree = 
                    (CommonTree)adaptor.create(REAL37)
                    ;
                    adaptor.addChild(root_0, REAL37_tree);


                    }
                    break;
                case 3 :
                    dbg.enterAlt(3);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:44:4: IDENTIFIER
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(44,4);
                    IDENTIFIER38=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_atom337); 
                    IDENTIFIER38_tree = 
                    (CommonTree)adaptor.create(IDENTIFIER38)
                    ;
                    adaptor.addChild(root_0, IDENTIFIER38_tree);


                    }
                    break;
                case 4 :
                    dbg.enterAlt(4);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:45:4: '(' ! arith_ausdruck ')' !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(45,7);
                    char_literal39=(Token)match(input,32,FOLLOW_32_in_atom342); 
                    dbg.location(45,9);
                    pushFollow(FOLLOW_arith_ausdruck_in_atom345);
                    arith_ausdruck40=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck40.getTree());
                    dbg.location(45,27);
                    char_literal41=(Token)match(input,33,FOLLOW_33_in_atom347); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(45, 28);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fi"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:47:1: fi : 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' -> ^( IF vergleich anweisung ^( ELSE ( anweisung )+ ) ) ;
    public final AST_MiniPParser.fi_return fi() throws RecognitionException {
        AST_MiniPParser.fi_return retval = new AST_MiniPParser.fi_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal42=null;
        Token string_literal44=null;
        Token string_literal46=null;
        Token string_literal48=null;
        AST_MiniPParser.vergleich_return vergleich43 =null;

        AST_MiniPParser.anweisung_return anweisung45 =null;

        AST_MiniPParser.anweisung_return anweisung47 =null;


        CommonTree string_literal42_tree=null;
        CommonTree string_literal44_tree=null;
        CommonTree string_literal46_tree=null;
        CommonTree string_literal48_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "fi");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(47, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:2: ( 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi' -> ^( IF vergleich anweisung ^( ELSE ( anweisung )+ ) ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:4: 'if' vergleich 'then' ( anweisung )+ ( 'else' ( anweisung )+ )? 'fi'
            {
            dbg.location(48,4);
            string_literal42=(Token)match(input,44,FOLLOW_44_in_fi359);  
            stream_44.add(string_literal42);

            dbg.location(48,9);
            pushFollow(FOLLOW_vergleich_in_fi361);
            vergleich43=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich43.getTree());
            dbg.location(48,20);
            string_literal44=(Token)match(input,48,FOLLOW_48_in_fi364);  
            stream_48.add(string_literal44);

            dbg.location(48,27);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:27: ( anweisung )+
            int cnt12=0;
            try { dbg.enterSubRule(12);

            loop12:
            do {
                int alt12=2;
                try { dbg.enterDecision(12, decisionCanBacktrack[12]);

                int LA12_0 = input.LA(1);

                if ( (LA12_0==IDENTIFIER||LA12_0==INTEGER||LA12_0==REAL||LA12_0==32||LA12_0==35||LA12_0==37||LA12_0==44||(LA12_0 >= 46 && LA12_0 <= 47)||LA12_0==49) ) {
                    alt12=1;
                }


                } finally {dbg.exitDecision(12);}

                switch (alt12) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:27: anweisung
            	    {
            	    dbg.location(48,27);
            	    pushFollow(FOLLOW_anweisung_in_fi366);
            	    anweisung45=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung45.getTree());

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

            dbg.location(48,38);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:38: ( 'else' ( anweisung )+ )?
            int alt14=2;
            try { dbg.enterSubRule(14);
            try { dbg.enterDecision(14, decisionCanBacktrack[14]);

            int LA14_0 = input.LA(1);

            if ( (LA14_0==42) ) {
                alt14=1;
            }
            } finally {dbg.exitDecision(14);}

            switch (alt14) {
                case 1 :
                    dbg.enterAlt(1);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:39: 'else' ( anweisung )+
                    {
                    dbg.location(48,39);
                    string_literal46=(Token)match(input,42,FOLLOW_42_in_fi370);  
                    stream_42.add(string_literal46);

                    dbg.location(48,46);
                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:46: ( anweisung )+
                    int cnt13=0;
                    try { dbg.enterSubRule(13);

                    loop13:
                    do {
                        int alt13=2;
                        try { dbg.enterDecision(13, decisionCanBacktrack[13]);

                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==IDENTIFIER||LA13_0==INTEGER||LA13_0==REAL||LA13_0==32||LA13_0==35||LA13_0==37||LA13_0==44||(LA13_0 >= 46 && LA13_0 <= 47)||LA13_0==49) ) {
                            alt13=1;
                        }


                        } finally {dbg.exitDecision(13);}

                        switch (alt13) {
                    	case 1 :
                    	    dbg.enterAlt(1);

                    	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:48:46: anweisung
                    	    {
                    	    dbg.location(48,46);
                    	    pushFollow(FOLLOW_anweisung_in_fi372);
                    	    anweisung47=anweisung();

                    	    state._fsp--;

                    	    stream_anweisung.add(anweisung47.getTree());

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

            dbg.location(48,59);
            string_literal48=(Token)match(input,43,FOLLOW_43_in_fi377);  
            stream_43.add(string_literal48);


            // AST REWRITE
            // elements: vergleich, anweisung, anweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 49:2: -> ^( IF vergleich anweisung ^( ELSE ( anweisung )+ ) )
            {
                dbg.location(49,5);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:49:5: ^( IF vergleich anweisung ^( ELSE ( anweisung )+ ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(49,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(IF, "IF")
                , root_1);

                dbg.location(49,10);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(49,20);
                adaptor.addChild(root_1, stream_anweisung.nextTree());
                dbg.location(49,31);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:49:31: ^( ELSE ( anweisung )+ )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(49,33);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ELSE, "ELSE")
                , root_2);

                dbg.location(49,38);
                if ( !(stream_anweisung.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(49,38);
                    adaptor.addChild(root_2, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(49, 49);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "vergleich"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:51:1: vergleich : arith_ausdruck COMPARE_OP ^ arith_ausdruck ;
    public final AST_MiniPParser.vergleich_return vergleich() throws RecognitionException {
        AST_MiniPParser.vergleich_return retval = new AST_MiniPParser.vergleich_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token COMPARE_OP50=null;
        AST_MiniPParser.arith_ausdruck_return arith_ausdruck49 =null;

        AST_MiniPParser.arith_ausdruck_return arith_ausdruck51 =null;


        CommonTree COMPARE_OP50_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "vergleich");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(51, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:52:2: ( arith_ausdruck COMPARE_OP ^ arith_ausdruck )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:53:3: arith_ausdruck COMPARE_OP ^ arith_ausdruck
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(53,3);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich408);
            arith_ausdruck49=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck49.getTree());
            dbg.location(53,28);
            COMPARE_OP50=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_vergleich410); 
            COMPARE_OP50_tree = 
            (CommonTree)adaptor.create(COMPARE_OP50)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(COMPARE_OP50_tree, root_0);

            dbg.location(53,30);
            pushFollow(FOLLOW_arith_ausdruck_in_vergleich413);
            arith_ausdruck51=arith_ausdruck();

            state._fsp--;

            adaptor.addChild(root_0, arith_ausdruck51.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(53, 44);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "elihw"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:55:1: elihw : 'while' vergleich 'do' ( anweisung )+ 'od' -> ^( WHILE vergleich ( anweisung )+ ) ;
    public final AST_MiniPParser.elihw_return elihw() throws RecognitionException {
        AST_MiniPParser.elihw_return retval = new AST_MiniPParser.elihw_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        AST_MiniPParser.vergleich_return vergleich53 =null;

        AST_MiniPParser.anweisung_return anweisung55 =null;


        CommonTree string_literal52_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleSubtreeStream stream_anweisung=new RewriteRuleSubtreeStream(adaptor,"rule anweisung");
        RewriteRuleSubtreeStream stream_vergleich=new RewriteRuleSubtreeStream(adaptor,"rule vergleich");
        try { dbg.enterRule(getGrammarFileName(), "elihw");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(55, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:56:2: ( 'while' vergleich 'do' ( anweisung )+ 'od' -> ^( WHILE vergleich ( anweisung )+ ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:56:4: 'while' vergleich 'do' ( anweisung )+ 'od'
            {
            dbg.location(56,4);
            string_literal52=(Token)match(input,49,FOLLOW_49_in_elihw423);  
            stream_49.add(string_literal52);

            dbg.location(56,12);
            pushFollow(FOLLOW_vergleich_in_elihw425);
            vergleich53=vergleich();

            state._fsp--;

            stream_vergleich.add(vergleich53.getTree());
            dbg.location(56,22);
            string_literal54=(Token)match(input,41,FOLLOW_41_in_elihw427);  
            stream_41.add(string_literal54);

            dbg.location(56,27);
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:56:27: ( anweisung )+
            int cnt15=0;
            try { dbg.enterSubRule(15);

            loop15:
            do {
                int alt15=2;
                try { dbg.enterDecision(15, decisionCanBacktrack[15]);

                int LA15_0 = input.LA(1);

                if ( (LA15_0==IDENTIFIER||LA15_0==INTEGER||LA15_0==REAL||LA15_0==32||LA15_0==35||LA15_0==37||LA15_0==44||(LA15_0 >= 46 && LA15_0 <= 47)||LA15_0==49) ) {
                    alt15=1;
                }


                } finally {dbg.exitDecision(15);}

                switch (alt15) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:56:27: anweisung
            	    {
            	    dbg.location(56,27);
            	    pushFollow(FOLLOW_anweisung_in_elihw429);
            	    anweisung55=anweisung();

            	    state._fsp--;

            	    stream_anweisung.add(anweisung55.getTree());

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

            dbg.location(56,38);
            string_literal56=(Token)match(input,45,FOLLOW_45_in_elihw432);  
            stream_45.add(string_literal56);


            // AST REWRITE
            // elements: vergleich, anweisung
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 57:2: -> ^( WHILE vergleich ( anweisung )+ )
            {
                dbg.location(57,5);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:57:5: ^( WHILE vergleich ( anweisung )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(57,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WHILE, "WHILE")
                , root_1);

                dbg.location(57,13);
                adaptor.addChild(root_1, stream_vergleich.nextTree());
                dbg.location(57,23);
                if ( !(stream_anweisung.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_anweisung.hasNext() ) {
                    dbg.location(57,23);
                    adaptor.addChild(root_1, stream_anweisung.nextTree());

                }
                stream_anweisung.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(57, 33);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "read"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:59:1: read : 'read(' IDENTIFIER ')' -> ^( READ IDENTIFIER ) ;
    public final AST_MiniPParser.read_return read() throws RecognitionException {
        AST_MiniPParser.read_return retval = new AST_MiniPParser.read_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal57=null;
        Token IDENTIFIER58=null;
        Token char_literal59=null;

        CommonTree string_literal57_tree=null;
        CommonTree IDENTIFIER58_tree=null;
        CommonTree char_literal59_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_IDENTIFIER=new RewriteRuleTokenStream(adaptor,"token IDENTIFIER");

        try { dbg.enterRule(getGrammarFileName(), "read");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(59, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:60:2: ( 'read(' IDENTIFIER ')' -> ^( READ IDENTIFIER ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:60:4: 'read(' IDENTIFIER ')'
            {
            dbg.location(60,4);
            string_literal57=(Token)match(input,47,FOLLOW_47_in_read457);  
            stream_47.add(string_literal57);

            dbg.location(60,12);
            IDENTIFIER58=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_read459);  
            stream_IDENTIFIER.add(IDENTIFIER58);

            dbg.location(60,23);
            char_literal59=(Token)match(input,33,FOLLOW_33_in_read461);  
            stream_33.add(char_literal59);


            // AST REWRITE
            // elements: IDENTIFIER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 61:2: -> ^( READ IDENTIFIER )
            {
                dbg.location(61,5);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:61:5: ^( READ IDENTIFIER )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(61,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(READ, "READ")
                , root_1);

                dbg.location(61,12);
                adaptor.addChild(root_1, 
                stream_IDENTIFIER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(61, 22);

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "println"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:63:1: println : 'println(' drucken ')' -> ^( PRINT drucken ) ;
    public final AST_MiniPParser.println_return println() throws RecognitionException {
        AST_MiniPParser.println_return retval = new AST_MiniPParser.println_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal60=null;
        Token char_literal62=null;
        AST_MiniPParser.drucken_return drucken61 =null;


        CommonTree string_literal60_tree=null;
        CommonTree char_literal62_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleSubtreeStream stream_drucken=new RewriteRuleSubtreeStream(adaptor,"rule drucken");
        try { dbg.enterRule(getGrammarFileName(), "println");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(63, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:64:2: ( 'println(' drucken ')' -> ^( PRINT drucken ) )
            dbg.enterAlt(1);

            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:64:4: 'println(' drucken ')'
            {
            dbg.location(64,4);
            string_literal60=(Token)match(input,46,FOLLOW_46_in_println482);  
            stream_46.add(string_literal60);

            dbg.location(64,15);
            pushFollow(FOLLOW_drucken_in_println484);
            drucken61=drucken();

            state._fsp--;

            stream_drucken.add(drucken61.getTree());
            dbg.location(64,23);
            char_literal62=(Token)match(input,33,FOLLOW_33_in_println486);  
            stream_33.add(char_literal62);


            // AST REWRITE
            // elements: drucken
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 65:2: -> ^( PRINT drucken )
            {
                dbg.location(65,5);
                // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:65:5: ^( PRINT drucken )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(65,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PRINT, "PRINT")
                , root_1);

                dbg.location(65,13);
                adaptor.addChild(root_1, stream_drucken.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(65, 20);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "println");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "println"


    public static class drucken_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "drucken"
    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:67:1: drucken : ( arith_ausdruck | STRING );
    public final AST_MiniPParser.drucken_return drucken() throws RecognitionException {
        AST_MiniPParser.drucken_return retval = new AST_MiniPParser.drucken_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token STRING64=null;
        AST_MiniPParser.arith_ausdruck_return arith_ausdruck63 =null;


        CommonTree STRING64_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "drucken");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(67, 0);

        try {
            // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:67:9: ( arith_ausdruck | STRING )
            int alt16=2;
            try { dbg.enterDecision(16, decisionCanBacktrack[16]);

            int LA16_0 = input.LA(1);

            if ( (LA16_0==IDENTIFIER||LA16_0==INTEGER||LA16_0==REAL||LA16_0==32||LA16_0==35||LA16_0==37) ) {
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

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:67:11: arith_ausdruck
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(67,11);
                    pushFollow(FOLLOW_arith_ausdruck_in_drucken503);
                    arith_ausdruck63=arith_ausdruck();

                    state._fsp--;

                    adaptor.addChild(root_0, arith_ausdruck63.getTree());

                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 2\\Sebastian\\Aufgabe 2\\AST_MiniP.g:68:4: STRING
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(68,4);
                    STRING64=(Token)match(input,STRING,FOLLOW_STRING_in_drucken508); 
                    STRING64_tree = 
                    (CommonTree)adaptor.create(STRING64)
                    ;
                    adaptor.addChild(root_0, STRING64_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(68, 9);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "drucken");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "drucken"

    // Delegated rules


 

    public static final BitSet FOLLOW_START_TOKEN_in_start61 = new BitSet(new long[]{0x0000000009020120L});
    public static final BitSet FOLLOW_deklaration_in_start63 = new BitSet(new long[]{0x0000000009020120L});
    public static final BitSet FOLLOW_BEGIN_TOKEN_in_start66 = new BitSet(new long[]{0x0002D02900814000L});
    public static final BitSet FOLLOW_anweisung_in_start68 = new BitSet(new long[]{0x0002D02900816000L});
    public static final BitSet FOLLOW_END_TOKEN_in_start71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_konstanten_in_deklaration101 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration103 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_36_in_deklaration106 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_deklaration108 = new BitSet(new long[]{0x0000011000000000L});
    public static final BitSet FOLLOW_40_in_deklaration112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_wertzuweisung_in_anweisung156 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_anweisung160 = new BitSet(new long[]{0x0000010000000800L});
    public static final BitSet FOLLOW_s_in_anweisung162 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_read_in_anweisung166 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_println_in_anweisung170 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_fi_in_anweisung174 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_elihw_in_anweisung178 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_anweisung181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_wertzuweisung193 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_wertzuweisung195 = new BitSet(new long[]{0x0000002904814000L});
    public static final BitSet FOLLOW_wertzuweisung_optionen_in_wertzuweisung197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_wertzuweisung_optionen221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_wertzuweisung_optionen225 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_s_in_wertzuweisung_optionen227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMPARE_OP_in_s236 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_s239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck254 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_set_in_arith_ausdruck257 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_mult_in_arith_ausdruck266 = new BitSet(new long[]{0x0000002800000002L});
    public static final BitSet FOLLOW_atom_in_mult282 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_set_in_mult285 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_atom_in_mult294 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_INTEGER_in_atom318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_atom332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_atom337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atom342 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_atom345 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_atom347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_fi359 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_vergleich_in_fi361 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_fi364 = new BitSet(new long[]{0x0002D02900814000L});
    public static final BitSet FOLLOW_anweisung_in_fi366 = new BitSet(new long[]{0x0002DC2900814000L});
    public static final BitSet FOLLOW_42_in_fi370 = new BitSet(new long[]{0x0002D02900814000L});
    public static final BitSet FOLLOW_anweisung_in_fi372 = new BitSet(new long[]{0x0002D82900814000L});
    public static final BitSet FOLLOW_43_in_fi377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich408 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OP_in_vergleich410 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_arith_ausdruck_in_vergleich413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_elihw423 = new BitSet(new long[]{0x0000002900814000L});
    public static final BitSet FOLLOW_vergleich_in_elihw425 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_elihw427 = new BitSet(new long[]{0x0002D02900814000L});
    public static final BitSet FOLLOW_anweisung_in_elihw429 = new BitSet(new long[]{0x0002F02900814000L});
    public static final BitSet FOLLOW_45_in_elihw432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_read457 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_read459 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_read461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_println482 = new BitSet(new long[]{0x0000002904814000L});
    public static final BitSet FOLLOW_drucken_in_println484 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_println486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arith_ausdruck_in_drucken503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_drucken508 = new BitSet(new long[]{0x0000000000000002L});

}