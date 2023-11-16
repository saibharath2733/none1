package com.java.FaqStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatMapExample {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("abc","def","ghi");
        List<Character> unqcharacters = lists.stream().flatMap(list -> list.chars().mapToObj(c -> (char) c)).distinct().collect(Collectors.toList());
        System.out.println(unqcharacters);
    }
}
