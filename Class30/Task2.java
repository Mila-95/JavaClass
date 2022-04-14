package com.syntax.Class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */
public class Task2 {
    public static void main(String[] args) {
        TreeMap<String,String> countriesAndCapitals=new TreeMap<>();
        countriesAndCapitals.put("Afghanistan","Kabul");
        countriesAndCapitals.put("Russia","Moscow");
        countriesAndCapitals.put("Turkey","Istanbul");
        countriesAndCapitals.put("Ukraine","Kyiv");
        countriesAndCapitals.put("USA","Washington Dc");
       //1Part
        //Print all keys and values from a country map using for each loop and iterator.
        for(Map.Entry<String ,String> entry:countriesAndCapitals.entrySet()){
            System.out.println(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }
        Iterator<Map.Entry<String,String>> iterator= countriesAndCapitals.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String ,String> entry=iterator.next();
            System.out.println(entry);
        }
        //2Part
        //Print all values from a country map using for eac{

     for(String value:countriesAndCapitals.values()){
         System.out.println(value);
     }
     Iterator<String>iterator1=countriesAndCapitals.values().iterator();
     while (iterator.hasNext()){
         System.out.println(iterator1.next());
     }
    }
}
