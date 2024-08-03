public class Program {

    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest) {
        // Adjust fromWhere and toWhere to valid indices
        if (fromWhere < 0) {
            fromWhere = 0;
        }
        if (toWhere >= array.length) {
            toWhere = array.length - 1;
        }

        int sum = 0;
        for (int i = fromWhere; i <= toWhere; i++) {
            if (array[i] >= smallest && array[i] <= largest) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));  // Output: 0
        System.out.println(sum(numbers, 0, 0, 0, 10)); // Output: 3
        System.out.println(sum(numbers, 0, 1, 0, 10)); // Output: 3
        System.out.println(sum(numbers, 0, 1, -10, 10)); // Output: 2
        System.out.println(sum(numbers, -1, 999, -10, 10)); // Output: 14
    }
}
