import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		
		Driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		Driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("results")));
		
		System.out.println( Driver.findElement(By.id("results")).getText());
	}

}
