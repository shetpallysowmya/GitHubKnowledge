import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.io.File;

public class WebDriverDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//java sample code
		//File file=new File("https:www.google.com");
		//selenium webdriver sample code
		//chromedriver is a predefined class in selenium webdriver library
		//created an object of chromedrive(childclass)r and assigning it to variable of webdriver(parent interface)
		//webdriver is an interface..as we cant create an object for interface,
		//ww are using the child class of interface which is chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();//constructor will be invoked which has predefind code to launch chrome browser
		//we have to set up the ChromeDriver to avoid illegal state exception
		
		//selenium commands are used to open any application URL's like google.com
		//Selenium webdriver is an API which consists of commands
		//API is a collection of classes,interfaces,predefined variables and methods
		//predefined methods of webdriver are API commands
		driver.get("http://omayo.blogspot.com/");//get() opens a new webpage
		driver.manage().window().maximize();
		//finding the UI elements using locators,By is a predefined class
		//WebElement ele=driver.findElement(By.id("confirm"));//findelement returns a webelement(interface which stores UI element
		//as Id() is a static method of By class,we can access Id () using classname not by creating  object
		//click() is a predefined method of webelment interfacee
		//ele.click();
/*WebElement ele1=driver.findElement(By.name("q"));
ele1.sendKeys("Sowmya");*/
		/*WebElement ele=driver.findElement(By.name("fname"));
		//hold the prgm execution for 5 seconds...use thread(predefined class in java) use sleep method
		//Thread.sleep(5000);
		ele.clear();*/
		/*WebElement ele=driver.findElement(By.className("classone"));
		ele.sendKeys("Learn");*/
		/*WebElement ele=driver.findElement(By.linkText( "Selenium143"));
		ele.click();*/
		/*WebElement ele=driver.findElement(By.cssSelector("#confirm"));
		ele.click();*/
		/*WebElement ele=driver.findElement(By.xpath("//input[@id='confirm']"));
		ele.click();*/
		//driver.findElement(By.xpath("//input[@id='confirm']")).click();//This also works ithout assigning it to an elemnet of WebElement
		//String text=driver.findElement(By.id("pah")).getText();//to fetch the visible text 
		//System.out.println(text);
		//to retrieve the title of webpage,we use getTitle()
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement ele=driver.findElement(By.partialLinkText("compendium"));
		
		ele.click();
		System.out.println(driver.getCurrentUrl());*/
		//driver.close();
		//WebElement ele=driver.findElement(By.linkText("Open a popup window"));
		//ele.click();
		//Thread.sleep(5000);
		//driver.close();
		
		//String text=driver.findElement(By.name("fname")).getAttribute("value");
		//System.out.println(text);
		/*boolean check=driver.findElement(By.id("but2")).isDisplayed();
		System.out.println(check);
		boolean check1=driver.findElement(By.id("hbutton")).isDisplayed();
		System.out.println(check1);
		boolean check2=driver.findElement(By.id("but2")).isEnabled();
		System.out.println(check2);
		boolean check3=driver.findElement(By.id("but1")).isEnabled();
		System.out.println(check3);*/
		/*boolean selectcheck=driver.findElement(By.id("checkbox2")).isSelected();
		System.out.println(selectcheck);*/
		
		/*driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String sourcecode=driver.getPageSource();
		System.out.println(sourcecode);*/
		
		
		driver.quit();
	}

}
