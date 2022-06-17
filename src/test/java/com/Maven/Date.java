package com.Maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Date {

	public static void main(String[] args) throws IOException {

		File file = new File("D:\\JavaClassProjectsEclipse\\MavenProject1\\Excel\\automationtesting_excel.xlsx");

		FileInputStream stream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet("Sheet1");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);

				CellType type = cell.getCellType();

				switch (type) {
				case STRING:
					String string = cell.getStringCellValue();
					System.out.println(string);

					break;

				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						java.util.Date dateCellValue = cell.getDateCellValue();
						SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						String format = dateFormat.format(dateCellValue);
						System.out.println(format);
						System.out.println("================");
					}

					else {

						double Value = cell.getNumericCellValue();
						BigDecimal valueOf = BigDecimal.valueOf(Value);
						String nu = valueOf.toString();
						System.out.println(nu);
						break;
					}
				
				}

			}

		}

	}
}
