package shar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver bo;
	String bpath="http://apps.qaplanet.in/qahrm/login.php";
	
  @Test(enabled=true, priority=2, groups="login")
  public void Tc1() {
	    bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	    bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	    bo.findElement(By.xpath("//input[@name='Submit']")).click();
	    Assert.assertEquals(bo.getTitle(), "OrangeHRM");
	   // Reporter.log("home page is success");
  }
	   @Test(enabled=true, priority=1, groups="admin")
	   public void Tc2(){
		    bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
		    bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
		    bo.findElement(By.xpath("//input[@name='Submit']")).click();
		  Assert.assertEquals(bo.switchTo().alert(), "User Name not given!");
		/*  if (bo.switchTo().alert().equals("User Name not given!")) {
			System.out.println("sucess");
		}else {
			System.out.println("not sucess");
		}*/
		  //Reporter.log("home page is fail");
	   }
	   @BeforeMethod
	   void be(){
 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        bo=new ChromeDriver();
	    bo.get(bpath);

	   }
	   @AfterMethod
	   void beclose(){
		  // bo.close();
 bo.quit();
	   }
	   
  
}

