package com.vibhor.JavaProg;

public class Sudoku_solver {
    public static void main(String[] args) {
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0} };

        System.out.println(solve(board));
    }

    private static boolean solve(int[][] board) {
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean emptyLeft = true;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if(board[r][c] == 0) {
                    row = r;
                    col = c;
                    emptyLeft = false;
                    break;
                }
            }
            // if you found empty element in the row u don't need to check further just break
            if(!emptyLeft) {
                break;
            }
        }

        if(emptyLeft) {
            return true;
        }

        for (int i = 1; i < 10; i++) {
            if(isSafe(board, row, col, i)) {
                board[row][col] = i;
                if(solve(board)) {
                    display(board);
                    System.out.println();
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }

    static void display(int[][] board) {
        for(int[] row: board) {
            for(int element: row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(int[][] board, int row, int col, int number) {

        // check for the row
        for (int c = 0; c < board[0].length; c++) {

            if(board[row][c] == number) {
                return false;
            }
        }

        for(int[] r: board) {
            if(r[col] == number) {
                return false;
            }
        }
        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;
        for (int r = rowStart; r < rowStart+sqrt; r++) {
            for (int c = colStart; c < colStart+sqrt; c++) {
                if(board[r][c] == number) {
                    return false;
                }
            }
        }

        return true;
    }
}
