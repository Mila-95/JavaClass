package com.syntax.Class22;
//Create 1 class with a static method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.
public class Task2 {

    public static void method(String name) {
        System.out.println("1");
    }
    public static void method(boolean bol){
        System.out.println("2");
    }
    public static void method(int number){
        System.out.println("3");
    }

    public static void main(String[] args) {
        method(false);
        method(15);
    }
}