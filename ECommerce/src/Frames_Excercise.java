import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Excercise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://the-internet.herokuapp.com");
		
		Driver.findElement(By.linkText("Nested Frames")).click();
		
		
		
		Driver.switchTo().frame("frame-top");
		Driver.switchTo().frame("frame-middle");
	
		System.out.println(Driver.findElement(By.id("content")).getText());
		
		

	}

}
