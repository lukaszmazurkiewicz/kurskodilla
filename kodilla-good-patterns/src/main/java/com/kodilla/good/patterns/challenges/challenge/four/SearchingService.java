package com.kodilla.good.patterns.challenges.challenge.four;

import java.util.List;

public class SearchingService {

    public static void main(String[] args) {
        SearchingFlights searchingFlights = new SearchingFlights();

        System.out.println("We found following flights from Wrocław Airport: ");
        searchingFlights.flightsFromAirport("Wrocław").stream()
                .forEach(System.out::println);

        System.out.println("\nWe found following flights to Radom Airport");
        searchingFlights.flightsToAirport("Radom").stream()
                .forEach(System.out::println);

        System.out.println("\nWe found following flights from Warsaw to Poznań Airport");
        searchingFlights.flightsFromAToBAirport("Warszawa", "Poznań");
    }
}
