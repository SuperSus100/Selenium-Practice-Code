import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Another_Dropdown {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Selecting Checkboxes
		//System.out.println(Driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		Assert.assertFalse(Driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//System.out.println(Driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Assert.assertTrue(Driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//Checking count of Checkboxes present
		System.out.println(Driver.findElements(By.cssSelector("input[type=checkbox]")).size());
		Assert.assertEquals(Driver.findElements(By.cssSelector("input[type=checkbox]")).size(), 6);
		
		
		
		
		//Working on Passennger Drowpdowns
		
		Driver.findElement(By.id("divpaxinfo")).click(); // Select and Click on dropdown
		Thread.sleep(2000L);
		
		int i=0;
		while (i<=3)
		{
		Driver.findElement(By.id("hrefIncAdt")).click(); // Adding more
		i++;
		}
		Driver.findElement(By.id("btnclosepaxoption")).click(); // Done Button 
		
		

	}

}
