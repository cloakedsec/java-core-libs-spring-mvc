package com.percipio.simple;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XLSTut {

@Test
public void loginToPercipio()
	{

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Percipio\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://pubdemo.qa.rocs.io/login?email";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("qa@skillsoft.com");
		driver.findElement(By.name("password")).sendKeys("qa123!");
		driver.findElement(By.className("auth0-lock-submit")).click();
		driver.quit();

	}
}