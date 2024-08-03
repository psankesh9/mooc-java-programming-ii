import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int count = -1;
        while (count < 0) {
            System.out.println("How many random numbers should be printed?");
            String input = scanner.nextLine().trim(); // trim to remove any leading/trailing whitespace
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please enter a valid number.");
                continue;
            }
            try {
                count = Integer.parseInt(input);
                if (count < 0) {
                    System.out.println("Please enter a non-negative number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(11); // Generates a random number between 0 and 10
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}
