package com.syntax.Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class Task3 {
    public static void main(String[] args) {
        HashMap<Integer,String > bestBuy=new HashMap<>();
        bestBuy.put(789,"Printer");
        bestBuy.put(7898,"Camera");
        bestBuy.put(789987,"TV");
        bestBuy.put(789987,"TV");
        Iterator<Map.Entry<Integer,String >> iterator=bestBuy.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
