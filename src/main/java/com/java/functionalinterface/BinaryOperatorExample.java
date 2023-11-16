package com.java.functionalinterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> sum = (a,b)->a+b;
        System.out.println(sum.apply(5,6));
    }
}
