package OppurtunityModule;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import Com.vtiger.Genricutil.BaseClass;
import Com.vtiger.Genricutil.ExcelUtility;





public class CreateOpportunitywithSalesStageProspecting extends BaseClass{
	@Test
	public  void salesstageprospecting() throws Throwable {
		driver.findElement(By.xpath("//a[@href='index.php?module=Potentials&action=index']")).click();
		driver.findElement(By.xpath("//img[@title='Create Opportunity...']")).click();
		ExcelUtility eu=new ExcelUtility();
		driver.findElement(By.xpath("//input[@name='potentialname']")).sendKeys(eu.excelutilty("Sheet1", 9, 2));
		driver.findElement(By.xpath("//tbody/tr[4]/td[2]/img[1]")).click();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> windows = s.iterator();
		while(windows.hasNext())
		{
			String parentWindow = windows.next();
			String childWindow = windows.next();
			driver.switchTo().window(childWindow);
			driver.findElement(By.xpath("//a[@id='2']")).click();
			driver.switchTo().window(parentWindow);
		}
		WebElement Ddadrr=driver.findElement(By.xpath("//select[@name='sales_stage']"));
		Ddadrr.click();
		wbu.selectByIndex(Ddadrr, 0);
		driver.findElement(By.xpath("/html[1]/body[1]/table[4]/tbody[1]/tr[1]/td[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/input[1]")).click();

	}
}
