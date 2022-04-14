package com.syntax.Class16;



public class Task3Task4 {
    public static void main(String[] args) {

        //You have a String a="Is it saturday?"
        //Is it raining? Do we have a Java Class today?”
        //How would you find out how many sentences are in that String?

        String a="Is it saturday?  Is it raining? Do we have a Java Class today?";
        System.out.println(a.length());                  // check number of character in class
        System.out.println(a.split("[?]").length);//check length number of elements

        //How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

        StringBuilder str=new StringBuilder("This is sentence i want to reverse");
        System.out.println(str.reverse());



    }
}
