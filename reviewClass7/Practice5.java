package com.syntax.reviewClass7;

public class Practice5 {

    String week(String day){
        switch(day){
            case"monday":
                return"Its lazy day";
            case"tuesday":
                return"Its productive day";
            case"wednesday":
                return"Its gloomy day";
            case"thursday":
                return"Its work day";
            case"friday":
                return"Its  day";
            default:
                return"no correct option";

        }
    }

    public static void main(String[] args) {
        Practice5 p=new Practice5();
        p.week("friday");
    }
}
