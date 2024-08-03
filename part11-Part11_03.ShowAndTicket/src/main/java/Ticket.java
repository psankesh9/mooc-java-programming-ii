
public class Ticket {
    private int seat;
    private int code;
    private Show show; // Reference to the Show class

    // Constructor
    public Ticket(int seat, int code, Show show) {
        this.seat = seat;
        this.code = code;
        this.show = show;
    }

    // Getter and Setter methods
    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    // Method to get ticket details
    public String getDetails() {
        return "Seat: " + seat + ", Code: " + code + ", Show: [" + show.getDetails() + "]";
    }
}
