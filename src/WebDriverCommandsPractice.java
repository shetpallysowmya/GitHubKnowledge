 	import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverCommandsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String browser="edge";
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver(); 
		}
		else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\geckodriver.exe");
		 driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		}
		else {
		System.setProperty("webdriver.ie.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\IEDriverServer.exe");//here the IE Driver server is downloaded from selenium.dev/downloads/3.141 version not as chrome,mozilla drivers from the browsers tab
		 driver=new InternetExplorerDriver();
		
		}
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sowmya539@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sharvaani@2020");
		driver.findElement(By.name("login")).click();
		
		}
			
		
		/*driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("sowmya539@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Sharvaani@2020");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("input-email")).sendKeys("shetpallysowmya@gmail.com");
		//String tag=driver.findElement(By.id("input-email")).getTagName();
		//System.out.println(tag);
		//String cssval=driver.findElement(By.xpath("//span[contains(text(),'Currency')]")).getCssValue("line-height");
		//System.out.println(cssval);
		//driver.findElement(By.id("input-password")).sendKeys("SeleniumJava@2020");
		//driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Thread.sleep(2000);
		//
		 /*org.openqa.selenium.Dimension d = driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).getSize();
		System.out.println(d.height);
		System.out.println(d.width);;//dimension is predefined class in selenium
		Point p = driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).getLocation();
		System.out.println(p.x);
		System.out.println(p.y);
		driver.manage().window().fullscreen();
		Thread.sleep(3000);*/
		//List<WebElement> elements = driver.findElements(By.tagName("a"));//returns list of webelements
		/*for(int i=0;i<elements.size();i++)
		System.out.println(elements.get(i).getText());//gettext() gives the text of the webelement ex:My account,Wishlist etc*/
		//using for each loop
		/*for(WebElement j:elements) {
			System.out.println(j.getText());
		}
		*/
		//driver.quit();

	}


