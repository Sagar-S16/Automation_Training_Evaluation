package com.evaluation.part1;

class LoginTest{
private String username;
private String password;


public LoginTest(String username, String password) {
    this.username = username;
    this.password = password;
}

public void doLogin() {
    System.out.println("Logging in");
    System.out.println("Username: " + username);
    System.out.println("Password: " + password);
}
}
class Login{
public static void main(String[] args) {
    
    LoginTest login = new LoginTest("SagarS", "pass123");
    login.doLogin();
}
}


