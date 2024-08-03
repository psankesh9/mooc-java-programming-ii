import java.util.Set;

public class Main {
    public static int returnSize(Set<?> set) {
        return set.size();
    }

    public static void main(String[] args) {
        Set<String> names = Set.of("first", "second");
        System.out.println(returnSize(names)); // Output: 2
    }
}
