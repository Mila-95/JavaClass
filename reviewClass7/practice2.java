package com.syntax.reviewClass7;

public class practice2 {
    //righting methods in the class to return the method
    String getRecord() {
        String department = "QA";
        String empName = "Violet";

        String details = "Worker" + empName + "belongs" + department;
        return details;
    }


    public static void main(String[] args) {
        //creating an object of the class
        practice2 p=new practice2();
        p.getRecord();

    }
}