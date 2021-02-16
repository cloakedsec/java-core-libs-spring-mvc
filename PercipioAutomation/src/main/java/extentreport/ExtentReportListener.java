package com.percipio.extentreport;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class ExtentReportListener implements IReporter{
	
	private ExtentReports extent;
	
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		extent = new ExtentReports(outputDirectory + File.separator + "Extent.html", true);
		
		for(ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();
			
			for(ISuiteResult r : result.values()) {
				ITestContext context = new r.getTestContext();
				buildTestNodes(context.getPassedTests(), LogStatus.PASS);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
				
			}
		}
		
		extent.flush();
		extent.close();
	}
	
	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;
		
	}
}
