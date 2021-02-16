package testcases;

import org.testng.annotations.*;
public class LoginTest {
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("Code test end");
		}
		@Test(dataProvider="getData")//2nd
			public void doLoginTest(String username, String password, String expRes, String browser) {
		}
	
	@DataProvider(parallel=true)
	public Object[][] getData(){
		Object[][] data = new Object[3][4]; //1st
	data[0][0]="User1";
	data[0][1]="P1";
	data[0][2]="Pass";
	data[0][3]="Firefox";
	
	data[1][0]="User2";
	data[1][1]="P2";
	data[1][2]="Pass";
	data[1][3]="Chrome";
	
	data[2][0]="User3";
	data[2][1]="P3";
	data[2][2]="Pass";
	data[2][3]="IE";
	return data;
}
}