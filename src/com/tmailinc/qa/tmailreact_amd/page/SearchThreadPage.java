package com.tmailinc.qa.tmailreact_amd.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class SearchThreadPage {
	static AndroidDriver addriver;
	public SearchThreadPage(AndroidDriver AndroDriver) {
		this.addriver = AndroDriver;
	}
	//elements inspections
		By searchBtn = By.id("folder-listing-search-btn-icon");
		By searchTextBox = By.id("search-tmail-text-field");
		By searchedThread = By.id("tmail-listing-subject-0");
		By threadTitle = By.id("comment-lisitng-header-subject");
	
	//Methods to access it
		
		public String searchThreadTTN(String validTTN) {
			addriver.findElement(searchBtn).click();
			addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			addriver.findElement(searchTextBox).sendKeys(validTTN);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			addriver.pressKeyCode(AndroidKeyCode.ENTER);
			addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			addriver.findElement(searchedThread).click();
			addriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			String pgTitle = addriver.findElement(threadTitle).getText();
			return pgTitle;
		}
		
	
}
