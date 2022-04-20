package com.syntax.Class33;

public class DoSomthing {

    void doSomthing( int a,int b){
        Calculator calculator=new Calculator();
        calculator.DoTheMath(a,b);
    }

    public static void main(String[] args) {
        DoSomthing doSomthing=new DoSomthing();
        doSomthing.doSomthing(10,10);

    }
}
