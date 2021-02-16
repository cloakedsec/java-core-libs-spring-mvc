package com.percipio.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig extends TestBase{

	public static void main(String[] args) throws IOException {

		File src = new File("C:\\Users\\cloaked\\eclipse-workspace\\PercipioAutomation\\Files\\df_prma_plan.xlsm");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet7 = wb.getSheetAt(6);
	
}
}