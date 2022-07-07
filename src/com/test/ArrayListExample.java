package com.test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(4);

        arrayList.add(89);
        arrayList.add(78);
        arrayList.add(56);
        arrayList.add(43);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(4);

        arrayList.remove(arrayList.size() -1);
        System.out.println(arrayList);
    }
}
