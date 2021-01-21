package NewPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\eshwar\\Desktop\\JAVA_PRACTICE\\SeleniumWebDriverDemoProject\\Drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("http://omayo.blogspot.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//print table headings
		List<WebElement> headings = driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
		for(int i=0;i<headings.size();i++)
			System.out.println(headings.get(i).getText());
		//to print table data
		List<WebElement> data = driver.findElements(By.xpath("//table[@id=\"table1\"]//td"));
		for(int j=0;j<data.size();j++)
			System.out.println(data.get(j).getText());
		//to print the first row data
		List<WebElement> firstrowele = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr[1]//td"));
		for(int k=0;k<firstrowele.size();k++)
			System.out.println(firstrowele.get(k).getText());
		//given a person name,print the place of that person
		String givenName="Praveen";
		List<WebElement> names = driver.findElements(By.xpath("//table[@id=\"table1\"]//td[1]"));
		int rowno=0;
		for(int n=0;n<names.size();n++)
		{
			if(names.get(n).getText().equalsIgnoreCase(givenName))
				rowno=n;
			
		}
		String path="//table[@id=\"table1\"]//tr["+(rowno+1)+"]//td[3]";
		System.out.println(driver.findElement(By.xpath(path)).getText());
		//no of rows
		System.out.println(driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody//tr")).size());
		System.out.println(driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody//tr[1]//td")).size());
		driver.quit();

	}

}
