package com.test;

public class Max {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 13, 14, 15};

        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxVal = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxVal) {

                maxVal = arr[i];
            }
        }

        return maxVal;
    }
}
