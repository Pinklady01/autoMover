package blablacar.core;

public class South implements Directions {
    @Override
    public Directions turnLeft() {
        return new East();
    }

    @Override
    public Directions turnRight() {
        return new West();
    }

    @Override
    public String toString() {
        return "S";
    }
}
