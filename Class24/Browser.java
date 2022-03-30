package com.syntax.Class24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the beowser");
    }
    void loadPage(String link){
        System.out.println("Loading the browser"+link);
    }
    void testThePage(){
        System.out.println("Test the page");
    }
    void closeBrowser(){
        System.out.println();

    }
}
class GoogleChrome extends Browser{
    void openBrowser(){
        System.out.println("Opening the GoogleChrome browser");
    }
    void loadPage(String link){
        System.out.println("Loading the browser"+link+" GoogleChrome browser");
    }
    void testThePage(){
        System.out.println("Test the page GoogleChrome browser");
    }
    void closeBrowser(){
        System.out.println("Closing the GoogleChrome");
    }
}
class FireFox extends Browser{
    void openBrowser(){
        System.out.println("Opening the FireFox browser");
    }
    void loadPage(String link){
        System.out.println("Loading the browser"+link+" FireFox browser");
    }
    void testThePage(){
        System.out.println("Test the page FireFox browser");
    }
    void closeBrowser(){
        System.out.println("Closing the FireFox");
    }
}
