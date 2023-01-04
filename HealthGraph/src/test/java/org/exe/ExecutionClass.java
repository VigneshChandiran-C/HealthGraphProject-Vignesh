package org.exe;

import org.base.UtilityBaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.AccountHistoryPage;
import org.pojo.HomePage;
import org.pojo.LoginPage;
import org.pojo.ProfilePage;
import org.pojo.RecentTranscationsPage;
import org.pojo.TransferPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.math.Quantiles.Scale;

public class ExecutionClass extends UtilityBaseClass {

	@BeforeClass
	private void launch() {
		//launch the url in the google chrome browser
		launchBrowser();
		launchUrl("http://testfire.net/index.jsp");
		browserMaximize();
	}
	
	@Test
	private void m1() {
		HomePage h = new HomePage();
		BtnClick(h.getBtnSiginIn());
		LoginPage l = new LoginPage();
		
		//Signin with invalid credentials
		fill(l.getTxtUsername(), "demo_user");
		fill(l.getTxtPassword(), "demo_password");
		BtnClick(l.getBtnLogin());
		String errorText = retriveText(l.getTxtError());
		Assert.assertTrue(errorText.contains("Failed"),"Verifying Login Failed Message");
		
	}
	@Test
	private void m2() {
		LoginPage l = new LoginPage();
		
		//Signin valid credentials
		fill(l.getTxtUsername(), "admin");
		fill(l.getTxtPassword(), "admin");
		BtnClick(l.getBtnLogin());
		
		ProfilePage p = new ProfilePage();
		String successMessage = retriveText(p.getTxtSuccess());
		System.out.println(successMessage);
		Assert.assertTrue(successMessage.contains("Hello"),"Verifying Login Success Message");
		BtnClick(p.getBtnSummary());
		
		dDnSelectByValue(p.getdDnAccount(), "800001");
		BtnClick(p.getGo());
	}
	
	
	@Test
	private void m3() {
		
		//Verifying two different accounts
		AccountHistoryPage ac = new AccountHistoryPage();
		String txtBalance80001 = retriveText(ac.getTxtAvailableBalance());
		
		dDnSelectByValue(ac.getdDnAccount(), "800000");
		String txtBalance8000 = retriveText(ac.getTxtAvailableBalance());
		
		BtnClick(ac.getBtnSelectAccount());
		
		Assert.assertEquals(txtBalance8000, txtBalance80001, "Verifying Balance");

		BtnClick(ac.getBtnTransferFund());
		
	}
	
	@Test
	private void m4() {
		
		//Vderifying Successful Transactions
		TransferPage tr = new TransferPage();
		dDnSelectByValue(tr.getdDnToAccount(), "800001");
		
		fill(tr.getTxtAmountToBeTransfer(), "9876");
		BtnClick(tr.getBtnTransfer());
		
		String successMessage = retriveText(tr.getTxtSuccessTransaction());
		System.out.println(successMessage);
		
		Assert.assertTrue(successMessage.contains("9876.0"), "Verifying Successful Transaction");
		
		BtnClick(tr.getBtnRecentTransaction());
			
		
	}
	
	@Test
	private void m5() {
		
		//Verifying recent transactions
		
		RecentTranscationsPage re = new RecentTranscationsPage();
		String transcationOne = re.getAllRows().get(1).getText().replaceAll("[^a-zA-z0-9]", "");
		
		String transcationTwo = re.getAllRows().get(2).getText().replaceAll("[^a-zA-z0-9]", "");;
		
		Assert.assertEquals(transcationOne, transcationTwo,"Verifying Transaction");
		
		BtnClick(re.getBtnContact());
		BtnClick(re.getBtnOnlineForm());
		BtnClick(re.getBtnSignOff());
		
	}
	
	
	
}
