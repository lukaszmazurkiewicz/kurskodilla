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

    /*public void flightsFromAToBAirport(String startingAirport, String endingAirport){
        FlightsList flightsList = new FlightsList();
        List<Flight> flightsFromAToB = flightsList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(startingAirport))
                .filter(f -> f.getArrivalAirport().equals(endingAirport))
                .collect(Collectors.toList());

        flightsFromAToB.stream()
                .forEach(System.out::println);
    }*/

    public void flightsFromAToBAirport(String startingAirport, String endingAirport){
        FlightsList flightsList = new FlightsList();
        List<Flight> flightsFromA = flightsList.getFlightsList().stream()
                .filter(f -> f.getDepartureAirport().equals(startingAirport))
                .collect(Collectors.toList());

        List<Flight> flightsToB = flightsList.getFlightsList().stream()
                .filter(f -> f.getArrivalAirport().equals(endingAirport))
                .collect(Collectors.toList());

        List<Flight> flightsFromAToB = flightsFromA.stream()
                .filter(f -> f.getDepartureAirport().contains(flightsToB.get()))


        //System.out.println(flightsFromA.stream().anyMatch(f -> flightsToB.contains(startingAirport)));

        /*List<Flight> flightsFromAToB = flightsFromA.stream()
                .map(f -> f.getArrivalAirport())
                .map(flightsToB -> flightsToB.equals(f))*/
        /*flightsFromA.stream()
                .forEach(System.out::println);

        flightsToB.stream()
                .forEach(System.out::println);
*/
    }

}
