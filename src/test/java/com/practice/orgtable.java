package com.practice;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class orgtable {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888/");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Organization Name']")).click();
			List<WebElement> allinfo = driver.findElements(By.xpath("//table[@class='lvt small']//tr//td[3]"));
			for (int i = 2; i < allinfo.size(); i++)
			{
			        System.out.println(allinfo.get(i).getText());
			}
			}

	}


