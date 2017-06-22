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
public class NewTmailTest {
	public static AndroidDriver addriver;
	public TmailBasicOperations tmailbasicoperations;
	String userName = "adi+dev2$sap.tmail21.com";
	String password = "Tmail123";
	String writer = "bob$sap.tmail21.com";
	String subject = "This is test message";

	@BeforeClass
	public void loadApp(){
		tmailbasicoperations = TMailAppSetup.addAccountOperate();
		tmailbasicoperations.loginWithValidCredentials(userName, password);
	}
	@Test
	public void createNewThreadTest(){
		String actualUserName = tmailbasicoperations.createNewThread(writer, subject);
	}
	@AfterClass
	public void tearDown(){
		tmailbasicoperations.killApp();
	}
}
