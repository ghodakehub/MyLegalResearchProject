package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import ConfigurationPath.PathFile;



public class BaseLib  extends PathFile{
	
	public static WebDriver driver;
	@BeforeClass
	public void initailizbrowser()
	{
		System.setProperty("webdriver.chrome.driver", PathFile.driverpath);
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
	
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		 driver.get(PathFile.appurl);
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		
	}
	
	
@AfterClass
	
	public void closeBrowser() {
	
		driver.quit();
	}
	
	
	}
	

