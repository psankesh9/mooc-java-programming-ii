import java.util.ArrayList;

public class MagicSquare {
    private int[][] square;

    public MagicSquare(int size) {
        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            int sum = 0;
            for (int j = 0; j < square[i].length; j++) {
                sum += square[i][j];
            }
            sums.add(sum);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sums = new ArrayList<>();
        for (int j = 0; j < square.length; j++) {
            int sum = 0;
            for (int i = 0; i < square.length; i++) {
                sum += square[i][j];
            }
            sums.add(sum);
        }
        return sums;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sums = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < square.length; i++) {
            sum1 += square[i][i];
            sum2 += square[i][square.length - 1 - i];
        }

        sums.add(sum1);
        sums.add(sum2);
        return sums;
    }

    public void setValue(int row, int column, int value) {
        this.square[row][column] = value;
    }

    public int getValue(int row, int column) {
        return this.square[row][column];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                sb.append(square[i][j]);
                if (j < square[i].length - 1) {
                    sb.append("\t");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                numbers.add(square[i][j]);
            }
        }
        return numbers;
    }

    public void placeValue(int row, int column, int value) {
        this.setValue(row, column, value);
    }
}
