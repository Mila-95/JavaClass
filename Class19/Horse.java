package com.syntax.Class19;

public class Horse {
    //it is very good practice to make fields private
    private String name;
    private int age;
    private double weight;
    /*No argument/zero argument constructor
    Horse(){
   wright some important line of code that you want to execute
   whet the object of class are created for example
    you might want to fetch some info internet or from your
     hard disc to give initial values to the fileds
     }
  */

    //purpose of constructor is to gave values to the fields
    // of class
Horse (String horseName,int horseAge, double horseWeight){
    name=horseName;
    age=horseAge;
    weight=horseWeight;

}
/*
1)Rule #1
constructor dont have return type like
int String not even void
Horse (String horseName,int horseAge, double horseWeight){
    name=horseName;
    age=horseAge;
    weight=horseWeight;
    */
    /*Rule #2)
    name of the constructor should be same as name of the class
    Horse (String horseName,int horseAge, double horseWeight){
    name=horseName;
    age=horseAge;
    weight=horseWeight;

     */
    void printHorseName() {
        System.out.println("name" + name);
    }

    void setName(String horseName) {
            name=horseName;
    }
}