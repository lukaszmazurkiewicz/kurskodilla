package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgressList;

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }
}
