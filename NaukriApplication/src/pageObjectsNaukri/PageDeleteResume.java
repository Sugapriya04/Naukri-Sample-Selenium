package pageObjectsNaukri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class PageDeleteResume {
	
	
	
@FindBy(how=How.CSS,using="a[class='secondary-content']")
public static WebElement updateButton;

@FindBy(how=How.CSS,using="a[class='link right fs14 fw500']")
public static WebElement deleteButton;

@FindBy(how=How.XPATH,using="//p[text()='Are you sure you want to delete the Resume?']")
public static WebElement textpopup;

@FindBy(how=How.XPATH,using="//p[text()='Are you sure you want to delete the Resume?']//following::a[@class='cancelLayerDel']")
public static WebElement cancelButton;


	
	
	
	
}
