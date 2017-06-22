package com.tmailinc.qa.tmailreact_amd.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.server.handler.FindElement;

import io.appium.java_client.android.AndroidDriver;

public class LoginPage {
	static AndroidDriver addriver;
	public LoginPage(AndroidDriver AndroDriver) {
		this.addriver = AndroDriver;
	}

	//elements inspections
		By startAddAct = By.id("welcome-add-account-btn");
		By userId = By.id("add-account-tmail-address");
		By passwd = By.id("add-account-password");
		By submitBtn = By.id("add-account-submit-btn");
		By cancelBtn =By.id("add-account-cancel-btn");
		By errMessage = By.id("add-account-err-msg");
	//outside elements
		By pg_Title = By.id("folder-header-title");
	
	
	//Methods to access it
	
	public String loginWithValidCredentials(String userName, String password) {
		addriver.findElement(userId).sendKeys(userName);
		addriver.findElement(submitBtn).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(passwd).sendKeys(password);
		addriver.findElement(submitBtn).click();
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String pgTitle = addriver.findElement(pg_Title).getText();
		return pgTitle;
	}
}
