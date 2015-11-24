// $ANTLR 3.4 C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g 2015-11-24 10:30:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class AST_Erzeugung1Parser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INT", "'+'", "'-'"
    };

    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int T__6=6;
    public static final int INT=4;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "expr", "atom"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public AST_Erzeugung1Parser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public AST_Erzeugung1Parser(TokenStream input, int port, RecognizerSharedState state) {
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

public AST_Erzeugung1Parser(TokenStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return AST_Erzeugung1Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g"; }


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:1: expr : atom ( ( '+' ^| '-' ^) atom )* ;
    public final AST_Erzeugung1Parser.expr_return expr() throws RecognitionException {
        AST_Erzeugung1Parser.expr_return retval = new AST_Erzeugung1Parser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal3=null;
        AST_Erzeugung1Parser.atom_return atom1 =null;

        AST_Erzeugung1Parser.atom_return atom4 =null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal3_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "expr");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(8, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:7: ( atom ( ( '+' ^| '-' ^) atom )* )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:10: atom ( ( '+' ^| '-' ^) atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(8,10);
            pushFollow(FOLLOW_atom_in_expr34);
            atom1=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom1.getTree());
            dbg.location(8,15);
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:15: ( ( '+' ^| '-' ^) atom )*
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= 5 && LA2_0 <= 6)) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:16: ( '+' ^| '-' ^) atom
            	    {
            	    dbg.location(8,16);
            	    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:16: ( '+' ^| '-' ^)
            	    int alt1=2;
            	    try { dbg.enterSubRule(1);
            	    try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==5) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==6) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        dbg.recognitionException(nvae);
            	        throw nvae;

            	    }
            	    } finally {dbg.exitDecision(1);}

            	    switch (alt1) {
            	        case 1 :
            	            dbg.enterAlt(1);

            	            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:17: '+' ^
            	            {
            	            dbg.location(8,20);
            	            char_literal2=(Token)match(input,5,FOLLOW_5_in_expr38); 
            	            char_literal2_tree = 
            	            (CommonTree)adaptor.create(char_literal2)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal2_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            dbg.enterAlt(2);

            	            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:8:22: '-' ^
            	            {
            	            dbg.location(8,25);
            	            char_literal3=(Token)match(input,6,FOLLOW_6_in_expr41); 
            	            char_literal3_tree = 
            	            (CommonTree)adaptor.create(char_literal3)
            	            ;
            	            root_0 = (CommonTree)adaptor.becomeRoot(char_literal3_tree, root_0);


            	            }
            	            break;

            	    }
            	    } finally {dbg.exitSubRule(1);}

            	    dbg.location(8,27);
            	    pushFollow(FOLLOW_atom_in_expr44);
            	    atom4=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom4.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
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
        dbg.location(9, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "expr");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "expr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:11:1: atom : INT ;
    public final AST_Erzeugung1Parser.atom_return atom() throws RecognitionException {
        AST_Erzeugung1Parser.atom_return retval = new AST_Erzeugung1Parser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT5=null;

        CommonTree INT5_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "atom");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(11, 0);

        try {
            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:11:6: ( INT )
            dbg.enterAlt(1);

            // C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\AST_Erzeugung1.g:11:8: INT
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(11,8);
            INT5=(Token)match(input,INT,FOLLOW_INT_in_atom57); 
            INT5_tree = 
            (CommonTree)adaptor.create(INT5)
            ;
            adaptor.addChild(root_0, INT5_tree);


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
        dbg.location(12, 1);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "atom");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_atom_in_expr34 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_5_in_expr38 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6_in_expr41 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_atom_in_expr44 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_INT_in_atom57 = new BitSet(new long[]{0x0000000000000002L});

}