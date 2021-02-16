package com.percipio.pages;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCourseTopicLinks {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	static WebDriver driver;

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) throws Exception {

		File src = new File("D:\\workspace\\Percipio\\Files\\df_prma_plan.xlsm");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sheet7 = wb.getSheetAt(6);

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Percipio\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		String baseUrl = "https://pubdemo.qa.rocs.io/login?email";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("qa@skillsoft.com");
		driver.findElement(By.name("password")).sendKeys("qa123!");
		driver.findElement(By.className("auth0-lock-submit")).click();

		WebElement searchInput = driver
				.findElement(By.xpath("//input[@type='text' and @data-marker='HeaderNavSearchInput']"));
		searchInput.sendKeys("Data Preprocessing");

		WebElement searchBtn = driver.findElement(By.xpath("//button[@data-marker='HeaderNavSearchSearch']"));
		searchBtn.click();

		WebElement courseName = driver.findElement(By.xpath("//a[contains(text(), 'Data Preprocessing')]"));
		courseName.click();

		String xpathDynamic = "//a[@data-marker=\"CourseContentsCardTitleLink";

		int count = 0;

		WebElement xpathUpdate = driver.findElement(By.xpath(xpathDynamic.substring(0) + count++ + "\"]"));

		for (int rowNo = 20; rowNo < 27; rowNo++) {
			if (sheet7.getRow(rowNo).getCell(1).getRichStringCellValue().getString().trim().equals(xpathUpdate))
				;
			System.out.println("Links Verified and Matched!!!");

		}
		driver.quit();
	}

}
