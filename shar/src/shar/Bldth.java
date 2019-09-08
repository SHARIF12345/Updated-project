package shar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bldth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    WebDriver bo=new ChromeDriver();
    bo.get("http://apps.qaplanet.in/qahrm/login.php");
    bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
    bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
    bo.findElement(By.xpath("//input[@name='Submit']")).click();
    bo.close();
	}

}
