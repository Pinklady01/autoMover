package blablacar.core;

import java.util.ArrayList;

public class Grid {
    private int coordXMax;
    private int coordYMax;
    private ArrayList<AutoMower> autoMowers = new ArrayList<AutoMower>();

    public Grid(int coordXMax, int coordYMax) {
        this.coordXMax = coordXMax;
        this.coordYMax = coordYMax;
    }

    public ArrayList<AutoMower> getAutoMowers() {
        return autoMowers;
    }

    public void setAutoMowers(ArrayList<AutoMower> autoMowers) {
        this.autoMowers = autoMowers;
    }

    public void addAnAutoMowers(AutoMower autoMower){
        if(!this.containsAutoMower(autoMower)){
            this.autoMowers.add(autoMower);
        }
    }

    public boolean containsAutoMower(AutoMower autoMower){
        if(this.getAutoMowers().contains(autoMower)){
            return true;
        }
        return false;
    }


    public int getCoordXMax() {
        return coordXMax;
    }

    private void setCoordXMax(int coordXMax) {
        this.coordXMax = coordXMax;
    }

    public int getCoordYMax() {
        return coordYMax;
    }

    private void setCoordYMax(int coordYMax) {
        this.coordYMax = coordYMax;
    }
}
