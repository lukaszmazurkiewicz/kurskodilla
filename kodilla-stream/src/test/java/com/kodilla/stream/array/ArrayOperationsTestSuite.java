package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] givenNumbers = new int[] {11, 10, 9, 8, 12, 11, 10, 9, 20, 0, 15, 5, 12, 8, 1, 19, 18, 2, 17, 3};
        //When
        double result = ArrayOperations.getAverage(givenNumbers);
        //Then
        Assert.assertEquals(10, result, 0);
    }
}
