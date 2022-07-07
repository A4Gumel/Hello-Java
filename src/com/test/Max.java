package com.test;

import java.util.Arrays;

import static com.test.Swap.swap;

public class Max {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 18, 9, 10};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
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

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
