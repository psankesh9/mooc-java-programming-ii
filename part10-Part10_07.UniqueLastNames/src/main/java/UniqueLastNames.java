import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueLastNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> lastNames = new TreeSet<>();

        while (true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            if (scanner.nextLine().equals("quit")) {
                break;
            }
            System.out.print("Input first name: ");
            scanner.nextLine();
            System.out.print("Input last name: ");
            lastNames.add(scanner.nextLine());
            System.out.print("Input the year of birth: ");
            scanner.nextLine();
        }

        System.out.println("Unique last names in alphabetical order:");
        lastNames.forEach(System.out::println);
    }
}
