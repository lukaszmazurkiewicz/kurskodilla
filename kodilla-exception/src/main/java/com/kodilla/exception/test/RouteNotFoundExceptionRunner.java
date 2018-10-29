package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        Flight flight1 = new Flight("Heathrow", "JFK Airport");
        Flight flight2 = new Flight("Modlin Airport", "Ławica Poznań Airport");
        Flight flight3 = new Flight("LA International Airport", "Warsaw Chopin Airport");

        SearchingFlights searchingFlights = new SearchingFlights();

        try {
            searchingFlights.findFlight(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("You did something wrong.");
        } finally {
            System.out.println("You may check another flight.");
        }

        try {
            searchingFlights.findFlight(flight2);
        } catch (RouteNotFoundException e) {
            System.out.println("You did something wrong.");
        } finally {
            System.out.println("You may check another flight.");
        }

        try {
            searchingFlights.findFlight(flight3);
        } catch (RouteNotFoundException e) {
            System.out.println("You did something wrong.");
        } finally {
            System.out.println("You may check another flight.");
        }


    }
}
