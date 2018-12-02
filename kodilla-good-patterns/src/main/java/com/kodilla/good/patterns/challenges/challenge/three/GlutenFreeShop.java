package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Provider{

    public static final String SHOP_NAME = "GlutenFreeShop";

    private Map<String, Integer> productsWeOffer;

    public GlutenFreeShop() {
        productsWeOffer = new HashMap<>();
        productsWeOffer.put("Apple", 14450);
        productsWeOffer.put("Banana", 991);
        productsWeOffer.put("Pear", 2800);
    }

    public static String getShopName() {
        return SHOP_NAME;
    }

    @Override
    public boolean process(Order order) {

        String productToOrder = order.getNameOfProductToOrder();
        int amount = order.getAmountOfProductToOrder();

        if (not(productsWeOffer.containsKey(productToOrder))) {
            return false;
        }

        return productsWeOffer.get(productToOrder) > amount;
    }

    private static boolean not(boolean value) {
        return !value;
    }
}