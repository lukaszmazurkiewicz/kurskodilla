package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface PurchaseService {

    boolean purchase(User user, Product product, LocalDateTime purchaseDate);

}
