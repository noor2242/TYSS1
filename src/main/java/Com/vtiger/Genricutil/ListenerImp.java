package Com.vtiger.Genricutil;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public class ListenerImp implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
//		WebDriverUtility wbu=new WebDriverUtility();
//	wbu.TakeScreenshot, null)
		String failedTestCasename = result.getMethod().getMethodName();
		String currentdate = new Date().toString().replace(" ", "_").replace(":", "_");
		EventFiringWebDriver ed=new EventFiringWebDriver(BaseClass.sdriver);
		File srcimg = ed.getScreenshotAs(OutputType.FILE);
		File destimg=new File("./Screenshots2/" +failedTestCasename+currentdate+".PNG");
		try {
			//FileUtils.copyFile(srcimg, destimg);
			Files.copy(srcimg, destimg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
