package com.java.ListExamples;

import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);

        for(int n : list2){
            System.out.println(n);
        }
        list2.remove(1);
        for (int n:list2){
            System.out.println(n);
        }

    }
}
