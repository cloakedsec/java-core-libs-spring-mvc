package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static String name = "Tesla User";
	public static String registrationNo = "9048482193";
	
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad\\Downloads\\selenium-drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://diagnostics.scanup.com/login?registration=true");
			driver.manage().window().maximize();
			driver.findElement(By.name("name")).sendKeys(name);
//			Thread.sleep(2000);
			driver.findElement(By.name("registration_number")).sendKeys(registrationNo);
//			Thread.sleep(2000);
			
			driver.findElement(By.name("profile_picture")).sendKeys("C:\\Users\\Ahmad\\Pictures\\salus.png");
			
			driver.findElement(By.id("m_login_signin_submit")).click();
			String at = driver.getTitle();
			String et = "Scanup - Diagnostics";
			driver.close();
			if(at.equalsIgnoreCase(et))
			{
				System.out.println("Test Successful!");
			}
			else 
			{
				System.out.println("Test Failure!!!");
			}
	}
}
