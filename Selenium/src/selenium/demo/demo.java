package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad\\Downloads\\selenium-drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://diagnostics.scanup.com/");
			driver.manage().window().maximize();
			driver.findElement(By.name("email")).sendKeys("salusradiology1@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys("Password!");
			Thread.sleep(2000);
			driver.findElement(By.id("m_login_signin_submit")).click();
			String at = driver.getTitle();
			String et = "Scanup - Diagnostics";
			driver.close();
			if(at.equalsIgnoreCase(et))
			{
				System.out.println("Test Successful!");
			}
			else {
				System.out.println("Test Failure!!!");
			}
			
	}

}
