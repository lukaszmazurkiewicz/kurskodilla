package com.kodilla.rps;

public class User {

    private static final int INITIAL_SCORE = 0;

    private String name;
    private int score = INITIAL_SCORE;

    public User(String name) {
        this.name = name;
    }

    public void clearScore(){
        score = INITIAL_SCORE;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int addOnePointToScore() {
        return score++;
    }
}
