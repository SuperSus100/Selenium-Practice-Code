import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Excercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1. Count of all the links present on the page
		System.out.println( Driver.findElements(By.tagName("a")).size()); 
		
		//2. Count the links present in footer section 
		WebElement FooterDriver =  Driver.findElement(By.id("gf-BIG")); //Limiting the scope of driver to the footer section only
		
		System.out.println( FooterDriver.findElements(By.tagName("a")).size());
		
		//3. Count the links present in 1st column of footer section
		WebElement FirstColumnDriver = FooterDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println( FirstColumnDriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link present in the column and check whether they are working or not
		
		int i=0;
		List<WebElement> Links = FirstColumnDriver.findElements(By.tagName("a"));
		for (i=1; i<Links.size(); i++)
		{
			String EnterwithCTRL = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			//Links.get(i).click();
			
			Links.get(i).sendKeys(EnterwithCTRL);
			Thread.sleep(1000L);
		}
			
			Set<String> windows = Driver.getWindowHandles();
			Iterator<String> it = windows.iterator();
			
			while (it.hasNext())
			{
				
				Driver.switchTo().window(it.next());
				System.out.println( Driver.getTitle());
			}
		
		
		
		
	}

}
