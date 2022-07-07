package com.test;

import java.util.ArrayList;

public class ColumnNotFixed {

    public static void main(String[] args) {


        int[][] arr =  {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        for (int[] rows : arr) {

            for (int column: rows) {

                System.out.print(column + " ");

            }

            System.out.println();
        }
    }
}
