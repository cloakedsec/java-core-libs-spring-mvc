package jSoupProjectAutomate;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderWay {
	WebDriver driver;
	public static void main(String[] args) throws Exception {
		
		
        Connection.Response loginForm = Jsoup.connect("https://orders.takeaway.com/")
         .method(Connection.Method.GET)
         .execute();

        Document document = Jsoup.connect("http://orders.takeaway.com/53c4a132595bfd5ad055194bb0aa361b")
         .data("cookieexists", "false")
         .data("pizze1794", "vmsduj2mej")
         .data("login", "Login")
         .cookies(loginForm.cookies())
         .post();
        System.out.println(document);

        WebDriver driver = new ChromeDriver();
        driver.get("https://orders.takeaway.com/");
        Document doc = Jsoup.parse(driver.getPageSource());
        
    }
}
