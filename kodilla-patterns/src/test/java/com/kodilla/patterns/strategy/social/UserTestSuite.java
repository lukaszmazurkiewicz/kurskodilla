package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Doe");
        User sara = new YGeneration("Sara Nah");
        User mark = new ZGeneration("Mark Hamill");

        //When
        String johnShouldUse = john.sharePost();
        System.out.println("John should: " + johnShouldUse);
        String saraShouldUse = sara.sharePost();
        System.out.println("Sara should: " + saraShouldUse);
        String markShouldUse = mark.sharePost();
        System.out.println("Mark should: " + markShouldUse);

        //Then
        Assert.assertEquals("Use [Twitter] account to share your post!", johnShouldUse);
        Assert.assertEquals("Use [Snapchat] account", saraShouldUse);
        Assert.assertEquals("Use [Facebook] account to share your post.", markShouldUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jimmy = new Millenials("Jimmy Rise");

        //When
        String jimmyShouldUse = jimmy.sharePost();
        System.out.println("Jimmy should: " + jimmyShouldUse);
        jimmy.setSharingStrategy(new SnapchatPublisher());
        jimmyShouldUse = jimmy.sharePost();
        System.out.println("Now " + jimmyShouldUse);

        //Then
        Assert.assertEquals("Use [Snapchat] account", jimmyShouldUse);
    }
}
