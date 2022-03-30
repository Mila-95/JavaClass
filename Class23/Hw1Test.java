package com.syntax.Class23;

public class Hw1Test {
    public static void main(String[] args) {
        //in java we can store the object of a child class in a parent
        //type variables
        //Every class in java can be treated as data type
        Student syntax = new SyntaxStudent();
        Student school = new SchoolStudent();
        //as we can store the object of a child class in a parent class
        //we can also create an array of this student as show below


        Student[] student = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};
        //int[] arr={1,2,3};
        //foe(int number:arr){
        // system.out.println(number);}
        //calling the methods from all the children class

    for(Student  a : student){
    a.study();
    a.doHomework();
    a.practice();
}
    }
}