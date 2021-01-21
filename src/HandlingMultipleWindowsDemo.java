import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HandlingMultipleWindowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser="chrome";
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
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		Set<String> windowids = driver.getWindowHandles();//to capture all the currently opened windows,Set is the collection framework..it has no index and it is stored in random order
		Iterator<String> itr = windowids.iterator();//iterator stores the ids of windows
		String mainwid = itr.next();//mainwindo id is stored in string variable
		String childwid = itr.next();//popup window id is stored in string variable
		driver.switchTo().window(childwid);//switching to popup window
		//to display the id of windows
		/*while(itr.hasNext()) {
			String wid=itr.next();
			System.out.println(wid);}*/
			
		String para1=driver.findElement(By.id("para1")).getText();
		System.out.println(para1);
		String para2=driver.findElement(By.id("para2")).getText();
		System.out.println(para2);	
		driver.close();
		driver.switchTo().window(mainwid);
		driver.close();
	}

}
