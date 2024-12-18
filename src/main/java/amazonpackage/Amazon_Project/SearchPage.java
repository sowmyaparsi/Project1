package amazonpackage.Amazon_Project;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage 
{
	WebDriver driver;
	@FindBy(xpath="(//div[@class='a-section aok-relative s-image-fixed-height'])[1]")  WebElement product;
	@FindBy(id="add-to-wishlist-button-submit")   WebElement wishlist;
	@FindBy(xpath="(//span[.='View Your List'])[1]") WebElement continue_shopping;
	
	public void Product_Click(WebDriver driver)
	{
		product.click();
		Set<String> s=driver.getWindowHandles();
		Iterator<String> li=s.iterator();
		String parentid =li.next();
		String childid=li.next();
		driver.switchTo().window(childid);
	}
	public void Wishlist_btn() throws InterruptedException
	{
		wishlist.click();
		Thread.sleep(3000);
		continue_shopping.click();
	}
	
	public SearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
