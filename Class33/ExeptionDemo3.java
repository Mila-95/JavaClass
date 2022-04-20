package com.syntax.Class33;

public class ExeptionDemo3 {
    public static void main(String[] args) {
        System.out.println("0");

        try {
            System.out.println("1");

            System.out.println(10 / 0);
            System.out.println("2");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("4");
    }
}