package com.java.Interface;

public interface GrandParent {
    public void Money();
    public static void main(String[] args){
        GrandParent g1 = new Parent();
        GrandParent g2 = new Son();
        g1.Money();
        g2.Money();
    }
}
class Parent implements GrandParent{
    @Override
    public void Money(){
        System.out.println("I have 3000$ money");
    }
}
class Son implements GrandParent{
    @Override
    public void Money(){
        System.out.println("I have 5000$ money");
    }
}
