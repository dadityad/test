package com.tmailinc.qa.tmailreact_amd.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CreateNewThreadPage {
	static AndroidDriver addriver;
	public CreateNewThreadPage(AndroidDriver AndroDriver) {
		this.addriver = AndroDriver;
	}

	//elements inspections
		By accountoneClick = By.id("folder-listing-newtmail-btn-icon");
		By createNewThreadMenu = By.id("new-thread");
		By addWriter = By.id("Add Writers...");
		By subjecttext = By.id("Subject");
		By sendBtn = By.id("new-tmail-send-btn-text");
		By cancelBtn = By.id("new-tmail-cancel-btn-text");
	// elements for popups
		By okPopup = By.id("android:id/button2");
		By cancelPopup = By.id("android:id/button1");
	
	//Methods to access it

	public void createNewThread(String writer, String subject) {
		addriver.findElement(accountoneClick).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(createNewThreadMenu).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(addWriter).sendKeys(writer);
		addriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		addriver.findElement(subjecttext).sendKeys(subject);
		addriver.pressKeyCode(AndroidKeyCode.BACK);
		addriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		addriver.findElement(sendBtn).click();
		addriver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		addriver.findElement(okPopup).click();
		try {
			Thread.sleep(9000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
