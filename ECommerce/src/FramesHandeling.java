import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://jqueryui.com/droppable");
		
		System.out.println(Driver.findElements(By.tagName("iframe")).size());
		
		Driver.switchTo().frame(0);
		//Driver.switchTo().frame(Driver.findElement(By.cssSelector(".demo-frame")));
		Driver.findElement(By.id("draggable"));
		
		Actions a = new Actions(Driver);
		WebElement source = Driver.findElement(By.id("draggable"));
		WebElement destination = Driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, destination).build().perform();
		
		Driver.switchTo().defaultContent(); //To move focus back to HTML page from Frames to be able to work on it
		

	}

}
