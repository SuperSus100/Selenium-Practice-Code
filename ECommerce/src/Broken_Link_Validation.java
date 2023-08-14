import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Broken_Link_Validation {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//To Validate:
		//Step1: get all URL's tied up to links using selenium
		//Step2: Java method will call the URL's and gets you the status codes
		//Step3: If status code is not 200 series, then it seems to be failed
		
		//TO validate one link -
		
		//String url = Driver.findElement(By.cssSelector("a[href*='broken']")).getAttribute("href");
	
		//HttpURLConnection	con	= (HttpURLConnection) new URL(url).openConnection();
		//con.setRequestMethod("HEAD");
		//con.connect();
		//int respCode = con.getResponseCode();
		
		// System.out.println(respCode);
		
		
		//To Itterate through all the links
		WebElement FooterDriver = Driver.findElement(By.id("gf-BIG"));
		List<WebElement> Links = FooterDriver.findElements(By.tagName("a"));
		SoftAssert a = new SoftAssert();
		
		for (WebElement Link : Links)
		{
			String url1 = Link.getAttribute("href");
			HttpURLConnection	con1	= (HttpURLConnection) new URL(url1).openConnection();
			con1.setRequestMethod("HEAD");
			con1.connect();
			int respCode1 = con1.getResponseCode();
			a.assertTrue(respCode1 ==200,"The link with Text:" +Link.getText() + " is getting failed with Response Code:"+respCode1 );			
						
		}
		
		a.assertAll();
	}

}
