package blablacar.core;

public class West implements Directions {
    @Override
    public CardinalPoint turnLeft() {

        return CardinalPoint.SOUTH;
    }

    @Override
    public CardinalPoint turnRight() {

        return CardinalPoint.NORTH;
    }
}
