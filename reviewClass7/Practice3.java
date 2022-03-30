package com.syntax.reviewClass7;

public class Practice3 {

    String studentName;
    String course;
    int studentID;
    int grades;

    void display() {
        System.out.println("Student name is " + studentName + " and the course student enrolled for this " + course );
        System.out.println("The student id is " + studentID + " ant grades student achieved are " + grades);
    }

    public static void main(String[] args) {
        Practice3 p1 = new Practice3() ;
            p1.studentName="Rogo";
            p1.course="SDET";
            p1.studentID=123;
            p1.grades=65;
            p1.display();

        System.out.println("******");

        Practice3 p2 = new Practice3() ;
        p2.studentName="Yazina";
        p2.course="sience";
        p2.studentID=546;
        p2.grades=91;
        p2.display();
    }
}