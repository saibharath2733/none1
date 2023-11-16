package com.java.MapExamples;

import java.util.HashMap;
import java.util.Map;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Bharath",1);
        map.put("jahnavi",12);
        map.put("ABC",2);
        for (Map.Entry<String,Integer> map1 : map.entrySet()){
            System.out.println(map1.getKey()+" "+map1.getValue());

        }
    }
}
