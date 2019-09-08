package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fw1 {
	WebDriver bo;
	String bpath="";
  @Test(enabled=true, priority=1, groups="login")
  public void Tc2() {
  bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet");
  bo.findElement(By.xpath("//")).sendKeys("lab1");
  bo.findElement(By.xpath("")).sendKeys("");
  Assert.assertEquals(actual, expected);
  }
  @Test(enabled=true, priority=1, groups="login")
public void Tc3(){
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  Assert.assertEquals(actual, expected);

  }
  //dependsOnMenthods is used if Tc3 fails then next Tcs should not run
  @Test(enabled=true, priority=1, groups="login", dependsOnMethods="Tc3")
  public void Tc4(){
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  Assert.assertEquals(actual, expected);

  }
  @Test(enabled=true, priority=1, groups="login", dependsOnMethods="Tc3")
  public void Tc5(){
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  Assert.assertEquals(actual, expected);

  }
  @Test(enabled=true, priority=1, groups="login", dependsOnMethods="Tc3")
  public void Tc6(){
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
	  bo.findElement(By.xpath("")).sendKeys("");
  }
  
@BeforeMethod
 public void be(){
System.setProperty("webdriver.chrome.driver", "D:\\shar\\chromedriver_win32\\chromedriver.exe");
bo=new ChromeDriver();
bo.get(bpath);
bo.manage().window().maximize();
}
@AfterMethod
public void bclose(){
   bo.close();
}

}