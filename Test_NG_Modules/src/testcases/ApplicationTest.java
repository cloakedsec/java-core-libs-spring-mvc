package testcases;

import org.testng.annotations.*;

public class ApplicationTest {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After suite");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before executing test case");

	}
}
