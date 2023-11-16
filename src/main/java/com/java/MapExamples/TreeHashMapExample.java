package com.java.MapExamples;

import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        map.put("Bharath",1);
        map.put("Abc",8);
        map.put("Jahnavi",6);
        for (Map.Entry<String,Integer> map1 : map.entrySet()){
            System.out.println(map1.getKey()+"--"+map1.getValue());
        }
    }
}
