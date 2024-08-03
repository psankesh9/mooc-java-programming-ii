public class Program {
    public static void main(String[] args) {
        MagicSquareFactory factory = new MagicSquareFactory();
        MagicSquare magicSquare = factory.createMagicSquare(3);
        System.out.println(magicSquare);

        System.out.println("Sums of rows: " + magicSquare.sumsOfRows());
        System.out.println("Sums of columns: " + magicSquare.sumsOfColumns());
        System.out.println("Sums of diagonals: " + magicSquare.sumsOfDiagonals());
    }
}
