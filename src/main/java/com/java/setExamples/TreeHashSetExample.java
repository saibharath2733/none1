package com.java.setExamples;

import java.util.Set;
import java.util.TreeSet;

public class TreeHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(6);
        set.add(2);
        set.add(8);
        for (int n: set){
            System.out.println(n);
        }

    }
}
