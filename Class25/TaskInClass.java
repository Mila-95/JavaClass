package com.syntax.Class25;
/*
Create a WebDriver Interface that will have the following unimplemented behaviour:
openBrowser(), closeBrowser(), maximizeWindow(), findElement().
Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */
public class TaskInClass {
    public static void main(String[] args) {
        WebDriver [] web={new ChromeDrive(),new FirefoxDriver()};
        for(WebDriver drive:web){
            drive.openBrowser();
            drive.closeBrowser();
            drive.maximizeWindows();
            drive.findElement();
        }
    }
}
interface WebDriver{
    void openBrowser();
    void closeBrowser();
    void maximizeWindows();
    void findElement();
}
class ChromeDrive implements WebDriver{
    public void openBrowser(){
        System.out.println("Chrome open Browser");
    }
    public void closeBrowser(){
        System.out.println("Chrome close Browser");
    }

    @Override
    public void maximizeWindows() {

    }

    public void maximizeBrowser(){
        System.out.println("Chrome maximize Browser");
    }
    public void findElement(){
        System.out.println("Chrome find element");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Firefox open Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Firefox close Browser");
    }

    @Override
    public void maximizeWindows() {
        System.out.println("Firefox maximize Windows");
    }

    @Override
    public void findElement() {
        System.out.println("Firefox find element");
    }
}