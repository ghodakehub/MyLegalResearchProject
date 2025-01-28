package TestClass;

import java.io.IOException;

import javax.mail.MessagingException;

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
import Pomclass.LatestLegalNewsDateSortby;
import Pomclass.Login;
import UtilityClass.UtilityClass;
import generic.BaseLib;
import generic.ForMultiplemailReceipent;

public class VerifydateOfLatestLegalNews extends BaseLib {
	
	UtilityClass utility;
	String tcid;
	
	  public static ExtentReports extent;
		
		public static ExtentSparkReporter spark;
		
		public static ExtentTest test;
		

	@BeforeMethod
	public void initialize()
	{
	  extent=ExtentReportManager.getReports();
	  test= extent.createTest("Latest Legal News by date filter Fucntionality test case");
		
	}
	
	@Test
	public void verifySearchBarfunction() throws InterruptedException, IOException
	
	{
		
	tcid="10: verify the Latest Legal news Functionality by date filter ";
	Login log= new Login(driver, test);
	log.login("pratiksha.damodar@legitquest.com","lq@123");
	LatestLegalNewsDateSortby legal= new LatestLegalNewsDateSortby (driver,test);
	legal.Verifylatestlegalnewsbydatesortby(BaseLib.driver);	
	
	}
	@AfterMethod
	public void finish(ITestResult result) throws IOException, MessagingException
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
		String screenshot=  UtilityClass.Capaturescreenshot(BaseLib.driver,result.getName() );
		
		test.log(Status.FAIL,"test"+ test.addScreenCaptureFromPath(screenshot));
		
		
		String testUrl = BaseLib.driver.getCurrentUrl();  
		 ForMultiplemailReceipent.sendEmail(
           	   BaseLib.driver, new String[]{"ghodake6896@gmail.com"},
           	    "LR-LatetLegalNews",
           	    "Please check issue coming in LatestLegalNews when we apply filter no result found , please find the attached screenshot for details." ,
           	 screenshot , testUrl
           	   
           	);
	
	}
	Reporter.log("take screenshot succesfully");
	
	extent.flush();
	BaseLib.driver.quit();
}
}
