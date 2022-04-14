package com.syntax.Class30;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*Create a map of a building. Store floor number and it is associated company name.
 (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map */
public class Task1 {
    public static void main(String[] args) {
        HashMap<Integer,String> flor=new HashMap<>();
        flor.put(1,"Google");
        flor.put(2,"Syntax");
        flor.put(3,"Pentagon");
        flor.put(4,"Police");
        flor.put(5,"Offices");
        flor.put(6,"Lawyer");
        flor.put(7,"Groceries");

        System.out.println(flor.size());

        flor.replace(4,"Fasebook");//replace
        System.out.println(flor);

        flor.remove(7,"Groceries");
        System.out.println(flor);











    }
}
