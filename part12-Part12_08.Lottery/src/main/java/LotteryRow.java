import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        Random random = new Random();

        while (this.numbers.size() < 7) {
            int number = random.nextInt(40) + 1; // Generate a number between 1 and 40
            if (!this.containsNumber(number)) {
                this.numbers.add(number);
            }
        }

        Collections.sort(this.numbers); // Optional: Sort the numbers
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LotteryRow)) {
            return false;
        }
        LotteryRow otherRow = (LotteryRow) other;
        return this.numbers.equals(otherRow.numbers());
    }
}
