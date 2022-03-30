package com.syntax.class22;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class IfelseDemo {
    public static void main(String[] args) {
        int number=10;
        /*
        The ternary has the limitation that it must return something we can't use it to print things
         */
       // number>10?System.out.println("Number is greater"):System.out.println("Number is smaller");
    }
   int maxNumber(int num1,int num2){
       /* if(num1>num2){
            return num1;
            }else {
               return num2;}
      */  //   OR
       //num1>num2=> the condition part
     // int max= num1>num2?num1:num2;
      //return max;
      //      OR
       return num1>num2?num1:num2;
    }
}
