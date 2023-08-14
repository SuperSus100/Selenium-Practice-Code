import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Driver.findElement(By.cssSelector(".blinkingText")).click();
		
		Set<String> windows = Driver.getWindowHandles(); //Will contain Parent id and Child ID
		
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String ChildId	= it.next();
		
		Driver.switchTo().window(ChildId);
		
		System.out.println(Driver.findElement(By.cssSelector(".im-para.red")).getText());
		//Driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String email = Driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		Driver.switchTo().window(ParentId);
		Driver.findElement(By.id("username")).sendKeys(email);
		
	}

}
