package com.syntax.Class30;

import java.util.HashMap;
import java.util.Map;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",105.5);
        fruitMap.put("Kiwi",16.5);
        fruitMap.put("Mango",20.0);
        //Entry.Set is a box inside we have boxes with keys and values
        System.out.println(fruitMap.entrySet()); //method that return object and keys as a single entity

        for(Map.Entry<String,Double> entry:fruitMap.entrySet()){ //print in a loop all keys and values
            System.out.println(entry);
            System.out.println("-------");
            System.out.println(entry.getKey()); //will print all keys in loop
            System.out.println("*********");
            System.out.println(entry.getValue());//will print values only in the loop
        }


    }
}
