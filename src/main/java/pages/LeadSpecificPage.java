package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.SalesForceWrappers;

public class LeadSpecificPage extends SalesForceWrappers{
	
	public LeadSpecificPage(RemoteWebDriver driver, ExtentTest test)
	{
		this.driver = driver;
		
		this.test = test;
	}
	
	public LeadSpecificPage verifyLeadName(String text)
	{
		verifyTextByXpath("//h2[@class='topName']", text);
		
		return this;
	}

}
