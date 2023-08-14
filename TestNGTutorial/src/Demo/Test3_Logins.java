package Demo;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3_Logins {
	
	
	@Test
	public void WebLogin()
	{
		//Selenium Code
		System.out.println("WebLogin");
	}
	
	@BeforeMethod
	public void BeforeMthd()
	{
		//Appium Code
		System.out.println("Before Method");
	}

	@Test(groups= {"Smoke"})
	public void MobileLogin()
	{
		//Appium Code
		System.out.println("MobileLogin");
	}
	
	@BeforeSuite
	public void B4Suite()
	{
		//Appium Code
		System.out.println("I am Number 1");
	}
	
	@Parameters({"URL","UserName"})
	@Test
	public void MobileLoginNew(String CarLoan, String UserName)
	{
		//Appium Code
		System.out.println("MobileLoginNew");
		System.out.println(CarLoan);
		System.out.println(UserName);
		
	}
	
	@Test
	public void LoginAPI()
	{
		//Rest API Automation
		System.out.println("LoginAPI");
	}
}
