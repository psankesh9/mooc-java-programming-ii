/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;


import java.util.HashMap;
import java.util.Map;

public class FlightControl {
    private Map<String, Airplane> airplanes;
    private Map<String, Flight> flights;

    public FlightControl() {
        airplanes = new HashMap<>();
        flights = new HashMap<>();
    }

    public void addAirplane(String id, int capacity) {
        airplanes.put(id, new Airplane(id, capacity));
    }

    public void addFlight(String airplaneId, String departure, String destination) {
        Airplane airplane = airplanes.get(airplaneId);
        if (airplane != null) {
            Flight flight = new Flight(airplane, departure, destination);
            flights.put(airplaneId + "-" + departure + "-" + destination, flight);
        }
    }

    public Map<String, Airplane> getAirplanes() {
        return airplanes;
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }
}
