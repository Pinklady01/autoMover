package blablacar.core.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<Token> parse(final String instructions){
        final String[] values = instructions.split(" ");
        final List<Token> tokens = new ArrayList<Token>();

        for (final String value : values){
            tokens.add(new Token((value)));
        }
        return tokens;
    }

}
