// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g 2015-12-08 10:11:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolraetselParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EQ", "ID", "OP", "WS"
    };

    public static final int EOF=-1;
    public static final int EQ=4;
    public static final int ID=5;
    public static final int OP=6;
    public static final int WS=7;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "prog"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AST_SymbolraetselParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AST_SymbolraetselParser(TokenStream input, int port, RecognizerSharedState state) {
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

public AST_SymbolraetselParser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return AST_SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:11:1: prog : id11= ID op12= OP id13= ID eq14= EQ id15= ID op21= OP op22= OP op23= OP id31= ID op32= OP id33= ID eq34= EQ id35= ID eq41= EQ eq42= EQ eq43= EQ id51= ID op52= OP id53= ID eq54= EQ id55= ID -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) ;
    public final AST_SymbolraetselParser.prog_return prog() throws RecognitionException {
        AST_SymbolraetselParser.prog_return retval = new AST_SymbolraetselParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token id11=null;
        Token op12=null;
        Token id13=null;
        Token eq14=null;
        Token id15=null;
        Token op21=null;
        Token op22=null;
        Token op23=null;
        Token id31=null;
        Token op32=null;
        Token id33=null;
        Token eq34=null;
        Token id35=null;
        Token eq41=null;
        Token eq42=null;
        Token eq43=null;
        Token id51=null;
        Token op52=null;
        Token id53=null;
        Token eq54=null;
        Token id55=null;

        CommonTree id11_tree=null;
        CommonTree op12_tree=null;
        CommonTree id13_tree=null;
        CommonTree eq14_tree=null;
        CommonTree id15_tree=null;
        CommonTree op21_tree=null;
        CommonTree op22_tree=null;
        CommonTree op23_tree=null;
        CommonTree id31_tree=null;
        CommonTree op32_tree=null;
        CommonTree id33_tree=null;
        CommonTree eq34_tree=null;
        CommonTree id35_tree=null;
        CommonTree eq41_tree=null;
        CommonTree eq42_tree=null;
        CommonTree eq43_tree=null;
        CommonTree id51_tree=null;
        CommonTree op52_tree=null;
        CommonTree id53_tree=null;
        CommonTree eq54_tree=null;
        CommonTree id55_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");

        try { dbg.enterRule(getGrammarFileName(), "prog");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:11:6: (id11= ID op12= OP id13= ID eq14= EQ id15= ID op21= OP op22= OP op23= OP id31= ID op32= OP id33= ID eq34= EQ id35= ID eq41= EQ eq42= EQ eq43= EQ id51= ID op52= OP id53= ID eq54= EQ id55= ID -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:11:8: id11= ID op12= OP id13= ID eq14= EQ id15= ID op21= OP op22= OP op23= OP id31= ID op32= OP id33= ID eq34= EQ id35= ID eq41= EQ eq42= EQ eq43= EQ id51= ID op52= OP id53= ID eq54= EQ id55= ID
            {
            dbg.location(11,12);
            id11=(Token)match(input,ID,FOLLOW_ID_in_prog31);  
            stream_ID.add(id11);

            dbg.location(11,20);
            op12=(Token)match(input,OP,FOLLOW_OP_in_prog35);  
            stream_OP.add(op12);

            dbg.location(11,28);
            id13=(Token)match(input,ID,FOLLOW_ID_in_prog39);  
            stream_ID.add(id13);

            dbg.location(11,36);
            eq14=(Token)match(input,EQ,FOLLOW_EQ_in_prog43);  
            stream_EQ.add(eq14);

            dbg.location(11,44);
            id15=(Token)match(input,ID,FOLLOW_ID_in_prog47);  
            stream_ID.add(id15);

            dbg.location(12,7);
            op21=(Token)match(input,OP,FOLLOW_OP_in_prog53);  
            stream_OP.add(op21);

            dbg.location(12,16);
            op22=(Token)match(input,OP,FOLLOW_OP_in_prog58);  
            stream_OP.add(op22);

            dbg.location(12,25);
            op23=(Token)match(input,OP,FOLLOW_OP_in_prog63);  
            stream_OP.add(op23);

            dbg.location(13,7);
            id31=(Token)match(input,ID,FOLLOW_ID_in_prog69);  
            stream_ID.add(id31);

            dbg.location(13,15);
            op32=(Token)match(input,OP,FOLLOW_OP_in_prog73);  
            stream_OP.add(op32);

            dbg.location(13,23);
            id33=(Token)match(input,ID,FOLLOW_ID_in_prog77);  
            stream_ID.add(id33);

            dbg.location(13,31);
            eq34=(Token)match(input,EQ,FOLLOW_EQ_in_prog81);  
            stream_EQ.add(eq34);

            dbg.location(13,39);
            id35=(Token)match(input,ID,FOLLOW_ID_in_prog85);  
            stream_ID.add(id35);

            dbg.location(14,7);
            eq41=(Token)match(input,EQ,FOLLOW_EQ_in_prog91);  
            stream_EQ.add(eq41);

            dbg.location(14,16);
            eq42=(Token)match(input,EQ,FOLLOW_EQ_in_prog96);  
            stream_EQ.add(eq42);

            dbg.location(14,25);
            eq43=(Token)match(input,EQ,FOLLOW_EQ_in_prog101);  
            stream_EQ.add(eq43);

            dbg.location(15,7);
            id51=(Token)match(input,ID,FOLLOW_ID_in_prog107);  
            stream_ID.add(id51);

            dbg.location(15,15);
            op52=(Token)match(input,OP,FOLLOW_OP_in_prog111);  
            stream_OP.add(op52);

            dbg.location(15,23);
            id53=(Token)match(input,ID,FOLLOW_ID_in_prog115);  
            stream_ID.add(id53);

            dbg.location(15,31);
            eq54=(Token)match(input,EQ,FOLLOW_EQ_in_prog119);  
            stream_EQ.add(eq54);

            dbg.location(15,39);
            id55=(Token)match(input,ID,FOLLOW_ID_in_prog123);  
            stream_ID.add(id55);


            // AST REWRITE
            // elements: id13, eq14, op52, op21, id33, id53, id13, op12, id53, eq42, eq43, id55, id31, op32, id51, id35, id11, op23, id15, eq34, id51, id31, eq54, id35, op22, id55, id15, id11, eq41, id33
            // token labels: eq14, eq34, eq43, eq54, eq42, id51, eq41, id53, id31, op52, id33, id55, id11, id13, id35, id15, op21, op32, op22, op12, op23
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eq14=new RewriteRuleTokenStream(adaptor,"token eq14",eq14);
            RewriteRuleTokenStream stream_eq34=new RewriteRuleTokenStream(adaptor,"token eq34",eq34);
            RewriteRuleTokenStream stream_eq43=new RewriteRuleTokenStream(adaptor,"token eq43",eq43);
            RewriteRuleTokenStream stream_eq54=new RewriteRuleTokenStream(adaptor,"token eq54",eq54);
            RewriteRuleTokenStream stream_eq42=new RewriteRuleTokenStream(adaptor,"token eq42",eq42);
            RewriteRuleTokenStream stream_id51=new RewriteRuleTokenStream(adaptor,"token id51",id51);
            RewriteRuleTokenStream stream_eq41=new RewriteRuleTokenStream(adaptor,"token eq41",eq41);
            RewriteRuleTokenStream stream_id53=new RewriteRuleTokenStream(adaptor,"token id53",id53);
            RewriteRuleTokenStream stream_id31=new RewriteRuleTokenStream(adaptor,"token id31",id31);
            RewriteRuleTokenStream stream_op52=new RewriteRuleTokenStream(adaptor,"token op52",op52);
            RewriteRuleTokenStream stream_id33=new RewriteRuleTokenStream(adaptor,"token id33",id33);
            RewriteRuleTokenStream stream_id55=new RewriteRuleTokenStream(adaptor,"token id55",id55);
            RewriteRuleTokenStream stream_id11=new RewriteRuleTokenStream(adaptor,"token id11",id11);
            RewriteRuleTokenStream stream_id13=new RewriteRuleTokenStream(adaptor,"token id13",id13);
            RewriteRuleTokenStream stream_id35=new RewriteRuleTokenStream(adaptor,"token id35",id35);
            RewriteRuleTokenStream stream_id15=new RewriteRuleTokenStream(adaptor,"token id15",id15);
            RewriteRuleTokenStream stream_op21=new RewriteRuleTokenStream(adaptor,"token op21",op21);
            RewriteRuleTokenStream stream_op32=new RewriteRuleTokenStream(adaptor,"token op32",op32);
            RewriteRuleTokenStream stream_op22=new RewriteRuleTokenStream(adaptor,"token op22",op22);
            RewriteRuleTokenStream stream_op12=new RewriteRuleTokenStream(adaptor,"token op12",op12);
            RewriteRuleTokenStream stream_op23=new RewriteRuleTokenStream(adaptor,"token op23",op23);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:3: -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55)
            {
                dbg.location(19,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:19:3: ^( $eq14 ^( $op12 $id11 $id13) $id15)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(19,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq14.nextNode(), root_1);

                dbg.location(19,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:19:11: ^( $op12 $id11 $id13)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(19,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op12.nextNode(), root_2);

                dbg.location(19,20);
                adaptor.addChild(root_2, stream_id11.nextNode());
                dbg.location(19,26);
                adaptor.addChild(root_2, stream_id13.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(19,33);
                adaptor.addChild(root_1, stream_id15.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(20,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:20:3: ^( $eq34 ^( $op32 $id31 $id33) $id35)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(20,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq34.nextNode(), root_1);

                dbg.location(20,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:20:11: ^( $op32 $id31 $id33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(20,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op32.nextNode(), root_2);

                dbg.location(20,20);
                adaptor.addChild(root_2, stream_id31.nextNode());
                dbg.location(20,26);
                adaptor.addChild(root_2, stream_id33.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(20,33);
                adaptor.addChild(root_1, stream_id35.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(21,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:21:3: ^( $eq54 ^( $op52 $id51 $id53) $id55)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(21,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq54.nextNode(), root_1);

                dbg.location(21,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:21:11: ^( $op52 $id51 $id53)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(21,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op52.nextNode(), root_2);

                dbg.location(21,20);
                adaptor.addChild(root_2, stream_id51.nextNode());
                dbg.location(21,26);
                adaptor.addChild(root_2, stream_id53.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(21,33);
                adaptor.addChild(root_1, stream_id55.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(23,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:23:3: ^( $eq41 ^( $op21 $id11 $id31) $id51)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(23,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq41.nextNode(), root_1);

                dbg.location(23,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:23:11: ^( $op21 $id11 $id31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(23,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op21.nextNode(), root_2);

                dbg.location(23,20);
                adaptor.addChild(root_2, stream_id11.nextNode());
                dbg.location(23,26);
                adaptor.addChild(root_2, stream_id31.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(23,33);
                adaptor.addChild(root_1, stream_id51.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(24,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:24:3: ^( $eq42 ^( $op22 $id13 $id33) $id53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(24,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq42.nextNode(), root_1);

                dbg.location(24,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:24:11: ^( $op22 $id13 $id33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(24,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op22.nextNode(), root_2);

                dbg.location(24,20);
                adaptor.addChild(root_2, stream_id13.nextNode());
                dbg.location(24,26);
                adaptor.addChild(root_2, stream_id33.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(24,33);
                adaptor.addChild(root_1, stream_id53.nextNode());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(25,3);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:25:3: ^( $eq43 ^( $op23 $id15 $id35) $id55)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(25,6);
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq43.nextNode(), root_1);

                dbg.location(25,11);
                // C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\AST_Symbolraetsel.g:25:11: ^( $op23 $id15 $id35)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(25,14);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op23.nextNode(), root_2);

                dbg.location(25,20);
                adaptor.addChild(root_2, stream_id15.nextNode());
                dbg.location(25,26);
                adaptor.addChild(root_2, stream_id35.nextNode());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(25,33);
                adaptor.addChild(root_1, stream_id55.nextNode());

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
        dbg.location(26, 2);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "prog");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "prog"

    // Delegated rules


 

    public static final BitSet FOLLOW_ID_in_prog31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog35 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog39 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog43 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog53 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog58 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog63 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog73 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog77 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog81 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog85 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog91 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog96 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog101 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_OP_in_prog111 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQ_in_prog119 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_prog123 = new BitSet(new long[]{0x0000000000000002L});

}