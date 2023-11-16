package com.java.Hierarchy;

public class GrandParent {
    public int getAge() {
        System.out.println("The age of grandpa is:"+age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public String name;


    public void GrandPaName(String name){
        System.out.println("Name is:"+name);
    }

    public static void main(String[] args){

    }
}
class Parent extends GrandParent{
    private int age;
    public void ParentName(String name) {
        System.out.println("Name of the parent is:"+name);
    }
    @Override
    public void setAge(int age){


    }
    @Override
    public int getAge(){
        return age;

    }


}
class Grandson extends GrandParent{
    @Override
    public void GrandPaName(String name){
        System.out.println("The original name is:"+name);
    }
}
