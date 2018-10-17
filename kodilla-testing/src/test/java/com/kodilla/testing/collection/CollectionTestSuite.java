package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

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
        List<Integer> evenOnly = oddNumbersExterminator.exterminate(testArray);
        //Then
        Assert.assertEquals(0, evenOnly.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> testArray = new ArrayList<>();
        for (int i = 0; i<20; i++) {
            testArray.add(i);
        }
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> evenOnly = oddNumbersExterminator.exterminate(testArray);
        //Then
        for (int n = 0; n < evenOnly.size(); n++) {

            Assert.assertEquals(0, evenOnly.get(n) % 2);

        }
    }
}
