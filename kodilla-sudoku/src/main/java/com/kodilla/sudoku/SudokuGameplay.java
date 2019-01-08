package com.kodilla.sudoku;

public class SudokuGameplay {

    public void resolvingSudoku(SudokuBoard board) {

        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            for (int j = 0; j < SudokuBoard.NUMBER_OF_ROWS; j++) {
                if (board.getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {

                    SudokuChecks.isOk(board, i, j);
                    System.out.println(board.getSudokuBoard().get(i).getRow().get(j).getElements());
                    System.out.println(board.getSudokuBoard().get(i).getRow().get(j).getElements().get(0));
                    /*board.getSudokuBoard().get(i).getRow().get(j)
                            .setValue(board.getSudokuBoard().get(i).getRow().get(j).getElements().get(0));*/
                    int valueToSet = board.getSudokuBoard().get(i).getRow().get(j).getElements().get(0);
                    board.getSudokuBoard().get(i).getRow().get(j).setValue(valueToSet);
                }
            }
        }

    }
}
