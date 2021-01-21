import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//mouse(hover and click) simulations
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("http://omayo.blogspot.com/");
		//driver.get("http://omayo.blogspot.com/p/page3.html");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//WebElement target = driver.findElement(By.id("blogsmenu"));
		//WebElement target2=driver.findElement(By.xpath("//a/span[text()=\"Selenium143\"]"));
		//WebElement slider = driver.findElement(By.xpath("//a[@aria-labelledby='price-min-label']"));
		//WebElement rightclickonsearchbox = driver.findElement(By.xpath("//input[@class=\"gsc-input\"]"));
				//rightclickonsearchbox.sendKeys("change");
		WebElement source = driver.findElement(By.id("box1"));
		WebElement destination = driver.findElement(By.id("box101"));
		
		Actions act=new Actions(driver);
		
		//act.moveToElement(target).perform();
		
		//act.moveToElement(target2).perform();
		//act.click(target2).perform();
		//code optimization
		//act.moveToElement(target2).click().build().perform();//when there are multiple commands to run,use build()
		
		//draganddropby() is to just drag the slide left to right or vice versa
		//act.dragAndDropBy(slider, 100, 0).perform();
		//Thread.sleep(2000);
		//act.dragAndDropBy(slider, -200, 0).perform();
		//contextclick() which is right click
		//act.contextClick(rightclickonsearchbox).perform();
		//Thread.sleep(2000);
		//double click
		//act.doubleClick(rightclickonsearchbox).perform();
		//draganddrop is to drag the elements from left to right or top to bottom in all directions
		act.dragAndDrop(source, destination).perform();
		Thread.sleep(2000);
		driver.quit();

	}


}
