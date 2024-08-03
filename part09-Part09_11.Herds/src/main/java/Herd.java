import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder positions = new StringBuilder();
        for (Movable movable : herd) {
            positions.append(movable.toString()).append("\n");
        }
        return positions.toString();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }
}
