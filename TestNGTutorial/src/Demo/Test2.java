package Demo;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups= {"Smoke"})
	public void Demo2()
	{
		System.out.println("Demo2");
		Assert.assertTrue(false);
	}
	
	

	@Test(dataProvider="getdata")
	public void Demo3(String usrname,String pwd)
	{
		System.out.println("Demo3");
		System.out.println(usrname);
		System.out.println(pwd);
		
	}
	
	
	@BeforeTest
	public void PreRequisite()
	{
		System.out.println("I will execute first");
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		//1st Combination: username/password -Good Credit history user
		//2nd Combination: username/password -No Credit history user
		//3rd Combination: username/password -Fraudent Credit history user
		Object[][] data= new Object[3][2];
		
		//1st Set
		data[0][0]= "Username";
		data[0][1]="password";
		
		//2nd Set
		data[1][0]= "Username";
		data[1][1]="password";
		
		//3rd Set
		data[2][0]= "Username";
		data[2][1]="password";
		return data;
	}
}
