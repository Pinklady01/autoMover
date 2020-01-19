package blablacar.core;

public class North implements Directions, Mouvements{
    @Override
    public Directions turnLeft() {
        return new West();
    }

    @Override
    public Directions turnRight() {
        return new East();
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
