package blablacar.core;

public class AutoMover {
    private int coordX;
    private int coordY;
    private CardinalPoint orientation;

    public AutoMover() {
        this.coordX = 0;
        this.coordY = 0;
        this.orientation = CardinalPoint.NORTH;
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

    public CardinalPoint getOrientation() {
        return orientation;
    }

    public void setOrientation(CardinalPoint orientation) {
        this.orientation = orientation;
    }
}
