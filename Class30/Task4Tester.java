package com.syntax.Class30;

import java.util.Map;
import java.util.TreeMap;

public class Task4Tester {
    public static void main(String[] args) {
        TreeMap<String,Person> personTreeMap=new TreeMap<>();
    personTreeMap.put("a",new Person("Saifur","Alam",45,150000));
    personTreeMap.put("b",new Person("Gylnar","A",16,140000));
    personTreeMap.put("c",new Person("MrA","B",22,130000));
    personTreeMap.put("d",new Person("Nasir","A",27,170000));

    for(Map.Entry<String ,Person> p:personTreeMap.entrySet()){
        System.out.println(p);
    }

    }
}
