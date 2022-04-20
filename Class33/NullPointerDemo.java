package com.syntax.Class33;

public class NullPointerDemo {
    public static void main(String[] args) {

//when object is not initialized properly, and we call this method we get pointerNullException
        String str = null;
        str.length();

    }
}