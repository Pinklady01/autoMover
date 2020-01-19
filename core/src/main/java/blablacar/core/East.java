package blablacar.core;

public class East implements Directions{
    @Override
    public Directions turnLeft() {
        return new North();
    }

    @Override
    public Directions turnRight() {
        return new South();
    }

    @Override
    public String toString() {
        return "E";
    }
}
