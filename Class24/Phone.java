package com.syntax.Class24;

public abstract class Phone {
    void makePhoneCall(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("sending a text");
    }
     abstract void displayPicture();
}
  class Iphone extends Phone{
    @Override
      void displayPicture(){
        System.out.println("Use the phoc app to display the pictures");
    }
}
class Samsung extends Phone{
    @Override
    void displayPicture(){
        System.out.println("Use gallery to display pictures");
    }
}