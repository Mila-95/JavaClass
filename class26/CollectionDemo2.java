package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Iraq");
        countries.add("Gana");
        countries.add("Eritea");
        countries.add("Afganistan");
        System.out.println(countries.get(3));  //3 Iraq
        //System.out.println(countries.get(-1));
       // System.out.println(countries.get(7)); //out of bound
        System.out.println(countries);
        countries.add(3,"Pakistan"); // insert the element at this specified index
        System.out.println(countries);
        System.out.println(countries.size());
        countries.add("PAKISTAN");
        countries.remove("Pakistan"); //removes Pakistan from this list
        System.out.println(countries);
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size());

    }
}
