package com.test.Sorts;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int[] arr) {
        int  i = 0;

        while (i < arr.length) {

            int correctI = arr[i] - 1;

            if (arr[i] != arr[correctI]) {

                swap(arr,i, correctI);
            } else {

                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {

        int temp = arr[first];

        arr[first] = arr[second];

        arr[second] = temp;
    }
}
