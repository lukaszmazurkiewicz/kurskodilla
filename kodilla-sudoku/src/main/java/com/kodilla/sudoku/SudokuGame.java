package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard board = new SudokuBoard();
            System.out.println(board);
            gameFinished = theGame.resolveSudoku();
        }
    }

    private boolean resolveSudoku() {
        return true;
    }
}
