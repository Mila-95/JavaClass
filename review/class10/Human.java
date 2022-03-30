package com.syntax.review.class10;

public class Human {
    private String name;
    private String colour;
    private int age;
    Human(String name,String colour,int age){
        this.name=name;
        this.colour=colour;
        this.age=age;
        System.out.println("Inside the parent class Human");
    }
    void printInfo(){
        System.out.println(name+" "+colour+" "+age);
    }
}
class Employee extends Human{
String employerID;
    Employee( String employerID,String name, String colour, int age) {
        super(name, colour, age);
        this.employerID=employerID;
    }
}
class Teacher extends Employee{
String favSubject;
    Teacher( String name, String colour, int age,String favSubject ,String EmployerID) {
        super(EmployerID, name, colour, age);
        this.favSubject=favSubject;
    }
}
class Tester123{
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Asgar","super white",22,"123","Java");
        teacher.printInfo();
    }
}