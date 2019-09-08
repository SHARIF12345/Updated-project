package crossbrowser;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screensht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\shar\\chromedriver_win32\\chromedriver.exe");
		WebDriver bo=new ChromeDriver();
		bo.get("");
		File SrcFile=((TakesScreenshot)bo).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SrcFile, newFile(""));
	}

}
