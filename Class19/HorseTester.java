package com.syntax.Class19;

public class HorseTester {
    public static void main(String[] args) {


        Horse horse = new Horse("jacky", 20,
                400);
        /*Horse->Data Type(names of classes)
        horse-> Object/instance/reference variable/variable
        = ->assignment operator
        Horse("jacky", 20,
                400);-> call constructor
         ; -> line terminator
         */
        horse.setName("jacky");
        horse.printHorseName();

    }
}