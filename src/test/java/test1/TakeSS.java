package test1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeSS {

	WebDriver driver;
	@Test
	public void takess() throws Exception
	{
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(2000);
		String path = "C:\\Users\\hp\\Desktop\\Auto\\Demo\\ScreenShotsSS";
		Thread.sleep(2000);
		File locate = new File(path+"naukri.jpg");
		Thread.sleep(2000);
		FileUtils.copyFileToDirectory(source, locate);
		Thread.sleep(5000);
		
		driver.close();
		
	}

}
