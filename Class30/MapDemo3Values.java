package com.syntax.Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo3Values {
    public static void main(String[] args) {
        HashMap<String,Double> fruitMap=new HashMap<>();
        fruitMap.put("Apple",20.0);
        fruitMap.put("Banana",10.2);
        fruitMap.put("Orange",105.5);
        fruitMap.put("Kiwi",16.5);
        fruitMap.put("Mango",20.0);

        //to print all values
        Collection<Double> value=fruitMap.values();//we use collection
        System.out.println(value);

        Iterator<Double> iterator=value.iterator();//use iterator because we will change size of hashMap
        while(iterator.hasNext()){
            if(iterator.next()>=20){
                iterator.remove();
            }
        }
        System.out.println(fruitMap);
    }
}
