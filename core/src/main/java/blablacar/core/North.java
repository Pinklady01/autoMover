package blablacar.core;

public class North implements Directions {
    @Override
    public CardinalPoint turnLeft() {

        return CardinalPoint.WEST;
    }

    @Override
    public CardinalPoint turnRight() {

        return CardinalPoint.EAST;
    }
}
