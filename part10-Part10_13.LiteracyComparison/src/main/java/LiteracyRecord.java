public class LiteracyRecord implements Comparable<LiteracyRecord> {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyRecord(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender.replace(" (%)", "").trim(); // Remove " (%)" and trim any whitespace
        this.literacyRate = literacyRate;
    }

    @Override
    public int compareTo(LiteracyRecord other) {
        return Double.compare(this.literacyRate, other.literacyRate);  // Ascending order
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }
}
