package com.tmailinc.qa.tmailreact_amd.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class CommentDetailsPage {
	static AndroidDriver addriver;
	public CommentDetailsPage(AndroidDriver AndroDriver) {
		this.addriver = AndroDriver;
	}
	
	//elements inspections
	By InboxClick = By.id("folder-listing-container-1");
	By ThreadClcik = By.id("tmail-listing-subject-0");
	By InlineTextBox = By.id("send-inline-comment-text-field");
	By SendBtn = By.id("send-inline-comment-btn-text");
	By MessageText = By.id("tmail-listing-computed-type-0");
	

	//Methods to access it
	
	public String searchThreadTTN(String inlineMessage) {
		addriver.findElement(InboxClick).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(ThreadClcik).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(InlineTextBox).sendKeys(inlineMessage);
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.findElement(SendBtn).click();
		addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		addriver.pressKeyCode(AndroidKeyCode.BACK);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//String AddedMessage = addriver.findElement(MessageText).getText();
		return null;
	}
	
}