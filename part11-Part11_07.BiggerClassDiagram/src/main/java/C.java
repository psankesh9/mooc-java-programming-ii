import java.util.ArrayList;
import java.util.List;

public class C extends B implements IC {
    private List<E> eList; // Collection of E objects

    // Constructor
    public C() {
        this.eList = new ArrayList<>();
    }

    @Override
    public void methodC() {
        // Implementation of methodC
    }

    // Method to add E to the list
    public void addE(E e) {
        this.eList.add(e);
    }

    // Getter for the list of E objects
    public List<E> getEList() {
        return eList;
    }
}
