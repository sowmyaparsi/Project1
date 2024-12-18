package amazonpackage.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Testcase4_AddToCart extends LaunchdQuit
{
	
	@Test
	public void addtocartitem() throws InterruptedException
	{
		HomePage h=new HomePage(driver);
		h.account(driver);
		h.signacct();
		LoginPage lp=new LoginPage(driver);
		lp.username();
		lp.countinue_btton();
		lp.password();
		lp.sign_btn();
		h.Searching_product();
		SearchPage sp= new SearchPage(driver);
		sp.Product_Click(driver);
		sp.Wishlist_btn();
		ProductsList pl=new ProductsList(driver);
		pl.addcartitem(driver);
		//pl.proceedtocheckout();
		
	}

}
