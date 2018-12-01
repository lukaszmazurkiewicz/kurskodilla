package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop implements Provider{

    private String name = "HealthyShop";
    private List<Product> listOfProductWeOffer = new ArrayList<>();

    private Product cabbage = new Product("Cabbage", 1280);
    private Product onion = new Product("Onion", 450);
    private Product apple = new Product("Apple", 21500);

    private boolean condition = false;

    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        listOfProductWeOffer.add(cabbage);
        listOfProductWeOffer.add(onion);
        listOfProductWeOffer.add(apple);

        if (listOfProductWeOffer.get(0).getNameOfProduct().equals(order.getNameOfProductToOrder()) && listOfProductWeOffer.get(0).getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            condition = true;
            System.out.println("Order is accepted.");
        } else if (listOfProductWeOffer.get(1).getNameOfProduct().equals(order.getNameOfProductToOrder()) && listOfProductWeOffer.get(1).getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            condition = true;
            System.out.println("Order is accepted.");
        } else if (listOfProductWeOffer.get(2).getNameOfProduct().equals(order.getNameOfProductToOrder()) && listOfProductWeOffer.get(2).getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            condition = true;
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + order.getAmountOfProductToOrder() + " " + order.getNameOfProductToOrder() + "s.");
        }
        return condition;
    }
}