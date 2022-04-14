package com.syntax.Class30;

import java.util.HashSet;
import java.util.Set;

public class Entry {
    String key;
    Double value;
    public Entry(String key, Double value) {
        this.key = key;
        this.value = value;
    }

   String getKey(){
        return key;
   }
   Double getValue(){
        return value;
   }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
class Test {
    public static void main(String[] args) {


        Set<Entry> entries=new HashSet<>();
        entries.add(new Entry("Apple",12.0));
        entries.add(new Entry("Mango",15.0));
        entries.add(new Entry("Banana",18.0));
        entries.add(new Entry("Kiwi",12.0));
        System.out.println(entries);
        for(Entry b:entries){
            System.out.println(b);
            System.out.println(b.getKey()); //print just key
            System.out.println(b.getValue());//print just values
        }
    }
}