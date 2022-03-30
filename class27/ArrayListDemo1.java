package com.syntax.class27;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Double> numberList=new ArrayList();//not allowed to use primitives data type
        Double double1=new Double(10.5);
        double number=double1.doubleValue();//unboxing
        Double number2=new Double(number);//boxing
        double number3=10.5;             //autoboxing
        Double number4=number3;         //autoboxing
        number3=number4;               //AutoUnboxing
        String nemw=new String("Hakhan");
        String name4="Hakhan";
    }
}
