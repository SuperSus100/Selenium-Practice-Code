import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownPractice {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement StaticDropdown = Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select Dropdown = new Select(StaticDropdown);
		Dropdown.selectByIndex(3);
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		Dropdown.selectByVisibleText("AED");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
		
		Dropdown.selectByValue("INR");
		System.out.println(Dropdown.getFirstSelectedOption().getText());
	}

}
