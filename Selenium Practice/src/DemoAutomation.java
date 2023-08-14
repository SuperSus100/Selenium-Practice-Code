import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\BrowserDriver\\msedgedriver.exe");
		
		//ChromeDriver Driver = new ChromeDriver();
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://www.google.com");
		System.out.println("Page Title is:" +Driver.getTitle());
		System.out.println("Current URL is:" +Driver.getCurrentUrl());
		//System.out.println(Driver.getPageSource());
		
		Driver.get("https://www.facebook.com");
		System.out.println("Page Title is:" +Driver.getTitle());
		System.out.println("Current URL is:" +Driver.getCurrentUrl());
		//Driver.navigate().back();
		//Driver.findElementById("email").sendKeys("sushantkaushik88@gmail.com");
		//Driver.findElement(By.linkText("Forget account?")).click();
		
		
		
		//CSSSelector Example
		
		Driver.findElement(By.cssSelector("#email")).sendKeys("Through CSS");
		
		//Driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//Driver.findElement(By.cssSelector("button#loginbutton")).click();
		
		Driver.close();
	}
	
	

}
