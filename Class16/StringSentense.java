package com.syntax.Class16;

public class StringSentense {
    public static void main(String[] args) {
        String s="This is a sentence";
        String[] strArr=s.split(" ");
        System.out.println(strArr.length); //count how name words in there
        System.out.println(strArr[0]);// count the first word "This"
        System.out.println(strArr[3]); // count the  3 word in sentence "sentence"

        String s2="This is a sentence.Batch 12 is great." +" Edward is not great.He is super great";
        String[]strArr2=s2.split("[.]"); //after .
        System.out.println(strArr2.length);     //all sentenses
        System.out.println(strArr2[3]);         //Print after . . sentense


    }
}
