package com.percipio.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.percipio.utils.Utility;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"D:\\workspace\\Percipio\\src\\com\\percipio\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Percipio\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\workspace\\Percipio\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("iexplorer")) {
			System.setProperty("webdriver.ie.driver", "D:\\workspace\\Percipio\\Drivers\\iedriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Utility.EXPLICIT_WAIT, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Utility.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

	}

	public void LoginPageSimple() throws InterruptedException {
		// TODO Auto-generated method stub

	}
}