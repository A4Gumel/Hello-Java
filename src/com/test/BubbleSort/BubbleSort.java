package com.test.BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {6, 5, 4, 3, 7, 2, 1, 8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            // for each item, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {

                // swap if item is less than previous item
                if (arr[j] < arr[j - 1]) {

                    //swap

                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                }

            }
        }
    }
}
