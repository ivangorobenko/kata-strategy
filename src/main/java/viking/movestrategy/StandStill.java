package viking.movestrategy;

public class StandStill implements Move {
    @Override
    public int move(int initialPosition) {
        return initialPosition + 0;
    }
}
