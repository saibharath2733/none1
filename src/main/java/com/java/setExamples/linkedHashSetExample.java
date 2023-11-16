package com.java.setExamples;

import java.util.LinkedHashSet;

public class linkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        for(int n:set){
            System.out.println(n);
        }
    }
}
