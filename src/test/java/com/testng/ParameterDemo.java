package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Maven.Date;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo{
//	WebDriver driver;
//	@BeforeClass
//	private void beforeClass() {
//		WebDriverManager.chromedriver().setup();
//		driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//	}
//	@BeforeMethod
//	private void beforeMethod() {
//		Date date = new Date();
//		System.out.println(date);
//
//	}
//	@Parameters("username")
//	@Test
//	private void tc0(String s) {
//		WebElement txtUserName = driver.findElement(By.id("email"));
//		txtUserName.sendKeys(s);
//		}
//	@Parameters("password")
//	@Test
//	private void tc01(String s) {
//	WebElement txtPassword = driver.findElement(By.id("pass"));
//	txtPassword.sendKeys(s);
//	
//
//	}
	
	@Test(groups="@smoke")
	private void tc01() {
		System.out.println("Method1");
	}
	@Test(groups="@sanity")
	private void tc02() {
		System.out.println("Method2");
	}
	@Test(groups="@retest")
	private void tc03() {
		System.out.println("Method3");
	}
	@Test(groups="@smoke")
	private void tc04() {
		System.out.println("Method4");
	}
	@Test(groups="@E2E")
	private void tc05() {
		System.out.println("Method5");
	}
	@Test(groups="@regression")
	private void tc06() {
		System.out.println("Method6");
	}
	
//	@AfterMethod
//	private void afterMethod() {
//		Date date = new Date();
//		System.out.println(date);
//
//	}
	
	
	

}
