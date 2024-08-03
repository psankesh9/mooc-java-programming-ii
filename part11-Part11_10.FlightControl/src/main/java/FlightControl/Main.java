// Main.java
package FlightControl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl flightControl = new FlightControl();

        while (true) {
            System.out.println("Airport Asset Control");
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("x")) {
                break;
            }

            switch (command) {
                case "1":
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    System.out.print("Give the airplane capacity: ");
                    int capacity = Integer.parseInt(scanner.nextLine());
                    flightControl.addAirplane(id, capacity);
                    break;
                case "2":
                    System.out.print("Give the airplane id: ");
                    String airplaneId = scanner.nextLine();
                    System.out.print("Give the departure airport id: ");
                    String departure = scanner.nextLine();
                    System.out.print("Give the target airport id: ");
                    String destination = scanner.nextLine();
                    flightControl.addFlight(airplaneId, departure, destination);
                    break;
            }
        }

        while (true) {
            System.out.println("Flight Control");
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String command = scanner.nextLine();

            if (command.equals("x")) {
                break;
            }

            switch (command) {
                case "1":
                    for (Airplane airplane : flightControl.getAirplanes().values()) {
                        System.out.println(airplane);
                    }
                    break;
                case "2":
                    for (Flight flight : flightControl.getFlights().values()) {
                        System.out.println(flight);
                    }
                    break;
                case "3":
                    System.out.print("Give the airplane id: ");
                    String id = scanner.nextLine();
                    Airplane airplane = flightControl.getAirplanes().get(id);
                    if (airplane != null) {
                        System.out.println(airplane);
                    }
                    break;
            }
        }
    }
}
