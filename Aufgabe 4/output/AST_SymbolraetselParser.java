// $ANTLR 3.4 Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g 2016-01-15 14:20:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolraetselParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BUCHSTABEN", "C", "D", "E", "EQ", "F", "G", "H", "I", "J", "K", "L", "M", "MINUS", "N", "O", "P", "PLUS", "Q", "R", "S", "T", "U", "V", "W", "WORD", "WS", "X", "Y", "Z"
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
    public static final int MINUS=19;
    public static final int N=20;
    public static final int O=21;
    public static final int P=22;
    public static final int PLUS=23;
    public static final int Q=24;
    public static final int R=25;
    public static final int S=26;
    public static final int T=27;
    public static final int U=28;
    public static final int V=29;
    public static final int W=30;
    public static final int WORD=31;
    public static final int WS=32;
    public static final int X=33;
    public static final int Y=34;
    public static final int Z=35;

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
    public String getGrammarFileName() { return "Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:13:1: prog : id11= word op12= op id13= word eq14= EQ id15= word op21= op op22= op op23= op id31= word op32= op id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= op id53= word eq54= EQ id55= word -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) ;
    public final AST_SymbolraetselParser.prog_return prog() throws RecognitionException {
        AST_SymbolraetselParser.prog_return retval = new AST_SymbolraetselParser.prog_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token eq14=null;
        Token eq34=null;
        Token eq41=null;
        Token eq42=null;
        Token eq43=null;
        Token eq54=null;
        AST_SymbolraetselParser.word_return id11 =null;

        AST_SymbolraetselParser.op_return op12 =null;

        AST_SymbolraetselParser.word_return id13 =null;

        AST_SymbolraetselParser.word_return id15 =null;

        AST_SymbolraetselParser.op_return op21 =null;

        AST_SymbolraetselParser.op_return op22 =null;

        AST_SymbolraetselParser.op_return op23 =null;

        AST_SymbolraetselParser.word_return id31 =null;

        AST_SymbolraetselParser.op_return op32 =null;

        AST_SymbolraetselParser.word_return id33 =null;

        AST_SymbolraetselParser.word_return id35 =null;

        AST_SymbolraetselParser.word_return id51 =null;

        AST_SymbolraetselParser.op_return op52 =null;

        AST_SymbolraetselParser.word_return id53 =null;

        AST_SymbolraetselParser.word_return id55 =null;


        Object eq14_tree=null;
        Object eq34_tree=null;
        Object eq41_tree=null;
        Object eq42_tree=null;
        Object eq43_tree=null;
        Object eq54_tree=null;
        RewriteRuleTokenStream stream_EQ=new RewriteRuleTokenStream(adaptor,"token EQ");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_word=new RewriteRuleSubtreeStream(adaptor,"rule word");
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:13:6: (id11= word op12= op id13= word eq14= EQ id15= word op21= op op22= op op23= op id31= word op32= op id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= op id53= word eq54= EQ id55= word -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:13:8: id11= word op12= op id13= word eq14= EQ id15= word op21= op op22= op op23= op id31= word op32= op id33= word eq34= EQ id35= word eq41= EQ eq42= EQ eq43= EQ id51= word op52= op id53= word eq54= EQ id55= word
            {
            pushFollow(FOLLOW_word_in_prog39);
            id11=word();

            state._fsp--;

            stream_word.add(id11.getTree());

            pushFollow(FOLLOW_op_in_prog43);
            op12=op();

            state._fsp--;

            stream_op.add(op12.getTree());

            pushFollow(FOLLOW_word_in_prog47);
            id13=word();

            state._fsp--;

            stream_word.add(id13.getTree());

            eq14=(Token)match(input,EQ,FOLLOW_EQ_in_prog51);  
            stream_EQ.add(eq14);


            pushFollow(FOLLOW_word_in_prog55);
            id15=word();

            state._fsp--;

            stream_word.add(id15.getTree());

            pushFollow(FOLLOW_op_in_prog61);
            op21=op();

            state._fsp--;

            stream_op.add(op21.getTree());

            pushFollow(FOLLOW_op_in_prog66);
            op22=op();

            state._fsp--;

            stream_op.add(op22.getTree());

            pushFollow(FOLLOW_op_in_prog71);
            op23=op();

            state._fsp--;

            stream_op.add(op23.getTree());

            pushFollow(FOLLOW_word_in_prog77);
            id31=word();

            state._fsp--;

            stream_word.add(id31.getTree());

            pushFollow(FOLLOW_op_in_prog81);
            op32=op();

            state._fsp--;

            stream_op.add(op32.getTree());

            pushFollow(FOLLOW_word_in_prog85);
            id33=word();

            state._fsp--;

            stream_word.add(id33.getTree());

            eq34=(Token)match(input,EQ,FOLLOW_EQ_in_prog89);  
            stream_EQ.add(eq34);


            pushFollow(FOLLOW_word_in_prog93);
            id35=word();

            state._fsp--;

            stream_word.add(id35.getTree());

            eq41=(Token)match(input,EQ,FOLLOW_EQ_in_prog99);  
            stream_EQ.add(eq41);


            eq42=(Token)match(input,EQ,FOLLOW_EQ_in_prog104);  
            stream_EQ.add(eq42);


            eq43=(Token)match(input,EQ,FOLLOW_EQ_in_prog109);  
            stream_EQ.add(eq43);


            pushFollow(FOLLOW_word_in_prog115);
            id51=word();

            state._fsp--;

            stream_word.add(id51.getTree());

            pushFollow(FOLLOW_op_in_prog119);
            op52=op();

            state._fsp--;

            stream_op.add(op52.getTree());

            pushFollow(FOLLOW_word_in_prog123);
            id53=word();

            state._fsp--;

            stream_word.add(id53.getTree());

            eq54=(Token)match(input,EQ,FOLLOW_EQ_in_prog127);  
            stream_EQ.add(eq54);


            pushFollow(FOLLOW_word_in_prog131);
            id55=word();

            state._fsp--;

            stream_word.add(id55.getTree());

            // AST REWRITE
            // elements: op12, id15, eq43, id31, op52, id33, eq42, id51, id15, eq14, id11, op21, eq54, id13, id33, op23, id53, id51, eq41, op22, id11, id35, id35, id55, eq34, id31, op32, id53, id55, id13
            // token labels: eq14, eq34, eq43, eq54, eq42, eq41
            // rule labels: id51, id31, id53, op52, id33, id11, id55, id13, id35, id15, retval, op21, op32, op22, op12, op23
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_eq14=new RewriteRuleTokenStream(adaptor,"token eq14",eq14);
            RewriteRuleTokenStream stream_eq34=new RewriteRuleTokenStream(adaptor,"token eq34",eq34);
            RewriteRuleTokenStream stream_eq43=new RewriteRuleTokenStream(adaptor,"token eq43",eq43);
            RewriteRuleTokenStream stream_eq54=new RewriteRuleTokenStream(adaptor,"token eq54",eq54);
            RewriteRuleTokenStream stream_eq42=new RewriteRuleTokenStream(adaptor,"token eq42",eq42);
            RewriteRuleTokenStream stream_eq41=new RewriteRuleTokenStream(adaptor,"token eq41",eq41);
            RewriteRuleSubtreeStream stream_id51=new RewriteRuleSubtreeStream(adaptor,"rule id51",id51!=null?id51.tree:null);
            RewriteRuleSubtreeStream stream_id31=new RewriteRuleSubtreeStream(adaptor,"rule id31",id31!=null?id31.tree:null);
            RewriteRuleSubtreeStream stream_id53=new RewriteRuleSubtreeStream(adaptor,"rule id53",id53!=null?id53.tree:null);
            RewriteRuleSubtreeStream stream_op52=new RewriteRuleSubtreeStream(adaptor,"rule op52",op52!=null?op52.tree:null);
            RewriteRuleSubtreeStream stream_id33=new RewriteRuleSubtreeStream(adaptor,"rule id33",id33!=null?id33.tree:null);
            RewriteRuleSubtreeStream stream_id11=new RewriteRuleSubtreeStream(adaptor,"rule id11",id11!=null?id11.tree:null);
            RewriteRuleSubtreeStream stream_id55=new RewriteRuleSubtreeStream(adaptor,"rule id55",id55!=null?id55.tree:null);
            RewriteRuleSubtreeStream stream_id13=new RewriteRuleSubtreeStream(adaptor,"rule id13",id13!=null?id13.tree:null);
            RewriteRuleSubtreeStream stream_id35=new RewriteRuleSubtreeStream(adaptor,"rule id35",id35!=null?id35.tree:null);
            RewriteRuleSubtreeStream stream_id15=new RewriteRuleSubtreeStream(adaptor,"rule id15",id15!=null?id15.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_op21=new RewriteRuleSubtreeStream(adaptor,"rule op21",op21!=null?op21.tree:null);
            RewriteRuleSubtreeStream stream_op32=new RewriteRuleSubtreeStream(adaptor,"rule op32",op32!=null?op32.tree:null);
            RewriteRuleSubtreeStream stream_op22=new RewriteRuleSubtreeStream(adaptor,"rule op22",op22!=null?op22.tree:null);
            RewriteRuleSubtreeStream stream_op12=new RewriteRuleSubtreeStream(adaptor,"rule op12",op12!=null?op12.tree:null);
            RewriteRuleSubtreeStream stream_op23=new RewriteRuleSubtreeStream(adaptor,"rule op23",op23!=null?op23.tree:null);

            root_0 = (Object)adaptor.nil();
            // 19:3: -> ^( $eq14 ^( $op12 $id11 $id13) $id15) ^( $eq34 ^( $op32 $id31 $id33) $id35) ^( $eq54 ^( $op52 $id51 $id53) $id55) ^( $eq41 ^( $op21 $id11 $id31) $id51) ^( $eq42 ^( $op22 $id13 $id33) $id53) ^( $eq43 ^( $op23 $id15 $id35) $id55)
            {
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:21:3: ^( $eq14 ^( $op12 $id11 $id13) $id15)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq14.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:21:11: ^( $op12 $id11 $id13)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op12.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id11.nextTree());

                adaptor.addChild(root_2, stream_id13.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id15.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:22:3: ^( $eq34 ^( $op32 $id31 $id33) $id35)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq34.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:22:11: ^( $op32 $id31 $id33)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op32.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id31.nextTree());

                adaptor.addChild(root_2, stream_id33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id35.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:23:3: ^( $eq54 ^( $op52 $id51 $id53) $id55)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq54.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:23:11: ^( $op52 $id51 $id53)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op52.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id51.nextTree());

                adaptor.addChild(root_2, stream_id53.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id55.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:25:3: ^( $eq41 ^( $op21 $id11 $id31) $id51)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq41.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:25:11: ^( $op21 $id11 $id31)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op21.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id11.nextTree());

                adaptor.addChild(root_2, stream_id31.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id51.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:26:3: ^( $eq42 ^( $op22 $id13 $id33) $id53)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq42.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:26:11: ^( $op22 $id13 $id33)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op22.nextNode(), root_2);

                adaptor.addChild(root_2, stream_id13.nextTree());

                adaptor.addChild(root_2, stream_id33.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, stream_id53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:27:3: ^( $eq43 ^( $op23 $id15 $id35) $id55)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_eq43.nextNode(), root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:27:11: ^( $op23 $id15 $id35)
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot(stream_op23.nextNode(), root_2);

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
        return retval;
    }
    // $ANTLR end "prog"


    public static class word_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "word"
    // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:1: word : ( BUCHSTABEN )+ -> ^( WORD ( BUCHSTABEN )+ ) ;
    public final AST_SymbolraetselParser.word_return word() throws RecognitionException {
        AST_SymbolraetselParser.word_return retval = new AST_SymbolraetselParser.word_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BUCHSTABEN1=null;

        Object BUCHSTABEN1_tree=null;
        RewriteRuleTokenStream stream_BUCHSTABEN=new RewriteRuleTokenStream(adaptor,"token BUCHSTABEN");

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:7: ( ( BUCHSTABEN )+ -> ^( WORD ( BUCHSTABEN )+ ) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:9: ( BUCHSTABEN )+
            {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:9: ( BUCHSTABEN )+
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
            	    // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:9: BUCHSTABEN
            	    {
            	    BUCHSTABEN1=(Token)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_word290);  
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

            root_0 = (Object)adaptor.nil();
            // 30:21: -> ^( WORD ( BUCHSTABEN )+ )
            {
                // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:30:24: ^( WORD ( BUCHSTABEN )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(WORD, "WORD")
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
        return retval;
    }
    // $ANTLR end "word"


    public static class op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:38:1: op : ( PLUS | MINUS );
    public final AST_SymbolraetselParser.op_return op() throws RecognitionException {
        AST_SymbolraetselParser.op_return retval = new AST_SymbolraetselParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set2=null;

        Object set2_tree=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:38:4: ( PLUS | MINUS )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_Symbolraetsel.g:
            {
            root_0 = (Object)adaptor.nil();


            set2=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set2)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
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
        return retval;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_word_in_prog39 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog47 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog55 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog61 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog66 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog71 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog77 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog81 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog85 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog89 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog93 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog99 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog104 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog109 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog115 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_op_in_prog119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog123 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_EQ_in_prog127 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_word_in_prog131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_word290 = new BitSet(new long[]{0x0000000000000042L});

}