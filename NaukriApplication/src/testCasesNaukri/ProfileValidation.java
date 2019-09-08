package testCasesNaukri;

import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjectsNaukri.PageNaukriHome;
import pageObjectsNaukri.PageProfile;
import utilNaukri.CommonFunctions;

public class ProfileValidation extends CommonFunctions  {


	public static void validateProfileHeader() {
	
		PageFactory.initElements(driver, PageNaukriHome.class);
		PageNaukriHome.updateprofLink.click();
		
		
	
		PageFactory.initElements(driver, PageProfile.class);
		String text=PageProfile.fullname.getAttribute("innerText");
		System.out.println(text);
		String backgroudcolor=PageProfile.fullname.getCssValue("color");
		System.out.println(backgroudcolor);}
	
	  
		public static void designationValidation() {
	   	
		String expected="Senior Quality Analyst";
		String designation=PageProfile.designation.getAttribute("innerText");
		System.out.println("The actual designation is : "+designation);
		Assert.assertEquals(expected, designation);}
	    
		
		public static void area() {	
		String expectedloc="Chennai, INDIA";
		String location=PageProfile.location.getAttribute("innerText");
		System.out.println("The actual location is : "+location);
		Assert.assertEquals(expectedloc, location);
		
		}
		
		
	
		public static void mobileNumber() {
		String expectedno="9677152937";
		String mobno=PageProfile.mobileno.getAttribute("innerText");
		System.out.println("The actual location is : "+mobno);
		Assert.assertEquals(expectedno, mobno);
				
		}
	   
		public static void experience() {
			String experience="6 Year(s)";
			String actexperience=PageProfile.exp.getAttribute("innerText");
			System.out.println("The actual experience is : "+actexperience);
			Assert.assertEquals(experience, actexperience);
	    }
	    
	   
		public static void salary() {
	    	String expectedsal="INR 10 Lakh(s)";
			String actSalary=PageProfile.salary.getAttribute("innerText");
			System.out.println("The actual experience is : "+actSalary);
			Assert.assertEquals(expectedsal, actSalary);
			
			//purposely failing this assert
			boolean salaryiconstatus=PageProfile.salaryIcon.isSelected();
			Assert.assertFalse(salaryiconstatus, "The salary icon is not selected");
			//incase of failure The salary icon is not selected- message ll be displayed
			
	    }
	    
	  
		public static void mailid() {
	    	String expectedmailid="sugapriyadev@gmail.com";
			String actMailID=PageProfile.emailid.getAttribute("innerText");
			System.out.println("The actual experience is : "+expectedmailid);
			Assert.assertEquals(expectedmailid, actMailID);
			
			//to check if the tick icon is present on the screen
			
			boolean emailTick=PageProfile.emailbool.isDisplayed();
			Assert.assertTrue(emailTick, "The status of the email id tick is" );
			//the syntax of assertTrue is Assert.assertTrue("Title does not match", expectedTitle.equals(driver.getTitle()));
            //incase of failure Title does not match- message ll be displayed
		
						
	    }
		
		public static void colorvalidation() {
			
			String rgbcolor=PageProfile.fields.getCssValue("color");
			String hex=Color.fromString(rgbcolor).asHex();
			System.out.println("The hex value of color is :"+rgbcolor);
				
		}
	    
			
		@Test
		public static void profileStrength() {
	    	validateProfileHeader();
	    	designationValidation();
			area();
			mobileNumber();
			salary();
			mailid();
			colorvalidation();
			String expectedstrenth="Profile Strength (Excellent)";
			String actStrenth=PageProfile.profileStrength.getAttribute("innerText");
			System.out.println(actStrenth);
			Assert.assertEquals(actStrenth, expectedstrenth);
			
			
			String actpercent=PageProfile.profilepercent.getAttribute("innerText");
			Assert.assertEquals(actpercent, "87%");
}}
