package com.tmailinc.qa.tmailreact_amd.operations;
/**
 * @author Adi
 *
 */
import com.tmailinc.qa.tmailreact_amd.page.CommentDetailsPage;
import com.tmailinc.qa.tmailreact_amd.page.CreateNewThreadPage;
import com.tmailinc.qa.tmailreact_amd.page.LoginPage;
import com.tmailinc.qa.tmailreact_amd.page.SearchThreadPage;

import io.appium.java_client.android.AndroidDriver;

public class TmailBasicOperations {
	static AndroidDriver addriver;
	public TmailBasicOperations (AndroidDriver AndroDriver){
		this.addriver = AndroDriver;
	}
	public String loginWithValidCredentials(String userName, String password) {
		LoginPage loginpage = new LoginPage(addriver);
		String accountsPage = loginpage.loginWithValidCredentials(userName, password);
		return accountsPage;
	}
	public String createNewThread(String writer, String subject) {
		CreateNewThreadPage createnewthreadpage = new CreateNewThreadPage(addriver);
		createnewthreadpage.createNewThread(writer,subject);
		return null;
	}
	public String searchThreadTTN(String validTTN) {
		SearchThreadPage searchthreadpage = new SearchThreadPage(addriver);
		String actualthreadtitle = searchthreadpage.searchThreadTTN(validTTN);
		return actualthreadtitle;
	}
	public String  addInlineMessage(String inlineMessage) {
		CommentDetailsPage commentdetails = new CommentDetailsPage(addriver);
		String ActMeg = commentdetails.searchThreadTTN(inlineMessage);
		return inlineMessage;
	}
	public void killApp() {
		addriver.resetApp();
	}
	
}
