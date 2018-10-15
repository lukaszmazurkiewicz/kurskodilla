package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Begin of test");
    }
    @After
    public void after() {
        System.out.println("End of test");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(testArray);
        //Then
        Assert.assertEquals(0, oddNumbersExterminator);
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<>();
        for (int i = 0; i<20; i++) {
            testArray.add(i+1);
        }
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        oddNumbersExterminator.exterminate(testArray);
        //Then
        for (int i = 0 ; i < testArray.size(); i++) {

            Assert.assertEquals(oddNumbersExterminator.m % 2,0 );

        }
    }
}
