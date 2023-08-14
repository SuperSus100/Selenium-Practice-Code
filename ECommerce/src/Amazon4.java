import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon4 {
	
	
	
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(Driver,10);
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in/");
	
	Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	Driver.findElement(By.id("nav-search-submit-button")).click();

	JavascriptExecutor js = (JavascriptExecutor)Driver;
	js.executeScript("window.scrollBy(0,6000)");

	
	List<WebElement> Pagination = Driver.findElements(By.cssSelector("ul[class='a-pagination'] li"));
	if(Pagination.size()>0)
	{
		WebElement Next= Driver.findElement(By.cssSelector("ul[class='a-pagination'] li[class='a-last']"));
		if(Next.isEnabled())
		{
			Next.click();
		}
	}
	
	}

}
