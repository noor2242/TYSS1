package vtiger.testcases;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Com.vtiger.Genricutil.BaseClass;
import Com.vtiger.Genricutil.ExcelUtility;
import Com.vtiger.Genricutil.JavaUtility;


public class OrgIndustryTest extends BaseClass{
	@Test(groups="smoketest")
	public  void orgindustrytest() throws Throwable {
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		ExcelUtility eu=new ExcelUtility();
		driver.findElement(By.xpath("//input[contains(@name,'accountname')]")).sendKeys(eu.excelutilty("Sheet1", 3, 2)+ JavaUtility.generateRandomNumber());

		Thread.sleep(5000);
		WebElement ddAddr = driver.findElement(By.xpath("//select[@name='industry']"));
		ddAddr.click();
		wbu.selectByValue(ddAddr,"Chemicals");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();

		WebElement icon= driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));

		wbu.MovetoElement(driver, icon);
		Thread.sleep(3000);
		
	}



}


