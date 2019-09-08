package shar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver bo=new ChromeDriver();
	    bo.get("http://apps.qaplanet.in/qahrm/login.php");
	    bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("");
	    bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("");
	    bo.findElement(By.xpath("//input[@name='Submit']")).click();
	   if(bo.switchTo().alert().getText().equals("User Name not given!"))
		   System.out.println("pass");
	   else
		   System.out.println("fail");
	   Thread.sleep(6000);
	   bo.switchTo().alert().accept();
	   bo.close();
	}

}
