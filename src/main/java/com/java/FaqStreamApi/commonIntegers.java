package com.java.FaqStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class commonIntegers {
    public static void main(String[] args) {


        List<Integer> list1 = Arrays.asList(77, 98, 2, 24, 52);


        List<Integer> list2 = Arrays.asList(77, 98, 20, 2, 1);
        List<Integer> commonElements = list1.stream().filter(elements->list2.contains(elements)).collect(Collectors.toList());
        System.out.println(commonElements);
    }



}
