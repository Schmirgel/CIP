// $ANTLR 3.4 /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g 2015-12-16 11:46:45

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolraetselParser extends Parser {
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


    public AST_SymbolraetselParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public AST_SymbolraetselParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AST_SymbolraetselParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:11:1: prog : id11= word op12= OP id13= word eq14= EQ id15= word op21= OP op22= OP op23= OP id31= word op32= OP id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= OP id53= word eq54= EQ id55= word -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) ;
    public final AST_SymbolraetselParser.prog_return prog() throws RecognitionException {
        AST_SymbolraetselParser.prog_return retval = new AST_SymbolraetselParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token op12=null;
        Token eq14=null;
        Token op21=null;
        Token op22=null;
        Token op23=null;
        Token op32=null;
        Token eq34=null;
        Token eq41=null;
        Token eq42=null;
        Token eq43=null;
        Token op52=null;
        Token eq54=null;
        AST_SymbolraetselParser.word_return id11 =null;

        AST_SymbolraetselParser.word_return id13 =null;

        AST_SymbolraetselParser.word_return id15 =null;

        AST_SymbolraetselParser.word_return id31 =null;

        AST_SymbolraetselParser.word_return id33 =null;

        AST_SymbolraetselParser.word_return id35 =null;

        AST_SymbolraetselParser.word_return id51 =null;

        AST_SymbolraetselParser.word_return id53 =null;

        AST_SymbolraetselParser.word_return id55 =null;


        CommonTree op12_tree=null;
        CommonTree eq14_tree=null;
        CommonTree op21_tree=null;
        CommonTree op22_tree=null;
        CommonTree op23_tree=null;
        CommonTree op32_tree=null;
        CommonTree eq34_tree=null;
        CommonTree eq41_tree=null;
        CommonTree eq42_tree=null;
        CommonTree eq43_tree=null;
        CommonTree op52_tree=null;
        CommonTree eq54_tree=null;
        RewriteRuleTokenStream stream_OP=new RewriteRuleTokenStream(adaptor,"token OP");
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:11:6: (id11= word op12= OP id13= word eq14= EQ id15= word op21= OP op22= OP op23= OP id31= word op32= OP id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= OP id53= word eq54= EQ id55= word -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:11:8: id11= word op12= OP id13= word eq14= EQ id15= word op21= OP op22= OP op23= OP id31= word op32= OP id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= OP id53= word eq54= EQ id55= word
            {
            pushFollow(FOLLOW_word_in_prog35);
            id11=word();

            state._fsp--;

            stream_word.add(id11.getTree());

            op12=(Token)match(input,OP,FOLLOW_OP_in_prog39);  
            stream_OP.add(op12);


            pushFollow(FOLLOW_word_in_prog43);
            id13=word();

            state._fsp--;

            stream_word.add(id13.getTree());

            eq14=(Token)match(input,EQ,FOLLOW_EQ_in_prog47);  
            stream_EQ.add(eq14);


            pushFollow(FOLLOW_word_in_prog51);
            id15=word();

            state._fsp--;

            stream_word.add(id15.getTree());

            op21=(Token)match(input,OP,FOLLOW_OP_in_prog57);  
            stream_OP.add(op21);


            op22=(Token)match(input,OP,FOLLOW_OP_in_prog62);  
            stream_OP.add(op22);


            op23=(Token)match(input,OP,FOLLOW_OP_in_prog67);  
            stream_OP.add(op23);


            pushFollow(FOLLOW_word_in_prog73);
            id31=word();

            state._fsp--;

            stream_word.add(id31.getTree());

            op32=(Token)match(input,OP,FOLLOW_OP_in_prog77);  
            stream_OP.add(op32);


            pushFollow(FOLLOW_word_in_prog81);
            id33=word();

            state._fsp--;

            stream_word.add(id33.getTree());

            eq34=(Token)match(input,EQ,FOLLOW_EQ_in_prog85);  
            stream_EQ.add(eq34);


            pushFollow(FOLLOW_word_in_prog89);
            id35=word();

            state._fsp--;

            stream_word.add(id35.getTree());

            eq41=(Token)match(input,EQ,FOLLOW_EQ_in_prog95);  
            stream_EQ.add(eq41);


            eq42=(Token)match(input,EQ,FOLLOW_EQ_in_prog100);  
            stream_EQ.add(eq42);


            eq43=(Token)match(input,EQ,FOLLOW_EQ_in_prog105);  
            stream_EQ.add(eq43);


            pushFollow(FOLLOW_word_in_prog111);
            id51=word();

            state._fsp--;

            stream_word.add(id51.getTree());

            op52=(Token)match(input,OP,FOLLOW_OP_in_prog115);  
            stream_OP.add(op52);


            pushFollow(FOLLOW_word_in_prog119);
            id53=word();

            state._fsp--;

            stream_word.add(id53.getTree());

            eq54=(Token)match(input,EQ,FOLLOW_EQ_in_prog123);  
            stream_EQ.add(eq54);


            pushFollow(FOLLOW_word_in_prog127);
            id55=word();

            state._fsp--;

            stream_word.add(id55.getTree());

            // AST REWRITE
            // elements: id51, id15, id55, op52, id55, eq54, eq42, id31, id11, id53, id13, eq41, id33, op23, id31, eq14, id51, id53, eq43, op12, id33, op32, eq34, id35, id11, id15, op21, op22, id13, id35
            // token labels: eq14, eq34, eq54, eq43, op32, op21, eq42, op22, eq41, op23, op12, op52
            // rule labels: id51, id31, id53, id55, id11, id33, id13, id35, id15, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eq14=new RewriteRuleTokenStream(adaptor,"token eq14",eq14);
            RewriteRuleTokenStream stream_eq34=new RewriteRuleTokenStream(adaptor,"token eq34",eq34);
            RewriteRuleTokenStream stream_eq54=new RewriteRuleTokenStream(adaptor,"token eq54",eq54);
            RewriteRuleTokenStream stream_eq43=new RewriteRuleTokenStream(adaptor,"token eq43",eq43);
            RewriteRuleTokenStream stream_op32=new RewriteRuleTokenStream(adaptor,"token op32",op32);
            RewriteRuleTokenStream stream_op21=new RewriteRuleTokenStream(adaptor,"token op21",op21);
            RewriteRuleTokenStream stream_eq42=new RewriteRuleTokenStream(adaptor,"token eq42",eq42);
            RewriteRuleTokenStream stream_op22=new RewriteRuleTokenStream(adaptor,"token op22",op22);
            RewriteRuleTokenStream stream_eq41=new RewriteRuleTokenStream(adaptor,"token eq41",eq41);
            RewriteRuleTokenStream stream_op23=new RewriteRuleTokenStream(adaptor,"token op23",op23);
            RewriteRuleTokenStream stream_op12=new RewriteRuleTokenStream(adaptor,"token op12",op12);
            RewriteRuleTokenStream stream_op52=new RewriteRuleTokenStream(adaptor,"token op52",op52);
            RewriteRuleSubtreeStream stream_id51=new RewriteRuleSubtreeStream(adaptor,"rule id51",id51!=null?id51.tree:null);
            RewriteRuleSubtreeStream stream_id31=new RewriteRuleSubtreeStream(adaptor,"rule id31",id31!=null?id31.tree:null);
            RewriteRuleSubtreeStream stream_id53=new RewriteRuleSubtreeStream(adaptor,"rule id53",id53!=null?id53.tree:null);
            RewriteRuleSubtreeStream stream_id55=new RewriteRuleSubtreeStream(adaptor,"rule id55",id55!=null?id55.tree:null);
            RewriteRuleSubtreeStream stream_id11=new RewriteRuleSubtreeStream(adaptor,"rule id11",id11!=null?id11.tree:null);
            RewriteRuleSubtreeStream stream_id33=new RewriteRuleSubtreeStream(adaptor,"rule id33",id33!=null?id33.tree:null);
            RewriteRuleSubtreeStream stream_id13=new RewriteRuleSubtreeStream(adaptor,"rule id13",id13!=null?id13.tree:null);
            RewriteRuleSubtreeStream stream_id35=new RewriteRuleSubtreeStream(adaptor,"rule id35",id35!=null?id35.tree:null);
            RewriteRuleSubtreeStream stream_id15=new RewriteRuleSubtreeStream(adaptor,"rule id15",id15!=null?id15.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 17:3: -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55)
            {
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:19:3: ^( $eq14 ^( $op12 $id11 $id13) $id15)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq14.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:19:11: ^( $op12 $id11 $id13)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op12.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id11.nextTree());

                adaptor.addChild(root_2, stream_id13.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id15.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:20:3: ^( $eq34 ^( $op32 $id31 $id33) $id35)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq34.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:20:11: ^( $op32 $id31 $id33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op32.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id31.nextTree());

                adaptor.addChild(root_2, stream_id33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id35.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:21:3: ^( $eq54 ^( $op52 $id51 $id53) $id55)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq54.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:21:11: ^( $op52 $id51 $id53)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op52.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id51.nextTree());

                adaptor.addChild(root_2, stream_id53.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id55.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:23:3: ^( $eq41 ^( $op21 $id11 $id31) $id51)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq41.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:23:11: ^( $op21 $id11 $id31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id11.nextTree());

                adaptor.addChild(root_2, stream_id31.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id51.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:24:3: ^( $eq42 ^( $op22 $id13 $id33) $id53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq42.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:24:11: ^( $op22 $id13 $id33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op22.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id13.nextTree());

                adaptor.addChild(root_2, stream_id33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:25:3: ^( $eq43 ^( $op23 $id15 $id35) $id55)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(stream_eq43.nextNode(), root_1);

                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:25:11: ^( $op23 $id15 $id35)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op23.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id15.nextTree());

                adaptor.addChild(root_2, stream_id35.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id55.nextTree());

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
        return retval;
    }
    // $ANTLR end "prog"


    public static class word_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:1: word : ( BUCHSTABEN )+ -> ^( WORD ( BUCHSTABEN )+ ) ;
    public final AST_SymbolraetselParser.word_return word() throws RecognitionException {
        AST_SymbolraetselParser.word_return retval = new AST_SymbolraetselParser.word_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token BUCHSTABEN1=null;

        CommonTree BUCHSTABEN1_tree=null;
        RewriteRuleTokenStream stream_BUCHSTABEN=new RewriteRuleTokenStream(adaptor,"token BUCHSTABEN");

        try {
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:7: ( ( BUCHSTABEN )+ -> ^( WORD ( BUCHSTABEN )+ ) )
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:9: ( BUCHSTABEN )+
            {
            // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:9: ( BUCHSTABEN )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==BUCHSTABEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:9: BUCHSTABEN
            	    {
            	    BUCHSTABEN1=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_word284);  
            	    stream_BUCHSTABEN.add(BUCHSTABEN1);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            // AST REWRITE
            // elements: BUCHSTABEN
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:21: -> ^( WORD ( BUCHSTABEN )+ )
            {
                // /Users/lewis/FH/CIP/Aufgabe 3/Ralf/AST_Symbolraetsel.g:28:24: ^( WORD ( BUCHSTABEN )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(WORD, "WORD")
                , root_1);

                if ( !(stream_BUCHSTABEN.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_BUCHSTABEN.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_BUCHSTABEN.nextNode()
                    );

                }
                stream_BUCHSTABEN.reset();

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
        return retval;
    }
    // $ANTLR end "word"

    // Delegated rules


 

    public static final BitSet FOLLOW_word_in_prog35 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog39 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog43 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog51 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog57 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog62 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog67 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog73 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog77 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog81 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog85 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog89 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog95 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog100 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog105 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog111 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_OP_in_prog115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog119 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog123 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_word284 = new BitSet(new long[]{0x0000000000000042L});

}