package blablacar.core;

public class South implements Directions {
    @Override
    public CardinalPoint turnLeft() {

        return CardinalPoint.EAST;
    }

    @Override
    public CardinalPoint turnRight() {

        return CardinalPoint.WEST;
    }
}
