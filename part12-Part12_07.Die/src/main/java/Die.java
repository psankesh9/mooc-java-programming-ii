import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces; // Initialize the number of faces
    }

    public int throwDie() {
        return this.random.nextInt(this.numberOfFaces) + 1; // Generate a random number between 1 and numberOfFaces
    }
}
