package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public class GamesPurchaseService implements PurchaseService {
    @Override
    public boolean purchase(User user, Product product, LocalDateTime purchaseDate) {

        return product.getAmountOfProduct() > 0;

    }
}
