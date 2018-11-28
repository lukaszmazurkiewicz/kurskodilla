package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseRepository {

    boolean createPurchase(User user, Product product, LocalDateTime purchaseDate);

}
