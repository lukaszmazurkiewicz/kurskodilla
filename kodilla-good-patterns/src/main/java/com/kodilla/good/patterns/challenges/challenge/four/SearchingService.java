package com.kodilla.good.patterns.challenges.challenge.four;

public class SearchingService {

    public static void main(String[] args) {
        SearchingFlights searchingFlights = new SearchingFlights();

        System.out.println("We found following flights from Warsaw Airport: ");
        searchingFlights.flightsFromAirport("Warszawa");

        System.out.println("We found following flights to Poznań Airport");
        searchingFlights.flightsToAirport("Poznań");

        System.out.println("We found following flights from Warsaw to Poznań Airport");
        searchingFlights.flightsFromAToBAirport("Warszawa", "Poznań");
    }
}
