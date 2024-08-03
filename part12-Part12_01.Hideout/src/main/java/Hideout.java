public class Hideout<T> {
    private T hiddenObject;

    public void putIntoHideout(T toHide) {
        hiddenObject = toHide;
    }

    public T takeFromHideout() {
        T toReturn = hiddenObject;
        hiddenObject = null;
        return toReturn;
    }

    public boolean isInHideout() {
        return hiddenObject != null;
    }
}
