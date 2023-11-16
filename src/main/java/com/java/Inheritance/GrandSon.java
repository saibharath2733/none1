package com.java.Inheritance;

public class GrandSon extends Son{
    public void GrandName(String name){
        System.out.println("Name of the grand son is:"+name);

    }
    @Override
    public void ParentMoney(int money){
        System.out.println("Money i have after getting form grandparent is:"+money);
    }
    @Override
    public void SonMoney(int money){
        System.out.println("Money i have after getting from parent is:"+money);
    }

}
