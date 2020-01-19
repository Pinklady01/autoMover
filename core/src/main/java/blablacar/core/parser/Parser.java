package blablacar.core.parser;

import java.util.ArrayList;
import java.util.List;

public class Parser {

    public List<Token> parseFromSpaces(final String instructions){
        final String[] values = instructions.split(" ");
        final List<Token> tokens = new ArrayList<Token>();

        for (final String value : values){
            tokens.add(new Token((value)));
        }
        return tokens;
    }

    public List<Token> parseEachChar(final String instructions){
        final List<Token> tokens = new ArrayList<Token>();
        for(int i = 0; i < instructions.length(); i++){
            tokens.add(new Token((instructions.charAt(i)+"")));
        }
        return tokens;
    }



}
