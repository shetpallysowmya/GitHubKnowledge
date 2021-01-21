import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99LoginValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("http://www.demo.guru99.com/V4/");
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.findElement(By.name("uid")).sendKeys("shetpallysowmya@gmail.com");
driver.findElement(By.name("password")).sendKeys("123lucky");
driver.findElement(By.name("btnLogin")).click();
//Thread.onSpinWait();
//driver.quit();




	}
	
	
	

}
