package blablacar.core;

import blablacar.core.parser.Parser;
import blablacar.core.parser.Token;

import java.util.List;

public class AutoMover {
    private int coordX;
    private int coordY;
    private Directions orientation;

    public AutoMover() {
        this.coordX = 0;
        this.coordY = 0;
        this.orientation = new North();
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public Directions getOrientation() {
        return orientation;
    }

    public void setOrientation(Directions orientation) {
        this.orientation = orientation;
    }

    public void move(final String movements){
        Parser aParser = new Parser();
        final List<Token> tokens = aParser.parse(movements);
        for(Token tok : tokens) {
            if (tok.getValue() == "L") {
                getOrientation().turnLeft();
            }else if(tok.getValue() == "R") {
                getOrientation().turnRight();
            }else if(tok.getValue() == "F"){
            }
            else if(tok.getValue() == "B") {
            }
        }
    }

}
