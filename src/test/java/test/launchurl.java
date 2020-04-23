package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchurl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jgajjave\\Desktop\\seleniu set up softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		System.out.println("This is parent window" + " " + driver.getTitle());
		driver.manage().window().maximize();

	}

}
