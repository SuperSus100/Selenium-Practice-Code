import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		WebDriver Driver = new ChromeDriver();

		// Visiting Site
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Handelling Autosuggest
		Driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000L);
		List<WebElement> Collection = Driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : Collection) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}

		// Clicking the From_dropdown
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		Driver.findElement(By.xpath("//a[@value='IXB']")).click(); // Selecting From Location
		Thread.sleep(2000L);

		// Selecting Destination Location
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']"))
				.click();

		// Select Current date
		Driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[2]/td[4]")).click();

		// To Check whether 2nd Calender UI is Disabled/Enabled
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // Clicking RoundTrip Button
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));

		if (Driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Working on Passennger Drowpdowns

		Driver.findElement(By.id("divpaxinfo")).click(); // Select and Click on dropdown
		Thread.sleep(2000L);

		int i = 0;
		while (i <= 3) {
			Driver.findElement(By.id("hrefIncAdt")).click(); // Adding more
			i++;
		}
		Driver.findElement(By.id("btnclosepaxoption")).click(); // Done Button

		// Working with Static Dropdown
		WebElement StaticDropdown = Driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select Dropdown = new Select(StaticDropdown);

		Dropdown.selectByValue("INR");
		// System.out.println(Dropdown.getFirstSelectedOption().getText());

		// Clicking Search Button
		Thread.sleep(2000L);
		Driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
