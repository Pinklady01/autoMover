package blablacar.core;

import blablacar.core.parser.Parser;
import blablacar.core.parser.Token;

import java.util.List;

public class AutoMower {
    private Point localisation;
    private Directions orientation;

    public AutoMower(int coordXMax, int coordYMax) {
        this.localisation = new Point(0,0,coordXMax,coordYMax);
        this.orientation = new North();
    }

    public Point getLocalisation() {
        return localisation;
    }

    public void setLocalisation(Point localisation) {
        this.localisation = localisation;
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
                setOrientation(getOrientation().turnLeft());
            }else if(tok.getValue() == "R") {
                setOrientation(getOrientation().turnRight());
            }else if(tok.getValue() == "F"){
                goForward(getOrientation().toString());
            }else if(tok.getValue() == "B") {
                goBackwards(getOrientation().toString());
            }
        }
    }

    private void goBackwards(String orientation) {
        switch (orientation) {
            case "N":
                getLocalisation().setCoordY(getLocalisation().getCoordY()-1);
                break;
            case "W":
                getLocalisation().setCoordX(getLocalisation().getCoordX()+1);
                break;
            case "E":
                getLocalisation().setCoordX(getLocalisation().getCoordX()-1);
                break;
            case "S":
                getLocalisation().setCoordY(getLocalisation().getCoordY()+1);
                break;
        }
    }

    private void goForward(String orientation) {
        switch (orientation) {
            case "N":
                getLocalisation().setCoordY(getLocalisation().getCoordY()+1);
                break;
            case "W":
                getLocalisation().setCoordX(getLocalisation().getCoordX()-1);
                break;
            case "E":
                getLocalisation().setCoordX(getLocalisation().getCoordX()+1);
                break;
            case "S":
                getLocalisation().setCoordY(getLocalisation().getCoordY()-1);
                break;
        }
    }

}
