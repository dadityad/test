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
public class AddCommentTest {
	public static AndroidDriver addriver;
	public TmailBasicOperations tmailbasicoperations;
	String userName = "adi+dev2$sap.tmail21.com";
	String password = "Tmail123";
	String inlineMessage = "This is text message via automation";
	@BeforeClass
	public void loadApp() {
		tmailbasicoperations = TMailAppSetup.addAccountOperate();
		String actualUserName = tmailbasicoperations.loginWithValidCredentials(userName, password);
	}
	@Test
	public void addInlineMessageTest(){
		String actualUserName = tmailbasicoperations.addInlineMessage(inlineMessage);
		//Assert.assertEquals(actualUserName, TestThreadTitle);
	}
	@AfterClass
	public void tearDown(){
		tmailbasicoperations.killApp();
	}
}
