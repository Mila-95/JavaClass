package com.syntax.Class16;

public class Task1Task2 {
    public static void main(String[] args) {

        //Create a String that will hold a sentence. Write a program to get a new String without any spaces.

        String str="Hello World";
        System.out.println(str.replace(" ",""));


        //Create a String that should be combination of letters, numbers and special characters.
        //Find out how many Alphanumeric characters are there in the String.

        String str1="1234!@#$%esdfAZSX123";
        System.out.println(str1.length());
        System.out.println(str1.replaceAll("[^A-Za-z0-9]","").length()); //method changing ^not
                                                                                         // calling multiply
                                                                                       //  methods on the same line

    }

}
