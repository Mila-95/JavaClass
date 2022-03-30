package com.syntax.class17;

public class DogAny {
    //when the information is expected to be different from object
    //we stored that information in an instance variable
    String name;   //instance
    String color;// instance
    //if we know that a value will stay same for all objects of a class
    //we create a static variable for that why because
     static int legs;     //static
    void eat() {
        int noOftime = 3; //local
        System.out.println(name + " eats " + noOftime);
    }
    void aleep(){
        //System.out.println(name+"sleeping"+noOftime);//can access  local variable in other methods
    }

    public static void main(String[] args) {
        DogAny dog=new DogAny(); //local
        dog.name="scooby";
        dog.color="Pink";
        DogAny.legs= 6;
        dog.eat();

        DogAny dog2=new DogAny();
        dog2.name="tommy";
        dog2.color="Navi blue";
        System.out.println(DogAny.legs);
        dog.eat();
    }

}
