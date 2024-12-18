package amazonpackage.Amazon_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;
@FindBy(xpath="//span[@class='nav-line-2 ']")
WebElement accountandlist;

@FindBy(xpath="(//span[.='Sign in'])[1]")
WebElement sign;

@FindBy(id="twotabsearchtextbox") WebElement search;

public void account(WebDriver driver)
{
	Actions a=new Actions(driver);
	a.moveToElement(accountandlist).perform();	
}
public void signacct()
{
	sign.click();
}
public void Searching_product() throws InterruptedException
{
	Thread.sleep(2000);
	search.sendKeys("mobiles"+Keys.ENTER);
}

public  HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


}
