package blablacar.core;

public class West implements Directions {
    @Override
    public Directions turnLeft() {
        return new South();
    }

    @Override
    public Directions turnRight() {
        return new North();
    }
}
