package TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {
	@BeforeSuite
	public void ConnectToDataBase()
	{
		System.out.println("Connect to the DataBase");
	}
	@BeforeClass
	public void LaunchBrowser()
	{
		System.out.println("Launch the Browser");
	}
	
	@BeforeMethod
	public void Login()
	{
		System.out.println("Login into the application");
	}
	@Test
	public void CreateOrganisation()
	{
		System.out.println("create the organisation");
	}
	@Test
     public void ModifyOrganisation()
     {
    	 System.out.println("modify the organisation");
     }
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout from the application");
	}
	@AfterClass
	public void CloseBrowser()
	{
		System.out.println("Close the Browser");
	}
	@AfterSuite
	public void DisConnectToDataBase()
	{
		System.out.println("DisConnect to the DataBase");
	}
}
