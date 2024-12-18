package amazonpackage.Amazon_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchdQuit 
{
	WebDriver driver;
@BeforeMethod
public void launch() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(10000);
	driver.manage().window().maximize();
}
@AfterMethod
public void quit() 
{
	//driver.close();
}
}
