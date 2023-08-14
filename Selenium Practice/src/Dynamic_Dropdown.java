import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click(); //Clicking the dropdown
		
		Driver.findElement(By.xpath("//a[@value='IXB']")).click();
		Thread.sleep(2000L);
		//Method 1: By selecting the index of that Xpath
		//Driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		//Method 2: By Traversing to its parent Xpath and then desired element as its child
		
		Driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();

		//TO Select today's Date
		//Driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();
		//Driver.findElement(By.cssSelector(".ui-datepicker-days-cell-over.ui-datepicker-current-day.ui-datepicker-today")).click();
		
		//To Check whether 2nd Calender UI is Disabled/Enabled
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
		Driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); //Clicking RoundTrip Button
		System.out.println(Driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
	}

}
