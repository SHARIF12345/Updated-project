package sharee;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		 WebDriver bo=new ChromeDriver();
		 bo.get("http://apps.qaplanet.in/qahrm/login.php");
      bo.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("qaplanet1");
      bo.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("lab1");
      bo.findElement(By.xpath("//input[@name='Submit']")).click();
      bo.findElement(By.xpath("/html[1]/body[1]/div[3]/ul[1]/li[3]/a[1]")).click();
	}

}
