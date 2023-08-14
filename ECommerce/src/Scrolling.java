import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector().scrollTop=5000");
		
		List<WebElement> Values = Driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		int Sum=0;
		for (int i=0; i<Values.size(); i++ )
		{
			Sum = Sum + Integer.parseInt(Values.get(i).getText());
		}

		System.out.println("Total Sum is:" +Sum);
		
		int Expected = Integer.parseInt( Driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		
		
		
		
	}

}
