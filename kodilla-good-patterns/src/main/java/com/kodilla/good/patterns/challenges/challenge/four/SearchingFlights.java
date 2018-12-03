package com.kodilla.good.patterns.challenges.challenge.four;


import java.util.List;
import java.util.stream.Collectors;

public class SearchingFlights {

    public void flightsFromAirport(String airport) {

        FlightsList flightsList = new FlightsList();
        List<Flight> flightsFromAirport = flightsList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());

        flightsFromAirport.stream()
                .forEach(System.out::println);
    }

    public void flightsToAirport(String airport) {

        FlightsList flightsList = new FlightsList();
        List<Flight> flightsToAirport = flightsList.getFlightsList().stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());

        flightsToAirport.stream()
                .forEach(System.out::println);
    }

}
