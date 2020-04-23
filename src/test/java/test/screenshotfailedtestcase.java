package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class screenshotfailedtestcase {
	
	public WebDriver driver;

	@BeforeMethod
	public void launchurl() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgajjave\\Desktop\\seleniu set up softwares\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println("This is parent window" + " " + driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}


@AfterMethod
public void closedriver() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgajjave\\Desktop\\seleniu set up softwares\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.get("https://facebook.com");
	System.out.println("This is child window" + " " + driver.getTitle());
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.close();
}
}