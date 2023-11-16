package com.java.FaqStreamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sortingExamples {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sai","bharath","samuel");
        List<String> sortedLength = list.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
        System.out.println(sortedLength);
    }
}
