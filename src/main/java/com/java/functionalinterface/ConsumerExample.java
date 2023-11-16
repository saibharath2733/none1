package com.java.functionalinterface;

import java.util.function.Consumer;

class Person{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}

public class ConsumerExample {
    public static void main(String[] args) {
        Person obj = new Person();
        Consumer<Person> setName = person -> person.setName("Bharath");
        setName.accept(obj);
        System.out.println(obj.getName());
        Consumer<String> printUpperacse = s -> System.out.println(s.toUpperCase());
        printUpperacse.accept("bharath");

    }
}
