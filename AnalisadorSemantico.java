import antlr.*;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.imageio.IIOException;
import java.io.IOException;

public class AnalisadorSemantico {
        public static void main(String[] args) {

            AlgumaParser parser = getParser(args[0]);
            AlgumaParser.ProgContext tree = parser.prog();

            MyListener listener = new MyListener();
            ParseTreeWalker walker = new ParseTreeWalker();

            try {
                walker.walk(listener, tree);
                listener.imprimeContador();
            }
            catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }

            //System.out.println(listener.getTabela_simbolos().toString());
            //System.out.println(listener.getTabela_valores().toString());
        }

        private static AlgumaParser getParser(String nomeArquivo) {
            AlgumaParser parser = null;
            try {
                CharStream arquivo = CharStreams.fromFileName(nomeArquivo);
                AlgumaLexer lexer = new AlgumaLexer(arquivo);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                parser = new AlgumaParser(tokens);
            }
            catch (IOException e){
                e.printStackTrace();
            }
            finally {
                return parser;
            }

        }
    }
