package com.java.MapExamples;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"sai");
        map.put(6,"jahnavi");
        map.put(8,"Abc");
        for (Map.Entry<Integer,String> map1 : map.entrySet()){
            System.out.println(map1.getKey()+"--"+map1.getValue());
        }

    }
}
