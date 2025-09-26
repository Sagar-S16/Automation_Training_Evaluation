package com.evaluation.part1;

class TestCase {
 void runTest() {
     System.out.println("Running Base Test");
 }
}


class SmokeTest extends TestCase {
 @Override
 void runTest() {
     System.out.println("Running Smoke Test");
     super.runTest();
 }
}


class TestCase5 {
 public static void main(String[] args) {
     SmokeTest test = new SmokeTest();
     test.runTest(); 
 }
}




