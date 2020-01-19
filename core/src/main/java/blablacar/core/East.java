package blablacar.core;

public class East implements Directions, Mouvements{
    @Override
    public Directions turnLeft() {
        return new North();
    }

    @Override
    public Directions turnRight() {
        return new South();
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
