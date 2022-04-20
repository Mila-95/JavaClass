package com.syntax.Class33;

public class Math {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void divide(int a, int b) {
       /* if(b!=0) {
            System.out.println(a / b);
        }else{
            System.out.println("You are trying divide by zero whitchn is not posible");
    } */

        try {
            System.out.println(a / b);
        } catch (ArithmeticException are) {
            System.out.println("You are trying divide by zero whiten is not possible");
        }catch (NullPointerException npe){
            System.out.println("Please initialize to avoid this exception");
        }
    }
}