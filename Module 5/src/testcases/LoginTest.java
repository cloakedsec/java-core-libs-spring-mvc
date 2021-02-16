package testcases;
import filereading.xls.ReadingXLSFile;
//import reporting.htmlreports.BetterHTMLReports;
//import reporting.htmlreports.HTMLReports;
import reporting.htmlreports.*;

public class LoginTest {
	public static void main(String arg[]) {
		HTMLReports htmlRep = new HTMLReports();
		BetterHTMLReports betterRep = new BetterHTMLReports();
		
		DefaulReports dr = new DefaultReports();
		
		SendMailTest sendMail = new SendMailTest();
		
		ReadingXLSFile xls = new ReadingXLSFile();
		System.out.println(xls.xlsLocation);
	}
}
