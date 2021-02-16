package testcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class NewTest {
    public String baseUrl = "http://google.com/";
    String driverPath = "D:\\Code\\selenium-drivers\\chromedriver.exe";
    public WebDriver driver ; 
     
  @Test
  public void verifyHomepageTitle() {
       
      System.out.println("launching firefox browser"); 
      System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
      driver.get(baseUrl);
      Assert.assertEquals("/html/head/title", "Google");
      String expectedTitle = "Google";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}