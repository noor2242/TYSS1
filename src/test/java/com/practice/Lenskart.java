package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lenskart {
	@Test
	public void lenskart() 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.lenskart.com/");
        driver.findElement(By.xpath("//img[@alt='Lenskart']")).getAttribute("img[@alt]");
        
       // driver.findElement(By.name("q")).click();
	}

}
