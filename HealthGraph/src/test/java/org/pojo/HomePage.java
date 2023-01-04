package org.pojo;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends UtilityBaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='LoginLink']")
	private WebElement btnSiginIn;

	public WebElement getBtnSiginIn() {
		return btnSiginIn;
	}
	
	

}
