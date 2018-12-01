package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop implements Provider{

    private String name = "ExtraFoodShop";
    private List<Product> listOfProductWeOffer = new ArrayList<>();

    private Product carrot = new Product("Carrot", 10000);
    private Product cabbage = new Product("Cabbage", 980);
    private Product onion = new Product("Onion", 2550);

    private boolean condition = false;

    public boolean isCondition() {
        return condition;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        listOfProductWeOffer.add(carrot);
        listOfProductWeOffer.add(cabbage);
        listOfProductWeOffer.add(onion);

        for (Product product : listOfProductWeOffer) {
            if (product.getNameOfProduct().equals(order.getNameOfProductToOrder())) {
                condition = product.getAmountOfProductInStock() > order.getAmountOfProductToOrder();
            }
        }

        return condition;
    }
}
