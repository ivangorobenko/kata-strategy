package viking;

public class Viking {
    private int position;

    public Viking() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move() {
        this.position += 1;
    }
}
