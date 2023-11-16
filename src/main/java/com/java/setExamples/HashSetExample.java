package com.java.setExamples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        set1.add("Apple");
        for (String fruits : set1){
            System.out.println(fruits);
        }
    }
}
