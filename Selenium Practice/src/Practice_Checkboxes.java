import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Checkboxes {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(Driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		
		Driver.findElement(By.xpath("//input[@value='option1']")).click();
		System.out.println(Driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		
		//Number of checkBoxes
		System.out.println("Number of checkboxes are:" +(Driver.findElements(By.xpath("//div[@id='checkbox-example']//label")).size()));

	}

}
