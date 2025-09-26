package com.evaluation.part1;


import java.util.Scanner;


public class TestCaseCounter {
    public static void main(String[] args) {
        
        String[] testResults = {"pass", "fail", "pass", "pass", "fail"};

        int passedCount = 0;

        for (String result : testResults) {
            if (result.equalsIgnoreCase("pass")) {
                passedCount++;
            }
        }

        System.out.println("Total number of passed test cases: " + passedCount);
    }
}


