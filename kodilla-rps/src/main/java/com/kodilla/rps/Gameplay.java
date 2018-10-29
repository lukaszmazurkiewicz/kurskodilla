package com.kodilla.rps;

public class Gameplay {

    public void whoWin(String playerMove, int computerMove, User playerUser, User computerUser) {

        if (playerMove.equals("1") && computerMove == 1) {
            System.out.println("Wybrałeś Kamień. Komputer wybrał Kamień. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("1") && computerMove == 2) {
            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Papier. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("1") && computerMove == 3) {
            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Nożyce. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("2") && computerMove == 1) {
            playerUser.addOnePointToScore();
        } else if (playerMove.equals("2") && computerMove == 2) {
            System.out.println("remis");
        } else if (playerMove.equals("2") && computerMove == 3) {
            computerUser.addOnePointToScore();
        } else if (playerMove.equals("3") && computerMove == 1) {
            computerUser.addOnePointToScore();
        } else if (playerMove.equals("3") && computerMove == 2) {
            playerUser.addOnePointToScore();
        } else if (playerMove.equals("2") && computerMove == 2) {
            System.out.println("remis");
        } else {
            System.out.println("problem");
        }
    }
}
