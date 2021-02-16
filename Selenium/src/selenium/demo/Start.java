package selenium.demo;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ahmad\\Downloads\\selenium-drivers\\chromedriver.exe");

		ChromeDriver c1 = new ChromeDriver();
		c1.get("https://google.com");
	}

}
