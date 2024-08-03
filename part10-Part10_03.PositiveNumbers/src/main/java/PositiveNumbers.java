import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                      .filter(n -> n > 0)
                      .collect(Collectors.toList());
    }
}
