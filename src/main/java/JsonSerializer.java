import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class JsonSerializer {
    private static final Gson PRETTY_PRINT_GSON = new GsonBuilder().setPrettyPrinting().create();

    public static String toJson(ParseTree tree) {
        return PRETTY_PRINT_GSON.toJson(toMap(tree));
    }

    private static Map<String, Object> toMap(ParseTree tree) {
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        traverse(tree, map);
        return map;
    }

    private static void traverse(ParseTree tree, Map<String, Object> map) {
        String name = tree.getClass().getSimpleName().replaceAll("Context$", "");

        if (tree.getChildCount() == 1) {
            if (tree.getChild(0) instanceof TerminalNodeImpl) {
                Token token = ((TerminalNodeImpl) tree.getChild(0)).getSymbol();
                map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), token.getText());
                return;
            }
            Map<String, Object> nested = new LinkedHashMap<String, Object>();
            map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), nested);
            traverse(tree.getChild(0), nested);
            return;
        }

        ArrayList<Object> children = new ArrayList<Object>();
        map.put(Character.toLowerCase(name.charAt(0)) + name.substring(1), children);

        for (int i = 0; i < tree.getChildCount(); i++) {
            Map<String, Object> nested = new LinkedHashMap<String, Object>();
            if (tree.getChild(i) instanceof TerminalNodeImpl) {
                Token token = ((TerminalNodeImpl) tree.getChild(i)).getSymbol();
                children.add(token.getText());
                continue;
            }
            children.add(nested);
            traverse(tree.getChild(i), nested);
        }
    }
}
