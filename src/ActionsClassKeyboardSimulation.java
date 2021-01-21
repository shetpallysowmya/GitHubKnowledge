import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassKeyboardSimulation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//when ctrl button is held the link is opened in different tab eg:compendiumdev on omayoblogspot..keydown and keyup
		//This operation has to be simulated
		//WebElement linktobeopenedindifftab = driver.findElement(By.linkText("compendiumdev"));
		Actions act=new Actions(driver);
		//act.keyDown(Keys.CONTROL).click(linktobeopenedindifftab).keyUp(Keys.CONTROL).build().perform();
		//keys is another class(consists of all key operations) in selenium just like actions class..keydown is from actions class
//Use Enter key and tab key on keyboard
		//driver.findElement(By.name("userid")).sendKeys("Sowmya");
		//act.sendKeys(Keys.TAB).perform();//here sendkeys method belongs to actions class not webelement
		//driver.findElement(By.name("pswrd")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.ENTER);//code optimization,we can use sendkeys of webelement to press enter on the keyboard,we do not need action class
	
		//driver.findElement(By.xpath("//input[@value='Login']"));not required
		//act.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		//Thread.sleep(2000);
		//driver.quit();
		//To press multiple keys eg:ctrl+z i.e undo
		driver.findElement(By.id("ta1")).sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("ta1")).sendKeys(Keys.chord(Keys.CONTROL,"z"));//to press multiple keys,use keys.chord
		
	}
}

