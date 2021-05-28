package viking.movestrategy;

import viking.Viking;

public class Fly implements Move {

    @Override
    public void move(Viking viking) {
        viking.setPosition(viking.getPosition() + 10);
    }
}
