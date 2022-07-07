package com.test;

public class Amstrong {

    public static void main(String[] args) {

        int a = 153;
        int org = a;
        int sum = 0;

        while(a > 0) {

            int rem = a % 10;

            sum += cubeNumber(rem);

            a = a / 10;
        }

        System.out.println(sum);

        System.out.println(sum == org);

    }

    private static int cubeNumber(int rem) {

        return rem * rem * rem;
    }
}
