package com.Maven;

import java.awt.print.Book;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Automationdemo {
	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:\\JavaClassProjectsEclipse\\MavenProject1\\src\\test\\java\\xl\\automationtesting_excel.xlsx");
		FileInputStream stream = new FileInputStream(file);

		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType type = cell.getCellType();
				switch (type) {
				case STRING:
					String Sv = cell.getStringCellValue();
					System.out.println(Sv);
					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date value = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						String format = dateFormat.format(value);
						System.out.println(format);
						System.out.println();
					} else {
						double d = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(d);
						String num = valueOf.toString();
						System.out.println(num);

					}
					break;
				default:
					break;

				}

			}
		}
	}
}
