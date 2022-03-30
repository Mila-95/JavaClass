package com.syntax.class16;

public class Task5Task6 {
    public static void main(String[] args) {
        //How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
        Task5Task6 task = new Task5Task6();
        System.out.println(task.palindrome("abc"));
        System.out.println(task.palindrome("Abbc"));
    }

    boolean palindrome(String inputStr) {
        String reversedStr = reverseString(inputStr);//reversing a word
        return reversedStr.equals(inputStr);//checking if words are same
    }

    String reverseString(String inputString) {
        //converting s string to stringbuilder so that we ca use the reverse method
        StringBuilder stringBuilder = new StringBuilder(inputString);
        stringBuilder.reverse();
        return stringBuilder.toString();

        //How would you swap  2 strings without a temporary variable?

    }
}