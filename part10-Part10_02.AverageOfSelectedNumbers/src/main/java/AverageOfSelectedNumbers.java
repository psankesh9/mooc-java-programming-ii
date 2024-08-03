import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(Integer.parseInt(input));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();

        if (choice.equals("n")) {
            double average = numbers.stream()
                                    .filter(n -> n < 0)
                                    .mapToInt(Integer::intValue)
                                    .average()
                                    .orElse(0.0);
            System.out.println("Average of the negative numbers: " + average);
        } else {
            double average = numbers.stream()
                                    .filter(n -> n > 0)
                                    .mapToInt(Integer::intValue)
                                    .average()
                                    .orElse(0.0);
            System.out.println("Average of the positive numbers: " + average);
        }
    }
}
