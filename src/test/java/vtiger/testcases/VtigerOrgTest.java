package vtiger.testcases;


import org.openqa.selenium.By;

import org.testng.annotations.Test;

import Com.vtiger.Genricutil.BaseClass;
import Com.vtiger.Genricutil.JavaUtility;


public class VtigerOrgTest extends BaseClass {
	@Test(groups="smoketest")
	public void createorgtest() throws Throwable {


		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='accountname']"))
		.sendKeys("shaik" + JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();
		Thread.sleep(4000);

	}

}
