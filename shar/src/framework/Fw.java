package framework;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fw {
	WebDriver bo;
	String bpath="http://gmail.com";
	Robot robot;
	
  @Test(enabled=true, priority=1,groups="login")
  public void Tc1() throws InterruptedException {
	  bo.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("9700159078a@gmail.com");
	  Thread.sleep(6000);
	  bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
      Thread.sleep(6000);
	 // bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
	  bo.findElement(By.xpath("//input[@name='password']")).sendKeys("");
	  Thread.sleep(6000);
	  bo.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]")).click();
	  Thread.sleep(6000);
	  
	  bo.findElement(By.xpath("//div[@gh='cm']")).click();
	  Thread.sleep(6000);
	  bo.findElement(By.name("to")).sendKeys("b.ankaiah143@gmail.com");
	  Thread.sleep(2000);
	  bo.findElement(By.name("subjectbox")).sendKeys("Shareef Resume");
	  Thread.sleep(2000);
	  //bo.findElement(By.id(":lr")).sendKeys("I am intrested for the given job.");
	  //Thread.sleep(2000);
	  bo.findElement(By.id(":m0")).click();
	  
	  StringSelection ss = new StringSelection("D:\\abandoned-forest-hd-wallpaper-34950.jpg");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	try {
		robot = new Robot();
	} catch (AWTException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	  robot.keyPress(KeyEvent.VK_CONTROL);
	  robot.keyPress(KeyEvent.VK_V);
	  robot.delay(2000);
	  robot.keyRelease(KeyEvent.VK_V);
	  robot.keyRelease(KeyEvent.VK_CONTROL);
	  robot.delay(2000);
	  robot.keyPress(KeyEvent.VK_ENTER);
	  robot.delay(2000);
	  robot.keyRelease(KeyEvent.VK_ENTER);
	  Thread.sleep(6000);
	  
	  bo.findElement(By.id(":k8")).click();

  }
  
  
  
  
 

@Test(enabled=true, priority=2, groups="login")
  public void Tc2() throws InterruptedException{
	 bo.findElement(By.xpath("/html[1]/body[1]/div[7]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click(); 
	 Thread.sleep(6000);
	 bo.findElement(By.xpath("//input[@name='to']")).sendKeys("sharief.956@gmail.com,9700159078a@gmail.com,6300693030s@gmail.com");
	 Thread.sleep(6000);
	 bo.findElement(By.xpath("//input[@id=':dr']")).sendKeys("these are my profise");
	 Thread.sleep(6000);
	 bo.findElement(By.xpath("//input[@id=':f9']")).click();

  }
//@Test()
 //public void Tc3(){
	
//}
@BeforeMethod
public void be(){
System.setProperty("webdriver.chrome.driver", "D:\\shar\\chromedriver_win32\\chromedriver.exe");
bo=new ChromeDriver();
bo.get(bpath);
bo.manage().window().maximize();
//bo.manage().deleteAllCookies();
}
@AfterMethod
 public void cls(){
	//bo.close();
}
}