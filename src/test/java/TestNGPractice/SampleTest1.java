package TestNGPractice;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Com.vtiger.Genricutil.BaseClass;

@Listeners(Com.vtiger.Genricutil.ListenerImp.class)
public class SampleTest1 extends BaseClass{
	@Test
	public void createorganisation()
	{
		System.out.println(10/0);
	}
	//@Test
	public void modifyorganisation()
	{
		System.out.println("Modify the organisation");
	}
	

}
