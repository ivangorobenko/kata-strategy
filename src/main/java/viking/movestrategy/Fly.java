package viking.movestrategy;

public class Fly implements Move {

    @Override
    public int move(int initialPosition) {
        return initialPosition + 10;
    }
}
