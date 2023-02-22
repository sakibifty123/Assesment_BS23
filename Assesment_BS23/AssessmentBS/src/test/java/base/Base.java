package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	
	public static String loginUrl = "https://test.sharebus.co/";
	
	
	@BeforeClass
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
