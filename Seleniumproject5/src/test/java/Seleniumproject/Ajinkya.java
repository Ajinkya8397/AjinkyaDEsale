package Seleniumproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Ajinkya {
	WebDriver driver;
	 @BeforeTest
	  public void configureBrowser()
	  {
		  driver=DriverUtility.configureBrowser("chrome");
		  driver.manage().window().maximize();
	  }
	 @Test(dataProvider="inputCredentials")
	 public void testLogin(String userName,String pwd)
	 {
		 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
		  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(userName);
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		  
	 }
	 @DataProvider
	 public Object[][] inputCredentials() throws IOException
	 {
	 Object[][] data=ExcelReader.readData();
	 return data;
	 }
	 
	
 @AfterTest
	  public void afterTest()
	  {
		 //driver.close();
	  }
	
	

}
