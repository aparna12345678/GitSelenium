package com.webappsecurity.zero.TestScripts;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummaryPage;
import com.webappsecurity.zero.Pages.Login;
import com.webappsecurity.zero.Pages.TransferFundsConformation;
import com.webappsecurity.zero.Pages.TransferFundsPage;
import com.webappsecurity.zero.Pages.TransferFundsVerifyPage;

public class VerifyFundTransferTest extends Base{
	@Test
	public void verifyFundTransfer(){
		Login lp = new Login(driver);
		AccountSummaryPage acc = new AccountSummaryPage(driver);
		TransferFundsPage tf = new TransferFundsPage(driver);
		TransferFundsConformation tfc = new TransferFundsConformation(driver);    
		TransferFundsVerifyPage tfv = new TransferFundsVerifyPage(driver);
		
		lp.applicationLogin("username", "password");
		acc.clickTransferFunds();
		tf.doFundTransfer("350","Fund transfer of $350");
		tfv.clickSubmit();
		String confText = tfc.getConfText();
		
		String expectedText = "You successfully submitted your transaction.";
		Assert.assertEquals(confText, expectedText);
		}
		
		
		}
		
	
