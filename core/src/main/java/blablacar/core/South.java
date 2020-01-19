package blablacar.core;

public class South implements Directions, Mouvements {
    @Override
    public Directions turnLeft() {
        return new East();
    }

    @Override
    public Directions turnRight() {
        return new West();
    }

    @Override
    public int goForward() {
        return 0;
    }

    @Override
    public int goBackwards() {
        return 0;
    }
}
