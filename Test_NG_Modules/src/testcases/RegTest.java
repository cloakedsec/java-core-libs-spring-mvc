package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegTest {
	SoftAssert softAssert = new SoftAssert();
	
	@Test
	public void doRegisterTest() {
		String expectedTitle = "New";
		String outputTitle = "Old";
		System.out.print("A");
		softAssert.assertEquals(outputTitle, expectedTitle);
		System.out.println("B");
		softAssert.assertAll();
	
	}
}
