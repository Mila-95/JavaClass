package com.syntax.Class21;
/*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
     Create a subclass  userInfo that will have user address variable and it also being initialized
     through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
public class HW {
}
class userClass{
    String name;
    String number;

    userClass(String name, String number) {
        this.name = name;
        this.number = number;
    }
}
    class userInfo extends userClass{
        String address;
        userInfo(String name, String number,String address) {
            super(name,number);
             this.address = address;
        }

        void userDet() {
            System.out.println(name + " " + number + " " + address);
        }

    }
    class userTester{
        public static void main(String[] args) {
            userInfo m = new userInfo("Asgar", "234-567-6543","10 old rd");
            m.userDet();
        }
    }

