package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver launch(String browserName)
	{
		WebDriver driver=null;
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			
			//System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			Reporter.log("chrome Launched",true);
	}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			//System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
			Reporter.log("Firefox Launched",true);
		}
	
	
	return driver;
	
	

	}

}
