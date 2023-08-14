import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		WebDriver Driver = new ChromeDriver();
				
		Driver.manage().window().maximize(); //To maximize the window
		Driver.manage().deleteAllCookies(); //To delete all cookies
		
		Driver.manage().deleteCookieNamed("Cookie Name"); //To delete specific cookie with its name
		
		Driver.get("https://Google.com");
		
		File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\sushantk\\Screenshot.png"));
	}
	

}
