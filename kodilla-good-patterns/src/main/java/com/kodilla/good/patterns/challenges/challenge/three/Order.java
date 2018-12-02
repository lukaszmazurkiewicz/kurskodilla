package com.kodilla.good.patterns.challenges.challenge.three;

public class Order {

    private String nameOfProductToOrder;
    private int amountOfProductToOrder;

    public Order(String nameOfProductToOrder, int amountOfProductToOrder) {
        this.nameOfProductToOrder = nameOfProductToOrder;
        this.amountOfProductToOrder = amountOfProductToOrder;
    }

    public String getNameOfProductToOrder() {
        return nameOfProductToOrder;
    }

    public int getAmountOfProductToOrder() {
        return amountOfProductToOrder;
    }
}
