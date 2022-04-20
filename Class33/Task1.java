package com.syntax.Class33;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(scanner.nextInt());
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Please enter the corect type of data");
        }
    }
}
