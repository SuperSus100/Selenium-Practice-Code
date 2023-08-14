import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopAlerthandelling {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
			WebDriver Driver = new ChromeDriver();

			String Text = "Sushant";
			Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
				
			Driver.findElement(By.id("name")).sendKeys(Text);
			Driver.findElement(By.id("alertbtn")).click();
			System.out.println(Driver.switchTo().alert().getText());
			
			Driver.switchTo().alert().accept();
			
			
			//Working on Different PopUp having Ok and Cancel button
			Driver.findElement(By.id("confirmbtn")).click();
			Driver.switchTo().alert().dismiss();
	}

}
