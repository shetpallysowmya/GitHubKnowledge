package NewPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.findElement(By.id("travel_date")).click();
		//System.out.println(driver.findElement(By.className("datepicker-switch")).getText());
		
       while(!driver.findElement(By.className("datepicker-switch")).getText().contains("January"))
    {
	    driver.findElement(By.xpath("(//th[@class=\"next\"])[1]")).click();
         }

        List<WebElement> day = driver.findElements(By.className("day"));

         for(int i=0;i<day.size();i++) {

        if(day.get(i).getText().equalsIgnoreCase("15")) {
	    day.get(i).click();
	    break;
     }

	}

	}

}

