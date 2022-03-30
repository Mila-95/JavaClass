package com.syntax.class18;

public class Task2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    //Method should be available to all classes within your project and accessible by class name.
    public static String reverseString(String input){
       /* StringBuilder stringBuilder=new StringBuilder(input);
        stringBuilder.reverse();
        return atringBuilder.toString();
        */
       return new StringBuilder(input).reverse().toString();


    }

    public static void main(String[] args) {

        String name="Emily";
        System.out.println(Task2.reverseString(name));

    }
    }
