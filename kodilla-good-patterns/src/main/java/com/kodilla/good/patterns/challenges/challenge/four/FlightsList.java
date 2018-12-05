package com.kodilla.good.patterns.challenges.challenge.four;

import java.util.ArrayList;
import java.util.List;

public class FlightsList {
    private List<Flight> flightsList;

    public FlightsList() {
        flightsList = new ArrayList<>();

        flightsList.add(new Flight("Warszawa", "Gdańsk"));
        flightsList.add(new Flight("Poznań", "Warszawa"));
        flightsList.add(new Flight("Wrocław", "Poznań"));
        flightsList.add(new Flight("Gdańsk", "Wrocław"));
        flightsList.add(new Flight("Radom", "Warszawa"));
        flightsList.add(new Flight("Łódź", "Radom"));
        flightsList.add(new Flight("Kraków", "Poznań"));
        flightsList.add(new Flight("Warszawa", "Łódź"));
        flightsList.add(new Flight("Poznań","Berlin"));
        flightsList.add(new Flight("Berlin", "Warszawa"));
        flightsList.add(new Flight("Wrocław", "Kraków"));
        flightsList.add(new Flight("Łódź", "Szczecin"));
        flightsList.add(new Flight("Gdańsk", "Poznań"));
        flightsList.add(new Flight("Warszawa", "Poznań"));
    }

    public List<Flight> getFlightsList() {
        return flightsList;
    }
}