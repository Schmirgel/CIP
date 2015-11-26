import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_MiniPLexer lex = new AST_MiniPLexer(new ANTLRFileStream("Z:\\pub\\Semester 4\\CIP-Git\\CIP\\Aufgabe 1\\Ralf\\program.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AST_MiniPParser g = new AST_MiniPParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}