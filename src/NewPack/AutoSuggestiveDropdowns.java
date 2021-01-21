package NewPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestiveDropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement logo = driver.findElement(By.xpath("//*[@class=\"mmtLogo makeFlex\"]"));
		Actions act=new Actions(driver);
		act.moveToElement(logo).click().perform();
		//From
		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("del");
		int i=0;
		
		while(i<4)
		{
			Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.DOWN);
		i++;
		}
		
		
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys(Keys.ENTER);
		
		
		driver.quit();

	}

}
