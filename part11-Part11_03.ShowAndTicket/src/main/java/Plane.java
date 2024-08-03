public class Plane {
    private String ID;
    private String model;
    private int yearOfIntroduction;

    // Constructor
    public Plane(String ID, String model, int yearOfIntroduction) {
        this.ID = ID;
        this.model = model;
        this.yearOfIntroduction = yearOfIntroduction;
    }

    // Getter and Setter methods
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIntroduction() {
        return yearOfIntroduction;
    }

    public void setYearOfIntroduction(int yearOfIntroduction) {
        this.yearOfIntroduction = yearOfIntroduction;
    }

    // Method to get plane details
    public String getDetails() {
        return "ID: " + ID + ", Model: " + model + ", Year of Introduction: " + yearOfIntroduction;
    }
}
