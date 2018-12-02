package com.kodilla.good.patterns.challenges.challenge.three;

import java.util.HashMap;
import java.util.Map;

public class ExtraFoodShop implements Provider{

    public static final String SHOP_NAME = "ExtraFoodShop";

    private Map<String, Integer> productsWeOffer;

    public ExtraFoodShop() {
        productsWeOffer = new HashMap<>();
        productsWeOffer.put("Carrot", 10_000);
        productsWeOffer.put("Cabbage", 980);
        productsWeOffer.put("Onion", 2_550);
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
