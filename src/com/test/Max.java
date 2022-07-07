package com.test;

public class Max {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 13, 14, 15};

        System.out.println(max(arr));
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
}
