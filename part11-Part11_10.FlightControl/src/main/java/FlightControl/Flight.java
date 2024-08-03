/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;
// Flight.java
public class Flight {
    private Airplane airplane;
    private String departure;
    private String destination;

    public Flight(Airplane airplane, String departure, String destination) {
        this.airplane = airplane;
        this.departure = departure;
        this.destination = destination;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return airplane.toString() + " (" + departure + "-" + destination + ")";
    }
}
