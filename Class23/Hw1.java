package com.syntax.Class23;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
 */


class Student{

    void study(){
        System.out.println("Student must study");//behaviors
    }

    void doHomework(){
        System.out.println("Student must do homework");//behaviors
    }
    void practice(){
        System.out.println("Student must do Practice");//behaviors
    }
}
class SyntaxStudent extends Student{//class
    @Override
void study(){
    System.out.println("Syntax student must study 25 hours a week");
}
    @Override
void doHomework(){
    System.out.println("Students must love replids");
}
    @Override
void practice(){
    System.out.println("Symtax student must do their own repls");
}
   }
   class CollegeStudent extends Student{
void doHomework(){

    System.out.println("College student can skip some of the homework");
}
   }
   class SchoolStudent extends Student{

   }
public class Hw1 {


}