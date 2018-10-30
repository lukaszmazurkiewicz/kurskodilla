package com.kodilla.rps;

class Gameplay {

    void whoWin(String playerMove, int computerMove, User playerUser, User computerUser) {

        if (playerMove.equals("1") && computerMove == 1) {
            System.out.println("Wybrałeś Kamień. Komputer wybrał Kamień. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("1") && computerMove == 2) {
            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Papier. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("1") && computerMove == 3) {
            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Kamień. Komputer wybrał Nożyce. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("2") && computerMove == 1) {
            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Papier. Komputer wybrał Kamień. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("2") && computerMove == 2) {
            System.out.println("Wybrałeś Papier. Komputer wybrał Papier. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("2") && computerMove == 3) {
            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Papier. Komputer wybrał Nożyce. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("3") && computerMove == 1) {
            computerUser.addOnePointToScore();
            System.out.println("Wybrałeś Nożyce. Komputer wybrał Kamień. Wygrywa Komputer. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("3") && computerMove == 2) {
            playerUser.addOnePointToScore();
            System.out.println("Wybrałeś Nożyce. Komputer wybrał Papier. Wygrywa " + playerUser.getName() + ". Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else if (playerMove.equals("3") && computerMove == 3) {
            System.out.println("Wybrałeś Nożyce. Komputer wybrał Nożyce. Remis. Człowiek kontra maszyna. Wynik: " + playerUser.getScore() + ":" + computerUser.getScore());
        } else {
            System.out.println("Wciśnięty został nieobsługiwany guzik!");
        }
    }
}
