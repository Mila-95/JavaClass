package com.syntax.Class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("Apple","Orange","Bananna");
       /* groceries.add("Apple");
        groceries.add("Orange");
        groceries.add("Banana");
        groceries.add("Potato");
        groceries.add("Onion");
        groceries.add("Carrot");*/
        System.out.println(groceries);

        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Apple");
        itemsToBeRemoved.add("Onion");


        System.out.println (groceries.containsAll(itemsToBeRemoved));

      ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(1,100);

        LinkedList<Integer> numbers=new LinkedList<>();
        numbers.add(10);
        numbers.add(12);
        numbers.add(130);
        numbers.add(40);
        numbers.add(50);
        numbers.add(1,100);
        System.out.println(numbers);

    }
}
