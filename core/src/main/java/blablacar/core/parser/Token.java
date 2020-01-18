package blablacar.core.parser;

public class Token {
    protected final String value;

    public Token( final String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
