package blablacar.core;

public class Point {
    private int coordX;
    private int coordY;
    private int coordXMax;
    private int coordYMax;

    public Point(int coordX, int coordY, int coordXMax, int coordYMax) {
        this.coordX = coordX;
        this.coordY = coordY;
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

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        if(coordX <= this.coordXMax){
            this.coordX = coordX;
        }
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        if(coordY <= this.coordYMax){
            this.coordY = coordY;
        }
    }


}
