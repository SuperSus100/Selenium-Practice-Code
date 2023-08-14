import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000L);
		List<WebElement> Collection = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		
		for (WebElement option: Collection)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
	}

}
