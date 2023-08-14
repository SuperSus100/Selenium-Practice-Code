import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Salesforce {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		
		//ChromeDriver Driver = new ChromeDriver();
		
		WebDriver Driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Driver, 10);
		
		Driver.get("https://login.salesforce.com");
		System.out.println("Page Title is:" +Driver.getTitle());
		System.out.println("Current URL is:" +Driver.getCurrentUrl());
		//System.out.println(Driver.getPageSource());
		
		
		//Driver.navigate().back();
		Driver.findElement(By.id("username")).sendKeys("sushantkaushik88@gmail.com");
		Driver.findElement(By.name("pw")).sendKeys("sushantkaushik88@gmail.com");
		//Driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
		
		Driver.findElement(By.cssSelector("input#Login")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
		String Error = Driver.findElement(By.id("error")).getText();
		System.out.println(Error);
		
		
		
		
		Driver.close();
	}
	
	

}
