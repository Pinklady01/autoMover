package blablacar.core;

public class North implements Directions {
    @Override
    public Directions turnLeft() {
        return new West();
    }

    @Override
    public Directions turnRight() {
        return new East();
    }
}
