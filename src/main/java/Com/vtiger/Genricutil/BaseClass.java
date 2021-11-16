package Com.vtiger.Genricutil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


public class BaseClass {

	public WebDriver driver;
	public PropertyFileutility pUtil=new PropertyFileutility();
	public WebDriverUtility wbu=new WebDriverUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	public static WebDriver sdriver;


	//@Parameters("browser")
	@BeforeClass(groups={"smoketest","regression test"})
	public void launchBrowser() throws Throwable
	{
		String BROWSER=pUtil.propertyfileutility("browser");
		if(BROWSER.equalsIgnoreCase("chrome"))

		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		sdriver=driver;
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver.manage().window().maximize();


	}

	@BeforeMethod(groups={"smoketest","regression test"})
	public void Login() throws Throwable
	{
		String URL=pUtil.propertyfileutility("url");
		String UN=pUtil.propertyfileutility("username");
		String PWD=pUtil.propertyfileutility("password");
		driver.get(URL);
		driver.findElement(By.xpath("//input[@name=\"user_name\"]")).sendKeys(UN);
		driver.findElement(By.xpath("//input[@name=\"user_password\"]")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@id=\"submitButton\"]")).click();

	}

	@AfterMethod(groups={"smoketest","regression test"})
	public void Logout() throws Throwable
	{
		WebElement icon = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wbu.MovetoElement(driver, icon);	
		Thread.sleep(2000);
		WebElement out=driver.findElement(By.xpath("//a[text()='Sign Out']"));
		out.click();

	}
	@AfterClass(groups="smoketest")
	public void closeBrowser()
	{
		driver.close();
	}


}
