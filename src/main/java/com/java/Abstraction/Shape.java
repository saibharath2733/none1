package com.java.Abstraction;

abstract class Shape {
    abstract double area(double radius);



}
class Circle extends Shape{
    public double radius;




    @Override
    public double area(double radius){
        return Math.PI * radius * radius;

    }
}
