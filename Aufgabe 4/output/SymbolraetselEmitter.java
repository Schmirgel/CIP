// $ANTLR 3.4 Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g 2016-01-15 14:25:39

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
@SuppressWarnings({"all", "warnings", "unchecked"})
public class SymbolraetselEmitter extends TreeParser {
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


    public SymbolraetselEmitter(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SymbolraetselEmitter(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected StringTemplateGroup templateLib =
  new StringTemplateGroup("SymbolraetselEmitterTemplates", AngleBracketTemplateLexer.class);

public void setTemplateLib(StringTemplateGroup templateLib) {
  this.templateLib = templateLib;
}
public StringTemplateGroup getTemplateLib() {
  return templateLib;
}
/** allows convenient multi-value initialization:
 *  "new STAttrMap().put(...).put(...)"
 */
public static class STAttrMap extends HashMap {
  public STAttrMap put(String attrName, Object value) {
    super.put(attrName, value);
    return this;
  }
  public STAttrMap put(String attrName, int value) {
    super.put(attrName, new Integer(value));
    return this;
  }
}
    public String[] getTokenNames() { return SymbolraetselEmitter.tokenNames; }
    public String getGrammarFileName() { return "Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g"; }


    public static class puzzle_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "puzzle"
    // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:9:1: puzzle : ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints);
    public final SymbolraetselEmitter.puzzle_return puzzle() throws RecognitionException {
        SymbolraetselEmitter.puzzle_return retval = new SymbolraetselEmitter.puzzle_return();
        retval.start = input.LT(1);


        List list_constraints=null;
        RuleReturnScope constraints = null;
        try {
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:10:3: ( ^( PUZZLE (constraints+= constraint )* ) -> sums(sums=$constraints))
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:11:3: ^( PUZZLE (constraints+= constraint )* )
            {
            match(input,PUZZLE,FOLLOW_PUZZLE_in_puzzle57); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:11:23: (constraints+= constraint )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==EQ) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:11:23: constraints+= constraint
                	    {
                	    pushFollow(FOLLOW_constraint_in_puzzle61);
                	    constraints=constraint();

                	    state._fsp--;

                	    if (list_constraints==null) list_constraints=new ArrayList();
                	    list_constraints.add(constraints.getTemplate());


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }


            // TEMPLATE REWRITE
            // 12:3: -> sums(sums=$constraints)
            {
                retval.st = templateLib.getInstanceOf("sums",new STAttrMap().put("sums", list_constraints));
            }



            }

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
    // $ANTLR end "puzzle"


    public static class constraint_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "constraint"
    // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:15:1: constraint : ^( EQ ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number);
    public final SymbolraetselEmitter.constraint_return constraint() throws RecognitionException {
        SymbolraetselEmitter.constraint_return retval = new SymbolraetselEmitter.constraint_return();
        retval.start = input.LT(1);


        SymbolraetselEmitter.number_return n1 =null;

        SymbolraetselEmitter.number_return n2 =null;

        SymbolraetselEmitter.number_return n3 =null;


        try {
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:23:3: ( ^( EQ ^( PLUS n1= number n2= number ) n3= number ) -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number))
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:24:3: ^( EQ ^( PLUS n1= number n2= number ) n3= number )
            {
            match(input,EQ,FOLLOW_EQ_in_constraint100); 

            match(input, Token.DOWN, null); 
            match(input,PLUS,FOLLOW_PLUS_in_constraint107); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_number_in_constraint111);
            n1=number();

            state._fsp--;


            pushFollow(FOLLOW_number_in_constraint115);
            n2=number();

            state._fsp--;


            match(input, Token.UP, null); 


            pushFollow(FOLLOW_number_in_constraint124);
            n3=number();

            state._fsp--;


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 29:4: -> sum(number1=$n1.numbernumber2=$n2.numbernumber3=$n3.number)
            {
                retval.st = templateLib.getInstanceOf("sum",new STAttrMap().put("number1", (n1!=null?n1.number:null)).put("number2", (n2!=null?n2.number:null)).put("number3", (n3!=null?n3.number:null)));
            }



            }


            Constraint constraint = new Constraint();
            constraint.numbers.add((n1!=null?n1.number:null));
            constraint.numbers.add((n2!=null?n2.number:null));
            constraint.numbers.add((n3!=null?n3.number:null));
            constraint.prepare();

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
    // $ANTLR end "constraint"


    public static class number_return extends TreeRuleReturnScope {
        public Number number;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };


    // $ANTLR start "number"
    // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:32:1: number returns [Number number] : ^( WORD (syms+= BUCHSTABEN )+ ) ;
    public final SymbolraetselEmitter.number_return number() throws RecognitionException {
        SymbolraetselEmitter.number_return retval = new SymbolraetselEmitter.number_return();
        retval.start = input.LT(1);


        CommonTree syms=null;
        List list_syms=null;

        try {
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:37:3: ( ^( WORD (syms+= BUCHSTABEN )+ ) )
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:38:3: ^( WORD (syms+= BUCHSTABEN )+ )
            {
            match(input,WORD,FOLLOW_WORD_in_number176); 

            match(input, Token.DOWN, null); 
            // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:38:14: (syms+= BUCHSTABEN )+
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
            	    // Z:\\git\\CIP\\Aufgabe 4\\SymbolraetselEmitter.g:38:14: syms+= BUCHSTABEN
            	    {
            	    syms=(CommonTree)match(input,BUCHSTABEN,FOLLOW_BUCHSTABEN_in_number180); 
            	    if (list_syms==null) list_syms=new ArrayList();
            	    list_syms.add(syms);


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


            match(input, Token.UP, null); 


            }


            retval.number = new Number();
            retval.number.setDigits(list_syms);

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
    // $ANTLR end "number"

    // Delegated rules


 

    public static final BitSet FOLLOW_PUZZLE_in_puzzle57 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constraint_in_puzzle61 = new BitSet(new long[]{0x0000000000000408L});
    public static final BitSet FOLLOW_EQ_in_constraint100 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_constraint107 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_number_in_constraint111 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_number_in_constraint115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_in_constraint124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WORD_in_number176 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_BUCHSTABEN_in_number180 = new BitSet(new long[]{0x0000000000000048L});

}