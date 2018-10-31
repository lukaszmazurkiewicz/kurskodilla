package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {

    private static final Random RADOM = new Random();
    private static boolean end = false;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Witaj w grze Papier, Nożyce, Kamień!");

        System.out.println("Podaj proszę swoję imię: ");

        User humanUser = new User(input.nextLine());
        User computerUser = new User("Titan");

        System.out.println("Witaj " + humanUser.getName() + "! Do ilu wygranych rund chcesz zagrać? ");

        GameplayInfo gameplayInfo = new GameplayInfo(input.nextInt());

        System.out.println("Obsługa gry Papier, Nożyce, Kamień! \nWciśnij 1 aby zagrać Kamień\nWciśnij 2 aby zagrać Papier\nWciśnij 3 aby zagrać Nożyce.");
        System.out.println("Wciśnij \"x\" aby zakończyć grę. \nWciśnij \"n\" aby zacząć grę od nowa.");

        while (!end) {
            System.out.println("Proszę wybierz swój ruch:");
            input = new Scanner(System.in);

            Move playerNextMove = Move.of(input.nextLine());
            Move computerNextMove = Move.of(RADOM.nextInt(3) + 1);

            Gameplay.whoWin(playerNextMove, computerNextMove, humanUser, computerUser);

            if (humanUser.getScore() == gameplayInfo.getNumberOfRounds() || computerUser.getScore() == gameplayInfo.getNumberOfRounds()) {

                if(humanUser.getScore() > computerUser.getScore()) {

                    finishGame(humanUser, computerUser);

                } else if (computerUser.getScore() > humanUser.getScore()) {

                    finishGame(computerUser, humanUser);
                }

            } else if (playerNextMove.equals("x")) {

                end = true;

            } else if (playerNextMove.equals("n")) {
                humanUser.clearScore();
                computerUser.clearScore();
                System.out.println("Zaczynamy grę od nowa!");
            }
        }
    }

    private static void finishGame(User winner, User loser) {
        System.out.println("Wygrał " + winner.getName() + " Wynik gry: " + winner.getScore() + ":" + loser.getScore() + "\nKoniec gry!");
        System.out.println("Teraz możesz zakończyć grę, wciśnij \"x\" lub zacząć od nowa, wciśnij \"n\"");
        Scanner input3 = new Scanner(System.in);
        String endGameChoice = input3.nextLine();
        if (endGameChoice.equals("x")) {
            end = true;
        } else if (endGameChoice.equals("n")) {
            winner.clearScore();
            loser.clearScore();
        }
    }
}
