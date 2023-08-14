import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClasses_Mouse {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		
		Actions a= new Actions(Driver);
		
		WebElement SignIn = Driver.findElement(By.id("nav-link-accountList"));
		WebElement SearchBox = Driver.findElement(By.id("twotabsearchtextbox"));
		
		//Moving the cursor to element
		a.moveToElement(SignIn).build().perform();
		
		//Perform Right Click
		a.moveToElement(SignIn).contextClick().build().perform();
		
		//Writing in Capital Letter
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("sushant").build().perform();
		
		//Double click on the string
		a.moveToElement(SearchBox).click().keyDown(Keys.SHIFT).sendKeys("sushant").doubleClick().build().perform();
		
		
		

	}

}
