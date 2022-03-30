package com.syntax.class26;

import com.sun.deploy.net.MessageHeader;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionnsDemo1 {
    public static void main(String[] args) {
        String name="Yasgul";
        String name2="Farah";

        //Not scalable if we have to store large amount of data
        //Arrays can ce good option to tackle this problem
        String [] names={"Yaxgul","Andrew"};
      //  names[2]="Tefur";
        String[] names2=new String[100];
        names2[0]="Elena";
        names2[0]="Andrew";
        System.out.println(Arrays.toString(names2));
       // ArrayList<String> syntaxStudents=new ArrayList<>();
        // <> diamond operator
        // String data type


    }
}
