package com.syntax.class20;

public class Frog {

    String name;
    String colours;
    int age;
    double weight;
    public Frog(String name,String colours, int age){
this.name=name;
this.colours=colours;
this.age=age;
//double weight=20;
weight=10;
    }

    public Frog(String name, String colours, int age, double weight) {
       //this()should be the first line inside the methods
        //this(name,colours,age);
        this( name, colours, age);
        this.weight = weight;
    }

    void printInfo(){
        //this ()not allowed to use inside the method
        //this(name,colours,age);
        System.out.println(name+" "+colours+" "+age+" "+weight);

    }
}
