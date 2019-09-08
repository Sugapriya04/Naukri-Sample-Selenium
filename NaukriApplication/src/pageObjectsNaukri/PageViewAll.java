package pageObjectsNaukri;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageViewAll {

	
	@FindBy(how=How.XPATH,using="//a[@href='javascript:void(0)'][text()='VIEW ALL']")
	public static WebElement viewall;
	
	
	@FindBy(how=How.XPATH,using="//input[@type='tel'][@value='9677152937']")
	public static WebElement phoneNumber;
	
	
	
	
	
	
	
}
