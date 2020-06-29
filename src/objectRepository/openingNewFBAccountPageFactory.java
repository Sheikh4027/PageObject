package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class openingNewFBAccountPageFactory {

	WebDriver driver;
	
	public openingNewFBAccountPageFactory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id= "u_0_m")
	WebElement firstName;
	
	
	@FindBy(id="u_0_o")
	WebElement lastName;
	
	@FindBy (id="u_0_r")
	WebElement email;
	
	@FindBy (id ="u_0_w")
	WebElement password;
	@FindBy (id="u_0_7")
	WebElement Gender;
	@FindBy (id="u_0_13")
	WebElement SignUp;
	
	
	/*By email =By.id("u_0_r");
	By password = By.id("u_0_w");
	By Gender = By.id("u_0_7");
	By SignUp = By.id("u_0_13");*/
	
	
	public WebElement firstName()
	{
		return firstName;
	}
	
	public WebElement lastName()
	{
		
		return lastName;
	}
	
	public WebElement email()
	{
		
		return email;
	}
	public WebElement password()
	{
		
		return password;
	}
	
	public WebElement Gender ()
	{
		
		return Gender;
	}
	public WebElement SignUp()
	{
		return SignUp;
	}

	
	
	
	
}
