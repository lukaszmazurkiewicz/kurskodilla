package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        System.out.println("Witaj w grze Papier, Nożyce, Kamień!");
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj proszę swoję imię: ");
        User humanUser = new User(input.nextLine(), 0);
        System.out.println("Witaj " + humanUser.getName() + "! Do ilu wygranych rund chcesz zagrać? ");
        GameplayInfo gameplayInfo = new GameplayInfo(input.nextInt());
        System.out.println("Obsługa gry Papier, Nożyce, Kamień! \nWciśnij 1 aby zagrać Kamień\nWciśnij 2 aby zagrać Papier\nWciśnij 3 aby zagrać Nożyce.");
        System.out.println("Wciśnij \"x\" aby zakończyć grę. \nWciśnij \"n\" aby zacząć grę od nowa.");

    }
}
