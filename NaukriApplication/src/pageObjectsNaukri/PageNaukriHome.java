package pageObjectsNaukri;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageNaukriHome {
	
	@FindBy(how=How.CSS,using="a[data-ga-track='spa-event|Profile_NHP|Update Profile|Click']")
	public static WebElement updateprofLink;

}
