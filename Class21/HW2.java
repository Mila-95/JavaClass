package com.syntax.Class21;
/*
Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code
 */

public class HW2 {
}
class Shape{
     double radius;
    Shape(double radius) {
        this.radius = radius;
    }
}
class Circle extends Shape{
   Circle(double radius) {
        super(radius);
    }
void area(){
        System.out.println(Math.PI*Math.pow(radius,2));
}

    public static void main(String[] args) {
        Circle m=new Circle(10);
       m.area();
    }
}