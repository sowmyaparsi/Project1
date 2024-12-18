package amazonpackage.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement un ;

	@FindBy(xpath="//span[@id='continue']")
	WebElement continue1;
	
	@FindBy(id="ap_password")
	WebElement pwd ;

	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement loginsign;
	
	public void username()
	{
		un.sendKeys("+17472268271");
		
	}
	public void countinue_btton()
	{
		continue1.click();
	}
	public void password() throws InterruptedException
	{
		Thread.sleep(2000);
		pwd.sendKeys("Humaninterface@123");
	}
	public void sign_btn() throws InterruptedException
	{
		Thread.sleep(3000);
		loginsign.click();
	}

	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
