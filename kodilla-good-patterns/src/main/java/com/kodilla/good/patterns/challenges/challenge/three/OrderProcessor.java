package com.kodilla.good.patterns.challenges.challenge.three;

public class OrderProcessor {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        HealthyShop healthyShop = new HealthyShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        OrderStatus orderStatus = new OrderStatus();

        OrderRequest orderRequest = new OrderRequest();
        Order orderOne = orderRequest.orderOne();
        Order orderTwo = orderRequest.orderTwo();
        Order orderThree = orderRequest.orderThree();

        System.out.println("Order from " + ExtraFoodShop.SHOP_NAME + ": ");
        orderStatus.statusOfOrder(extraFoodShop.process(orderOne), orderOne);
        orderStatus.statusOfOrder(extraFoodShop.process(orderTwo), orderTwo);
        orderStatus.statusOfOrder(extraFoodShop.process(orderThree), orderThree);


        System.out.println("Order from " + HealthyShop.SHOP_NAME + ": ");
        orderStatus.statusOfOrder(healthyShop.process(orderOne), orderOne);
        orderStatus.statusOfOrder(healthyShop.process(orderTwo), orderTwo);
        orderStatus.statusOfOrder(healthyShop.process(orderThree), orderThree);

        System.out.println("Order from " + GlutenFreeShop.SHOP_NAME + ": ");
        orderStatus.statusOfOrder(glutenFreeShop.process(orderOne), orderOne);
        orderStatus.statusOfOrder(glutenFreeShop.process(orderTwo), orderTwo);
        orderStatus.statusOfOrder(glutenFreeShop.process(orderThree), orderThree);
    }

}
