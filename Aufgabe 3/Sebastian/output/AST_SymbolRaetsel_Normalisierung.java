// $ANTLR 3.4 Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g 2015-12-17 14:11:08

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolRaetsel_Normalisierung extends TreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public AST_SymbolRaetsel_Normalisierung(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public AST_SymbolRaetsel_Normalisierung(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return AST_SymbolRaetsel_Normalisierung.tokenNames; }
    public String getGrammarFileName() { return "Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:9:1: prog : line line line line line line ;
    public final AST_SymbolRaetsel_Normalisierung.prog_return prog() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.prog_return retval = new AST_SymbolRaetsel_Normalisierung.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        AST_SymbolRaetsel_Normalisierung.line_return line1 =null;

        AST_SymbolRaetsel_Normalisierung.line_return line2 =null;

        AST_SymbolRaetsel_Normalisierung.line_return line3 =null;

        AST_SymbolRaetsel_Normalisierung.line_return line4 =null;

        AST_SymbolRaetsel_Normalisierung.line_return line5 =null;

        AST_SymbolRaetsel_Normalisierung.line_return line6 =null;



        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:9:7: ( line line line line line line )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:9:9: line line line line line line
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog36);
            line1=line();

            state._fsp--;

            adaptor.addChild(root_0, line1.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog38);
            line2=line();

            state._fsp--;

            adaptor.addChild(root_0, line2.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog40);
            line3=line();

            state._fsp--;

            adaptor.addChild(root_0, line3.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog42);
            line4=line();

            state._fsp--;

            adaptor.addChild(root_0, line4.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog44);
            line5=line();

            state._fsp--;

            adaptor.addChild(root_0, line5.getTree());


            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog46);
            line6=line();

            state._fsp--;

            adaptor.addChild(root_0, line6.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:11:1: line : ( linePlus | lineMinus );
    public final AST_SymbolRaetsel_Normalisierung.line_return line() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.line_return retval = new AST_SymbolRaetsel_Normalisierung.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        AST_SymbolRaetsel_Normalisierung.linePlus_return linePlus7 =null;

        AST_SymbolRaetsel_Normalisierung.lineMinus_return lineMinus8 =null;



        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:11:6: ( linePlus | lineMinus )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQ) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==PLUS) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==MINUS) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:11:9: linePlus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_linePlus_in_line55);
                    linePlus7=linePlus();

                    state._fsp--;

                    adaptor.addChild(root_0, linePlus7.getTree());


                    }
                    break;
                case 2 :
                    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:12:4: lineMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lineMinus_in_line60);
                    lineMinus8=lineMinus();

                    state._fsp--;

                    adaptor.addChild(root_0, lineMinus8.getTree());


                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line"


    public static class linePlus_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "linePlus"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:15:1: linePlus : ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) ;
    public final AST_SymbolRaetsel_Normalisierung.linePlus_return linePlus() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.linePlus_return retval = new AST_SymbolRaetsel_Normalisierung.linePlus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ9=null;
        CommonTree PLUS10=null;
        CommonTree WORD11=null;
        CommonTree WORD13=null;
        CommonTree WORD15=null;
        AST_SymbolRaetsel_Normalisierung.z1_return z112 =null;

        AST_SymbolRaetsel_Normalisierung.z2_return z214 =null;

        AST_SymbolRaetsel_Normalisierung.z3_return z316 =null;


        CommonTree EQ9_tree=null;
        CommonTree PLUS10_tree=null;
        CommonTree WORD11_tree=null;
        CommonTree WORD13_tree=null;
        CommonTree WORD15_tree=null;

        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:15:9: ( ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:15:11: ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ9=(CommonTree)match(input,EQ,FOLLOW_EQ_in_linePlus70); 
            EQ9_tree = (CommonTree)adaptor.dupNode(EQ9);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ9_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PLUS10=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_linePlus73); 
            PLUS10_tree = (CommonTree)adaptor.dupNode(PLUS10);


            root_2 = (CommonTree)adaptor.becomeRoot(PLUS10_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD11=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus76); 
            WORD11_tree = (CommonTree)adaptor.dupNode(WORD11);


            root_3 = (CommonTree)adaptor.becomeRoot(WORD11_tree, root_3);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z1_in_linePlus78);
            z112=z1();

            state._fsp--;

            adaptor.addChild(root_3, z112.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_2, root_3);
            _last = _save_last_3;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD13=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus82); 
            WORD13_tree = (CommonTree)adaptor.dupNode(WORD13);


            root_3 = (CommonTree)adaptor.becomeRoot(WORD13_tree, root_3);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z2_in_linePlus84);
            z214=z2();

            state._fsp--;

            adaptor.addChild(root_3, z214.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_2, root_3);
            _last = _save_last_3;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD15=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus89); 
            WORD15_tree = (CommonTree)adaptor.dupNode(WORD15);


            root_2 = (CommonTree)adaptor.becomeRoot(WORD15_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z3_in_linePlus91);
            z316=z3();

            state._fsp--;

            adaptor.addChild(root_2, z316.getTree());


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "linePlus"


    public static class lineMinus_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lineMinus"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:18:1: lineMinus : ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) ;
    public final AST_SymbolRaetsel_Normalisierung.lineMinus_return lineMinus() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.lineMinus_return retval = new AST_SymbolRaetsel_Normalisierung.lineMinus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ17=null;
        CommonTree MINUS18=null;
        CommonTree WORD19=null;
        CommonTree WORD21=null;
        CommonTree WORD23=null;
        AST_SymbolRaetsel_Normalisierung.z1_return z120 =null;

        AST_SymbolRaetsel_Normalisierung.z2_return z222 =null;

        AST_SymbolRaetsel_Normalisierung.z3_return z324 =null;


        CommonTree EQ17_tree=null;
        CommonTree MINUS18_tree=null;
        CommonTree WORD19_tree=null;
        CommonTree WORD21_tree=null;
        CommonTree WORD23_tree=null;
        RewriteRuleNodeStream stream_WORD=new RewriteRuleNodeStream(adaptor,"token WORD");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"rule z1");
        RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"rule z2");
        RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"rule z3");
        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:18:10: ( ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:18:12: ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ17=(CommonTree)match(input,EQ,FOLLOW_EQ_in_lineMinus102);  
            stream_EQ.add(EQ17);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS18=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_lineMinus105);  
            stream_MINUS.add(MINUS18);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD19=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus108);  
            stream_WORD.add(WORD19);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z1_in_lineMinus110);
            z120=z1();

            state._fsp--;

            stream_z1.add(z120.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_2, root_3);
            _last = _save_last_3;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD21=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus114);  
            stream_WORD.add(WORD21);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z2_in_lineMinus116);
            z222=z2();

            state._fsp--;

            stream_z2.add(z222.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_2, root_3);
            _last = _save_last_3;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD23=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus121);  
            stream_WORD.add(WORD23);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z3_in_lineMinus123);
            z324=z3();

            state._fsp--;

            stream_z3.add(z324.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: WORD, WORD, WORD, EQ, MINUS, z1, z3, z2
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 19:2: -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
            {
                // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:19:5: ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:19:10: ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MINUS, "+")
                , root_2);

                // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:19:23: ^( WORD z3 )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_3);

                adaptor.addChild(root_3, stream_z3.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:19:34: ^( WORD z2 )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_3);

                adaptor.addChild(root_3, stream_z2.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:19:46: ^( WORD z1 )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_2);

                adaptor.addChild(root_2, stream_z1.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lineMinus"


    public static class z1_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z1"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:22:1: z1 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z1_return z1() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z1_return retval = new AST_SymbolRaetsel_Normalisierung.z1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN25=null;

        CommonTree BUCHSTABEN25_tree=null;

        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:22:5: ( ( BUCHSTABEN )+ )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:22:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:22:7: ( BUCHSTABEN )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==BUCHSTABEN) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:22:7: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN25=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z1167); 
            	    BUCHSTABEN25_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN25);


            	    adaptor.addChild(root_0, BUCHSTABEN25_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "z1"


    public static class z2_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z2"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:23:1: z2 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z2_return z2() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z2_return retval = new AST_SymbolRaetsel_Normalisierung.z2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN26=null;

        CommonTree BUCHSTABEN26_tree=null;

        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:23:5: ( ( BUCHSTABEN )+ )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:23:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:23:7: ( BUCHSTABEN )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==BUCHSTABEN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:23:7: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN26=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z2176); 
            	    BUCHSTABEN26_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN26);


            	    adaptor.addChild(root_0, BUCHSTABEN26_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "z2"


    public static class z3_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "z3"
    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:24:1: z3 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z3_return z3() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z3_return retval = new AST_SymbolRaetsel_Normalisierung.z3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN27=null;

        CommonTree BUCHSTABEN27_tree=null;

        try {
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:24:5: ( ( BUCHSTABEN )+ )
            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:24:8: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:24:8: ( BUCHSTABEN )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==BUCHSTABEN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Z:\\Compiler\\CIP\\Aufgabe 3\\Sebastian\\AST_SymbolRaetsel_Normalisierung.g:24:8: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN27=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z3186); 
            	    BUCHSTABEN27_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN27);


            	    adaptor.addChild(root_0, BUCHSTABEN27_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "z3"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_prog36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog38 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog40 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog42 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog44 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog46 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linePlus_in_line55 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineMinus_in_line60 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_linePlus70 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_linePlus73 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_linePlus76 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z1_in_linePlus78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_linePlus82 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z2_in_linePlus84 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_linePlus89 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z3_in_linePlus91 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_lineMinus102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_lineMinus105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_lineMinus108 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z1_in_lineMinus110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_lineMinus114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z2_in_lineMinus116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_lineMinus121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z3_in_lineMinus123 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z1167 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z2176 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z3186 = new BitSet(new long[]{0x0000000000000042L});

}