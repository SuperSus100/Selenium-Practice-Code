import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_UI_Full {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
	    //14 September
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//Selecting Month
	 	Driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1] //span[@class='ui-datepicker-month']"));
	 	
	 		while (! Driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[1] //span[@class='ui-datepicker-month']")).getText().contains("December"))
	 		{
	 			Driver.findElement(By.cssSelector("a[data-handler='next']")).click();
	 			Thread.sleep(1000L);
	 		}
	 		
		
		
		//Selecting Date
		List<WebElement> DateList = Driver.findElements(By.cssSelector("[data-handler='selectDay']"));
		for (int i=0; i<DateList.size() ; i++)
		{
			if (DateList.get(i).getText().contains("20"))
			{
				DateList.get(i).click();
			}
		}
		

	}

}
