import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        MiniPLexer lex = new MiniPLexer(new ANTLRFileStream("/Users/lewis/Documents/CI/A2/program.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        MiniPParser g = new MiniPParser(tokens, 49100, null);
        try {
            g.start();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}