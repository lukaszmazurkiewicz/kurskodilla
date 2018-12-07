package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList1 = board.getToDoList();
        taskList1.getTasks().add("Fly to the vacation!");
        TaskList taskList2 = board.getInProgressList();
        taskList2.getTasks().add("Drive to the Airport");
        TaskList taskList3 = board.getDoneList();
        taskList3.getTasks().add(("Pack your stuff."));
        //Then
        Assert.assertEquals("Fly to the vacation!", taskList1.getTasks().get(0));
        Assert.assertEquals("Drive to the Airport", taskList2.getTasks().get(0));
        Assert.assertEquals("Pack your stuff.", taskList3.getTasks().get(0));
    }
}
