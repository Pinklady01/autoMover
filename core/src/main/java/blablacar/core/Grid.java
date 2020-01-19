package blablacar.core;

public class Grid {
    private int coordXMax;
    private int coordYMax;
    private AutoMower anAutoMower;

    public Grid(int coordXMax, int coordYMax) {
        this.coordXMax = coordXMax;
        this.coordYMax = coordYMax;
        this.anAutoMower = new AutoMower(coordXMax,coordYMax);
    }

    private int getCoordXMax() {
        return coordXMax;
    }

    private void setCoordXMax(int coordXMax) {
        this.coordXMax = coordXMax;
    }

    private int getCoordYMax() {
        return coordYMax;
    }

    private void setCoordYMax(int coordYMax) {
        this.coordYMax = coordYMax;
    }
}
