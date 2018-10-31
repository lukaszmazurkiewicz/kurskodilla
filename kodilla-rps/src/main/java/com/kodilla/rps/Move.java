package com.kodilla.rps;

public enum  Move {

    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private int number;

    Move(int number) {
        this.number = number;
    }

    static Move of(String input){

        try {
            int value =  Integer.valueOf(input);

            return of(value);

        } catch (NumberFormatException e) {
            throw new RuntimeException("Wrong input for move !!! "+input);
        }
    }

    static Move of(Integer value){
        if(value == 1){
            return Move.ROCK;
        }else if(value == 2){
            return Move.PAPER;
        }else if(value == 3){
            return Move.SCISSORS;
        }else {
            throw new RuntimeException("Wrong type of move !!! "+value);
        }
    }
}
