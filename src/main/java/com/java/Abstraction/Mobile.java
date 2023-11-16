package com.java.Abstraction;



abstract class Mobile {
    public String name;

    abstract void Sim();
    public static void main(String[] args){
        Mobile s1 = new Jio();
        Mobile s2 = new Vodafone();
        s1.Sim();
        s2.Sim();

    }



}
class Jio extends Mobile{
    @Override
    public void Sim(){
        System.out.println("I am using jio mobile");
    }

}
class Vodafone extends Mobile{
    @Override
    public void Sim(){
        System.out.println("I am using vodafone mobile");
    }
}