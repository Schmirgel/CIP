// $ANTLR 3.4 Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g 2016-01-15 14:25:27

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_SymbolRaetsel_Normalisierung extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "B", "BUCHSTABEN", "C", "D", "E", "EQ", "F", "G", "H", "I", "J", "K", "L", "M", "MINUS", "N", "O", "P", "PLUS", "Q", "R", "S", "T", "U", "V", "W", "WORD", "WS", "X", "Y", "Z", "PUZZLE"
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
    public static final int PUZZLE=36;

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
    public String getGrammarFileName() { return "Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g"; }


    public static class prog_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:10:1: prog : l1= line l2= line l3= line l4= line l5= line l6= line -> ^( PUZZLE $l1 $l2 $l3 $l4 $l5 $l6) ;
    public final AST_SymbolRaetsel_Normalisierung.prog_return prog() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.prog_return retval = new AST_SymbolRaetsel_Normalisierung.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        AST_SymbolRaetsel_Normalisierung.line_return l1 =null;

        AST_SymbolRaetsel_Normalisierung.line_return l2 =null;

        AST_SymbolRaetsel_Normalisierung.line_return l3 =null;

        AST_SymbolRaetsel_Normalisierung.line_return l4 =null;

        AST_SymbolRaetsel_Normalisierung.line_return l5 =null;

        AST_SymbolRaetsel_Normalisierung.line_return l6 =null;


        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:10:7: (l1= line l2= line l3= line l4= line l5= line l6= line -> ^( PUZZLE $l1 $l2 $l3 $l4 $l5 $l6) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:10:9: l1= line l2= line l3= line l4= line l5= line l6= line
            {
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog43);
            l1=line();

            state._fsp--;

            stream_line.add(l1.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog47);
            l2=line();

            state._fsp--;

            stream_line.add(l2.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog51);
            l3=line();

            state._fsp--;

            stream_line.add(l3.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog55);
            l4=line();

            state._fsp--;

            stream_line.add(l4.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog59);
            l5=line();

            state._fsp--;

            stream_line.add(l5.getTree());

            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_line_in_prog63);
            l6=line();

            state._fsp--;

            stream_line.add(l6.getTree());

            // AST REWRITE
            // elements: l5, l4, l6, l1, l2, l3
            // token labels: 
            // rule labels: l1, l2, l3, l4, l5, l6, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_l1=new RewriteRuleSubtreeStream(adaptor,"rule l1",l1!=null?l1.tree:null);
            RewriteRuleSubtreeStream stream_l2=new RewriteRuleSubtreeStream(adaptor,"rule l2",l2!=null?l2.tree:null);
            RewriteRuleSubtreeStream stream_l3=new RewriteRuleSubtreeStream(adaptor,"rule l3",l3!=null?l3.tree:null);
            RewriteRuleSubtreeStream stream_l4=new RewriteRuleSubtreeStream(adaptor,"rule l4",l4!=null?l4.tree:null);
            RewriteRuleSubtreeStream stream_l5=new RewriteRuleSubtreeStream(adaptor,"rule l5",l5!=null?l5.tree:null);
            RewriteRuleSubtreeStream stream_l6=new RewriteRuleSubtreeStream(adaptor,"rule l6",l6!=null?l6.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 10:57: -> ^( PUZZLE $l1 $l2 $l3 $l4 $l5 $l6)
            {
                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:10:60: ^( PUZZLE $l1 $l2 $l3 $l4 $l5 $l6)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PUZZLE, "PUZZLE")
                , root_1);

                adaptor.addChild(root_1, stream_l1.nextTree());

                adaptor.addChild(root_1, stream_l2.nextTree());

                adaptor.addChild(root_1, stream_l3.nextTree());

                adaptor.addChild(root_1, stream_l4.nextTree());

                adaptor.addChild(root_1, stream_l5.nextTree());

                adaptor.addChild(root_1, stream_l6.nextTree());

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
    // $ANTLR end "prog"


    public static class line_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:12:1: line : ( linePlus | lineMinus );
    public final AST_SymbolRaetsel_Normalisierung.line_return line() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.line_return retval = new AST_SymbolRaetsel_Normalisierung.line_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        AST_SymbolRaetsel_Normalisierung.linePlus_return linePlus1 =null;

        AST_SymbolRaetsel_Normalisierung.lineMinus_return lineMinus2 =null;



        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:12:6: ( linePlus | lineMinus )
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
                    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:12:9: linePlus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_linePlus_in_line96);
                    linePlus1=linePlus();

                    state._fsp--;

                    adaptor.addChild(root_0, linePlus1.getTree());


                    }
                    break;
                case 2 :
                    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:13:4: lineMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_lineMinus_in_line101);
                    lineMinus2=lineMinus();

                    state._fsp--;

                    adaptor.addChild(root_0, lineMinus2.getTree());


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
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:16:1: linePlus : ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) ;
    public final AST_SymbolRaetsel_Normalisierung.linePlus_return linePlus() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.linePlus_return retval = new AST_SymbolRaetsel_Normalisierung.linePlus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ3=null;
        CommonTree PLUS4=null;
        CommonTree WORD5=null;
        CommonTree WORD7=null;
        CommonTree WORD9=null;
        AST_SymbolRaetsel_Normalisierung.z1_return z16 =null;

        AST_SymbolRaetsel_Normalisierung.z2_return z28 =null;

        AST_SymbolRaetsel_Normalisierung.z3_return z310 =null;


        CommonTree EQ3_tree=null;
        CommonTree PLUS4_tree=null;
        CommonTree WORD5_tree=null;
        CommonTree WORD7_tree=null;
        CommonTree WORD9_tree=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:16:9: ( ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:16:11: ^( EQ ^( PLUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) )
            {
            root_0 = (CommonTree)adaptor.nil();


            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ3=(CommonTree)match(input,EQ,FOLLOW_EQ_in_linePlus111); 
            EQ3_tree = (CommonTree)adaptor.dupNode(EQ3);


            root_1 = (CommonTree)adaptor.becomeRoot(EQ3_tree, root_1);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            PLUS4=(CommonTree)match(input,PLUS,FOLLOW_PLUS_in_linePlus114); 
            PLUS4_tree = (CommonTree)adaptor.dupNode(PLUS4);


            root_2 = (CommonTree)adaptor.becomeRoot(PLUS4_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD5=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus117); 
            WORD5_tree = (CommonTree)adaptor.dupNode(WORD5);


            root_3 = (CommonTree)adaptor.becomeRoot(WORD5_tree, root_3);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z1_in_linePlus119);
            z16=z1();

            state._fsp--;

            adaptor.addChild(root_3, z16.getTree());


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
            WORD7=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus123); 
            WORD7_tree = (CommonTree)adaptor.dupNode(WORD7);


            root_3 = (CommonTree)adaptor.becomeRoot(WORD7_tree, root_3);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z2_in_linePlus125);
            z28=z2();

            state._fsp--;

            adaptor.addChild(root_3, z28.getTree());


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
            WORD9=(CommonTree)match(input,WORD,FOLLOW_WORD_in_linePlus130); 
            WORD9_tree = (CommonTree)adaptor.dupNode(WORD9);


            root_2 = (CommonTree)adaptor.becomeRoot(WORD9_tree, root_2);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z3_in_linePlus132);
            z310=z3();

            state._fsp--;

            adaptor.addChild(root_2, z310.getTree());


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
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:19:1: lineMinus : ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) ;
    public final AST_SymbolRaetsel_Normalisierung.lineMinus_return lineMinus() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.lineMinus_return retval = new AST_SymbolRaetsel_Normalisierung.lineMinus_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQ11=null;
        CommonTree MINUS12=null;
        CommonTree WORD13=null;
        CommonTree WORD15=null;
        CommonTree WORD17=null;
        AST_SymbolRaetsel_Normalisierung.z1_return z114 =null;

        AST_SymbolRaetsel_Normalisierung.z2_return z216 =null;

        AST_SymbolRaetsel_Normalisierung.z3_return z318 =null;


        CommonTree EQ11_tree=null;
        CommonTree MINUS12_tree=null;
        CommonTree WORD13_tree=null;
        CommonTree WORD15_tree=null;
        CommonTree WORD17_tree=null;
        RewriteRuleNodeStream stream_WORD=new RewriteRuleNodeStream(adaptor,"token WORD");
        RewriteRuleNodeStream stream_EQ=new RewriteRuleNodeStream(adaptor,"token EQ");
        RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");
        RewriteRuleSubtreeStream stream_z1=new RewriteRuleSubtreeStream(adaptor,"rule z1");
        RewriteRuleSubtreeStream stream_z2=new RewriteRuleSubtreeStream(adaptor,"rule z2");
        RewriteRuleSubtreeStream stream_z3=new RewriteRuleSubtreeStream(adaptor,"rule z3");
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:19:10: ( ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) ) -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) ) )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:19:12: ^( EQ ^( MINUS ^( WORD z1 ) ^( WORD z2 ) ) ^( WORD z3 ) )
            {
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            EQ11=(CommonTree)match(input,EQ,FOLLOW_EQ_in_lineMinus143);  
            stream_EQ.add(EQ11);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_2 = _last;
            CommonTree _first_2 = null;
            CommonTree root_2 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            MINUS12=(CommonTree)match(input,MINUS,FOLLOW_MINUS_in_lineMinus146);  
            stream_MINUS.add(MINUS12);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_3 = _last;
            CommonTree _first_3 = null;
            CommonTree root_3 = (CommonTree)adaptor.nil();
            _last = (CommonTree)input.LT(1);
            WORD13=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus149);  
            stream_WORD.add(WORD13);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z1_in_lineMinus151);
            z114=z1();

            state._fsp--;

            stream_z1.add(z114.getTree());

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
            WORD15=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus155);  
            stream_WORD.add(WORD15);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z2_in_lineMinus157);
            z216=z2();

            state._fsp--;

            stream_z2.add(z216.getTree());

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
            WORD17=(CommonTree)match(input,WORD,FOLLOW_WORD_in_lineMinus162);  
            stream_WORD.add(WORD17);


            match(input, Token.DOWN, null); 
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_z3_in_lineMinus164);
            z318=z3();

            state._fsp--;

            stream_z3.add(z318.getTree());

            match(input, Token.UP, null); 
            adaptor.addChild(root_1, root_2);
            _last = _save_last_2;
            }


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            // AST REWRITE
            // elements: WORD, z1, WORD, EQ, z2, z3, WORD, MINUS
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 20:2: -> ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
            {
                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:20:5: ^( EQ ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) ) ^( WORD z1 ) )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQ.nextNode()
                , root_1);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:20:10: ^( MINUS[\"+\"] ^( WORD z3 ) ^( WORD z2 ) )
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                root_2 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(MINUS, "+")
                , root_2);

                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:20:23: ^( WORD z3 )
                {
                CommonTree root_3 = (CommonTree)adaptor.nil();
                root_3 = (CommonTree)adaptor.becomeRoot(
                stream_WORD.nextNode()
                , root_3);

                adaptor.addChild(root_3, stream_z3.nextTree());

                adaptor.addChild(root_2, root_3);
                }

                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:20:34: ^( WORD z2 )
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

                // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:20:46: ^( WORD z1 )
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
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:23:1: z1 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z1_return z1() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z1_return retval = new AST_SymbolRaetsel_Normalisierung.z1_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN19=null;

        CommonTree BUCHSTABEN19_tree=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:23:5: ( ( BUCHSTABEN )+ )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:23:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:23:7: ( BUCHSTABEN )+
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
            	    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:23:7: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN19=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z1208); 
            	    BUCHSTABEN19_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN19);


            	    adaptor.addChild(root_0, BUCHSTABEN19_tree);


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
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:24:1: z2 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z2_return z2() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z2_return retval = new AST_SymbolRaetsel_Normalisierung.z2_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN20=null;

        CommonTree BUCHSTABEN20_tree=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:24:5: ( ( BUCHSTABEN )+ )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:24:7: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:24:7: ( BUCHSTABEN )+
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
            	    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:24:7: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN20=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z2217); 
            	    BUCHSTABEN20_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN20);


            	    adaptor.addChild(root_0, BUCHSTABEN20_tree);


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
    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:25:1: z3 : ( BUCHSTABEN )+ ;
    public final AST_SymbolRaetsel_Normalisierung.z3_return z3() throws RecognitionException {
        AST_SymbolRaetsel_Normalisierung.z3_return retval = new AST_SymbolRaetsel_Normalisierung.z3_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BUCHSTABEN21=null;

        CommonTree BUCHSTABEN21_tree=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:25:5: ( ( BUCHSTABEN )+ )
            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:25:8: ( BUCHSTABEN )+
            {
            root_0 = (CommonTree)adaptor.nil();


            // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:25:8: ( BUCHSTABEN )+
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
            	    // Z:\\git\\CIP\\Aufgabe 4\\AST_SymbolRaetsel_Normalisierung.g:25:8: BUCHSTABEN
            	    {
            	    _last = (CommonTree)input.LT(1);
            	    BUCHSTABEN21=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_z3227); 
            	    BUCHSTABEN21_tree = (CommonTree)adaptor.dupNode(BUCHSTABEN21);


            	    adaptor.addChild(root_0, BUCHSTABEN21_tree);


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


 

    public static final BitSet FOLLOW_line_in_prog43 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog47 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog51 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog55 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog59 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_line_in_prog63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_linePlus_in_line96 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lineMinus_in_line101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQ_in_linePlus111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_linePlus114 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_linePlus117 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z1_in_linePlus119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_linePlus123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z2_in_linePlus125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_linePlus130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z3_in_linePlus132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQ_in_lineMinus143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_in_lineMinus146 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_WORD_in_lineMinus149 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z1_in_lineMinus151 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_lineMinus155 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z2_in_lineMinus157 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_lineMinus162 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_z3_in_lineMinus164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z1208 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z2217 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_z3227 = new BitSet(new long[]{0x0000000000000042L});

}