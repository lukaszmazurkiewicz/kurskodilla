package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        System.out.println("Witaj w grze Papier, Nożyce, Kamień!");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj proszę swoję imię: ");
        User humanUser = new User(input.nextLine(), 0);
        User computerUser = new User("Titan", 0);
        System.out.println("Witaj " + humanUser.getName() + "! Do ilu wygranych rund chcesz zagrać? ");
        GameplayInfo gameplayInfo = new GameplayInfo(input.nextInt());
        System.out.println("Obsługa gry Papier, Nożyce, Kamień! \nWciśnij 1 aby zagrać Kamień\nWciśnij 2 aby zagrać Papier\nWciśnij 3 aby zagrać Nożyce.");
        System.out.println("Wciśnij \"x\" aby zakończyć grę. \nWciśnij \"n\" aby zacząć grę od nowa.");
        System.out.println("Proszę wybierz swój ruch:");
        while (!end) {
            Scanner input2 = new Scanner(System.in);
            String playerNextMove = input2.nextLine();
            Random random = new Random();
            int computerNextMove = random.nextInt(3) + 1;
            Gameplay gameplay = new Gameplay();
            gameplay.whoWin(playerNextMove, computerNextMove, humanUser, computerUser);
            if (humanUser.getScore() == gameplayInfo.getNumberOfRounds() || computerUser.getScore() == gameplayInfo.getNumberOfRounds()) {
                if(humanUser.getScore() > computerUser.getScore()) {
                    System.out.println("Wygrał " + humanUser.getName() + " Wynik gry: " + humanUser.getScore() + ":" + computerUser.getScore() + "\nKoniec gry!");
                    System.out.println("Teraz możesz zakończyć grę, wciśnij \"x\" lub zacząć od nowa, wciśnij \"n\"");
                    Scanner input3 = new Scanner(System.in);
                    String endGameChoice = input3.nextLine();
                    if (endGameChoice.equals("x")) {
                        end = true;
                    } else if (endGameChoice.equals("n")) {
                        humanUser.setScore();
                        computerUser.setScore();
                        System.out.println("Proszę wybierz swój ruch: ");
                    }
                } else if (computerUser.getScore() > humanUser.getScore()) {
                        System.out.println("Wygrał " + humanUser.getName() + " Wynik gry: " + humanUser.getScore() + ":" + computerUser.getScore() + "\nKoniec gry!");
                        System.out.println("Teraz możesz zakończyć grę, wciśnij \"x\" lub zacząć od nowa, wciśnij \"n\"");
                        Scanner input4 = new Scanner(System.in);
                        String endGameChoice = input4.nextLine();
                        if (endGameChoice.equals("x")) {
                            end = true;
                        } else if (endGameChoice.equals("n")) {
                            humanUser.setScore();
                            computerUser.setScore();
                        }
                    }
            } else if (playerNextMove.equals("x")) {
                end = true;
            } else if (playerNextMove.equals("n")) {
                humanUser.setScore();
                computerUser.setScore();
                System.out.println("Zaczynamy grę od nowa!");
                System.out.println("Proszę wybierz swój ruch: ");
            } else {
                System.out.println("Proszę wybierz swój ruch: ");
            }
        }
    }
}
