package com.syntax.Class23;

public class AlisParent {
    String girlName="Salma";
    double money=1000000;
    void marry(){
        System.out.println("Aliypo should marry "+girlName);
    }
}
class Ali extends AlisParent{
    String girlName="Rihana";
    void marry(){
        super.marry();
        System.out.println("But Dad i want to marry "+girlName);
    }
}
