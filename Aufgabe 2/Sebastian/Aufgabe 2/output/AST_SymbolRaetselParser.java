// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g 2015-11-24 12:31:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolRaetselParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQUALS", "OPERATOR", "WORD"
    };

    public static final int EOF=-1;
    public static final int EQUALS=4;
    public static final int OPERATOR=5;
    public static final int WORD=6;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "start"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AST_SymbolRaetselParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AST_SymbolRaetselParser(TokenStream input, int port, RecognizerSharedState state) {
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

public AST_SymbolRaetselParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return AST_SymbolRaetselParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g"; }


    public static class start_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:11:1: start : w1_1= WORD op1= OPERATOR w1_2= WORD e1= EQUALS w1_3= WORD op2_1= OPERATOR op2_2= OPERATOR op2_3= OPERATOR w3_1= WORD op3= OPERATOR w3_2= WORD e3= EQUALS w3_3= WORD e4_1= EQUALS e4_2= EQUALS e4_3= EQUALS w5_1= WORD op5= OPERATOR w5_2= WORD e5= EQUALS w5_3= WORD -> ^( $e1 ^( $op1 $w1_1 $w1_2) $w1_3) ^( $e3 ^( $op3 $w3_1 $w3_2) $w3_3) ^( $e5 ^( $op5 $w5_1 $w5_2) $w5_3) ^( $e4_1 ^( $op2_1 $w1_1 $w3_1) $w5_1) ^( $e4_2 ^( $op2_2 $w1_2 $w3_2) $w5_2) ^( $e4_3 ^( $op2_3 $w1_3 $w3_3) $w5_3) ;
    public final AST_SymbolRaetselParser.start_return start() throws RecognitionException {
        AST_SymbolRaetselParser.start_return retval = new AST_SymbolRaetselParser.start_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token w1_1=null;
        Token op1=null;
        Token w1_2=null;
        Token e1=null;
        Token w1_3=null;
        Token op2_1=null;
        Token op2_2=null;
        Token op2_3=null;
        Token w3_1=null;
        Token op3=null;
        Token w3_2=null;
        Token e3=null;
        Token w3_3=null;
        Token e4_1=null;
        Token e4_2=null;
        Token e4_3=null;
        Token w5_1=null;
        Token op5=null;
        Token w5_2=null;
        Token e5=null;
        Token w5_3=null;

        CommonTree w1_1_tree=null;
        CommonTree op1_tree=null;
        CommonTree w1_2_tree=null;
        CommonTree e1_tree=null;
        CommonTree w1_3_tree=null;
        CommonTree op2_1_tree=null;
        CommonTree op2_2_tree=null;
        CommonTree op2_3_tree=null;
        CommonTree w3_1_tree=null;
        CommonTree op3_tree=null;
        CommonTree w3_2_tree=null;
        CommonTree e3_tree=null;
        CommonTree w3_3_tree=null;
        CommonTree e4_1_tree=null;
        CommonTree e4_2_tree=null;
        CommonTree e4_3_tree=null;
        CommonTree w5_1_tree=null;
        CommonTree op5_tree=null;
        CommonTree w5_2_tree=null;
        CommonTree e5_tree=null;
        CommonTree w5_3_tree=null;
        RewriteRuleTokenStream stream_WORD=new RewriteRuleTokenStream(adaptor,"token WORD");
        RewriteRuleTokenStream stream_OPERATOR=new RewriteRuleTokenStream(adaptor,"token OPERATOR");
        RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");

        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:11:7: (w1_1= WORD op1= OPERATOR w1_2= WORD e1= EQUALS w1_3= WORD op2_1= OPERATOR op2_2= OPERATOR op2_3= OPERATOR w3_1= WORD op3= OPERATOR w3_2= WORD e3= EQUALS w3_3= WORD e4_1= EQUALS e4_2= EQUALS e4_3= EQUALS w5_1= WORD op5= OPERATOR w5_2= WORD e5= EQUALS w5_3= WORD -> ^( $e1 ^( $op1 $w1_1 $w1_2) $w1_3) ^( $e3 ^( $op3 $w3_1 $w3_2) $w3_3) ^( $e5 ^( $op5 $w5_1 $w5_2) $w5_3) ^( $e4_1 ^( $op2_1 $w1_1 $w3_1) $w5_1) ^( $e4_2 ^( $op2_2 $w1_2 $w3_2) $w5_2) ^( $e4_3 ^( $op2_3 $w1_3 $w3_3) $w5_3) )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:13:5: w1_1= WORD op1= OPERATOR w1_2= WORD e1= EQUALS w1_3= WORD op2_1= OPERATOR op2_2= OPERATOR op2_3= OPERATOR w3_1= WORD op3= OPERATOR w3_2= WORD e3= EQUALS w3_3= WORD e4_1= EQUALS e4_2= EQUALS e4_3= EQUALS w5_1= WORD op5= OPERATOR w5_2= WORD e5= EQUALS w5_3= WORD
            {
            dbg.location(13,5);
            w1_1=(Token)match(input,WORD,FOLLOW_WORD_in_start40);  
            stream_WORD.add(w1_1);

            dbg.location(13,14);
            op1=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start44);  
            stream_OPERATOR.add(op1);

            dbg.location(13,28);
            w1_2=(Token)match(input,WORD,FOLLOW_WORD_in_start48);  
            stream_WORD.add(w1_2);

            dbg.location(13,36);
            e1=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start52);  
            stream_EQUALS.add(e1);

            dbg.location(13,48);
            w1_3=(Token)match(input,WORD,FOLLOW_WORD_in_start56);  
            stream_WORD.add(w1_3);

            dbg.location(15,6);
            op2_1=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start61);  
            stream_OPERATOR.add(op2_1);

            dbg.location(15,21);
            op2_2=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start65);  
            stream_OPERATOR.add(op2_2);

            dbg.location(15,36);
            op2_3=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start69);  
            stream_OPERATOR.add(op2_3);

            dbg.location(17,5);
            w3_1=(Token)match(input,WORD,FOLLOW_WORD_in_start74);  
            stream_WORD.add(w3_1);

            dbg.location(17,14);
            op3=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start78);  
            stream_OPERATOR.add(op3);

            dbg.location(17,28);
            w3_2=(Token)match(input,WORD,FOLLOW_WORD_in_start82);  
            stream_WORD.add(w3_2);

            dbg.location(17,36);
            e3=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start86);  
            stream_EQUALS.add(e3);

            dbg.location(17,48);
            w3_3=(Token)match(input,WORD,FOLLOW_WORD_in_start90);  
            stream_WORD.add(w3_3);

            dbg.location(19,5);
            e4_1=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start95);  
            stream_EQUALS.add(e4_1);

            dbg.location(19,17);
            e4_2=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start100);  
            stream_EQUALS.add(e4_2);

            dbg.location(19,30);
            e4_3=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start104);  
            stream_EQUALS.add(e4_3);

            dbg.location(21,5);
            w5_1=(Token)match(input,WORD,FOLLOW_WORD_in_start109);  
            stream_WORD.add(w5_1);

            dbg.location(21,14);
            op5=(Token)match(input,OPERATOR,FOLLOW_OPERATOR_in_start113);  
            stream_OPERATOR.add(op5);

            dbg.location(21,28);
            w5_2=(Token)match(input,WORD,FOLLOW_WORD_in_start117);  
            stream_WORD.add(w5_2);

            dbg.location(21,36);
            e5=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_start121);  
            stream_EQUALS.add(e5);

            dbg.location(21,48);
            w5_3=(Token)match(input,WORD,FOLLOW_WORD_in_start125);  
            stream_WORD.add(w5_3);


            // AST REWRITE
            // elements: e1, w1_1, w5_1, w3_3, w5_3, op1, op5, e4_1, e4_2, w1_2, w1_2, w5_1, e5, op2_1, w3_3, w5_2, e4_3, w3_2, w3_1, op2_2, w5_3, w5_2, op2_3, op3, w1_3, w3_1, w3_2, w1_1, w1_3, e3
            // token labels: w5_3, w5_1, w3_3, w5_2, op2_3, op2_2, e1, e4_2, op2_1, e4_3, e3, e4_1, e5, op1, op3, op5, w3_1, w1_3, w3_2, w1_1, w1_2
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_w5_3=new RewriteRuleTokenStream(adaptor,"token w5_3",w5_3);
            RewriteRuleTokenStream stream_w5_1=new RewriteRuleTokenStream(adaptor,"token w5_1",w5_1);
            RewriteRuleTokenStream stream_w3_3=new RewriteRuleTokenStream(adaptor,"token w3_3",w3_3);
            RewriteRuleTokenStream stream_w5_2=new RewriteRuleTokenStream(adaptor,"token w5_2",w5_2);
            RewriteRuleTokenStream stream_op2_3=new RewriteRuleTokenStream(adaptor,"token op2_3",op2_3);
            RewriteRuleTokenStream stream_op2_2=new RewriteRuleTokenStream(adaptor,"token op2_2",op2_2);
            RewriteRuleTokenStream stream_e1=new RewriteRuleTokenStream(adaptor,"token e1",e1);
            RewriteRuleTokenStream stream_e4_2=new RewriteRuleTokenStream(adaptor,"token e4_2",e4_2);
            RewriteRuleTokenStream stream_op2_1=new RewriteRuleTokenStream(adaptor,"token op2_1",op2_1);
            RewriteRuleTokenStream stream_e4_3=new RewriteRuleTokenStream(adaptor,"token e4_3",e4_3);
            RewriteRuleTokenStream stream_e3=new RewriteRuleTokenStream(adaptor,"token e3",e3);
            RewriteRuleTokenStream stream_e4_1=new RewriteRuleTokenStream(adaptor,"token e4_1",e4_1);
            RewriteRuleTokenStream stream_e5=new RewriteRuleTokenStream(adaptor,"token e5",e5);
            RewriteRuleTokenStream stream_op1=new RewriteRuleTokenStream(adaptor,"token op1",op1);
            RewriteRuleTokenStream stream_op3=new RewriteRuleTokenStream(adaptor,"token op3",op3);
            RewriteRuleTokenStream stream_op5=new RewriteRuleTokenStream(adaptor,"token op5",op5);
            RewriteRuleTokenStream stream_w3_1=new RewriteRuleTokenStream(adaptor,"token w3_1",w3_1);
            RewriteRuleTokenStream stream_w1_3=new RewriteRuleTokenStream(adaptor,"token w1_3",w1_3);
            RewriteRuleTokenStream stream_w3_2=new RewriteRuleTokenStream(adaptor,"token w3_2",w3_2);
            RewriteRuleTokenStream stream_w1_1=new RewriteRuleTokenStream(adaptor,"token w1_1",w1_1);
            RewriteRuleTokenStream stream_w1_2=new RewriteRuleTokenStream(adaptor,"token w1_2",w1_2);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 23:5: -> ^( $e1 ^( $op1 $w1_1 $w1_2) $w1_3) ^( $e3 ^( $op3 $w3_1 $w3_2) $w3_3) ^( $e5 ^( $op5 $w5_1 $w5_2) $w5_3) ^( $e4_1 ^( $op2_1 $w1_1 $w3_1) $w5_1) ^( $e4_2 ^( $op2_2 $w1_2 $w3_2) $w5_2) ^( $e4_3 ^( $op2_3 $w1_3 $w3_3) $w5_3)
            {
                dbg.location(23,5);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:23:5: ^( $e1 ^( $op1 $w1_1 $w1_2) $w1_3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(23,8);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e1.nextNode(), root_1);

                dbg.location(23,11);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:23:11: ^( $op1 $w1_1 $w1_2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(23,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_2);

                dbg.location(23,19);
                adaptor.addChild(root_2, stream_w1_1.nextNode());
                dbg.location(23,25);
                adaptor.addChild(root_2, stream_w1_2.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(23,32);
                adaptor.addChild(root_1, stream_w1_3.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(25,2);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:25:2: ^( $e3 ^( $op3 $w3_1 $w3_2) $w3_3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(25,5);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e3.nextNode(), root_1);

                dbg.location(25,8);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:25:8: ^( $op3 $w3_1 $w3_2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(25,11);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_2);

                dbg.location(25,16);
                adaptor.addChild(root_2, stream_w3_1.nextNode());
                dbg.location(25,22);
                adaptor.addChild(root_2, stream_w3_2.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(25,29);
                adaptor.addChild(root_1, stream_w3_3.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(27,2);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:27:2: ^( $e5 ^( $op5 $w5_1 $w5_2) $w5_3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(27,5);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e5.nextNode(), root_1);

                dbg.location(27,8);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:27:8: ^( $op5 $w5_1 $w5_2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(27,11);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op5.nextNode(), root_2);

                dbg.location(27,16);
                adaptor.addChild(root_2, stream_w5_1.nextNode());
                dbg.location(27,22);
                adaptor.addChild(root_2, stream_w5_2.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(27,29);
                adaptor.addChild(root_1, stream_w5_3.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(29,2);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:29:2: ^( $e4_1 ^( $op2_1 $w1_1 $w3_1) $w5_1)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(29,5);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e4_1.nextNode(), root_1);

                dbg.location(29,10);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:29:10: ^( $op2_1 $w1_1 $w3_1)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(29,13);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2_1.nextNode(), root_2);

                dbg.location(29,20);
                adaptor.addChild(root_2, stream_w1_1.nextNode());
                dbg.location(29,26);
                adaptor.addChild(root_2, stream_w3_1.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(29,33);
                adaptor.addChild(root_1, stream_w5_1.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(31,2);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:31:2: ^( $e4_2 ^( $op2_2 $w1_2 $w3_2) $w5_2)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(31,5);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e4_2.nextNode(), root_1);

                dbg.location(31,10);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:31:10: ^( $op2_2 $w1_2 $w3_2)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(31,13);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2_2.nextNode(), root_2);

                dbg.location(31,20);
                adaptor.addChild(root_2, stream_w1_2.nextNode());
                dbg.location(31,26);
                adaptor.addChild(root_2, stream_w3_2.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(31,33);
                adaptor.addChild(root_1, stream_w5_2.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(33,2);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:33:2: ^( $e4_3 ^( $op2_3 $w1_3 $w3_3) $w5_3)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(33,5);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_e4_3.nextNode(), root_1);

                dbg.location(33,10);
                // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_SymbolRaetsel.g:33:10: ^( $op2_3 $w1_3 $w3_3)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(33,13);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op2_3.nextNode(), root_2);

                dbg.location(33,20);
                adaptor.addChild(root_2, stream_w1_3.nextNode());
                dbg.location(33,26);
                adaptor.addChild(root_2, stream_w3_3.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(33,33);
                adaptor.addChild(root_1, stream_w5_3.nextNode());

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
        dbg.location(34, 0);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "start"

    // Delegated rules


 

    public static final BitSet FOLLOW_WORD_in_start40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start44 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start48 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start56 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start61 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start74 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start78 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start86 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start90 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start95 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start100 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start104 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_start113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_start121 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_start125 = new BitSet(new long[]{0x0000000000000002L});

}