import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://google.com");
		
		//Driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("Test");
		Driver.findElement(By.xpath("//textarea[//title='Search']")).sendKeys("Testing Text");

	}

}
