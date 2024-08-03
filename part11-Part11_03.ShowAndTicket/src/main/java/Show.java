public class Show {
    private String movie;
    private String time;

    // Constructor
    public Show(String movie, String time) {
        this.movie = movie;
        this.time = time;
    }

    // Getter and Setter methods
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    // Method to get show details
    public String getDetails() {
        return "Movie: " + movie + ", Time: " + time;
    }
}
