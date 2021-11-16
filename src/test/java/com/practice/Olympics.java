package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Olympics {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://olympics.com/");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		WebElement medals =  driver.findElement(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul/li/div[@class='featured-athlete__medals text-body-sm']"));
		String Allmedals =  medals.getText();

		List<WebElement> all = driver.findElements(By.xpath("//span[text()='Eliud KIPCHOGE']/ancestor::ul//descendant::a[@class='featured-athlete__name d-flex text-body']"));
		List<WebElement> Medals = driver.findElements(By.xpath("//div[@class='featured-athlete__medals text-body-sm']"));
		for (int i = 0; i <all.size(); i++) 
		{
			System.out.println(all.get(i).getText());
			System.out.println(Medals.get(i).getText());


		}



	}
}
