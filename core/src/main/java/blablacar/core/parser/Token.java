package blablacar.core.parser;


import static java.lang.String.format;

public class Token {
    private final String token;

    public Token( final String value){
        this.token = value;
    }

    public String getValue() {
        return token;
    }

    //int i = Integer.parseInt(s.trim());

    private int intValue() {
        try {
            return Integer.parseInt(token.trim());
        } catch (final NumberFormatException e) {
            return 0;
        }
    }

    public boolean isInt() {
        return intValue() != 0;
    }

    public double asInt() {
        final int value = intValue();

        if (value == 0) {
            throw new IllegalStateException(format("Expected token to hold a int value, but did not: %s", this));
        }
        return value;
    }


}
