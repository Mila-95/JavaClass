package com.syntax.Class19;

public class Panda {
    String name="Poe";
    String breed="red Panda";
    String color="Red";
    double height=2.2;
    int age=12;
    double weight=35.0;
    Panda(){

    }
    Panda(String pandaName,String pandaBreed,String pandaColour,double pandaHaight,int pandaAge,double pandaWeight){
        name=pandaName;
        breed=pandaBreed;
        color=pandaColour;
        height= pandaHaight;
        age=pandaAge;
        weight=pandaWeight;
    }
    Panda(String pandaName){
        name=pandaName;
    }
    Panda(String pandaName,String pandaBreed){
        name=pandaName;
        breed=pandaBreed;
    }
    void printInfo(){
        System.out.println(name+" "+breed+" "+color+" "+height+" "+age+" "+weight);
    }
}

