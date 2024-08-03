import java.util.Objects;

public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }

        SimpleDate compared = (SimpleDate) object;

        return this.day == compared.day &&
               this.month == compared.month &&
               this.year == compared.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    public static void main(String[] args) {
        SimpleDate d1 = new SimpleDate(1, 2, 2000);
        SimpleDate d2 = new SimpleDate(1, 2, 2000);
        SimpleDate d3 = new SimpleDate(5, 2, 2012);

        System.out.println(d1.equals(d2)); // true
        System.out.println(d1.hashCode() == d2.hashCode()); // true
        System.out.println(d1.hashCode() == d3.hashCode()); // false
    }
}
