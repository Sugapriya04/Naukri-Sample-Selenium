package testCasesNaukri;



import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjectsNaukri.PageViewAll;
import utilNaukri.CommonFunctions;

public class ViewAllTestcase extends CommonFunctions {

	
	public static void clickViewAll() {
		PageFactory.initElements(driver, PageViewAll.class);
		PageViewAll.viewall.click();
			
	}
	
	@Test
	public static void validatePhoneNumber() {
		
		String expectedPhone="9677152937";
		String phoneNumber=PageViewAll.phoneNumber.getText();
		Assert.assertEquals(expectedPhone, phoneNumber);
		System.out.println("The actual phone number is :"+phoneNumber);
		
		
		
	}
	
	
	
	
	
	
	
	
}
