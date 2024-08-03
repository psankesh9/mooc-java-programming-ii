public class MagicSquareFactory {
    public MagicSquare createMagicSquare(int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Size must be an odd number.");
        }

        MagicSquare magicSquare = new MagicSquare(size);
        int n = size;
        int row = 0;
        int col = n / 2;
        int num = 1;

        while (num <= n * n) {
            magicSquare.setValue(row, col, num);
            num++;
            int newRow = (row - 1 + n) % n;
            int newCol = (col + 1) % n;
            if (magicSquare.getValue(newRow, newCol) != 0) {
                row = (row + 1) % n;
            } else {
                row = newRow;
                col = newCol;
            }
        }

        return magicSquare;
    }
}
