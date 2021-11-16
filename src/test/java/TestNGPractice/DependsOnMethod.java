package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(invocationCount=2)
	public void login()
	{
		System.out.println("login into app");
	}
	@Test
	public void createopp()
	{
		Assert.fail();
		System.out.println("created");
	}
	@Test(dependsOnMethods="createopp")
	public void createcon()
	{
		System.out.println("contact created");
	}
	@Test(enabled=false)
	public void createcampaign()
	{
		System.out.println("campaign done");	
	}
	@Test
	public void logout()
	{
		System.out.println("logout from app");
	}
}



