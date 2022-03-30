package com.syntax.Project;
/*Create a Class Car that would have the following
fields:   carPrice   and   color   and   method
calculateSalePrice() which should be returning a price
of the car.
Create 2 sub classes: Sedan and Truck. The Truck
class   has   field   as   weight   and   has   its   own
implementation   of   calculateSalePrice()   method   in
which   returned   price   calculated   as   following:   if
weight>2000 then returned price car should include
10% discount, otherwise 20% discount.
The Sedan class has field as length and also does it
is   own   implementation   of   calculateSalePrice():   if
length of sedan is >20 feet then returned car price
should include 5% discount, otherwise 10% discoun
*/
public class Task3 {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(15000, "White", 20);
        System.out.println(sedan.calculateSalePrice());
        Car truck=new Truck(20000, "Black", 5050);
        System.out.println(truck.calculateSalePrice());
    }
}
class Car {
    double carPrice;
    String color;
    double discount;

    public Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice-carPrice*discount;
    }
}
class Sedan extends Car{
    int length;
    public Sedan(double carPrice,String color,int length){
        super( carPrice,color);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        if(length>20){
            discount=0.05;
        }else{
            discount=0.1;
        }
        return carPrice -carPrice*discount;
}
}
class Truck extends Car{
    int weight;
    public Truck(double carPrice,String colour,int weight){
        super(carPrice,colour);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
if(weight>2000){
    discount=0.1;
}else{
    discount=0.2;
}
return carPrice-carPrice*discount;
    }
}