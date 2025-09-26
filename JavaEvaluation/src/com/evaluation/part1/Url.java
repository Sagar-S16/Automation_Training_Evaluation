package com.evaluation.part1;

class BasePage {
 String url = "https://app.com";
}
class HomePage extends BasePage {
 String url = "https://app.com/home"; 

 void printUrls() {
     System.out.println("Child URL using this: " + this.url);   
     System.out.println("Parent URL using super: " + super.url); 
 }
}

 class Url {
 public static void main(String[] args) {
     HomePage home = new HomePage();
     home.printUrls();
 }

}





