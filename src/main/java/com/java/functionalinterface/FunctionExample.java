package com.java.functionalinterface;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,String> value = t->t*10+" You have a value";
        System.out.println(value.apply(2));
    }
}
