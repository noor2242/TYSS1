package TestNGPractice;

import org.testng.annotations.Test;

public class SampleTest2 {
	@Test(retryAnalyzer = Com.vtiger.Genricutil.RetryAnalyser.class)
	public void sampletest1() 
	{
		System.out.println(10/0);
	}

}
