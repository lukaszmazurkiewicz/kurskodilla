package com.kodilla.good.patterns.challenges.challenge.four;

public class FlightNotFoundException extends RuntimeException {

    public FlightNotFoundException() {
        super("Flight not found");
    }
}