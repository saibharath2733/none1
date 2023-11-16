package com.java.Inheritance;

public class Parent {
    String name;
    int money;
    public void ParentName(String name){
        System.out.println("Name of the parent is:"+name);

    }
    public void ParentMoney(int money){
        System.out.println("Total money parent has is:"+money);
    }
    public static void main(String[] args) {

        Parent obj1 = new Parent();
        Son obj2 = new Son();
        GrandSon obj3 = new GrandSon();
        obj1.ParentName("Reddy");
        obj1.ParentMoney(1000);
        obj2.SonName("Arjun");
        obj2.SonMoney(15000);
        obj2.ParentMoney(16000);
        obj3.GrandName("Ravi");
        obj3.ParentMoney(15000);
        obj3.SonMoney(129090);

    }
}
class Son extends Parent{
    public void SonName(String name){
        System.out.println("Name of the son is:"+name);
    }
    public void SonMoney(int money){
        System.out.println("Total money son has is:"+money);
    }

    @Override
    public void ParentMoney(int money) {
        System.out.println("Money son has after taking from parent:"+money);
    }
}