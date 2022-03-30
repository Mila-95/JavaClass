package com.syntax.Class21;

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }
}
class Parent{
    String color="Black";
}
class Child extends Parent{
    String color="Red";
    void printColor(){
        String color="Green";
        //refers to the local variable
        System.out.println(color);      //brind the color from char
        //refers to instance variable
        System.out.println(this.color);
        //refers to parent variable
        System.out.println(super.color);//bring the color from super class
    }
}