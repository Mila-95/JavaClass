package com.syntax.Class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Task5 {
    /*
   Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
                     John Smith=$100000
     */
    public static void main(String[] args) {

        HashMap<String,Integer> map= new HashMap<>();
        map.put("Asel",150000);
        map.put("Oskar",154000);
        map.put("Mire",160000);
        map.put("Olena",170000);

        String name=null;
        int salary=0;
 for(Map.Entry<String,Integer> entry:map.entrySet()){
     if(entry.getValue()>salary){
         salary=entry.getValue();
         name=entry.getKey();
     }
        }
        System.out.println(name+ " = " + salary);



        }
    }

