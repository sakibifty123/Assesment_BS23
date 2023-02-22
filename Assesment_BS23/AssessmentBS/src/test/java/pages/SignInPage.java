package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {
	WebDriver driver;
	
	public By signInPath =By.xpath("//body/div[@id='app']/nav[1]/div[1]/ul[1]/li[1]/button[1]");
	
	public By emailPath =By.xpath("//input[@id ='email']");
	public By passwordPath =By.xpath("//input[@id = 'password']");
	public By signInButtonPath =By.xpath("//button[@type='submit']");
	
	public By dropDownPath =By.xpath("//span[contains(text(),'B')]");
	public By shareleadPath =By.xpath("/html[1]/body[1]/div[1]/nav[1]/div[1]/ul[1]/li[1]/ul[1]/li[3]/button[1]");
	public By continueButtonPath =By.xpath("(//button[normalize-space()='Yes'])[1]");
	
	public By setUpShareBusPath =By.xpath("//span[contains(text(),'Set up a Sharebus')]");

	public By fromPath = By.xpath("//input[@id='startPoint']");
	public By toPath = By.xpath("//input[@id='destination']");
	public By departureDatePath = By.xpath("(//input[@placeholder='Departure Date'])[1]");
	public By departuredatePickerPath = By.xpath("//tbody/tr[5]/td[2]/span[1]");
	public By departuretimePath = By.xpath("(//input[@placeholder='Time'])[1]");
	public By returnDatePath = By.xpath("(//input[@placeholder='Return Date'])[1]");
	public By returndatePickerPath = By.xpath("//span[normalize-space()='28']");
	public By returntimePath = By.xpath("(//input[@placeholder='Time'])[3]");
	public By continueBttnPath = By.xpath("//span[contains(text(),'Continue')]");
	
	
	
	public By clickPath = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]");
	
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void signInFunction(){
        driver.findElement(signInPath).click();
    }
	
	
	public void emailFunction(String email){
        driver.findElement(emailPath).sendKeys(email);
    }
	public void passwordFunction(String pass){
        driver.findElement(passwordPath).sendKeys(pass);;
    }
	public void signInButtonFunction(){
        driver.findElement(signInButtonPath).click();
    }
	
	
	public void dropDownFunction(){
        driver.findElement(dropDownPath).click();
    }
	public void shareleadFunction(){
        driver.findElement(shareleadPath).click();
    }
	public void continueButtonFunction(){
        driver.findElement(continueButtonPath).click();
    }
	
	
	//click an scroll down element
	public void setUpShareBusFunction(){
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Set up a Sharebus')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
    }
	
	
	public void fromFunction(String from){
        driver.findElement(fromPath).sendKeys(from);
    }
	public void toFunction(String to){
        driver.findElement(toPath).sendKeys(to);
    }
	public void departureDateFunction(){
		WebElement ele = driver.findElement(By.xpath("(//input[@placeholder='Departure Date'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
        //driver.findElement(departureDatePath).click();
    }
	public void departuredatePickerFunction(){
        driver.findElement(departuredatePickerPath).click();
    }
	public void departuretimeFunction(){
        driver.findElement(departuretimePath).click();
    }
	public void returnDateFunction(){
        driver.findElement(returnDatePath).click();
    }
	public void returndatePickerFunction(){
        driver.findElement(returndatePickerPath).click();
    }
	public void returntimeFunction(){
        driver.findElement(returntimePath).click();
    }
	public void continueBttnFunction(){
        driver.findElement(continueBttnPath).click();
    }
	public void clickFunction(){
        driver.findElement(clickPath).click();
    }
	
	
	
	
	

}
