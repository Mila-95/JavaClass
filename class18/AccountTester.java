package com.syntax.class18;

public class AccountTester {
    public static void main(String[] args) {


        Account account = new Account();
       // System.out.println( account.userName);
       // System.out.println(account.password);
       // System.out.println( account.balance);
       // System.out.println(account.accountNumber);
        /*Accessing field directly is different the accessing
        the same filed with methods having different access modifier
        * */
       // account.printUserName(); private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();
    }
}