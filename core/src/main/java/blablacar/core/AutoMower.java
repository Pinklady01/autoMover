package blablacar.core;

import blablacar.core.parser.Parser;
import blablacar.core.parser.Token;

import java.util.List;

public class AutoMower {
    private int coordX;
    private int coordY;
    private Directions orientation;

    public AutoMower() {
        this.coordX = 0;
        this.coordY = 0;
        this.orientation = new North();
    }


    private int getCoordX() {
        return coordX;
    }

    private void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    private int getCoordY() {
        return coordY;
    }

    private void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    private Directions getOrientation() {
        return orientation;
    }

    private void setOrientation(Directions orientation) {
        this.orientation = orientation;
    }

    private void move(final String movements){
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
