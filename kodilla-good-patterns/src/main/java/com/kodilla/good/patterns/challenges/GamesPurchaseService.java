package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class GamesPurchaseService implements PurchaseService {
    @Override
    public boolean purchase(User user, Product product, LocalDateTime purchaseDate) {
        if (product.amountOfProduct > 0) {
            return true;
        } else {
            return false;
        }
    }
}
