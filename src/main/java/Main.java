import golang.GolangLexer;
import golang.GolangParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    private static final String INPUT_FILE = "in.txt";
    private static final String OUTPUT_FILE = "out.txt";

    public static String parse(CharStream charStream) {
        GolangLexer lexer = new GolangLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        GolangParser parser = new GolangParser(commonTokenStream);
        parser.addErrorListener(new ParseErrorListener());

        String result;
        try {
            ParseTree tree = parser.sourceFile();
            result = JsonSerializer.toJson(tree);
        } catch (ParseErrorException e) {
            result = e.getMessage();
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        CharStream charStream = CharStreams.fromFileName(INPUT_FILE);
        PrintWriter printWriter = new PrintWriter(OUTPUT_FILE);
        printWriter.print(parse(charStream));
        printWriter.close();
    }
}