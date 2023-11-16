package com.java.test;

public class TestSave {
    public static void main(String[] args){
        Shape s1 = new Square();
        System.out.println(s1.area(5));

    }
}
abstract class Shape{
    abstract double area(int a);
}
class Square extends Shape{


    @Override
    double area(int a) {
        return a*a;

    }
}
