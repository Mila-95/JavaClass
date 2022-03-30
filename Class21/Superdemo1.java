package com.syntax.Class21;

public class Superdemo1 {
}
class AAA{
    AAA(){

    }

}
class BBB extends AAA{
    String name;
    BBB(){

    }
    BBB(String name){
        super();
       // this(); we cannot use this() and super() inside the same constructor
        this.name=name;
    }
}