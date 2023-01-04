package org.pojo;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends UtilityBaseClass  {
	
	public ProfilePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='wrapper']//following-sibling::table[2]//tr/td[2]/div/h1")
	private WebElement txtSuccess;
	
	@FindBy(xpath="//a[text()='View Account Summary']")
	private WebElement btnSummary;
	
	@FindBy(id="listAccounts")
	private WebElement dDnAccount;
	
	@FindBy(id="btnGetAccount")
	private WebElement btnGo;
	
	public WebElement getdDnAccount() {
		return dDnAccount;
	}

	public WebElement getTxtSuccess() {
		return txtSuccess;
	}

	public WebElement getBtnSummary() {
		return btnSummary;
	}
	
	public WebElement getGo() {
		return btnGo;
	}
	


	
	
	
	
	
	
}
