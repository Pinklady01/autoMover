package blablacar.core;

public class West implements Directions, Mouvements {
    @Override
    public Directions turnLeft() {
        return new South();
    }

    @Override
    public Directions turnRight() {
        return new North();
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
