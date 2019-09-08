package shar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    WebDriver bo=new ChromeDriver();
	    bo.get("http://apps.qaplanet.in/qahrm/login.php");
	    bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
	    bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
	    bo.findElement(By.xpath("//input[@name='Submit']")).click();
	   if(bo.getTitle().equals("OrangeHRM"))
		   System.out.println("pass");
	   else
		   System.out.println("fail");
	   bo.close();
	}

}
