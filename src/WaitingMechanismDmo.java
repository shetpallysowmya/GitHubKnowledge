import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingMechanismDmo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		//Implicit waiting by selenium
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);//it is a global ait which waits for all the elements
		
		driver.findElement(By.xpath("//button[contains(text(),'Dropdown')]")).click();
		//problem with implicit wait is..for sake of few elemnets,we have to apply implicit wait for all the elements..also it takes 30 seconds to throw an exception even if an element with 3s timeout hast to throw
		//wait by Java
		//Thread.sleep(10000);//as the programmer designed the dropdown options come after 3 sec,wasting 7 sec of time
		//Explicit wait->WebDriverWait()
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook"))).click();//as there is no example of 30sec wait element..took facebook as  example
       // driver.findElement(By.linkText("Facebook")).click();
        driver.quit();
		
	}

}
