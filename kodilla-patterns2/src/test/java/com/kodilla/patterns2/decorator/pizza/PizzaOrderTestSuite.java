package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrder() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        System.out.println(cost + " USD");
        System.out.println(description + "\n");

        //Then
        assertEquals(new BigDecimal(15), cost);
        assertEquals("Pizza with cheese and tomato sauce", description);
    }

    @Test
    public void testHamDecorator() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        System.out.println(cost + " USD");
        System.out.println(description + "\n");

        //Then
        assertEquals(new BigDecimal(20), cost);
        assertEquals("Pizza with cheese and tomato sauce and ham", description);

    }

    @Test
    public void testShrimpAndPineAppleDecorator() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new ShrimpDecorator(order);
        order = new PineappleDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        System.out.println(cost + " USD");
        System.out.println(description + "\n");

        //Then
        assertEquals(new BigDecimal(40), cost);
        assertEquals("Pizza with cheese and tomato sauce and shrimp and pineapple", description);
    }

    @Test
    public void testLettuceTomatoAndMushroomAndMushroomDecorator() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new LettuceTomatoDecorator(order);
        order = new MushroomDecorator(order);
        order = new MushroomDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        System.out.println(cost + " USD");
        System.out.println(description + "\n");

        //Then
        assertEquals(new BigDecimal(22), cost);
        assertEquals("Pizza with cheese and tomato sauce and lettuce and tomato and mushrooms and mushrooms", description);
    }

    @Test
    public void testAllDecorators() {
        //Given
        PizzaOrder order = new BasicPizzaOrder();
        order = new HamDecorator(order);
        order = new LettuceTomatoDecorator(order);
        order = new MushroomDecorator(order);
        order = new ShrimpDecorator(order);
        order = new PineappleDecorator(order);

        //When
        BigDecimal cost = order.getCost();
        String description = order.getDescription();

        System.out.println(cost + " USD");
        System.out.println(description + "\n");

        //Then
        assertEquals(new BigDecimal(50), cost);
        assertEquals("Pizza with cheese and tomato sauce and ham and lettuce and tomato and mushrooms and shrimp and pineapple", description);
    }
}