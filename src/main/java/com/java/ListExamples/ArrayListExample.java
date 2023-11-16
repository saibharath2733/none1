package com.java.ListExamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        for(int n:list1){
            System.out.println(n);
        }
    }
}
