package com.java.FaqStreamApi;

import java.util.Arrays;
import java.util.List;

public class toUpperCase {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sai","bharath","a");
        list.stream().map(S->S.toUpperCase()).forEach(n-> System.out.println(n));
    }
}
