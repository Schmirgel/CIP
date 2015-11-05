// $ANTLR 3.4 C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g 2015-11-05 12:55:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolRaetselParser extends DebugParser {
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
    "invalidRule", "equalsline", "opline", "start", "taskline"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public SymbolRaetselParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public SymbolRaetselParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this, port, null);

        setDebugListener(proxy);
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
    }

public SymbolRaetselParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg, new RecognizerSharedState());
}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

    public String[] getTokenNames() { return SymbolRaetselParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g"; }



    // $ANTLR start "start"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:3:1: start : taskline opline taskline equalsline taskline ;
    public final void start() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "start");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(3, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:3:7: ( taskline opline taskline equalsline taskline )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:3:9: taskline opline taskline equalsline taskline
            {
            dbg.location(3,9);
            pushFollow(FOLLOW_taskline_in_start11);
            taskline();

            state._fsp--;

            dbg.location(3,18);
            pushFollow(FOLLOW_opline_in_start13);
            opline();

            state._fsp--;

            dbg.location(3,25);
            pushFollow(FOLLOW_taskline_in_start15);
            taskline();

            state._fsp--;

            dbg.location(3,34);
            pushFollow(FOLLOW_equalsline_in_start17);
            equalsline();

            state._fsp--;

            dbg.location(3,45);
            pushFollow(FOLLOW_taskline_in_start19);
            taskline();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(3, 52);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "start");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "taskline"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:5:1: taskline : WORD OPERATOR WORD EQUALS WORD ;
    public final void taskline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "taskline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(5, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:5:10: ( WORD OPERATOR WORD EQUALS WORD )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:5:12: WORD OPERATOR WORD EQUALS WORD
            {
            dbg.location(5,12);
            match(input,WORD,FOLLOW_WORD_in_taskline28); 
            dbg.location(5,17);
            match(input,OPERATOR,FOLLOW_OPERATOR_in_taskline30); 
            dbg.location(5,26);
            match(input,WORD,FOLLOW_WORD_in_taskline32); 
            dbg.location(5,31);
            match(input,EQUALS,FOLLOW_EQUALS_in_taskline34); 
            dbg.location(5,38);
            match(input,WORD,FOLLOW_WORD_in_taskline36); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(5, 41);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "taskline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "taskline"



    // $ANTLR start "opline"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:6:1: opline : OPERATOR OPERATOR OPERATOR ;
    public final void opline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "opline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(6, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:6:9: ( OPERATOR OPERATOR OPERATOR )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:6:11: OPERATOR OPERATOR OPERATOR
            {
            dbg.location(6,11);
            match(input,OPERATOR,FOLLOW_OPERATOR_in_opline44); 
            dbg.location(6,20);
            match(input,OPERATOR,FOLLOW_OPERATOR_in_opline46); 
            dbg.location(6,29);
            match(input,OPERATOR,FOLLOW_OPERATOR_in_opline48); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(6, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "opline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "opline"



    // $ANTLR start "equalsline"
    // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:7:1: equalsline : EQUALS EQUALS EQUALS ;
    public final void equalsline() throws RecognitionException {
        try { dbg.enterRule(getGrammarFileName(), "equalsline");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(7, 0);

        try {
            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:7:12: ( EQUALS EQUALS EQUALS )
            dbg.enterAlt(1);

            // C:\\Users\\abp516\\Documents\\CIP\\Sebastian\\SymbolRaetsel.g:7:14: EQUALS EQUALS EQUALS
            {
            dbg.location(7,14);
            match(input,EQUALS,FOLLOW_EQUALS_in_equalsline56); 
            dbg.location(7,21);
            match(input,EQUALS,FOLLOW_EQUALS_in_equalsline58); 
            dbg.location(7,28);
            match(input,EQUALS,FOLLOW_EQUALS_in_equalsline60); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(7, 34);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "equalsline");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return ;
    }
    // $ANTLR end "equalsline"

    // Delegated rules


 

    public static final BitSet FOLLOW_taskline_in_start11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_opline_in_start13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_taskline_in_start15 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_equalsline_in_start17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_taskline_in_start19 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WORD_in_taskline28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_taskline30 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_taskline32 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_taskline34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_WORD_in_taskline36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATOR_in_opline44 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_opline46 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_OPERATOR_in_opline48 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUALS_in_equalsline56 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_equalsline58 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_EQUALS_in_equalsline60 = new BitSet(new long[]{0x0000000000000002L});

}