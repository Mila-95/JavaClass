package com.syntax.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo7 {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",105.5);
        fruitMap.put("Kiwi",16.5);
        fruitMap.put("Mango",20.0);

       Iterator<Map.Entry<String,Double>> iterator= fruitMap.entrySet().iterator();
       while(iterator.hasNext()){
           //getting the entries from Itretor
           Map.Entry<String ,Double> entry=iterator.next();
           //getting the keys and values from the entry object
           if(entry.getKey().endsWith("e") || entry.getValue()>=20){
               iterator.remove();
           }
       }
        System.out.println(fruitMap);
    }
}
