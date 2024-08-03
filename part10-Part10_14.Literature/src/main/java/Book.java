class Book implements Comparable<Book> {
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    @Override
    public String toString() {
        return this.name + " (recommended for " + this.ageRecommendation + " year-olds or older)";
    }

    @Override
    public int compareTo(Book other) {
        if (this.ageRecommendation != other.ageRecommendation) {
            return Integer.compare(this.ageRecommendation, other.ageRecommendation);
        } else {
            return this.name.compareTo(other.name);
        }
    }
}
