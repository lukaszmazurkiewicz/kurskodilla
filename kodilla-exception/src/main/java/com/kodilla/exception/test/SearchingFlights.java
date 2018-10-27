package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlights {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> flights = new HashMap<>();

        flights.put("Heathrow", true);
        flights.put("JFK Airport", false);
        flights.put("LAGuardia Airport", true);
        flights.put("Warsaw Chopin Airport", false);
        flights.put("Poznań Ławica Airport", true);

        if (flights.containsKey(flight.getArrivalAirport()) == false || flights.containsKey(flight.getDepartureAirport()) == false) {
            throw new RouteNotFoundException("You cannot book this flight!");
        } else {
            System.out.println("You can book this flight!");
        }
    }
}
