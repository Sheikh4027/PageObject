package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openingNewFBAccount {

	WebDriver driver;
	
	public openingNewFBAccount (WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	
	By firstName = By.id("u_0_m");
	By lastName = By.id("u_0_o");
	By email =By.id("u_0_r");
	By password = By.id("u_0_w");
	By Gender = By.id("u_0_7");
	By SignUp = By.id("u_0_13");
	
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement lastName()
	{
		
		return driver.findElement(lastName);
	}
	
	public WebElement email()
	{
		
		return driver.findElement(email);
	}
	public WebElement password()
	{
		
		return driver.findElement(password);
	}
	
	public WebElement Gender ()
	{
		
		return driver.findElement(Gender);
	}
	public WebElement SignUp()
	{
		return driver.findElement(SignUp);
	}

	
	
	
	
}
