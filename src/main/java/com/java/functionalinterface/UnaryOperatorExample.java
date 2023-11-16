package com.java.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> uno = i->i*i;
        System.out.println(uno.apply(5));

    }
}
