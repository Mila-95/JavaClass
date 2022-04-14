package com.syntax.Class29;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String ,Integer> fruit=new HashMap<>();
        fruit.put("Orange",10);
        fruit.put("Apple",1000);
        fruit.put("Bannana",15);

        Map<String ,Integer> vegetable=new HashMap<>();
        vegetable.put("Potato",4);
        vegetable.put("tomato",10);

        Map<String,Integer> groceris=new HashMap<>();
        groceris.putAll(fruit);
    }
}
