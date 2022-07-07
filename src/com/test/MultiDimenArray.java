package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArray {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        Scanner input = new Scanner(System.in);
        System.out.println(arr.length);


        // Taking input from user
        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = input.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));

//        // Output
//        for (int row = 0; row < arr.length; row++) {
//
//            for (int col = 0; col < arr[row].length; col++) {
//
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }


//        // another output
//        for (int row = 0; row < arr.length; row++) {
//
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // another output
        for (int[] row: arr) {

            System.out.println(Arrays.toString(row));
        }

    }
}
