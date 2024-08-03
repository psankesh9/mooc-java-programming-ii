public class Customer {
    private String name;
    private String address;
    private String email;

    // Constructor
    public Customer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to get customer details
    public String getDetails() {
        return "Name: " + name + ", Address: " + address + ", Email: " + email;
    }

    // Main method for testing
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", "123 Main St", "john.doe@example.com");
        System.out.println(customer.getDetails());
    }
}
