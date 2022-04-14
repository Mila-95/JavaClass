package com.syntax.Class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",105.5);
        fruitMap.put("Kiwi",16.5);
        fruitMap.put("Mango",10.2);
        fruitMap.put("Banana",12.5); //Duplicate values are overwritten it will print last duplicate value
        System.out.println(fruitMap);

        System.out.println(fruitMap.get("kiwi")); //case sensitive

        System.out.println(fruitMap.remove("Mango"));//remove method
        System.out.println(fruitMap);

        System.out.println(fruitMap.containsKey("Kiwi"));
        System.out.println(fruitMap.containsKey("Camel"));
        System.out.println(fruitMap.containsValue(20.0));

        System.out.println(fruitMap.isEmpty());
        System.out.println(fruitMap.size());

        fruitMap.replace("Banana",50.0); //replase banana to 50.0
        System.out.println(fruitMap);
    }
}
