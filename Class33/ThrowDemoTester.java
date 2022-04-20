package com.syntax.Class33;

import org.apache.poi.ss.formula.functions.T;

public class ThrowDemoTester {
    public static void main(String[] args) {
        ThrowDemo throwDemo=new ThrowDemo();
        try{
            throwDemo.setBalance(-15);
        }catch(Exception e){
           e.printStackTrace();
        }
    }
}



