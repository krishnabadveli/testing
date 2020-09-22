package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.MobileElement;



public class TestClass extends BaseClass{
	
	@Test
	public void test()
	{
		
		ExtentTest test=extent.createTest("Test one","Sample test case demo");
		test.log(Status.INFO, "Test case started ");
		 MobileElement two=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_2"));

	        MobileElement seven=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/digit_7"));

	        MobileElement plus=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/op_add"));
	        
	        //MobileElement equals=(MobileElement) driver.findElement(By.id("com.google.android.calculator:id/eq"));
	        
	        MobileElement equals=(MobileElement) driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.google.android.calculator:id/eq']"));

	        
	        two.click();
	        test.log(Status.PASS, "two clicked  ");
	        plus.click();
	        test.log(Status.INFO, "plus clicked ");
	        seven.click();
	        test.log(Status.INFO, "seven clicked  ");
	        equals.click();
	        test.log(Status.INFO, "e ");

	}

}
