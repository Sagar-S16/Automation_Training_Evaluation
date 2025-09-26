package com.evaluation.part1;

public class LoginMessageAnalyzer {
    public static void main(String[] args) {
        
        String[] loginMessages = {
            "Invalid username or password",
            "Account locked",
            "Password expired",
            "Invalid username or password",
            "Session timed out",
            "Incorrect password"
        };

        String expectedMessage = "Invalid username or password";
        int exactMatchCount = 0;
        int passwordKeywordCount = 0;

        for (String message : loginMessages) {
        	if (message.equals(expectedMessage)) {
                exactMatchCount++;
            }

     
            if (message.toLowerCase().contains("password")) {
                passwordKeywordCount++;
            }
        }

        System.out.println("username" + exactMatchCount);
        System.out.println("password" + passwordKeywordCount);
    }
}
