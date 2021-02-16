package com.percipio.tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.percipio.base.TestBase;
import com.percipio.pages.HomePage;
import com.percipio.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
	}

	@Test(dataProvider="percipioData")
	public void loginTest(String email, String password) throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.className("auth0-lock-submit")).click();
		Thread.sleep(10000);
		Assert.assertTrue("Page title not verified - User is unable to login", driver.getTitle().contains("All Content"));
		System.out.println("Page title verified - User is able to login successfully");
	}
	@DataProvider(name = "percipioData")
	public Object[][] passData(){
		Object[][] data= new Object[3][2];
		
		data[0][0] = "admin1@gmail.com";
		data[0][1] = "demo1";
		
		data[1][0] = "qa@skillsoft.com";
		data[1][1] = "qa123!";
		
		data[2][0] = "admin2@gmail.com";
		data[2][1] = "demo2";
		
		return data;
				
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
