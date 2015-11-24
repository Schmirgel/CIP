import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_MiniPLexer lex = new AST_MiniPLexer(new ANTLRFileStream("C:\\Users\\VAIO PRO\\Documents\\HAW\\4_Sem\\CI_Neitzke\\CI-Aufgaben\\Aufgabe 2\\TestMiniP.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        AST_MiniPParser g = new AST_MiniPParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}