package TestNGPractice;

import org.testng.annotations.Test;

public class Prioritytest {
	@Test(priority=-1)
	public void login()
	{
		System.out.println("login into app");
	}
	@Test(priority=2)
	public void createopp()
	{
		System.out.println("created");
	}
	@Test(priority=1)
	public void createcon()
	{
		System.out.println("contact created");
	}
	@Test(priority=0)
	public void createcampaign()
	{
		System.out.println("campaign done");	
	}
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("logout from app");
	}
}
