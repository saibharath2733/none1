package com.java.ListExamples;

import java.util.Arrays;
import java.util.List;

public class ArrayaslistExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1,2,3,4);
        for(int n:list1){
            System.out.println(n);
        }
    }
}
