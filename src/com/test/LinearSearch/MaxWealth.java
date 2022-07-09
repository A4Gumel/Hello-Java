package com.test.LinearSearch;

public class MaxWealth {

    public static void main(String[] args) {

        int[][] accounts = {
                {1,5},
                {7, 3},
                {3, 5}
        };

        System.out.println(findMaxWealth(accounts));

    }

    static int findMaxWealth(int[][] accounts) {

        int ans = 0;

        for (int person = 0; person < accounts.length; person++) {

            int sum = 0;

            for (int account = 0; account < accounts[person].length; account++) {

                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
