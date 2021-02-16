package com.percipio.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.percipio.base.TestBase;

public abstract class LoginPage extends TestBase {

	static WebDriver driver;

	@FindBy(xpath = "//input[@name='email']")
	WebElement email;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(className = "auth0-lock-submit")
	WebElement loginButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String mail, String pass) {
		email.sendKeys(mail);
		password.sendKeys(pass);
		loginButton.click();

		return new HomePage();
	}

}
