package com.syntax.Class17;

public class Student {
    //Create a Class called Students
    //Create three  variables  Name , ID  and  numberOfStudents
    //Create three objects of the Students Class
    //Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    //Print out  total number of students

    String name;
    int iD;
    static int numberOfStudent ;

    public static void main(String[] args) {
        Student s = new Student();
        s.name="Viki";
        s.iD=123;
        Student.numberOfStudent++;

        Student s1 = new Student();
        s1.name="Yasgul";
        s1.iD=123;
        Student.numberOfStudent++;

        Student s2 = new Student();
        s2.name="Zokhor";
        s2.iD=123;
        Student.numberOfStudent++;
        System.out.println(Student.numberOfStudent);


    }
}