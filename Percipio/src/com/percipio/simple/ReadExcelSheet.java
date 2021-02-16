package com.percipio.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReadExcelSheet {

	static WebDriver driver;
	static String message;

	public static void main(String[] args) throws IOException {

		File src = new File("D:\\workspace\\Percipio\\Files\\df_prma_plan.xlsm");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(6);

		String data0 = sheet1.getRow(20).getCell(1).getStringCellValue();
		System.out.println(data0);

		wb.close();

	}

	public ReadExcelSheet() {

	}

}
