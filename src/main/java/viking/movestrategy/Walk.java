package viking.movestrategy;

import viking.Viking;

public class Walk implements Move {
    @Override
    public void move(Viking viking) {
        viking.setPosition(viking.getPosition() + 1);
    }
}
