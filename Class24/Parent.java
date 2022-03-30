package com.syntax.Class24;

public  class Parent {        //final dose not allowed to extend the class
   final void method(){     //no-one can be able to override this method
       final String name="Vladlen"; //cannot reassign final variable
        System.out.println("im patent");
    }
}
class Child extends Parent{


}
