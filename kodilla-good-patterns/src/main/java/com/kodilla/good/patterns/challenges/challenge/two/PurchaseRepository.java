package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public interface PurchaseRepository {

    boolean createPurchase(User user, Product product, LocalDateTime purchaseDate);

}
