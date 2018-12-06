package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    private static final double DELTA = 0.0001;
    @Test
    public void CalculatorTestSuite() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultOfAdd = calculator.add(2.10,3.34);
        double resultOfSub = calculator.sub(5.4,2.25);
        double resultOfMul = calculator.mul(2.2, 3.1);
        double resultOfDiv = calculator.div(7.6, 3.1);
        //Given
        Assert.assertEquals(5.44, resultOfAdd, DELTA);
        Assert.assertEquals(3.15, resultOfSub, DELTA);
        Assert.assertEquals(6.82, resultOfMul, DELTA);
        Assert.assertEquals(2.45161, resultOfDiv, DELTA);
    }
}
