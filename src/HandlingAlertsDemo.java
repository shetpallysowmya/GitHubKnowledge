import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class HandlingAlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Handling Alerts
		/*driver.findElement(By.id("alert1")).click();
		Alert alert = driver.switchTo().alert();
		String Textalert=alert.getText();
		System.out.println(Textalert);
		alert.accept();*/
		//Handling dropdown and multiselection fields
		/*driver.findElement(By.id("drop1")).sendKeys("doc 3");//wrong approach
		//use select(predefined class in selenium designd for dropdown and multiselection box
		WebElement dropdownfield = driver.findElement(By.id("drop1"));
	 Select select=new Select(dropdownfield);
	// select.selectByVisibleText("doc 3");
	 select.selectByIndex(1);*/
	 //Handling multiselection box
		WebElement multiselectionfild = driver.findElement(By.id("multiselect1"));
		Select select=new Select(multiselectionfild);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		Thread.sleep(3000);
		select.deselectByVisibleText("Audi");
	 
		
//driver.quit();
	}

}
