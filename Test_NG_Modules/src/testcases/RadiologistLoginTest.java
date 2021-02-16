package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class RadiologistLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Code\\selenium-drivers\\chromedriver.exe");
		driver = new ChromeDriver(); //launches chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://qa-radiologist.scanup.com");
		
	}
	
	
	
	
	
}
