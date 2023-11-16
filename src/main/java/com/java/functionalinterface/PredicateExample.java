package com.java.functionalinterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> compareLength = str->str.length()>5;
        System.out.println(compareLength.test("Bharath"));
        Predicate<Integer> name = obj->obj==5;
        System.out.println(name.test(6));

    }
}
