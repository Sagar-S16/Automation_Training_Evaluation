package com.evaluation.part1;

public class ElementActions {

 
  public void click(String locator) {
      System.out.println(locator);
  }

  
  public void click(String locator, int index) {
      System.out.println("Clicked on element with locator: " + locator + " at index: " + index);
  }

  public static void main(String[] args) {
      ElementActions actions = new ElementActions();

      
      actions.click("login-button");

      
      actions.click("menu-item", 2);
  }
}

