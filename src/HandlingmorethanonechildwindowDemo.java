import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingmorethanonechildwindowDemo {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://omayo.blogspot.com/");//main window is opened
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();//first child window is opened
	driver.findElement(By.linkText("Blogger")).click();//2nd child window is opened
	Set<String> windowids = driver.getWindowHandles();//here ids are stored randomly so we do not know which is the first child window
	Iterator<String> itr = windowids.iterator();
	String textonpopupwindow=null;
	while(itr.hasNext()) {
	String windowid = itr.next();//we do not know the window id as it is random
	driver.switchTo().window(windowid);//switching to unknown windowid
	if(driver.getTitle().equals("Basic Web Page Title")) {
		textonpopupwindow=driver.findElement(By.id("para1")).getText();
		
	}
	
	}
		
	System.out.println(textonpopupwindow);
	driver.quit();
	//how to close each window separately
}
}
