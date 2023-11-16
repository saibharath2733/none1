package com.java.functionalinterface;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> getValue = ()->Math.random();
        System.out.println(getValue.get());
    }
}
