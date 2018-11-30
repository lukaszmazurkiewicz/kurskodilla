package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve() {

        User user = new User("Łukasz", "Mazurkiewicz");
        LocalDateTime purchaseDate = LocalDateTime.of(2018,11, 28, 20, 30);
        Product product = new Product("Toothbrush", 99);

        return new PurchaseRequest(user, purchaseDate, product);
    }
}
