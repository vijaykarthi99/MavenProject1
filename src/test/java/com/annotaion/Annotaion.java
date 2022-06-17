package com.annotaion;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotaion {
	
	
	@Test
	private void tc1() {
		
		System.out.println("test 1"+6%2);	
		

	}
	@Test
	private void tc2() {
		
		System.out.println("test 2"+10/2);

	}
	
	@Test
	private void tc3() {
		System.out.println("test 3"+12+6);

	}
	
	@Test
	private void tc4() {
		System.out.println("test 4" + 7*2);

	}
}
