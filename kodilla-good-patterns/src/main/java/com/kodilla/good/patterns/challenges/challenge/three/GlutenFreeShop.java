package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Provider{

    private String name = "GlutenFreeShop";
    private List<Product> listOfProductWeOffer = new ArrayList<>();

    private Product apple = new Product("Apple", 14450);
    private Product banana = new Product("Banana", 991);
    private Product pear = new Product("Pear", 2800);

    public String getName() {
        return name;
    }

    @Override
    public boolean process(Order order) {
        listOfProductWeOffer.add(apple);
        listOfProductWeOffer.add(banana);
        listOfProductWeOffer.add(pear);

        if (apple.getNameOfProduct().equals(order.getNameOfProductToOrder()) && apple.getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            System.out.println("Order is accepted.");
        } else if (banana.getNameOfProduct().equals(order.getNameOfProductToOrder()) && banana.getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            System.out.println("Order is accepted.");
        } else if (pear.getNameOfProduct().equals(order.getNameOfProductToOrder()) && pear.getAmountOfProductInStock() > order.getAmountOfProductToOrder()) {
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + order.getAmountOfProductToOrder() + " " + order.getNameOfProductToOrder() + "s.");
        }

        return true;
    }
}