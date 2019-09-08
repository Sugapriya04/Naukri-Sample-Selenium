package testCasesNaukri;





import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectsNaukri.PageLoginPage;
import utilNaukri.CommonFunctions;

public class ValidateCredentials extends CommonFunctions {

	public static Actions act;
	public static void userNameValidation()  {
		PageFactory.initElements(driver, PageLoginPage.class);
			
		PageLoginPage.loginButton.click();
		WebElement wb=PageLoginPage.usernameError;
		act=new Actions(driver);
		act.moveToElement(wb).perform();
		System.out.println("The username error message is : "+wb.getAttribute("innerText"));
		
	}
		
		
	@Test  
	public static void passwordValidation()  {
		userNameValidation();
	
		WebElement wb1=PageLoginPage.pwdError;
		act.moveToElement(wb1).perform();
		System.out.println("The password error message is : "+wb1.getAttribute("innerText"));
		
		
		
		
	
	
	
	
}}
