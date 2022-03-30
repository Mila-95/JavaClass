package com.syntax.class27;

import java.util.LinkedList;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();

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

    }

    public void add(int i) {
    }
}