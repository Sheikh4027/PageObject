package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginPage {
WebDriver driver;

public FacebookLoginPage(WebDriver driver)

{
  this.driver=driver;	
}
	

By Email = By.xpath("//input[@id='email']");
By Password = By.xpath("//input[@id='pass']");
By Login  = By.id("loginbutton");



public WebElement Email()
{
  return driver.findElement(Email);	
}

public WebElement Password()
{
	return driver.findElement(Password);
}	
	
public WebElement Login()
{
   return	driver.findElement(Login);
}



}
