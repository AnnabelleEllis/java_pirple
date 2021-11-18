package com.company;

import java.util.Arrays;

public class DSArray {
    public static void main(String[] args) {
         // Mocking a chess board

        int boardDim = 8;
        char[][] board = new char[boardDim][10];
        boolean isWhite = false;

        System.out.println("Board Length: " + board.length);

        for(int y=0; y < board.length; y++){
            isWhite = !isWhite;
//            System.out.println(board[y].length);

//          The below for loop will be iterating through the individual elements of rows.
//            row y
//            column x
            for (int x = 0; x < board[y].length ; x++) {
                if (isWhite) board[y][x] = 'W';
                if (!isWhite) board[y][x] = 'B';
                isWhite = !isWhite;
            }

        }

        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
}
