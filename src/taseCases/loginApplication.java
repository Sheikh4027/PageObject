package taseCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.FacebookLoginPage;
import objectRepository.openingNewFBAccountPageFactory;





public class loginApplication {
@Test
	
public void login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\Downloads\\Documents\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");

	openingNewFBAccountPageFactory pf = new openingNewFBAccountPageFactory(driver);
	
	pf.firstName().sendKeys("Tufail");
	pf.lastName().sendKeys("Prapti");
	pf.email().sendKeys("tufail111@gmail.com");
	pf.password().sendKeys("00rrrr@");
	pf.Gender().click();
	//pf.SignUp().click();
	
	
	
	/*
	//page object Repository style
	
	openingNewFBAccount acc = new openingNewFBAccount(driver);
	acc.firstName().sendKeys("Tufail");
	acc.lastName().sendKeys("Prapti");
	acc.email().sendKeys("tufail111@gmail.com");
	acc.password().sendKeys("00rrrr@");
	acc.Gender().click();
	//acc.SignUp().click();
	
	*/
	
	Thread.sleep(2000);

	FacebookLoginPage fb =new FacebookLoginPage(driver);
	
	fb.Email().sendKeys("baal@gmail.com");
	fb.Password().sendKeys("111111111dddd@");
	//fb.Login().click();

	
	
}

	
}
