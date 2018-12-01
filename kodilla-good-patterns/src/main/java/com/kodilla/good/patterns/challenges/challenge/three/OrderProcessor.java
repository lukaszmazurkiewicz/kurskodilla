package com.kodilla.good.patterns.challenges.challenge.three;

public class OrderProcessor {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderRequest orderRequest = new OrderRequest();
        Order orderOne = orderRequest.orderOne();
        Order orderTwo = orderRequest.orderTwo();
        Order orderThree = orderRequest.orderThree();

        System.out.println("Order from " + extraFoodShop.getName() + ": ");
        extraFoodShop.process(orderOne);
        if (extraFoodShop.isCondition()) {
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + orderOne.getAmountOfProductToOrder() + " " + orderOne.getNameOfProductToOrder() + "s.");
        }
        extraFoodShop.process(orderTwo);
        if (extraFoodShop.isCondition()) {
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + orderTwo.getAmountOfProductToOrder() + " " + orderTwo.getNameOfProductToOrder() + "s.");
        }
        extraFoodShop.process(orderThree);
        if (extraFoodShop.isCondition()) {
            System.out.println("Order is accepted.");
        } else {
            System.out.println("We don't have in stock " + orderThree.getAmountOfProductToOrder() + " " + orderThree.getNameOfProductToOrder() + "s.");
        }

        System.out.println("Order from " + healthyShop.getName() + ": ");
        healthyShop.process(orderOne);
        healthyShop.process(orderTwo);
        healthyShop.process(orderThree);

        System.out.println("Order from " + glutenFreeShop.getName() + ": ");
        glutenFreeShop.process(orderOne);
        glutenFreeShop.process(orderTwo);
        glutenFreeShop.process(orderThree);
    }

}
