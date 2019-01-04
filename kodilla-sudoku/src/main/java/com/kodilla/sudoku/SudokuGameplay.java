package com.kodilla.sudoku;

public class SudokuGameplay {

    public void resolvingSudoku(SudokuBoard board) {

        for (int i = 0; i < SudokuBoard.NUMBER_OF_ROWS; i++) {
            for (int j = 0; j < SudokuBoard.NUMBER_OF_ROWS; j++) {
                if (board.getSudokuBoard().get(i).getRow().get(j).getValue() == SudokuElement.EMPTY) {

                    /*try {
                        sudokuChecks.isOk(board,i,j);
                    } catch (Exception e) {
                        System.out.println(e);
                    }*/
                    SudokuChecks.isOk(board,i,j);
                    //board.getSudokuBoard().get(i).getRow().get(j)
                            //.setValue(board.getSudokuBoard().get(i).getRow().get(j).getElements().get(0));
                    System.out.println(board.getSudokuBoard().get(i).getRow().get(j).getElements());
                }
            }
        }

    }
}
