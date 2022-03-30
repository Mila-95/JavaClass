package com.syntax.class18;

public class AccesseModifiers {
    private String name="Naughty Tarik"; //private  only this package
    int age=50;            // default access with in  the same package only
    protected double weight=50;//yes accessible in other packages
    public String color="White";////accessible anywhere

    public static void main(String[] args) {
        AccesseModifiers a=new AccesseModifiers();
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.weight);
        System.out.println(a.color);
    }
}
