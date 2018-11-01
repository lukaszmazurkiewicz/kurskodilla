package com.kodilla.rps;

import org.junit.*;

public class UserTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {

        System.out.println("Start Testing: ");
    }

    @AfterClass
    public static void afterAllTests() {

        System.out.println("The end of all tests.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Test nr " + testCounter);
    }
    @After
    public void afterEveryTest() {

        System.out.println("End of test nr " + testCounter);
    }
    @Test
    public void getNameOfUserTest() {
        //Given
        User user = new User("Tomek");
        //When
        String result = user.getName();
        //Then
        Assert.assertEquals("Tomek", result);
    }
    @Test
    public void getScoreOfUserTest() {
        //Given
        User user = new User("Maciek");
        user.addOnePointToScore();
        //When
        int result = user.getScore();
        //Then
        Assert.assertEquals(1, result);
    }
    @Test
    public void clearScoreOfUserTest() {
        //Given
        User user = new User("Janek");
        //When
        user.clearScore();
        int result = user.getScore();
        //Then
        Assert.assertEquals(0, result);
    }

}
