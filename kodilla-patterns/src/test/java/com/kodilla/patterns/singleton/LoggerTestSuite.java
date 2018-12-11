package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("Test Message");
        //When
        String testLog = Logger.getInstance().getLastLog();
        System.out.println("Last saved log: " + testLog);
        //Then
        Assert.assertEquals("Test Message", testLog);
    }
}
