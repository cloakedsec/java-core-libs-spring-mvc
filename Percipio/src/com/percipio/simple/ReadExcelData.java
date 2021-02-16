package com.percipio.simple;

import java.io.IOException;

import com.percipio.config.ExcelDataConfig;

public class ReadExcelData {
	
	public static void main(String[] args) throws IOException {
		
		ExcelDataConfig excel = new ExcelDataConfig("D:\\workspace\\Percipio\\Files\\Data.xlsx");
		
		System.out.println(excel.getData(0, 0, 0));
	}
}
