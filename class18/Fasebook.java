package com.syntax.class18;

public class Fasebook {
    private String userName;
    private String pasword;
    private int age;

    void setAge(int personAge) {
        if (personAge > 5 && age < 80) {
            age = personAge;

        } else {
            System.out.println("Not allowed");
        }
    }

    int getAge(String userPasword) {
        if (userPasword.equals(pasword)) {
            return age;
        } else {
            return-1;
        }

    }
}