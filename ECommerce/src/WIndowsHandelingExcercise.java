import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WIndowsHandelingExcercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com");
		
		Driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click(); //Clicking on the Link
		
		Driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> windows = Driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String Parentid = it.next();
		String ChildWindow = it.next();
		
		//String SecondChild = it.next();
		
		Driver.switchTo().window(ChildWindow); //Moving control on first child Window
		
		
		System.out.println( Driver.findElement(By.cssSelector(".example h3")).getText());
		
		Driver.switchTo().window(Parentid);
		System.out.println( Driver.findElement(By.cssSelector(".example h3")).getText());

	}

}
