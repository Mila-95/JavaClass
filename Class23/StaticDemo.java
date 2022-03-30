package com.syntax.Class23;

public class StaticDemo {

}
class Cat{
    static int noOfLegs=4;
            String name;
            Cat(String name){
                this.name=name;
            }
            public void printInfo(){
                System.out.println(name+" "+noOfLegs);
            }
            public static void Print(){
                //we can't access the instance fields inside static method
                //System.out.println(name+noOfLegs);
               // we cant use instance filed with static methods
                //System.out.println(name);
            }

    public static void main(String[] args) {
        Cat cat=new Cat("Stella");
        cat.Print();
        Cat cat2=new Cat("Nutella");
        cat2.Print();


    }
}
