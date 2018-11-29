package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public class PurchaseRequest {

    private User user;
    private LocalDateTime purchaseDAte;
    private Product product;

    public PurchaseRequest(User user, LocalDateTime purchaseDate, Product product) {
        this.user = user;
        this.purchaseDAte = purchaseDate;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDAte;
    }

    public Product getProduct() {
        return product;
    }

}
