package com.java.FaqStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(25,44,56,27,82,91,66,54,31);
        System.out.println(list.stream().filter(n->n%2==0).collect(Collectors.toList()));

    }
}
