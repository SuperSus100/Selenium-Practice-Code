
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Calendar_UI {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
       
		WebDriver Driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(Driver,30);
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date1']")).click();
		Thread.sleep(5000L);
		
		
		
		
		 
		//Select Current date
		Driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div[1]/table/tbody/tr[2]/td[4]")).click();

	}

}
