package com.test.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiAL {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        // Initialization
        for (int i = 0; i < 4; i++) { // for loop with the number of rows - 1 as condition
            lists.add(new ArrayList<>());
        }


        // Add elements
        for (int row = 0; row < 4; row++) {

            for (int column = 0; column < 4; column++) {

                lists.get(column).add(input.nextInt());
            }
        }

    }
}
