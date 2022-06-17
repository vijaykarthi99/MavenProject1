package com.Maven;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StoreToExcel {
	public static void main(String[] args) throws InvalidFormatException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtSkill = driver.findElement(By.id("Skills"));
		txtSkill.click();

		Select select = new Select(txtSkill);
		List<WebElement> options = select.getOptions();
		List<String> li = new ArrayList<>();

		File file = new File("D:\\JavaClassProjectsEclipse\\MavenProject1\\Excel\\Skills.xlsx");

		Workbook workbook = new XSSFWorkbook();
		Sheet sheet = workbook.createSheet("Skills");

		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String text = element.getText();
			li.add(text);

		}

		for (int j = 0; j < li.size(); j++) {
			Row createRow = sheet.createRow(j);
			Cell createCell = createRow.createCell(20);
			createCell.setCellValue(li.get(j));
		}

	}

}
