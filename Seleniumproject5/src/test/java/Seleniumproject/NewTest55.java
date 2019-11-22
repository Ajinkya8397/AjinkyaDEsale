package Seleniumproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest55 {
	WebDriver driver;
	
  @Test
  public void testAboutUs() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  Actions act=new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Our\n" + 
	  		"												Offices')]"))).
	  moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Bangalore')]"))).click().build().perform();
  }
  @BeforeTest
  public void configureBrowser()
  {
	  driver=DriverUtility.configureBrowser("chrome");
	  driver.manage().window().maximize();
  }
  @AfterTest
  public void afterTest()
  {
	 //driver.close();
  }
}
