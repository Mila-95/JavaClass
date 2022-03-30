package com.syntax.Class24;

public class BrowserTester {
    public static void main(String[] args) {
        GoogleChrome chorome=new GoogleChrome();
        chorome.openBrowser();
        chorome.loadPage("www.google.com");
        chorome.testThePage();
        chorome.closeBrowser();

    //SHORT CATS USING LOOPS
        Browser[] browser={new GoogleChrome(),new FireFox()};
        for(Browser b: browser){
            b.openBrowser();
            b.loadPage("www.google.com");
            b.testThePage();
            b.closeBrowser();
        }

    }
}
