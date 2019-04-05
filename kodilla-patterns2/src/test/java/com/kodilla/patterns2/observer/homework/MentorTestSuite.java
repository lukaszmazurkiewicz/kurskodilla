package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Student johnSmith = new JohnSmith();
        Student aliceCooper = new AliceCooper();
        Mentor martinJones = new Mentor("Martin Jones");
        Mentor eveNing = new Mentor("Eve Ning");
        johnSmith.registerObserver(eveNing);
        aliceCooper.registerObserver(martinJones);
        aliceCooper.registerObserver(eveNing);

        //When
        johnSmith.addTask("Task 28.1");
        johnSmith.addTask("Task 28.2");
        johnSmith.addTask("Task 30.1");
        aliceCooper.addTask("2.3");
        aliceCooper.addTask("2.4");
        aliceCooper.addTask("3.1");

        //Given
        assertEquals(3, martinJones.getUpdateCount());
        assertEquals(6, eveNing.getUpdateCount());
    }


}