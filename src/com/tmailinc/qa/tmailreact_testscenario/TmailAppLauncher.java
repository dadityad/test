package com.tmailinc.qa.tmailreact_testscenario;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.tmailinc.qa.tmailreact_amd.operations.TmailBasicOperations;
import com.tmailinc.qa.tmailreact_helper.TMailAppSetup;

import io.appium.java_client.android.AndroidDriver;
/**
 * @author Adi
 *
 */
public class TmailAppLauncher {
	public static AndroidDriver addriver;
	public TmailBasicOperations tmailbasicoperations;
	@Test
	public void InstallApp(){
		tmailbasicoperations = TMailAppSetup.startSimulator();
	}

	@AfterClass
	public void tearDown(){	
		tmailbasicoperations.killApp();
	}
}
