

package tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.aop.target.ThreadLocalTargetSource;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass extends ExtentReportDemo{
	static AppiumDriver driver;
	
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void sampleTest()
	{
		
		
		System.out.println("Inside test");
		
	}
	
	@BeforeTest
	public void setup() throws Exception
	{
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","RealMe2");
        capabilities.setCapability("udid", "Z5RKUSK7KBAYN7SS");
       // capabilities.setCapability("udid", "100.123.48.46:5555");// connecting through wifi
       
        capabilities.setCapability("platformName", "Android");
        
        
        capabilities.setCapability("platformVersion", "9");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
       //  capabilities.setCapability(MobileCapabilityType.APP ,"absolutepathofapp");   //if using app
      //  capabilities.setCapability(MobileCapabilityType.BROWSER_NAME ,"Chrome");
        driver =new AppiumDriver<MobileElement>(url,capabilities);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        Thread.sleep(3000);
		
	}
}
