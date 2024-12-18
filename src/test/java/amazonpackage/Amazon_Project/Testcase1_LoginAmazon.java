package amazonpackage.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase1_LoginAmazon extends LaunchdQuit
{
	@Test
	public void testcase1_login() throws InterruptedException
	{
		
		HomePage h=new HomePage(driver);
		h.account(driver);
		h.signacct();
		LoginPage lp=new LoginPage(driver);
		lp.username();
		lp.countinue_btton();
		
		lp.password();
		lp.sign_btn();
	}

}
