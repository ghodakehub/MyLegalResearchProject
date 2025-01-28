package TestClass;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import ExtentReportBasic.ExtentReportManager;
import Pomclass.Login;
import UtilityClass.UtilityClass;

import generic.BaseLib;

public class LoginTest extends BaseLib {
	
	 UtilityClass utility;
	 String tcid;
	
	  public static ExtentReports extent;
		
		public static ExtentSparkReporter spark;
		
		public static ExtentTest test;
		
		
	
	
	@BeforeMethod
	public void initialize()
	{
	  extent=ExtentReportManager.getReports();
	  test= extent.createTest("Login for Legitquest  for individual");
		
	}
	
	@Test
	public void verifyLoginforIndividual() throws InterruptedException, IOException
	
	{
		
		 Login log= new Login(driver, test);
		utility= new UtilityClass();
		test.log(Status.INFO, "Enter valid username and password");
		
		test.log(Status.FAIL, "login test case pass by individual");
		//log.login(UtilityClass.readPropertyFileData("Emailid"),UtilityClass.readPropertyFileData("password"));
		log.login("pratiksha.damodar@legitquest.com","lq@123");
	
	}
	@AfterMethod
	public void finish(ITestResult result) throws IOException
	
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			UtilityClass.Capaturescreenshot(driver,tcid);
		}
		Reporter.log("take screenshot succesfully");
		extent.flush();
		BaseLib.driver.quit();
	}

}
