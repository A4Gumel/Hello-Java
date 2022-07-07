package com.test;

public class SearchInRange {
    public static void main(String[] args) {

        int[] nums = { 8, 5, 6, 3, 4, 9, 1};
        int target = 8;
        System.out.println(linearSearch(nums, target, 0, 7));

    }

    static int linearSearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int i = start; i < end; i++) {
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
}
