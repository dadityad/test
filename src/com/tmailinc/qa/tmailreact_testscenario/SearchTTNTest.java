package com.tmailinc.qa.tmailreact_testscenario;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.tmailinc.qa.tmailreact_amd.operations.TmailBasicOperations;
import com.tmailinc.qa.tmailreact_helper.TMailAppSetup;

import io.appium.java_client.android.AndroidDriver;
/**
 * @author Adi
 *
 */
public class SearchTTNTest {
	public static AndroidDriver addriver;
	public TmailBasicOperations tmailbasicoperations;
	String validUId = "apple+dev2$mob.tmail21.com";
	String ValidPwd = "Tmail123";
	String ValidTTN = "0001";
	String testThreadTitle = "WelcomeThread_For_Automation";
	
	@BeforeClass
	public void loadApp() {
		tmailbasicoperations = TMailAppSetup.addAccountOperate();
		tmailbasicoperations.loginWithValidCredentials(validUId, ValidPwd);
	}
	@Test
	public void SearcThreadTTNTest(){
		String actualUserName = tmailbasicoperations.searchThreadTTN(ValidTTN);
		Assert.assertEquals(actualUserName, testThreadTitle);
	}
	@AfterClass
	public void tearDown(){
		tmailbasicoperations.killApp();
	}
}
