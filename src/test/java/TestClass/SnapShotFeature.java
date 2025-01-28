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
import Pomclass.SnapShot;
import UtilityClass.UtilityClass;
import generic.BaseLib;

public class SnapShotFeature extends BaseLib {
	
	UtilityClass utility;
	String tcid;
	
	  public static ExtentReports extent;
		
		public static ExtentSparkReporter spark;
		
		public static ExtentTest test;
		
	@BeforeMethod
	public void initialize()
	{
	  extent=ExtentReportManager.getReports();
	  test= extent.createTest("Snapshot feature test case");
		
	}
	
	@Test
	public void verifysnapshot() throws InterruptedException, IOException
	
	{
		tcid="6: verify the SnapShot";
		Login log= new Login(driver, test);
		log.login("pratiksha.damodar@legitquest.com","lq@123");
		SnapShot shot= new SnapShot (driver,test);
	     shot.click(driver);
	
	}
	@AfterMethod
	public void finish(ITestResult result) throws IOException
	
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			UtilityClass.Capaturescreenshot(BaseLib.driver, tcid);
		}
		Reporter.log("take screenshot succesfully");
		extent.flush();
		BaseLib.driver.close();
	}


}
