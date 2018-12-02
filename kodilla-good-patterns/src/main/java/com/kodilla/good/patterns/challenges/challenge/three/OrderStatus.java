package com.kodilla.good.patterns.challenges.challenge.three;

public class OrderStatus {

    public void statusOfOrder(boolean isOrdered, Order order) {
        if (isOrdered) {
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + order.getAmountOfProductToOrder() + " " + order.getNameOfProductToOrder() + "s.");
        }
    }
}
