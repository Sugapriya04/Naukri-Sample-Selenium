package pageObjectsNaukri;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageProfile {

	
	@FindBy(how=How.CSS,using="span.fullname")
	public static WebElement fullname;
	
	@FindBy(how=How.XPATH,using="//div[@class='row mb0']//following::span[text()='Senior Quality Analyst']")
	public static WebElement designation;
	
	@FindBy(how=How.CSS,using="span[name='Location']")
	public static WebElement location;
	
	@FindBy(how=How.CSS,using="span[name='Mobile']")
	public static WebElement mobileno;
	
	@FindBy(how=How.CSS,using="span[title='6 Year(s) ']")
	public static WebElement exp;
	
	@FindBy(how=How.CSS,using="span[title='10 Lakh(s) ']")
	public static WebElement salary;
	
	@FindBy(how=How.CSS,using="span[title='sugapriyadev@gmail.com']")
	public static WebElement emailid;
	
	@FindBy(how=How.XPATH,using="//div[@class='verified']//following::em[@class='icon tick']")
	public static WebElement emailbool;
	
	@FindBy(how=How.CSS,using="span[class='fs11']")
	public static WebElement profileStrength;
	
	@FindBy(how=How.CSS,using="span[class='right']")
	public static WebElement profilepercent ;
	
	
	@FindBy(how=How.XPATH,using="//em[text()='Wallet']")
	public static WebElement salaryIcon ;
	
	@FindBy(how=How.CSS,using="div[class='row mb0']")
    public static WebElement fields;
	
}
