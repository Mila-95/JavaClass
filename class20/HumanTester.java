package com.syntax.class20;

import com.sun.security.auth.PrincipalComparator;

public class HumanTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zukhor";
        System.out.println(student.name);
        student.printName();
        student.studentId="123234";
        Principal principal=new Principal();
        principal.name="Gulden";
        principal.printName();
        principal. specialParkingSlot=false;
    }
}
