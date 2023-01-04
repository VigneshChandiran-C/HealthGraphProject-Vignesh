package org.pojo;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHistoryPage extends UtilityBaseClass {
	public AccountHistoryPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[contains(text(),'Available balance')]//following-sibling::td")
	private WebElement txtAvailableBalance;

	@FindBy(id="listAccounts")
	private WebElement dDnAccount;
	
	@FindBy(id="btnGetAccount")
	private WebElement btnSelectAccount;
	
	@FindBy(xpath ="//a[text()='Transfer Funds']")
	private WebElement btnTransferFund;
	
	public WebElement getBtnTransferFund() {
		return btnTransferFund;
	}

	public WebElement getBtnSelectAccount() {
		return btnSelectAccount;
	}

	public WebElement getTxtAvailableBalance() {
		return txtAvailableBalance;
	}
	
	public WebElement getdDnAccount() {
		return dDnAccount;
	}
	
	
	
	

}
