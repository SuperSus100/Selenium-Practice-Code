package Demo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	@Parameters({"URL"})
	@Test
	public void Demo(String weburl)
	{
		System.out.println("Hello");
		System.out.println(weburl);
	}
	
	@Parameters({"URL"})
	@Test
	public void SecondTest(String PersonalLoan)
	{
		System.out.println("Bye");
		System.out.println(PersonalLoan);
	}
	
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will execute last");
	}

	
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I am number 1 from last");
	}
	
	
}
