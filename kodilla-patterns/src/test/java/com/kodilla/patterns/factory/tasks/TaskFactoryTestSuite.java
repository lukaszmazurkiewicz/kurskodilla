package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        //Then
        Assert.assertEquals("Buy Fruits", shoppingTask.getTaskName());
        Assert.assertEquals("Trying to Bought: Banana", shoppingTask.executeTask());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        //Then
        Assert.assertEquals("Paint Room", paintingTask.getTaskName());
        Assert.assertEquals("Trying to paint: Walls", paintingTask.executeTask());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTest() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        Assert.assertEquals("Drive Home", drivingTask.getTaskName());
        Assert.assertEquals("Trying to drive to: Poznań", drivingTask.executeTask());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());

    }
}
