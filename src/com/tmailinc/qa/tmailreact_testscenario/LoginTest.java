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
public class LoginTest {
	public static AndroidDriver addriver;
	public TmailBasicOperations tmailbasicoperations;
	String userName = "apple+dev2$mob.tmail21.com";
	String password = "Tmail123";
	
	@BeforeClass
	public void loadApp() {
		tmailbasicoperations = TMailAppSetup.addAccountOperate();
	}
	
	@Test
	public void loginTest(){
		String actualUserName = tmailbasicoperations.loginWithValidCredentials(userName, password);
		Assert.assertEquals(userName, actualUserName);
	}
	
	@AfterClass
	public void tearDown(){	
		tmailbasicoperations.killApp();
	}

}
