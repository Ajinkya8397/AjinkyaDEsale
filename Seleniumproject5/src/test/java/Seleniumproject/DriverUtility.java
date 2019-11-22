package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtility {
	static WebDriver driver;
	
	public static WebDriver configureBrowser(String Browsername)
	{
		if(Browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			return driver;
		}
		else if (Browsername.equals("explorer"))
		{
			System.setProperty("webdriver.ie.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			return driver;
		}
		else if (Browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_b6b.01.03\\Desktop\\kgf2\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
			return driver;
		}
		return null;
	}

}
