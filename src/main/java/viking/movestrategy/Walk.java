package viking.movestrategy;

public class Walk implements Move {
    @Override
    public int move(int initialPosition) {
        return initialPosition + 1;
    }
}
