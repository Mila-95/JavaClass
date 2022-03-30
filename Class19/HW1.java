package com.syntax.Class19;
/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside same class;
2 - from outside the class;
 3 - from different class inside different package  and observe result.
*/
public class HW1 {

     private HW1(){
         System.out.println("Private");
     }
     HW1(double a){
        System.out.println("Default");
    }
      protected  HW1(String a){
          System.out.println("protected");
     }
      public HW1(boolean a){
    System.out.println("public");
}

    public static void main(String[] args) {
        new HW1();
        new HW1("Haha");
        new HW1(10.2);
        new HW1(false);
    }
}
