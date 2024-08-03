import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
                      .collect(Collectors.toCollection(ArrayList::new));
    }
}
