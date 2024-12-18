package amazonpackage.Amazon_Project;

import org.testng.annotations.Test;

public class TestCase2_Search extends LaunchdQuit
{
	
	@Test
	public void searching() throws InterruptedException
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

		
	}

}
