package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        world.continents();
        //When
        BigDecimal result = world.getPeopleQuantity();
        //Then
        BigDecimal expected = new BigDecimal("1999999998");
        Assert.assertEquals(expected, result);
    }
}
