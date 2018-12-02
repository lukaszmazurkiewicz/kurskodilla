package com.kodilla.good.patterns.challenges.challenge.three;

public class OrderRequest {

    public Order orderOne() {
        return new Order("Apple", 20000);
    }

    public Order orderTwo() {
        return new Order("Pear", 2500);
    }

    public Order orderThree() {
        return new Order("Onion", 1000);
    }
}
