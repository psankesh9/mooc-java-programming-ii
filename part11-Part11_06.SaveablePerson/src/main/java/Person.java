public class Person implements Saveable {
    private String name;
    private String address;

    // Constructor
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Saveable interface methods
    @Override
    public void save() {
        // Implementation of save
    }

    @Override
    public void delete() {
        // Implementation of delete
    }

    @Override
    public void load(String address) {
        // Implementation of load
    }
}
