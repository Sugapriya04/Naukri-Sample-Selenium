package testCasesNaukri;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


import pageObjectsNaukri.PageLoginPage;
import utilNaukri.CommonFunctions;

public class NaukriLogin extends CommonFunctions{
	
			

	@Test
	public void verifyLoginTest() {
		
		PageFactory.initElements(driver, PageLoginPage.class);
		
		/*PageLoginPage.loginLink.click();*/
		
		PageLoginPage.username.sendKeys("sugapriyadev@gmail.com");
		
		PageLoginPage.password.sendKeys("Spriya$27");
		
		PageLoginPage.loginButton.submit();
		//here using submit() instead of click() as the button type is submit in html
		
	}
	
			
	}
	
	

