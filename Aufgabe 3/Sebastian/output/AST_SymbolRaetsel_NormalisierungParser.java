// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g 2015-12-16 15:05:02
package gramma;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolRaetsel_NormalisierungParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BUCHSTABEN", "C", "D", "E", "EQ", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "OP", "P", "Q", "R", "S", "T", "U", "V", "W", "WORD", "WS", "X", "Y", "Z"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "raetsel", "z3", "z1", "z2", "line"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AST_SymbolRaetsel_NormalisierungParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AST_SymbolRaetsel_NormalisierungParser(TokenStream input, int port, RecognizerSharedState state) {
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

public AST_SymbolRaetsel_NormalisierungParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return AST_SymbolRaetsel_NormalisierungParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g"; }


    public static class raetsel_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "raetsel"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:11:1: raetsel : ^( line line line line line line ) ;
    public final AST_SymbolRaetsel_NormalisierungParser.raetsel_return raetsel() throws RecognitionException {
        AST_SymbolRaetsel_NormalisierungParser.raetsel_return retval = new AST_SymbolRaetsel_NormalisierungParser.raetsel_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line1 =null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line2 =null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line3 =null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line4 =null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line5 =null;

        AST_SymbolRaetsel_NormalisierungParser.line_return line6 =null;



        try { dbg.enterRule(getGrammarFileName(), "raetsel");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:11:9: ( ^( line line line line line line ) )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:11:11: ^( line line line line line line )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(11,11);
            dbg.location(11,13);
            pushFollow(FOLLOW_line_in_raetsel40);
            line1=line();

            state._fsp--;

            root_0 = (CommonTree)adaptor.becomeRoot(line1.getTree(), root_0);

            match(input, Token.DOWN, null); 
            dbg.location(11,18);
            pushFollow(FOLLOW_line_in_raetsel42);
            line2=line();

            state._fsp--;

            adaptor.addChild(root_0, line2.getTree());
            dbg.location(11,23);
            pushFollow(FOLLOW_line_in_raetsel44);
            line3=line();

            state._fsp--;

            adaptor.addChild(root_0, line3.getTree());
            dbg.location(11,28);
            pushFollow(FOLLOW_line_in_raetsel46);
            line4=line();

            state._fsp--;

            adaptor.addChild(root_0, line4.getTree());
            dbg.location(11,33);
            pushFollow(FOLLOW_line_in_raetsel48);
            line5=line();

            state._fsp--;

            adaptor.addChild(root_0, line5.getTree());
            dbg.location(11,38);
            pushFollow(FOLLOW_line_in_raetsel50);
            line6=line();

            state._fsp--;

            adaptor.addChild(root_0, line6.getTree());

            match(input, Token.UP, null); 


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
        dbg.location(11, 42);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "raetsel");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "raetsel"


    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:13:1: line : ^( EQ ^( OP ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( OP[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) ;
    public final AST_SymbolRaetsel_NormalisierungParser.line_return line() throws RecognitionException {
        AST_SymbolRaetsel_NormalisierungParser.line_return retval = new AST_SymbolRaetsel_NormalisierungParser.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQ7=null;
        Token OP8=null;
        Token WORD9=null;
        Token WORD11=null;
        Token WORD13=null;
        AST_SymbolRaetsel_NormalisierungParser.z1_return z110 =null;

        AST_SymbolRaetsel_NormalisierungParser.z2_return z212 =null;

        AST_SymbolRaetsel_NormalisierungParser.z3_return z314 =null;


        CommonTree EQ7_tree=null;
        CommonTree OP8_tree=null;
        CommonTree WORD9_tree=null;
        CommonTree WORD11_tree=null;
        CommonTree WORD13_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"rule z1");
        RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"rule z2");
        RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"rule z3");
        try { dbg.enterRule(getGrammarFileName(), "line");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:13:7: ( ^( EQ ^( OP ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( OP[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:13:9: ^( EQ ^( OP ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) )
            {
            dbg.location(13,9);
            dbg.location(13,11);
            EQ7=(Token)match(input,EQ,FOLLOW_EQ_in_line61);  
            stream_EQ.add(EQ7);


            match(input, Token.DOWN, null); 
            dbg.location(13,14);
            dbg.location(13,16);
            OP8=(Token)match(input,OP,FOLLOW_OP_in_line64);  
            stream_OP.add(OP8);


            match(input, Token.DOWN, null); 
            dbg.location(13,19);
            dbg.location(13,21);
            WORD9=(Token)match(input,WORD,FOLLOW_WORD_in_line67);  
            stream_WORD.add(WORD9);


            match(input, Token.DOWN, null); 
            dbg.location(13,26);
            pushFollow(FOLLOW_z1_in_line69);
            z110=z1();

            state._fsp--;

            stream_z1.add(z110.getTree());

            match(input, Token.UP, null); 

            dbg.location(13,30);
            dbg.location(13,32);
            WORD11=(Token)match(input,WORD,FOLLOW_WORD_in_line73);  
            stream_WORD.add(WORD11);


            match(input, Token.DOWN, null); 
            dbg.location(13,37);
            pushFollow(FOLLOW_z2_in_line75);
            z212=z2();

            state._fsp--;

            stream_z2.add(z212.getTree());

            match(input, Token.UP, null); 


            match(input, Token.UP, null); 

            dbg.location(13,42);
            dbg.location(13,44);
            WORD13=(Token)match(input,WORD,FOLLOW_WORD_in_line80);  
            stream_WORD.add(WORD13);


            match(input, Token.DOWN, null); 
            dbg.location(13,49);
            pushFollow(FOLLOW_z3_in_line82);
            z314=z3();

            state._fsp--;

            stream_z3.add(z314.getTree());

            match(input, Token.UP, null); 


            match(input, Token.UP, null); 


            // AST REWRITE
            // elements: z2, WORD, OP, WORD, z1, EQ, WORD, z3
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 14:2: -> ^( EQ ^( OP[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
            {
                dbg.location(14,5);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:14:5: ^( EQ ^( OP[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(14,7);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                dbg.location(14,10);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:14:10: ^( OP[\"+\"] ^( WORD z3 ) ^( WORD z2 ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(14,12);
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(OP, "+")
                , root_2);

                dbg.location(14,20);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:14:20: ^( WORD z3 )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(14,22);
                root_3 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_3);

                dbg.location(14,27);
                adaptor.addChild(root_3, stream_z3.nextTree());

                adaptor.addChild(root_2, root_3);
                }
                dbg.location(14,31);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:14:31: ^( WORD z2 )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                dbg.location(14,33);
                root_3 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_3);

                dbg.location(14,38);
                adaptor.addChild(root_3, stream_z2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(14,43);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:14:43: ^( WORD z1 )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(14,45);
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_2);

                dbg.location(14,50);
                adaptor.addChild(root_2, stream_z1.nextTree());

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
        dbg.location(14, 53);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "line");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "line"


    public static class z1_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z1"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:16:1: z1 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_NormalisierungParser.z1_return z1() throws RecognitionException {
        AST_SymbolRaetsel_NormalisierungParser.z1_return retval = new AST_SymbolRaetsel_NormalisierungParser.z1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN15=null;

        CommonTree BUCHSTABEN15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "z1");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(16, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:16:5: ( ( BUCHSTABEN )+ )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:16:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(16,7);
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:16:7: ( BUCHSTABEN )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==BUCHSTABEN) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:16:7: BUCHSTABEN
            	    {
            	    dbg.location(16,7);
            	    BUCHSTABEN15=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z1125); 
            	    BUCHSTABEN15_tree = 
            	    (CommonTree)adaptor.create(BUCHSTABEN15)
            	    ;
            	    adaptor.addChild(root_0, BUCHSTABEN15_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


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
        dbg.location(16, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "z1");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "z1"


    public static class z2_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z2"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:17:1: z2 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_NormalisierungParser.z2_return z2() throws RecognitionException {
        AST_SymbolRaetsel_NormalisierungParser.z2_return retval = new AST_SymbolRaetsel_NormalisierungParser.z2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN16=null;

        CommonTree BUCHSTABEN16_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "z2");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(17, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:17:5: ( ( BUCHSTABEN )+ )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:17:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(17,7);
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:17:7: ( BUCHSTABEN )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==BUCHSTABEN) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:17:7: BUCHSTABEN
            	    {
            	    dbg.location(17,7);
            	    BUCHSTABEN16=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z2134); 
            	    BUCHSTABEN16_tree = 
            	    (CommonTree)adaptor.create(BUCHSTABEN16)
            	    ;
            	    adaptor.addChild(root_0, BUCHSTABEN16_tree);


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
        dbg.location(17, 17);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "z2");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "z2"


    public static class z3_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z3"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:18:1: z3 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_NormalisierungParser.z3_return z3() throws RecognitionException {
        AST_SymbolRaetsel_NormalisierungParser.z3_return retval = new AST_SymbolRaetsel_NormalisierungParser.z3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN17=null;

        CommonTree BUCHSTABEN17_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "z3");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(18, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:18:5: ( ( BUCHSTABEN )+ )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:18:8: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(18,8);
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:18:8: ( BUCHSTABEN )+
            int cnt3=0;
            try { dbg.enterSubRule(3);

            loop3:
            do {
                int alt3=2;
                try { dbg.enterDecision(3, decisionCanBacktrack[3]);

                int LA3_0 = input.LA(1);

                if ( (LA3_0==BUCHSTABEN) ) {
                    alt3=1;
                }


                } finally {dbg.exitDecision(3);}

                switch (alt3) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\AST_SymbolRaetsel_Normalisierung.g:18:8: BUCHSTABEN
            	    {
            	    dbg.location(18,8);
            	    BUCHSTABEN17=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z3144); 
            	    BUCHSTABEN17_tree = 
            	    (CommonTree)adaptor.create(BUCHSTABEN17)
            	    ;
            	    adaptor.addChild(root_0, BUCHSTABEN17_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt3++;
            } while (true);
            } finally {dbg.exitSubRule(3);}


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
        dbg.location(18, 18);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "z3");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "z3"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_raetsel40 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_line_in_raetsel42 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_raetsel44 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_raetsel46 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_raetsel48 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_raetsel50 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_line61 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_OP_in_line64 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_line67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z1_in_line69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_line73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z2_in_line75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_line80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z3_in_line82 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z1125 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z2134 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z3144 = new BitSet(new long[]{0x0000000000000042L});

}