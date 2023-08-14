import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddif {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rediff.com");
		
		//Syntax "tagName[Attribute*='value']"
		Driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		Driver.findElement(By.cssSelector("input#login1")).sendKeys("Username");
		Driver.findElement(By.xpath("//input[contains(@name, 'pass')]")).sendKeys("Password");
		//Driver.findElement(By.id("password")).sendKeys("password");
		//Driver.findElement(By.name("proceed")).click();

	}

}
