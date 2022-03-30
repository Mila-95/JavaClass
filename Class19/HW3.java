package com.syntax.Class19;

public class HW3 {
    String bookName;
    double price;
    public HW3(){
        System.out.println("No argument");
    }
    public HW3(String bookName,double price){
        this();
        this.bookName=bookName;
        this.price=price;
        System.out.println("Two argument constructor");
    }
}
