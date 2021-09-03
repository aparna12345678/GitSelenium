package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage {
	
	
	@FindBy(linkText = "Transfer Funds")
	private WebElement tranFunds;
	
	public AccountSummaryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void clickTransferFunds() {
	  tranFunds.click();
	}
	
	public boolean isTransferFundsPresent() {
		return tranFunds.isDisplayed();
	}
           
}
