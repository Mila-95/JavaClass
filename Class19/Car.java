package com.syntax.Class19;

public class Car {
    String name="Toyota";
    String make;
    String color;
    String type;
    Car(String name,String make,String color,String type){
    /*
    if we have the same local variables java always prefet
    local variable if you want to instruct java to use instance
    variable we use instance variables we use the "This" keyword
     */
       this.name=name;
       this.make=make;
       this.color=color;
       this.type=type;

    }
    Car(){

    }
    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }
}
