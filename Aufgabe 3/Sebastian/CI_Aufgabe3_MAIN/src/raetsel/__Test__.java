import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_SymbolRaetselLexer lex = new AST_SymbolRaetselLexer(new ANTLRFileStream("C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 3\\output\\__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        AST_SymbolRaetselParser parser = new AST_SymbolRaetselParser(tokens);
        AST_SymbolRaetselParser.prog_return r = parser.prog();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());


        AST_SymbolRaetsel_Normalisierung walker = new AST_SymbolRaetsel_Normalisierung(nodes);
        try {
            walker.prog();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }

    }

}