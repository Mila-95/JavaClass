package com.syntax.class18;

public class Task3 {
    //Create a method that will accept a String as a parameter and
    // return a new String that consist only of vowels.
    //Method should be available inside the class
    // only where it was declared and executed by calling it is name.

    /*Static methods can access other static methods and fileds
     without needing an object of that class or that classname id they are same class
     */


    private  static String onlyVowes(String input){
        String newStr=input.replaceAll("[^aeiouAEIOU]"," ");
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(onlyVowes("Emily"));
    }
}
