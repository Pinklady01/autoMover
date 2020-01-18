package blablacar.core;

public class Grid {
    private int coordXMax;
    private int coordYMax;

    public Grid(int coordXMax, int coordYMax) {
        this.coordXMax = coordXMax;
        this.coordYMax = coordYMax;
    }

    public int getCoordXMax() {
        return coordXMax;
    }

    public void setCoordXMax(int coordXMax) {
        this.coordXMax = coordXMax;
    }

    public int getCoordYMax() {
        return coordYMax;
    }

    public void setCoordYMax(int coordYMax) {
        this.coordYMax = coordYMax;
    }
}
