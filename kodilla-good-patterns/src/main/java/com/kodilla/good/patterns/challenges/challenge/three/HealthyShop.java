package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Provider{

    public static final String SHOP_NAME = "HealthyShop";

    private Map<String,Integer> productsWeOffer;

    public HealthyShop() {
        productsWeOffer = new HashMap<>();
        productsWeOffer.put("Cabbage", 1280);
        productsWeOffer.put("Onion", 450);
        productsWeOffer.put("Apple", 21500);
    }

    public static String getShopName() {
        return SHOP_NAME;
    }

    @Override
    public boolean process(Order order) {
        String productToOrder = order.getNameOfProductToOrder();
        int amount = order.getAmountOfProductToOrder();

        if(not(productsWeOffer.containsKey(productToOrder))) {
            return false;
        }

        return productsWeOffer.get(productToOrder) > amount;
    }

    private static boolean not(boolean value) {
        return !value;
    }
}