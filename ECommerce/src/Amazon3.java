import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;


public class Amazon3 {
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(Driver,10);
	Driver.manage().window().maximize();
	Driver.get("https://www.amazon.in/");
	
	Driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Laptop");
	Driver.findElement(By.id("nav-search-submit-button")).click();
	
	//Thread.sleep(2000);
	
	//Driver.findElement(By.id("low-price")).sendKeys("25000");
	//Driver.findElement(By.id("high-price")).sendKeys("45000");
	//Driver.findElement(By.cssSelector(".a-button-input")).click();
	JavascriptExecutor js = (JavascriptExecutor)Driver;
	js.executeScript("window.scrollBy(0,6000)");
	
	//wait.until(ExpectedConditions.visibilityOfAllElements(Driver.findElements(By.cssSelector("ul[class='a-pagination'] li"))));
	Thread.sleep(3000);
	List<WebElement> Pagination = Driver.findElements(By.cssSelector("ul[class='a-pagination'] li"));
	if(Pagination.size()>0)
	{
		
	}
	for (int i=0;i<Pagination.size();i++)
	{
		if(Pagination.get(i).getAttribute("class").toString().contains("a-last"))
		{
			Pagination.get(i).click();
		}
	}
	
	//List<WebElement> PriceList= Driver.findElements(By.cssSelector(".a-price-whole"));
	
	
	
	}

}
