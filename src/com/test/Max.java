package com.test;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 18, 9, 10, 5};

        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 4, arr.length - 1));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];

        for (int i: arr) {

            if (i > maxVal) {

                maxVal = i;
            }
        }

        return maxVal;
    }

    static int maxInRange(int[] arr, int start, int end) {
        int maxVal = arr[start];


        for (int num = start; num <= end; num++) {

            if (arr[num] > maxVal) {

                maxVal = arr[num];
            }
        }

        return maxVal;
    }
}
