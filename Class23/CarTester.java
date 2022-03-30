package com.syntax.Class23;

public class CarTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();
        Suzuki suzuki=new Suzuki();
          suzuki.start();
        System.out.println("*********");
        Car car=new BMW();
        car=new Tesla();
        car=new Suzuki();
        car.start();

    }
}
