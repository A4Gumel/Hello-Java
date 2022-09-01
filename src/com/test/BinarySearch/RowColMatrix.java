package com.test.BinarySearch;

import java.util.Arrays;

public class RowColMatrix {

    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 51;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] matrix, int target) {
        int col = matrix.length - 1;
        int row = 0;

        while (row < matrix.length && col > 0) {

            if (matrix[row][col] == target) {

                return new int[]{col, row};
            }

            if (matrix[row][col] < target) {

                row++;
            } else {

                col--;
            }
        }

        return new int[]{-1, -1};
    }
}

