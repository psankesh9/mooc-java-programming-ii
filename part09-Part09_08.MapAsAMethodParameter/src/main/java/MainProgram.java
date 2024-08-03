import java.util.Map;

public class MainProgram {
    public static int returnSize(Map<?, ?> map) {
        return map.size();
    }

    public static void main(String[] args) {
        Map<String, String> names = Map.of("1", "first", "2", "second");
        System.out.println(returnSize(names)); // Output: 2
    }
}
