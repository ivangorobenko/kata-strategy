package viking;

import viking.movestrategy.Move;
import viking.movestrategy.StandStill;

public class Viking {
    private int position;
    private Move moveStrategy;

    public Viking() {
        this.moveStrategy = new StandStill();
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void move() {
        moveStrategy.move(this);
    }

    public void setMoveStrategy(Move move) {
        this.moveStrategy = move;
    }
}
