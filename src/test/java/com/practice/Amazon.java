package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.vtiger.Genricutil.WebDriverUtility;

public class Amazon {

	public static void main(String[] args) {
		
       WebDriverUtility wbu=new WebDriverUtility();
       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		wbu.maximiseWin(driver);
		driver.get("https://www.amazon.in/");
	
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles price under 15000");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("//li[@id='p_89/Redmi']//i[@class='a-icon a-icon-checkbox']")).click();
        
	}

}
