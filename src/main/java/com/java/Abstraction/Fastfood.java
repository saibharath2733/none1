package com.java.Abstraction;

abstract class Fastfood {
    public String name;

    abstract void Eat();
    public static void main(String[] args){
        Fastfood f1 = new Dosa();
        Fastfood f2 = new Noodles();
        f1.Eat();
        f2.Eat();
    }



}
class Dosa extends Fastfood{
    @Override
    public void Eat(){
        System.out.println("I am eating dosa");
    }

}
class Noodles extends Fastfood{
    @Override
    public void Eat(){
        System.out.println("I am eating Noodles");
    }
}