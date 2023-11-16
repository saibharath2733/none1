package com.java.FaqStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupingCountingExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello world","Java Programming");
        Map<Integer,Long> word = list.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        word.forEach((length,count)-> System.out.println(length+"letters"+count+"words"));
    }
}
