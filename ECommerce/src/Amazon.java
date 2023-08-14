import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Amazon {
	
	public static void main(String[] args) throws IOException 
	{
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.amazon.in/");
	Actions a= new Actions(Driver);
	
	WebElement signin = Driver.findElement(By.id("nav-link-accountList"));
	a.moveToElement(signin).build().perform();
	
	WebElement NavDriver = Driver.findElement(By.id("nav-al-your-account"));
	List<WebElement> AccountOptions = NavDriver.findElements(By.tagName("a"));
	
		
	for (WebElement Options: AccountOptions)
	{
		String url = Options.getAttribute("href");
		HttpURLConnection	con	= (HttpURLConnection) new URL(url).openConnection();
		con.setRequestMethod("GET");
		con.connect();
		
		int respCode = con.getResponseCode();
		
		//if (respCode ==200)
		System.out.println("The link with Text:" +Options.getText() + "  "+" is getting passed with Response Code:"+respCode);
		
	}
	
	WebElement NavDriver1 = Driver.findElement(By.id("nav-al-wishlist"));
	List<WebElement> ListOptions = NavDriver1.findElements(By.tagName("a"));
	
		
	for (WebElement Options1: ListOptions)
	{
		String url = Options1.getAttribute("href");
		HttpURLConnection	con	= (HttpURLConnection) new URL(url).openConnection();
		con.setRequestMethod("GET");
		con.connect();
		
		String respmsg = con.getResponseMessage();
		System.out.println("The link with Text:" +Options1.getText() + "  "+" is getting passed with Response Code:"+respmsg);
		//int respCode = con.getResponseCode();
		
		//if (respCode ==200)
		//System.out.println("The link with Text:" +Options1.getText() + "  "+" is getting passed with Response Code:"+respCode);
		
	}
	
	Driver.findElement(By.id("nav-flyout-ya-newCust")).click();
	
	
	}

}
