package Com.vtiger.Genricutil;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {
	/**
	 * this method to select by index
	 * 
	 * 
	 */
	public void selectByIndex(WebElement ele,int index) {
		Select s=new Select(ele);
		s.selectByIndex(index);
			}
	/**
	 * 
	 * this method to select by visible text
	 */
    public void selectByVisibleText(WebElement ele,String vistext) 
{
      Select s=new Select(ele);
      s.selectByVisibleText(vistext);
}
    /**
     * this method to select by value
     */
    public void selectByValue(WebElement ele,String value)
    {
    	Select s=new Select(ele);
    	s.selectByValue(value);
    }
    /**
     * this method will wait for page to load
     */
    public void waitForPageLoad(WebDriver driver)
    {
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
    }
    /**
     * this method is wait for element to be visible
     */
    public void waitForElementToBEVisible(WebDriver driver,WebElement ele)
    {
    	WebDriverWait Wait=new WebDriverWait(driver,20);
    	Wait.until(ExpectedConditions.visibilityOf(ele));
    }
    /**
     * this method will perform mouse over action
     */
    public void MovetoElement(WebDriver driver,WebElement element)
    {
    	Actions ac=new Actions(driver);
    	ac.moveToElement(element).perform();
    }
    /**
     * this method is to perform right click
     */
    public void RightClick(WebDriver driver,WebElement element)
    {
    Actions ac=new Actions(driver);
    ac.contextClick(element).perform();
    }
    /**
     * this method is to drag and drop
     */
    public void DragAndDrop(WebDriver driver,WebElement src,WebElement dest)
    {
    Actions ac=new Actions(driver);
    ac.dragAndDrop(src,dest);
    }
    /**
     * this method is to do double click
     */
    public void DoubleClick(WebDriver driver,WebElement element)
    {
    	Actions ac=new Actions(driver);
    	ac.doubleClick(element).perform();
    }
  /**
   * this method is to do maximise window  
   */
    public void maximiseWin(WebDriver driver)
    {
    	driver.manage().window().maximize();
    }  
    /**
     * this method is used to switch from one window to another window
     */
   public void SwitchToWindow(WebDriver driver, String partialWinTitle) 
   {
	Set<String> window=driver.getWindowHandles();
	Iterator<String> it=window.iterator();
	while(it.hasNext())
	{
		String winId=it.next();
		String title=driver.switchTo().window(winId).getTitle();
		if(title.contains(partialWinTitle))
				{
			         break;
				}
	}
	   
   }
    /**
     * this method to accept alert pop up
     */
   public void acceptAlert(WebDriver driver)
   {
   	driver.switchTo().alert().accept();
   }
/**
 * this method to dismiss alert pop up    
 */
   public void dissmisAlert(WebDriver driver)
   {
   	driver.switchTo().alert().dismiss();
   }  
    
 /**
  * this method is to switch to frame based on element   
  */
  public void SwitchToFrame(WebDriver driver,WebElement element)  
  {
	  driver.switchTo().frame(element);
  }
  /**
   * this method is to switch to frame based on index  
   */
   public void Switchtoframe(WebDriver driver,int index) 
   {
	   driver.switchTo().frame(index);
   }
/**
 * this method is to switch to frame based on id or name    
 */
    public void SwitchToframe(WebDriver driver,String idorname)
    
    {
    	driver.switchTo().frame(idorname);
    }
  /**
   * to take screenshot  
 * @throws Throwable 
   */
  public String TakeScreenshot(WebDriver driver,String screenshotname) throws Throwable
  {
	  String screenshotpath="./screenshot/"+screenshotname+".PNG";
	  TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(screenshotpath);
	Files.copy(src, dst);
	return screenshotpath;
	  
  }
  /**
   * this method is to scroll a particular element
   */
  public void scrollToWebElement(WebDriver driver, WebElement element)
  {
  	JavascriptExecutor js = (JavascriptExecutor)driver;
  	int y = element.getLocation().getY();
  	js.executeScript("window.scrollBy(0,"+y+")", element);
  }
  /**
   * press the enter key on keyboard
   */
//  public void pressEnter()
//  {
// 	Robot rc = new Robot();
// 	rc.keyPress(KeyEvent.VK_ENTER);
// 	rc.keyRelease(KeyEvent.VK_ENTER);
//	
//  }
}















