package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask("Buy Fruits", "Banana", 101);
            case PAINTING_TASK:
                return new PaintingTask("Paint Room", "Green", "Walls");
            case DRIVING_TASK:
                return new DrivingTask("Drive Home", "Poznań", "Car");
            default:
                return null;
        }
    }
}
