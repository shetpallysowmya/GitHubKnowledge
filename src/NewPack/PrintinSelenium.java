package NewPack;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintinSelenium {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//take a screenshot...we use screenshots for test proof
		
		File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//we convert the WebDriver object (driver) to TakeScreenshot. And call getScreenshotAs() method to create an image file by providing the parameter OutputType.FILE.
		FileUtils.copyFile(File, new File("C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\screenshots\\screenshot1.png"));
		driver.findElement(By.linkText("compendiumdev")).click();
		//another screenshot
		File File1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(File1, new File("C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\screenshots\\screenshot2.png"));
		driver.quit();
		
}
}
