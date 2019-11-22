package Seleniumproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class NewTest58 {
	WebDriver driver;
	 @Test(priority=1, enabled=false)
  public void f() {
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	  driver.findElement(By.id("userName")).sendKeys("Ajin1119");
	  driver.findElement(By.id("firstName")).sendKeys("Ajinxx");
	  driver.findElement(By.id("lastName")).sendKeys("Desale");
	  driver.findElement(By.id("password")).sendKeys("Ajinkya1234");
	  driver.findElement(By.id("pass_confirmation")).sendKeys("Ajinkya1234");
	  //driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[6]/div/div/label/span[1]")).click();
	  driver.findElement(By.xpath("//input[@value='Male']")).click();
	  driver.findElement(By.id("emailAddress")).sendKeys("a.desale@gmail.com");
	  driver.findElement(By.id("mobileNumber")).sendKeys("8090102025");
	  driver.findElement(By.id("dob")).sendKeys("03/09/1997");
	  driver.findElement(By.id("address")).sendKeys("pimpri chinchwad,Pune");
	  Select ques = new Select (driver.findElement(By.id("securityQuestion")));
	  ques.selectByIndex(2);
	  driver.findElement(By.id("answer")).sendKeys("Dada");
	  //driver.findElement(By.xpath("//input[@value='Register'])")).click();
	  driver.findElement(By.xpath("//input[@type='submit']")).click();

  }
  @Test(priority=2)
  public void f1()
  {
	  driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  driver.findElement(By.id("userName")).sendKeys("Ajin1119");
	  driver.findElement(By.id("password")).sendKeys("Ajinkya1234");
      driver.findElement(By.name("Login")).click();
      
  }

  @Test(priority=3)
  public void f2()
  {
	  Actions acti=new Actions(driver);
	  WebElement search=driver.findElement(By.id("myInput"));
	  acti.sendKeys(search,"b").pause(1000).sendKeys(search,"a").pause(1000).sendKeys("g").build().perform();
	  acti.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Hand bag')]"))).click().build().perform();
	  driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	  driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
	  
  }
  @Test(priority=4)
  public void f3()
  {
	  driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	  driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
	  driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
	  driver.findElement(By.name("username")).sendKeys("123456");;
	  driver.findElement(By.name("password")).sendKeys("Pass@456");;
	  driver.findElement(By.name("Login")).click();
	  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");;
	  driver.findElement(By.xpath("//input[@value='PayNow']")).click();
		 
	
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=DriverUtility.configureBrowser("chrome");
	  driver.manage().window().maximize();
	
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
