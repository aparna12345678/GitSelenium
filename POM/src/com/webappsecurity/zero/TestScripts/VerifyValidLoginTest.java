package com.webappsecurity.zero.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummaryPage;
import com.webappsecurity.zero.Pages.Login;

public class VerifyValidLoginTest extends Base {
	
	 
		@Test
		public void VerifyValidLogin() {
			Login lp = new Login(driver);
			AccountSummaryPage acc = new AccountSummaryPage(driver);
			
			lp.applicationLogin("username", "password");
			boolean tranFundsPresent = acc.isTransferFundsPresent();
			Assert.assertTrue(tranFundsPresent);	
		}
	
	}
