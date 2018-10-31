package com.kodilla.rps;

class Gameplay {

    static void whoWin(Move playerMove, Move computerMove, User playerUser, User computerUser) {

        if (playerMove == Move.ROCK && computerMove == Move.ROCK) {
            System.out.println("Wybrałeś Kamień. Komputer wybrał Kamień. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.ROCK && computerMove == Move.PAPER) {

            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Papier. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.ROCK && computerMove == Move.SCISSORS) {

            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Nożyce. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.PAPER && computerMove == Move.ROCK) {

            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Papier. Komputer wybrał Kamień. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.PAPER && computerMove == Move.PAPER) {

            System.out.println("Wybrałeś Papier. Komputer wybrał Papier. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.PAPER && computerMove == Move.SCISSORS) {

            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Papier. Komputer wybrał Nożyce. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.SCISSORS && computerMove == Move.ROCK) {

            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Nożyce. Komputer wybrał Kamień. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.SCISSORS && computerMove == Move.PAPER) {

            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Nożyce. Komputer wybrał Papier. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else if (playerMove == Move.SCISSORS && computerMove == Move.SCISSORS) {

            System.out.println("Wybrałeś Nożyce. Komputer wybrał Nożyce. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());

        } else {

            System.out.println("Wciśnięty został nieobsługiwany guzik!");
        }
    }
}
