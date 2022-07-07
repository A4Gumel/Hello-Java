package com.test;

public class LinearSearch {

    public static void main(String[] args) {

        int[] nums = { 8, 5, 6, 3, 4, 9, 1};
        int target = 99;
        System.out.println(linearSearch(nums, target));
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));

    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index
            if (arr[i] == target) {
                return arr[i];
            }

        }

        // This will execute if none of the above statements have executed
        //hence target not found
        return Integer.MAX_VALUE;

    }

    // search in the array: return the index if item found else -1
    static int linearSearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }

        // This will execute if none of the above statements have executed
        //hence target not found
        return -1;

    }

    // Search with for each
    static int linearSearch3(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int element : arr) {
            //check for element at every index
            if (element == target) {
                return element;
            }

        }

        // This will execute if none of the above statements have executed
        //hence target not found
        return Integer.MAX_VALUE;

    }
}
