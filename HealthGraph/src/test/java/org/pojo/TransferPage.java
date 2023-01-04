package org.pojo;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferPage extends UtilityBaseClass{
	
	public TransferPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="toAccount")
	private WebElement dDnToAccount;
	
	@FindBy(id="transferAmount")
	private WebElement txtAmountToBeTransfer;
	
	@FindBy(id="transfer")
	private WebElement btnTransfer;
	
	@FindBy(xpath="//form[@id='tForm']//table//tr//span//span")
	private WebElement txtSuccessTransaction;
	
	@FindBy(id="MenuHyperLink2")
	private WebElement btnRecentTransaction;
	
	public WebElement getdDnToAccount() {
		return dDnToAccount;
	}

	public WebElement getTxtAmountToBeTransfer() {
		return txtAmountToBeTransfer;
	}

	public WebElement getBtnTransfer() {
		return btnTransfer;
	}

	public WebElement getTxtSuccessPage() {
		return txtSuccessTransaction;
	}

	public WebElement getTxtSuccessTransaction() {
		return txtSuccessTransaction;
	}

	public WebElement getBtnRecentTransaction() {
		return btnRecentTransaction;
	}
	
	
	
	
	
	

}
