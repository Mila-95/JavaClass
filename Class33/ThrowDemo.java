package com.syntax.Class33;

public class ThrowDemo {
    double balance;

    public void setBalance(double balance) throws InsufficientBalance {
        if (balance <= 0) {
            throw new InsufficientBalance("cant set negative balance");
        }else{
            this.balance=balance;
        }
    }
}
