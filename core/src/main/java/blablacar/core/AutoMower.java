package blablacar.core;

import blablacar.core.parser.Parser;
import blablacar.core.parser.Token;

import java.util.List;

public class AutoMower {
    private Point localisation;
    private Directions orientation;

    public AutoMower(int coordX, int coordY, int coordXMax, int coordYMax, String orientation) {
        this.localisation = new Point(coordX,coordY,coordXMax,coordYMax);
        switch(orientation){
            case "N": this.orientation = new North();
                break;
            case "S": this.orientation = new South();
                break;
            case "W": this.orientation = new West();
                break;
            case "E": this.orientation = new East();
                break;
        }

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

    public void move(final String movements){
        Parser aParser = new Parser();
        final List<Token> tokens = aParser.parseEachChar(movements);
        for(Token tok : tokens) {
            if (tok.getValue().equals("L")) {
                setOrientation(getOrientation().turnLeft());
            }else if(tok.getValue().equals("R")) {
                setOrientation(getOrientation().turnRight());
            }else if(tok.getValue().equals("F")){
                goForward(getOrientation().toString());
            }else if(tok.getValue().equals("B")) {
                goBackwards(getOrientation().toString());
            }
        }
        this.toString();
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

    @Override
    public String toString() {
        return this.localisation.toString()+this.orientation.toString();
    }
}
