package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int resultOfAdd = calculator.add(12, 5);

        if (resultOfAdd == 17) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        int resultOfSubstact = calculator.substract(9,7);

        if (resultOfSubstact == 3) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
        System.out.println("wow");
    }
}