package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsPage {
	
	@FindBy(id="tf_fromAccountId")
	private WebElement fromAcc;
	
	@FindBy(id="tf_toAccountId")
	private WebElement toAcc;
	
	@FindBy(id="tf_amount")
	private WebElement amt;
	
	@FindBy(id="tf_description")
	private WebElement des;
	
	@FindBy(id="btn_submit")
	private WebElement continueBtn;
	
	public TransferFundsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void doFundTransfer(String amount, String description) {
		
		Select fromDD = new Select(fromAcc);
		fromDD.selectByIndex(2);
		
		Select toDD = new Select(toAcc);
		fromDD.selectByIndex(3);
		
		amt.sendKeys(amount);
		
		des.sendKeys(description);
		
		continueBtn.click();		
	} 
	

}
