package UtilityClass;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

public class PdfDownlaodInProject {
	
	//BaseLib base;
	
	public void pdff()
	{
	String location=System.getProperty("user.dir")+"\\DownloadPdf\\";
	HashMap preferences= new HashMap();
	
	preferences.put("plugins.always_open_pdf_externally", true);
	
	
	preferences.put("download.default_directory",location );
	 ChromeOptions options= new  ChromeOptions();
	 
	 options.setExperimentalOption("prefs", preferences);
	  
	
	
	}
}