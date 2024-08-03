public class Player {
    private String name;

    // Constructor
    public Player(String name) {
        this.name = name;
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Methods
    public void play() {
        // Implementation of play
        System.out.println(name + " is playing.");
    }

    public void printName() {
        System.out.println("Name: " + name);
    }
}
