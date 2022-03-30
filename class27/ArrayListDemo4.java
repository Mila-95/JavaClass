package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
        fruits.add("Soap");
        fruits.add("pillow");
       fruits.add("Milk");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Onion");
        vegetables.add("Carrot");

        ArrayList<String> groceries=new ArrayList<>();
           groceries.addAll(fruits);
           groceries.addAll(vegetables);
        System.out.println(groceries);

    }
}
