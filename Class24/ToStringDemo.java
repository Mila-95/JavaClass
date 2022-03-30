package com.syntax.Class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        ToStringDemo demo=new ToStringDemo("Mr.a",10);
        System.out.println(demo.toString() );

    }
}
