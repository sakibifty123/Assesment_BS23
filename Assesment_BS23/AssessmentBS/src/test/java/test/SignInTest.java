package test;

import org.testng.annotations.Test;

import base.Base;
import pages.SignInPage;

public class SignInTest extends Base {
	@Test
	
	public void signIn() throws InterruptedException {
		//task no 01
		driver.get(loginUrl);
		Thread.sleep(3000);
		
		//task no 02
		SignInPage signin = new SignInPage(driver);
		signin.signInFunction();
		Thread.sleep(3000);
		
		//task no 03
		signin.emailFunction("brainstation23@yopmail.com");
		signin.passwordFunction("Pass@1234");
		signin.signInButtonFunction();
		Thread.sleep(10000);
		
		//task no 04
		signin.dropDownFunction();
		signin.shareleadFunction();
		Thread.sleep(2000);
		signin.continueButtonFunction();
		Thread.sleep(5000);
		
		//task no 05
		//signin.scrollFunction();
		signin.setUpShareBusFunction();
		Thread.sleep(3000);
		
		//task no 06
		signin.fromFunction("Oslo,Norway");
		signin.toFunction("kolbotn,Norway");
		//signin.clickFunction();
		Thread.sleep(2000);
		signin.departureDateFunction();
		Thread.sleep(2000);
		signin.departuredatePickerFunction();
		Thread.sleep(2000);
		signin.departuretimeFunction();
		Thread.sleep(2000);
		signin.returnDateFunction();
		//signin.returndatePickerFunction();
		Thread.sleep(5000);
		//signin.returntimeFunction();
		//signin.continueBttnFunction();
		
	}

}
