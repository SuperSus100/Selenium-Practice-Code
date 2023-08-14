import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset //input[@id='checkBoxOption2']")).click();
		
		String Checkboxtext = Driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset //label[@for='benz']")).getText();
		System.out.println(Checkboxtext);
		
		WebElement StaticDropdown = Driver.findElement(By.id("dropdown-class-example"));
		Select Dropdown = new Select(StaticDropdown);

		Dropdown.selectByVisibleText(Checkboxtext);
		
		Driver.findElement(By.id("name")).sendKeys(Checkboxtext);
		
		Driver.findElement(By.id("alertbtn")).click();
		
		String AlertBoxText = Driver.switchTo().alert().getText();
		
		if (AlertBoxText.contains(Checkboxtext))
		{
			System.out.print("String match found");
		}
		else
		{
			System.out.print("String match NOT found");
		}
	}

}
