package com.test.LinearSearch;

public class EvenDigits {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};


        System.out.println(findNumbers(nums));
    }

    static int numDigits(int num) {

        //For Negative numbers
        if (num < 0) {

            num *= -1;
        }

        if (num == 0) {

            return 1;
        }

        int count = 0;
        while (num > 0) {

            count ++;
            num /=10;
        }

        return count;
    }

    static boolean isEven(int digits) {

       return  digits % 2 == 0;
    }

    static int findNumbers(int[] nums) {

        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (isEven(numDigits(nums[i]))) {
                ans++;
            }

        }

        return ans;
    }
}
