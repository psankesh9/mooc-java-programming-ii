import java.util.List;

public class mainProgram {
    public static int returnSize(List<?> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<String> names = List.of("First", "Second", "Third");
        System.out.println(returnSize(names)); // Output: 3
    }
}
