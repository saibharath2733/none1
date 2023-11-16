package com.java.Abstraction;

abstract class GrandParent {
    public String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void Name();





    public static void main(String[] args){

    }


}
class Son extends GrandParent{
    @Override
    public void Name() {
        System.out.println("Name of the grandparent is:"+name);

    }





}
