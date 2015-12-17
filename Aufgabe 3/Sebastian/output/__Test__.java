import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_SymbolraetselLexer lex = new AST_SymbolraetselLexer(new ANTLRFileStream("Z:\\Compiler\\CIP\\Aufgabe 3\\Raetsel.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        AST_SymbolraetselParser parser = new AST_SymbolraetselParser(tokens);
        AST_SymbolraetselParser.prog_return r = parser.prog();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        AST_SymbolRaetsel_Normalisierung walker = new AST_SymbolRaetsel_Normalisierung(nodes);
        try {
            walker.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}