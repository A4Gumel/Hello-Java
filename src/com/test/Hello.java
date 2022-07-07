package com.test;

public class Hello {
    public static void main(String[] args) {

        String name = "Musa";

        greet(name);

        System.out.println(name);
    }

    private static void greet(String name) {
        name = "Tanko";
    }
}
