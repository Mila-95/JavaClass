package com.syntax.Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("ASgar Nasir");
        names.add("Muhamed");
        System.out.println(names.get(0));

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1234567889,"Asgar Nasir");
        map.put(123456,"Mohamed");
        System.out.println(map.get(1234567889));

        HashMap <String,String> groseries=new HashMap();
        groseries.put("Lily","Egs, milk,Bread, etc"); //keys is Lily we cannot have 2 Lily cannon duplicate in Map
        groseries.put("Tefur","Camel, Horse,CamelHorse, etc");
        groseries.put("Asgar","MacBook, iphone 13,Apple monitor Stand for 100$, etc");
        System.out.println(groseries.get("Lily"));

    }
}
