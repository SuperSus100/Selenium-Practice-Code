import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Amazon2 {
	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		
	System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
	WebDriver Driver = new ChromeDriver();
	Driver.get("https://www.amazon.in/");
	Driver.manage().window().maximize();
	
	WebElement elem = Driver.findElement(By.id("searchDropdownBox"));
	
	Select s= new Select(elem);
		
	for (int i=0; i<s.getOptions().size();i++)
	{
		Thread.sleep(2000);
		
		s.selectByIndex(i);
		String selectedText =s.getFirstSelectedOption().getText(); 
		Driver.findElement(By.id("twotabsearchtextbox")).clear();
		Driver.findElement(By.id("twotabsearchtextbox")).sendKeys(selectedText);
		Driver.findElement(By.id("nav-search-submit-button")).sendKeys(Keys.CONTROL,Keys.ENTER);
		
		Set<String> windows = Driver.getWindowHandles(); //Will contain Parent id and Child ID
		
		Iterator<String> it = windows.iterator();
		String ParentId = it.next();
		String ChildId	= it.next();
		
		Driver.switchTo().window(ChildId);
		
		Thread.sleep(2000);
		String Check= Driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).getText().replaceAll("^\"+|\"+$", "");
		if(selectedText.contains(Check))
		{
			System.out.println("Searched String was : "+selectedText+"  Actual Visible String:"+Check);
		}
		Driver.close();
		Driver.switchTo().window(ParentId);
		
	}
	
	
	
	}

}
