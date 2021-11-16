package com.practice;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MakeMyTrip {
	@Test(dataProvider = "maketripdata")
	public void maketrip(String src, String dest) {
		Date d = new Date();
		String s = d.toString();
		String[] arr = s.split(" ");
		String day = arr[0];
		String month = arr[1];
		String currentdate = arr[2];
		String year = arr[5];
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//span[@class='langcardClose']")).click();
		driver.findElement(By.xpath("//div[@data-cy='landingContainer']")).click();
		driver.findElement(By.xpath("//input[@id=\"fromCity\"]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'HYD')]")).sendKeys(src);
	//	driver.findElement(By.xpath("//li[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
		
		driver.findElement(By.id("tocity")).sendKeys(dest);
		driver.findElement(By.xpath("//div[contains(text(),'BZA')]")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		driver.findElement(By.xpath("//div[@aria-label='" + day + " " + month + " " + currentdate + " " + year + "']"))
				.click();
	}

	@DataProvider
	public Object maketripdata() {
		Object[][] obj = new Object[5][2];
		obj[0][0] = "PNQ";
		obj[0][1] = "HYD";
		obj[1][0] = "BLR";
		obj[1][1] = "MAA";
		obj[2][0] = "BOM";
		obj[2][1] = "DEL";
		obj[3][0] = "KOL";
		obj[3][1] = "MAA";
		obj[4][0] = "BOM";
		obj[4][1] = "PNQ";

		return obj;
	}
}
