package viking;

import viking.movestrategy.Fly;
import viking.movestrategy.Move;

public class Viking {
    private int position;
    private Fly moveStrategy;

    public Viking() {
        this.moveStrategy = null;
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        if (moveStrategy == null) this.position += 1;
        else this.position += moveStrategy.move();
    }

    public void setMoveStrategy(Fly fly) {
        this.moveStrategy = fly;
    }
}
