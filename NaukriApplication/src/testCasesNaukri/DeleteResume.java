package testCasesNaukri;

import org.testng.AssertJUnit;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjectsNaukri.PageDeleteResume;
import utilNaukri.CommonFunctions;

public class DeleteResume extends CommonFunctions{
	
	
	public static void deleteResume() {
		PageFactory.initElements(driver, PageDeleteResume.class);
		PageDeleteResume.updateButton.click();
		PageDeleteResume.deleteButton.click();}
		
	public static void textvalidation() {
		String expectedText="Are you sure you want to delete the Resume?";
		String actualText=PageDeleteResume.textpopup.getText();
		AssertJUnit.assertEquals(expectedText, actualText);
		System.out.println("The text matches");
	}
	
	@Test
	public static void cancelButton() {
		deleteResume();
		textvalidation();
		
		PageDeleteResume.cancelButton.click();
		
		
		
		
		
		
		
		}
		
		
	}


	


