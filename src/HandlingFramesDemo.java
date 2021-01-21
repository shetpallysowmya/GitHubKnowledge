import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//Switch to required frame
		WebElement iframe2 = driver.findElement(By.id("iframe2"));
		driver.switchTo().frame(iframe2);
		driver.findElement(By.id("q")).sendKeys("Selenium");
		//SWItch to default space
		driver.switchTo().defaultContent();
		driver.findElement(By.id("ta1")).sendKeys("Defaultcontent");
		driver.findElement(By.id("ta1")).clear();
		//to find the total no of frames on a webpage
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.quit();
	}

}
