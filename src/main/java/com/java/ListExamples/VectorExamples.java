package com.java.ListExamples;

import java.util.List;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("Blue");
        vector.add("Red");
        vector.add("green");
        System.out.println("Second element of the vector is:"+vector.get(1));
    }
}
