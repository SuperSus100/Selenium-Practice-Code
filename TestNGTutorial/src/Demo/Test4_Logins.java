package Demo;

import org.testng.annotations.Test;

public class Test4_Logins {
	
	@Test
	public void WebLoginHomeLoan()
	{
		//Selenium Code
		System.out.println("WebLoginHome");
	}

	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//Appium Code
		System.out.println("MobileLoginHome");
	}
	
	@Test(dependsOnMethods={"WebLoginHomeLoan"})
	public void LoginAPIHomeLoan()
	{
		//Rest API Automation
		System.out.println("LoginAPIHome");
	}
}
