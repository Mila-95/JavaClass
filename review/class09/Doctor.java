package com.syntax.review.class09;

 class Doctor {
    //instatce variable-decleared inside the class but outside of any method constructor or block
    String firstName,lastName,speciality;

     //instatce variable-decleared inside the class but outside of any method constructor or block
    static String hospital="Jorje Washhington";

    //static methods can be access only static members
   static  void work(){
        System.out.println("All doctor work at "+hospital);
    }
    //constructor- initializing instance variables
    Doctor(String firstName,String lastName){
       this.firstName=firstName;
       this.lastName=lastName;
    }
    //we can have multiple constructors by overloading them
    Doctor(String firstName,String lastName,String speciality){
        this(firstName,lastName);
        this.speciality=speciality;
    }

    //non  static nethods can be access static members
      void work1(){
          System.out.println("All doctor work at "+hospital);

          /*static method cannot access non static members
     static void printInfo(){
        System.out.println("Doctor"+firstName+" "+lastName+" is a "+speciality);
    } */

     }
}
