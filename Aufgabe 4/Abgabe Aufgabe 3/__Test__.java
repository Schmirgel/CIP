package solver;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        AST_SymbolraetselLexer lex = new AST_SymbolraetselLexer(new ANTLRFileStream("Z:\\Compiler\\CIP\\Aufgabe 3\\Raetsel.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);


        AST_SymbolraetselParser parser = new AST_SymbolraetselParser(tokens);
        AST_SymbolraetselParser.prog_return r = parser.prog();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
        CommonTree ast = (CommonTree)r.getTree(); 

        AST_SymbolRaetsel_Normalisierung walker = new AST_SymbolRaetsel_Normalisierung(nodes);
        AST_SymbolRaetsel_Normalisierung.prog_return r2 = walker.prog();
        
        CommonTree newAST = (CommonTree)r2.getTree(); 
        System.out.println("******* Old AST ********");
        System.out.println(ast.toStringTree());
        System.out.println("******* New AST ********");
        System.out.println(newAST.toStringTree());
        

    }

}