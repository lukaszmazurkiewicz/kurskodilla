package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public class GamesPurchaseRepository implements PurchaseRepository{
    @Override
    public boolean createPurchase(User user, Product product, LocalDateTime purchaseDate) {
        return true;
    }
}
