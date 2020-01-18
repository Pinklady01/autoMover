package blablacar.core;

public class East implements Directions {
    @Override
    public CardinalPoint turnLeft() {
        return CardinalPoint.NORTH;
    }

    @Override
    public CardinalPoint turnRight() {

        return CardinalPoint.SOUTH;
    }
}
