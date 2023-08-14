import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExample 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		Driver.findElement(By.cssSelector("[id='start'] button")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver).withTimeout(Duration.ofSeconds(30)).
				pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement Elem = wait.until(new Function<WebDriver, WebElement>()
		{
		public WebElement apply(WebDriver Driver)
		{
			if (Driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed())
			{
				return Driver.findElement(By.cssSelector("[id='finish'] h4"));
			}
			else return null;
		}
		});
		
	}
			
		
				
		
}
	


