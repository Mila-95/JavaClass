package com.syntax.class16;

public class StringReverse {
    public static void main(String[] args) {
        String s=new String ("Asgar is great");               //original string
        s.concat("Hahaha");                                         //Add new String HAha to the original string
        System.out.println(s);                                      //print out original string
        System.out.println(s.replace(" ",""));    //print with no spaces

       StringBuilder stringBuilder=new StringBuilder("Asgar is great");
        stringBuilder.append("Haha");                              //Add new String HAha to the original string
        System.out.println(stringBuilder);                         //print out original string
        System.out.println(stringBuilder.reverse());                //reverse sentence
        System.out.println("*********");




    }
}
