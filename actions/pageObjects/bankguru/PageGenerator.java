package pageObjects.bankguru;

import org.openqa.selenium.WebDriver;

import commons.BasePage;

public class PageGenerator extends BasePage {
	WebDriver driver;

	public static LoginPO getLoginPage(WebDriver driver) {

		return new LoginPO(driver);
	}

	public static HomePagePO getHomePage(WebDriver driver) {

		return new HomePagePO(driver);
	}

	public static RegisterPO getRegisterPage(WebDriver driver) {

		return new RegisterPO(driver);
	}

	public static NewCustomerPO getNewCustomerPage(WebDriver driver) {

		return new NewCustomerPO(driver);
	}
	
	public static EditCustomerPO getEditCustomerPage(WebDriver driver) {
		
		return new EditCustomerPO(driver);
	}
	
	public static NewAccountPO getNewAccountPage(WebDriver driver) {
		
		return new NewAccountPO(driver);
	}
	
	public static EditAccountPO getEditAccountPage(WebDriver driver) {
		
		return new EditAccountPO(driver);
	}
	
	public static DepositPagePO getDepositPage(WebDriver driver) {
		
		return new DepositPagePO(driver);
	}
	
	public static WithdrawalPO getWithdrawalPage(WebDriver driver) {
		
		return new WithdrawalPO(driver);
	}
	
	public static FundTransferPO getFundTransferPage(WebDriver driver) {
		
		return new FundTransferPO(driver);
	}
	
	public static BalanceEnquiryPO getBalanceEnquiryPage(WebDriver driver) {
		
		return new BalanceEnquiryPO(driver);
	}
	
	public static DeleteAccountPO getDeleteAccountPage(WebDriver driver) {
		
		return new DeleteAccountPO(driver);
	}
	
	public static DeleteCustomerPO getDeleteCustomerPage(WebDriver driver) {
		
		return new DeleteCustomerPO(driver);
	}
	
	
	
	

}
