package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTestSuite {

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
    public void zeroPostTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCounter = 0;
        List<String> users = Arrays.asList("Jola","Ola");
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(0, result);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(0, result4);
        Assert.assertEquals(0, result5);
        Assert.assertEquals(0, result6);
    }

    @Test
    public void thousandPostTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int postCounter = 1000;
        List<String> users = Arrays.asList("Jola","Ola");
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(1000, result);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(500, result4);
        Assert.assertEquals(0, result5);
        Assert.assertEquals(0, result6);
    }

    @Test
    public void zeroCommentTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentCounter = 0;
        List<String> users = Arrays.asList("Jola","Ola");
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(0, result);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(0, result4);
        Assert.assertEquals(0, result5);
        Assert.assertEquals(0, result6);
    }

    @Test
    public void thousandCommentTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int commentCounter = 1000;
        List<String> users = Arrays.asList("Jola","Ola");
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.usersNames()).thenReturn(users);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(0, result);
        Assert.assertEquals(1000, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(0, result4);
        Assert.assertEquals(500, result5);
        Assert.assertEquals(0, result6);
    }

    @Test
    public void moreCommentsThanPostsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = Arrays.asList("Jola", "Johny Bravo");
        int commentCounter = 1000;
        int postCounter = 500;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(500, result);
        Assert.assertEquals(1000, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(250, result4);
        Assert.assertEquals(500, result5);
        Assert.assertEquals(2, result6);
    }

    @Test
    public void morePostsThanCommentsTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = Arrays.asList("Jola", "Jarek");
        int commentCounter = 5000;
        int postCounter = 10000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(10000, result);
        Assert.assertEquals(5000, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(5000, result4);
        Assert.assertEquals(2500, result5);
        Assert.assertEquals(0, result6, 1);
    }

    @Test
    public void zeroUserTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = new ArrayList<>();
        int commentCounter = 5000;
        int postCounter = 1000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(commentCounter);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(1000, result);
        Assert.assertEquals(5000, result2);
        Assert.assertEquals(0, result3);
        Assert.assertEquals(0, result4);
        Assert.assertEquals(0, result5);
        Assert.assertEquals(5, result6);
    }

    @Test
    public void hundredUserTest() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> users = Arrays.asList("Ziemowit", "Samuel");
        int postCounter = 1000;
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(postCounter);
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        int result = calculateStatistics.numberOfPosts;
        int result2 = calculateStatistics.numberOfComments;
        int result3 = calculateStatistics.numberOfUsers;
        int result4 = calculateStatistics.averageOfPostsPerUser;
        int result5 = calculateStatistics.averageOfCommentsPerUser;
        int result6 = calculateStatistics.averageOfCommentsPerPost;
        System.out.println(calculateStatistics.showStatistics());
        //Then
        Assert.assertEquals(1000, result);
        Assert.assertEquals(0, result2);
        Assert.assertEquals(2, result3);
        Assert.assertEquals(500, result4);
        Assert.assertEquals(0, result5);
        Assert.assertEquals(0, result6);
    }
}
