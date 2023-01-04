package org.pojo;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityBaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}

	
	@FindBy(id="uid")
	private WebElement txtUsername;

	@FindBy(id="passw")
	private WebElement txtPassword;
	
	@FindBy(name="btnSubmit")
	private WebElement btnLogin;

	@FindBy(xpath="//span[contains(@id,'Main')]")
	private WebElement txtError;
	
	public WebElement getTxtError() {
		return txtError;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getTxtUsername() {
		return txtUsername;
	}
	
	
	
}
