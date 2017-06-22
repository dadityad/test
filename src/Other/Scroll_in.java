package Other;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.DownAction;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;
import org.openqa.selenium.remote.server.handler.interactions.touch.Up;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Scroll_in {
	public AndroidDriver addriver;

	@BeforeClass
	public void loadApp() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("app", "E:/MyPersonalDiary-release.apk");
		addriver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}
	@Test
	public void startupoperations() throws InterruptedException{
		System.out.println("Testmessage");
		Thread.sleep(1000);
		System.out.println("installiation done sucessfully");
		addriver.findElement(By.id("com.androizen.personaldiary:id/etlFirstName")).sendKeys("Aditya");
		//ad.scrollToExact("Last Name (*)");
		addriver.findElement(By.id("com.androizen.personaldiary:id/etlLastName")).sendKeys("deshmukh");
       // addriver.scrollToExact("Email (*)");
		TouchAction action = new TouchAction(addriver);
	    action.press(0, 500).waitAction(200).moveTo(0, 200).release().perform();
		
		//addriver.findElement(By.id("com.androizen.personaldiary:id/etlEmail")).sendKeys("adi_1234@yopmail.com");
	    System.out.println("dsgsdgsdgds");
		
		//addriver.findElement(By.id("com.androizen.personaldiary:id/etlMobile")).sendKeys("8007888111");
		
		addriver.findElement(By.id("com.androizen.personaldiary:id/etlPasswd")).sendKeys("1234");
		//ad.scrollToExact("Register ");
		//addriver.findElement(By.id("com.androizen.personaldiary:id/buttonRegister")).click();
		System.out.println("all kdone");

	}

}
