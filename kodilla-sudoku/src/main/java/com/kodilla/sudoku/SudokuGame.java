package com.kodilla.sudoku;

public class SudokuGame {

    public static void main(String[] args) {
        SudokuGameplay sudokuGameplay = new SudokuGameplay();

        boolean gameFinished = false;
        while(!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            SudokuBoard board = new SudokuBoard();

            startingBoard(board);
            sudokuGameplay.resolvingSudoku(board);

            System.out.println(board);
            gameFinished = theGame.resolveSudoku();
        }
    }

    public static void startingBoard(SudokuBoard board) {

        board.getSudokuBoard().get(0).getRow().get(1).setValue(2);
        board.getSudokuBoard().get(0).getRow().get(3).setValue(5);
        board.getSudokuBoard().get(0).getRow().get(5).setValue(1);
        board.getSudokuBoard().get(0).getRow().get(7).setValue(9);
        board.getSudokuBoard().get(1).getRow().get(0).setValue(8);
        board.getSudokuBoard().get(1).getRow().get(3).setValue(2);
        board.getSudokuBoard().get(1).getRow().get(5).setValue(3);
        board.getSudokuBoard().get(1).getRow().get(8).setValue(6);
        board.getSudokuBoard().get(2).getRow().get(1).setValue(3);
        board.getSudokuBoard().get(2).getRow().get(4).setValue(6);
        board.getSudokuBoard().get(2).getRow().get(7).setValue(7);
        board.getSudokuBoard().get(3).getRow().get(2).setValue(1);
        board.getSudokuBoard().get(3).getRow().get(6).setValue(6);
        board.getSudokuBoard().get(4).getRow().get(0).setValue(5);
        board.getSudokuBoard().get(4).getRow().get(1).setValue(4);
        board.getSudokuBoard().get(4).getRow().get(7).setValue(1);
        board.getSudokuBoard().get(4).getRow().get(8).setValue(9);
        board.getSudokuBoard().get(5).getRow().get(2).setValue(2);
        board.getSudokuBoard().get(5).getRow().get(6).setValue(7);
        board.getSudokuBoard().get(6).getRow().get(1).setValue(9);
        board.getSudokuBoard().get(6).getRow().get(4).setValue(3);
        board.getSudokuBoard().get(6).getRow().get(7).setValue(8);
        board.getSudokuBoard().get(7).getRow().get(0).setValue(2);
        board.getSudokuBoard().get(7).getRow().get(3).setValue(8);
        board.getSudokuBoard().get(7).getRow().get(5).setValue(4);
        board.getSudokuBoard().get(7).getRow().get(8).setValue(7);
        board.getSudokuBoard().get(8).getRow().get(1).setValue(1);
        board.getSudokuBoard().get(8).getRow().get(3).setValue(9);
        board.getSudokuBoard().get(8).getRow().get(5).setValue(7);
        board.getSudokuBoard().get(8).getRow().get(7).setValue(6);

    }

    private boolean resolveSudoku() {
        return true;
    }
}
