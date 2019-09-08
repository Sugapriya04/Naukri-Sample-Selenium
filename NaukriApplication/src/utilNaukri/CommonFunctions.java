package utilNaukri;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static Properties properties=null;
	public static WebDriver driver=null;
	
	public static Properties loadPropertyFile() throws IOException {
		FileInputStream fs=new FileInputStream("config.properties");
		properties=new Properties();
		properties.load(fs);
		return properties;
		
		}
	
		
	@BeforeSuite
	public static void  launchBrowser() throws IOException {
		loadPropertyFile();
		String browser=properties.getProperty("browser");
		String uRl=properties.getProperty("url");
		String driverLoc=properties.getProperty("DriverLocation");
		System.out.println(uRl);
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
	
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLoc);	
			driver=new ChromeDriver(dc);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", driverLoc);	
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(uRl);	
		
		
	}
	
	
	/*@AfterSuite
	public void tearDown() {
		driver.quit();
	}*/
}
