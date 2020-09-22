package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReportDemo {
	ExtentSparkReporter html ;
	ExtentReports extent;

	@BeforeSuite
	public void reportSetup()
	{
		html = new ExtentSparkReporter("/Users/krishnabadveli/Desktop/ECLISPE_APPIUM_Testing/APPIUMFramework/test-output/extentreports/");
		extent = new ExtentReports();
		extent.attachReporter(html);
	}
	@AfterSuite
	public void tearDown()
	{
		extent.flush();
	}
}
