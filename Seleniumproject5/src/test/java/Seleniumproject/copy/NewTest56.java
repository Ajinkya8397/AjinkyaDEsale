package Seleniumproject.copy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest56 {
	 WebDriver driver;
  @Test
  public void testFindDetaisl() {
	 
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  WebElement search=driver.findElement(By.id("myInput"));
	  Actions act=new Actions(driver);
	  act.sendKeys(search,"b").pause(1000).sendKeys(search,"a").pause(1000).sendKeys("g").build().perform();
	  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  }
  @BeforeTest
  public void configureBrowser() {
	  driver=DriverUtility.configureBrowser("chrome");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
