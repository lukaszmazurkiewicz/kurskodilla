package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("Onion")
                .bun("Sesame")
                .ingredient("Mushrooms")
                .ingredient("Olives")
                .burgers(3)
                .ingredient("Lettuce")
                .sauce("Ketchup")
                .ingredient("Bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals("Sesame", bigmac.getBun());
        Assert.assertEquals("Ketchup", bigmac.getSauce());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals(5, howManyIngredients);

    }
}
