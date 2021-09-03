package com.webappsecurity.zero.TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.Login;

public class VerifyInvalidLoginTest extends Base{

	@Test
	public void VerifyInValidLogin() {
		Login lp = new Login(driver);
		lp.applicationLogin("sfghgnklj", "hjuyijkfgsrh");
		String actualText = lp.getErrorMsg();
		String expectedText = "Login and/or password are wrong.";
		Assert.assertEquals(actualText, expectedText);
	}

	}

