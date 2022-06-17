package com.Maven;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookTask1 {
	public static void main(String[] args) {
		
		//WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement txtName = driver.findElement(By.id("email"));
		txtName.sendKeys("VJ_vijaymnai");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("alexa@1234_!");
//		WebElement btnlogin = driver.findElement(By.name("login"));
//		btnlogin.click();
//		driver.navigate().back();
		WebElement btncreat = driver.findElement(By.xpath("(//a[contains(text(),'Creat')])[1]"));
		btncreat.click();
		WebElement txtFirst = driver.findElement(By.name("firstname"));
		txtFirst.sendKeys("Vijaymani");
		
		
	}

}
