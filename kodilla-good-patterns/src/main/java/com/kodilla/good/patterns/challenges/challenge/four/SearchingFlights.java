package com.kodilla.good.patterns.challenges.challenge.four;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SearchingFlights {

    private static final FlightsList FLIGHTS_LIST = new FlightsList();

    public List<Flight> flightsFromAirport(String airport) {

        return FLIGHTS_LIST.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsToAirport(String airport) {

        return FLIGHTS_LIST.getFlightsList().stream()
                .filter(f -> f.getArrivalAirport().equals(airport))
                .collect(Collectors.toList());
    }

    public Optional<Flight> flightsFromAToBAirportDirectly(String startingAirport, String endingAirport) {
        return FLIGHTS_LIST.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(startingAirport))
                .filter(f -> f.getArrivalAirport().equals(endingAirport))
                .findAny();
    }

    public void flightsFromAToBAirport(String startingAirport, String endingAirport){

        System.out.println("Search from "+startingAirport+" to "+endingAirport);
        Optional<Flight> directFlight = flightsFromAToBAirportDirectly(startingAirport, endingAirport);

        if(directFlight.isPresent()){
            System.out.println("Direct flight available ");
            System.out.println(directFlight.get());

            return;
        }

        List<Flight> flightsFromA = flightsFromAirport(startingAirport);
        List<Flight> flightsToB = flightsToAirport(endingAirport);

        List<String> flightsToDepartureAirport = flightsToB.stream()
                .map(Flight::getDepartureAirport)
                .collect(Collectors.toList());

        System.out.println("\nResults: ");
        Flight flightOne = flightsFromA.stream()
                .filter(a -> flightsToDepartureAirport.contains(a.getArrivalAirport()))
                .findFirst()
                .orElseThrow(FlightNotFoundException::new);

        System.out.println("Flight one "+flightOne);
        Flight flightTwo = flightsToB.stream()
                .filter(a -> a.getDepartureAirport().equals(flightOne.getArrivalAirport()))
                .findFirst()
                .orElseThrow(FlightNotFoundException::new);
        System.out.println("Flight two "+flightTwo);

    }
}