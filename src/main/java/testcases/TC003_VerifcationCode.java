package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.SalesForceWrappers;

public class TC003_VerifcationCode extends SalesForceWrappers{

	@BeforeClass
	public void setValues(){
		browserName = "chrome";
		testCaseName = "Login";
		testDescription = "Verify the code";
		category = "smoke";
		authors = "sathya";
		dataSheetName = "TC003";

	}


	@Test
	public void login(){

		new LoginPage(driver, test)
		.enterUserName("freetest@urcomp.com")
		.enterPassword("09safepass")
		.clickLogin()
		.verifyText("Verify Your Identity")
		.enterCode("username","password")
		.clickVerify()
		.clickHomeTab()
		.verifyUser("free support")
		.clickUserMenuButton()
		.clickLogout();
	}
}
