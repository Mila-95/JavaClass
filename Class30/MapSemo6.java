package com.syntax.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",105.5);
        fruitMap.put("Kiwi",16.5);
        fruitMap.put("Mango",20.0);
        System.out.println(fruitMap.keySet()); //print  all keys
        System.out.println(fruitMap.values()); //print  all values
        System.out.println(fruitMap.entrySet());//print  all keys and values

        //getting keys and values in the form of array(Map.Entry)
        Iterator< Map.Entry<String,Double>> iterator=fruitMap.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println("*****");
            System.out.println(iterator.next());
            System.out.println(iterator.next().getKey());
            System.out.println(iterator.next().getValue());
        }

    }
}
