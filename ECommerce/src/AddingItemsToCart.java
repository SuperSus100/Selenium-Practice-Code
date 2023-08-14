import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddingItemsToCart {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");

		WebDriver Driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(Driver, 5);
		
		//Implicit Wait
		//Driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		Driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] itemsNeeded = { "Cucumber", "Cauliflower", "Beetroot", "Beans" };
		addItems(Driver, itemsNeeded);
		
		Driver.findElement(By.cssSelector(".cart-icon")).click();
		
		Driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoCode")));
		Driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.cssSelector(".promoBtn")).click();
		
		//ExplicitWait
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		
		System.out.println( Driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}
	
	public static void addItems(WebDriver Driver, String[] itemsNeeded)
	{
		List<WebElement> Collection = Driver.findElements(By.cssSelector(".product-name"));
		int j=0;
		for (int i = 0; i < Collection.size(); i++) 
		{
			String[] name = Collection.get(i).getText().split("-");
			String formattedName = name[0].trim();
			// format correctly to get actual vegetable name by triiming "- 1kg"

			// covert array into array list for easy search to check whether the vegie you
			// search is present in ArrayList or not
			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) 
			{
				j++;
				Driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}

}
