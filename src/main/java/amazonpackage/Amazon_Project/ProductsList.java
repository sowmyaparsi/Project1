package amazonpackage.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsList 
{
WebDriver driver;
@FindBy(xpath="(//span[@class='a-button a-button-normal a-button-primary a-button-icon wl-info-aa_add_to_cart'])[1]")  
WebElement addcart;
@FindBy(xpath="(//input[@name='submit.deleteItem'])[1]")	WebElement delete;

public void addcartitem(WebDriver driver) throws InterruptedException
{
	addcart.click();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(2000);
}
public void deleteitem()
{
	delete.click();
}
public ProductsList(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
