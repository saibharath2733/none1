package com.java.Abstraction;





abstract class Animal {
    public String name;

    abstract void Sleeping();
    public static void main(String[] args){
        Animal A1 = new Cat();
        A1.Sleeping();
        Animal A2 = new Dog();
        A2.Sleeping();

    }



}
class Dog extends Animal{
    @Override
    public void Sleeping(){
        System.out.println("Dog is sleeping");
    }

}
class Cat extends Animal{
    @Override
    public void Sleeping(){
        System.out.println("Cat is sleeping");
    }
}