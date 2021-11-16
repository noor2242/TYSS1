package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Tablepractice {
	public static void main(String[] args) {
		
	       
	       System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.manage().window().maximize();
			   driver.get("https://www.w3schools.com/html/html_tables.asp");
			WebElement tb = driver.findElement(By.xpath("//table[@id='customers']"));
			System.out.println(tb.getText());
			
	}
}
