package com.evaluation.part1;

class BaseTest{
	void setUp() {
		System.out.println("Setting up the test");
	}
	void tearDown() {
		System.out.println("TearDown");
	}
}

class LoginTest2 extends BaseTest{
	void testLogin() {
		System.out.println("Loginging for the test");
	}
}


public class LoginTest3{

	public static void main(String[] args) {
		LoginTest2  L  = new LoginTest2();
		
		L.testLogin();
		L.setUp();
		L.tearDown();

	}

}


