package com.evaluation.part1;


public class Browser {

    
    public void openBrowser() {
        System.out.println("Browser is opened.");
    }

    
    public void closeBrowser() {
        System.out.println("Browser is closed.");
    }

    
    public static void main(String[] args) {
        
        Browser myBrowser = new Browser();

        
        myBrowser.openBrowser();
        myBrowser.closeBrowser();
    }
}

