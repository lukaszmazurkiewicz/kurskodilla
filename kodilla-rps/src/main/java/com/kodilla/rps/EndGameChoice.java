package com.kodilla.rps;

public enum EndGameChoice {
    ENDGAME("x"),
    NEWGAME("n"),
    TAK("t");

    private String choice;

    EndGameChoice(String choice) {
        this.choice = choice;
    }

    static EndGameChoice of(String text) {
        if (text.equals("x")) {
            return EndGameChoice.ENDGAME;
        } else if (text.equals("n")) {
            return EndGameChoice.NEWGAME;
        } else if (text.equals("t")) {
            return EndGameChoice.TAK;
        } else {
            throw new RuntimeException("Zły Wybór");
        }
    }
}
