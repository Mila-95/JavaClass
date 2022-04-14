package com.syntax.Class26;

public class ShoppingCart {
   private double originalPrice=100;
   private double discount=.15;
   void setDiscount(double dicsount){
       if(discount>0&&discount<=.15){
           this.discount=dicsount;
       }else{
           System.out.println("Cant have that much discount");
       }
   }
  public  double getDiscount(){
       return discount;
  }
    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }
}
