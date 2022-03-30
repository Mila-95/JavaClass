package com.syntax.class16;

public class ReplaceRemove {
    public static void main(String[] args) {
        String str="1234!#%&jskhckahdcKJGU";
        System.out.println(str.replaceAll("[0-9]","#")); //will not print 1234
        System.out.println(str.replaceAll("[a-z]",""));  //wil not print jskhckahdc
        System.out.println(str.replaceAll("[0-9]","Julia"));//will replace 1234 to Julia
                                                                              // 4 times because its 4 numbers there
    }
}
