package com.tmailinc.qa.tmailreact_helper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.tmailinc.qa.tmailreact_amd.operations.TmailBasicOperations;

import io.appium.java_client.android.AndroidDriver;
/**
 * @author Adi
 *
 */
public class TMailAppSetup {
	
	static AndroidDriver addriver;
	
	public static TmailBasicOperations startSimulator(){
		//Thread.sleep(9000);
		try {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", "E:/Appium/app-release(8).apk");
		
			addriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TmailBasicOperations tmailbasicoperations = new TmailBasicOperations(addriver);
		return tmailbasicoperations;
	}
	public static TmailBasicOperations addAccountOperate() {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addriver.findElement(By.id("welcome-add-account-btn")).click();
		TmailBasicOperations tmailbasicoperations = new TmailBasicOperations(addriver);
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tmailbasicoperations;
	}
	
}
