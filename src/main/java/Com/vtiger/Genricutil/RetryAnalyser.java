package Com.vtiger.Genricutil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
	int count=0;
	int retrylimit=4;
	public boolean retry(ITestResult result) {
		if(count<retrylimit)
		{
			count++;
			return true;
		}
		// TODO Auto-generated method stub

		return false;
	}

}
