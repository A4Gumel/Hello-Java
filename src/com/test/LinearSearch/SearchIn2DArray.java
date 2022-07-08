package com.test.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {29, 56, 78, 90},
                {57, 79,  45},
                {34, 23, 12, 99, 87}
        };

        int target = 12;

        System.out.println(Arrays.toString(search2D(arr, target)));
        System.out.println(maxIn2D(arr));
    }

    static int[] search2D(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] == target) {

                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static int maxIn2D(int[][] arr) {

        int max = Integer.MIN_VALUE;

        if (arr.length == 0) {

            return max;
        }


        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                if (arr[row][col] > max) {

                    max = arr[row][col];
                }
            }
        }

        return max;
    }


}
