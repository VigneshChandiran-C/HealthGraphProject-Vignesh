package org.pojo;

import java.util.List;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecentTranscationsPage extends UtilityBaseClass {

	public RecentTranscationsPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//table[contains(@id,'My')]//tr//td[5]")
	private List<WebElement> allRows;

	@FindBy(xpath="//a[text()='Contact Us']")
	private WebElement btnContact;
	
	@FindBy(xpath="//a[text()='online form']")
	private WebElement btnOnlineForm;
	
	@FindBy(xpath="//a[@id='LoginLink']")
	private WebElement btnSignOff;
	
	
	public WebElement getBtnSignOff() {
		return btnSignOff;
	}


	public WebElement getBtnOnlineForm() {
		return btnOnlineForm;
	}


	public WebElement getBtnContact() {
		return btnContact;
	}


	public List<WebElement> getAllRows() {
		return allRows;
	}
	
	
	
}
