package com.test.LinearSearch;

import java.util.Arrays;

public class Search2DArray {


    public static void main(String[] args) {

        int[][] arr = {
                {4 ,5, 7, 8},
                {3, 9, 89, 67, 54},
                {45, 34, 32, 12, 14}
        };

        int target = 34;

        System.out.println(arr[0][0]);
        System.out.println(search(arr, target));

    }

    static int search(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {
                    return col;
                }
            }

        }

        return -1;
    }
}
