import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_SymbolraetselLexer lex = new AST_SymbolraetselLexer(new ANTLRFileStream("C:\\Users\\VAIO PRO\\Documents\\GitHub\\CIP\\Aufgabe 3\\Abgabe Aufgabe 2\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AST_SymbolraetselParser g = new AST_SymbolraetselParser(tokens, 49100, null);
        try {
            g.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}