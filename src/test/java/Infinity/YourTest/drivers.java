package Infinity.YourTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class drivers {
	/*
public static RemoteWebDriver driver = null;
public void launch_browser(String browsername)
{

	try {
		if (browsername.equalsIgnoreCase("firefox"))
		{
			new FirefoxDriver();
		}
		if (browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\drivers\\chromedriver.exe");
	    new ChromeDriver();
		
}
	}
		catch (Exception e)
		{
		System.out.println("print it");
		}
	
}
}
		
	


		
		
	

*/
protected static WebDriver driver = new FirefoxDriver();
		
	
}

