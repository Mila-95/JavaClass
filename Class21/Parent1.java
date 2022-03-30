package com.syntax.Class21;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent1 {
    String name = "child";
    void printName() {
        String name="Teyfur"; //first priority is given to local variables
        System.out.println(name);
        System.out.println(this.name); //ignoring the local variable will print "child"
        //when we use this keyword even though we have a local variable java will only bring the values from
        // instance variable
        System.out.println(super.name);//ignoring local and instance will print "parent"
        //when we use super keyword even though we have a local variable and instance variable inside the same class
        //java will only print the values from parent class instance variables
    }
}
class ParentTester{
    public static void main(String[]args){
        Child1 child1=new Child1();
        child1.printName();
    }
}