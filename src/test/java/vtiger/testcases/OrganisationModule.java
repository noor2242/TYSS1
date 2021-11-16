package vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com.vtiger.Genricutil.BaseClass;
import Com.vtiger.Genricutil.ExcelUtility;
import Com.vtiger.Genricutil.JavaUtility;

public class OrganisationModule extends BaseClass {
	@Test(groups="regression test")
	public void contactorgTest() throws Throwable {

		ExcelUtility eu=new ExcelUtility();


		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@src=\"themes/softed/images/btnL3Add.gif\"]")).click();
		Thread.sleep(2000);
		WebElement ddAddr =	driver.findElement(By.xpath("//select[@name='salutationtype']"));
		ddAddr.click();
		wbu.selectByIndex(ddAddr, 1);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(eu.excelutilty("Sheet1", 5, 3)+ JavaUtility.generateRandomNumber());
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(eu.excelutilty("Sheet1", 5, 4));
		driver.findElement(By.xpath("//tbody/tr[5]/td[2]/img[1]")).click();
		String pwt = driver.getTitle();
		wbu.SwitchToWindow(driver, pwt);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title=\"Save [Alt+S]\"]")).click();
		Reporter.log("organisation created");
		//Thread.sleep(3000);
		WebElement frst = driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String frstname = frst.getText();

		Assert.assertTrue(frstname.contains(eu.excelutilty("Sheet1", 5, 3)));
		System.out.println("verification done");
		Reporter.log("organisation done", true);



	}
	@Test(groups="smoketest")
	public  void orgindustrytest() throws Throwable {
		driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		ExcelUtility eu=new ExcelUtility();
		driver.findElement(By.xpath("//input[contains(@name,'accountname')]")).sendKeys(eu.excelutilty("Sheet1", 3, 2));

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




