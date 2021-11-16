package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Login {
	public Login(WebDriver driver)  //4. Create single argument constructor and initialise the element using Pagefactory.
	{
		PageFactory.initElements(driver, this);
	}

//	@FindBy(name="user_name")   //2. Locate the element using FindBy,FindBys & FindAll annotation
//	private WebElement usernameTxtFld;
	
	@FindAll({@FindBy(name="username"), @FindBy(xpath="//input[@type='text']")})
	private WebElement usernameTxtFld;
	
//	@FindBy(name="user_password")
//	public WebElement pswdTxtFld;
	
	@FindBys({@FindBy(name="user_password"), @FindBy(xpath="//input[@type='password']")})
	private WebElement pswdTxtFld;
	
	@FindBy(id="submitButton")
	private WebElement lgnBtn;
	
}
