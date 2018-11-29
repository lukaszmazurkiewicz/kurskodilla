package com.kodilla.good.patterns.challenges.challenge.two;

import java.time.LocalDateTime;

public interface PurchaseService {

    boolean purchase(User user, Product product, LocalDateTime purchaseDate);

}
