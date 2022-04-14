package com.syntax.Class27;

import java.util.Arrays;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
    int[] arr={10,20,30};
    int[] arr2=new int[5];
    arr2[0]=10;
    arr2[1]=20;
    arr2[2]=30;
    List <Integer> list= Arrays.asList(10,20,30);
        System.out.println(list);


       // List<Integer> list2=new ArrayList <>(Arrays.asList(10,20,30));
       // list2.add(40);
       // System.out.println(list2);
    }
}