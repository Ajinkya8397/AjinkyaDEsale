package Seleniumproject.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void configuration()
	{
		driver=DriverUtility.configureBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
  public void testLogin()
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	driver.findElement(By.id("userName")).sendKeys("Lalitha");
	  driver.findElement(By.id("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).click();
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("password456");
	 driver.findElement(By.xpath("//input[@value='Login']")).click();
	  
	 // driver.findElement(By.linkText("SignOut")).click();
	//  driver.findElement(By.name("Login")).click();
	  Assert.assertEquals(driver.getTitle(),"Admin Home");
	  driver.findElement(By.xpath("/html/body/main/div/div/div/div[4]/button/")).click();
	  Select catgDropDown=new Select(driver.findElement(By.id("categorydropid")));
	  catgDropDown.selectByIndex(2);
	  Select catgDropDown1=new Select(driver.findElement(By.id("subcategorydropid")));
	  catgDropDown1.selectByIndex(3);
	  driver.findElement(By.xpath("//input[@value='View Products']")).click();
	  //driver.findElement(By.xpath("//div[@class='btn-group'][2]/button")).click();
	  //driver.findElement(By.xpath("//input[@id='catgName']")).sendKeys("Laptop");
	  //driver.findElement(By.xpath("//input[@id='catgDesc']")).sendKeys("Apple macbook air");
	  //driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	  
  }
  @AfterTest
  public void closeApp() {
	 //driver.close();
	  
  }
  
}
