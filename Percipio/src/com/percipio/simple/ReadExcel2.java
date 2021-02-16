package com.percipio.simple;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {

		File src = new File("D:\\workspace\\Percipio\\Files\\Data.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = wb.getSheetAt(0);

		int rowCount = sheet1.getLastRowNum();

		System.out.println("Total rows is " +rowCount+1);

		for (int i=0;i<rowCount;i++) {
			String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();

			System.out.println("Data from Row is "+i+" is "+data0);
			
			
		}

		wb.close();
	}

}
