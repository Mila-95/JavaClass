package com.syntax.Class17;

public class Task {
    //Create a Class called Employee:
    //Create three  variables  empID , salary and set the CEO to “Sumair”
    //Create two objects of the class Employee
    //Set the value of eID, salary for each of the objects
    //Print out the eID , salary and  CEO for each of the objects

    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        Task aselObject =new Task();
        aselObject.empId="123";
        aselObject.salary=2000;
        System.out.println(aselObject.empId);
        System.out.println(aselObject.salary);
        System.out.println(Task.CEO);

        Task mozzam=new Task();
        mozzam.empId="456";
        mozzam.salary=12345;
        System.out.println(mozzam.empId);
        System.out.println(mozzam.salary);
        System.out.println(Task.CEO);



    }
}
