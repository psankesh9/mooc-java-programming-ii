
public class MisplacingBox extends Box {
    @Override
    public void add(Item item) {
        // Items can be added but not tracked
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
