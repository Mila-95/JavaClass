package com.syntax.Class29;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Recap2 {
    public static void main(String[] args) {
        ArrayList<String > arrayList=new ArrayList<>();
        arrayList.add("B");
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("C");
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>(arrayList);//insertion order
        System.out.println(linkedHashSet);

        TreeSet<String> treeSet=new TreeSet<>(arrayList);//will store alphabetically
        System.out.println(treeSet);

        //remove duplicate and maintain(Store) in insertion order
        arrayList.clear();                //removing all the original elements
        arrayList.addAll(linkedHashSet); //adds all unique with the insertion order
        System.out.println("Array");
        System.out.println(arrayList);

    }
}
