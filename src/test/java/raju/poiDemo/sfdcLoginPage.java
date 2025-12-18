package raju.poiDemo;

import java.security.interfaces.RSAPublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sfdcLoginPage {
	
	WebDriver driver;
	
	public sfdcLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id='username']") WebElement text_username;
	@FindBy(xpath="//input[@id='password']") WebElement text_password;
	@FindBy(xpath="//input[@id='Login']") WebElement loginButton;
	@FindBy(xpath="//input[@id='rememberUn']") WebElement Remember_me;
	@FindBy(xpath="//a[@id='forgot_password_link']") WebElement forgot_password_link;
	@FindBy(xpath="(//span[@class='uiImage'])[1]") WebElement userIcon;
	@FindBy(xpath="//span[normalize-space()='Raju Kumar']") WebElement logedUserName;
	@FindBy(xpath="//input[@id='emc']") WebElement text_VarificationCode;
	@FindBy(xpath="//input[@id='save']") WebElement VerifyButton;
	
	
	public void setUserName(String username) {
		text_username.sendKeys(username);
	}
	public void setPassword(String password) {
		text_password.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void clickOnLoginIcon() {
		userIcon.click();
	}
	public String LogedUserName() {
		
		String logedUsername=logedUserName.getText();
		return logedUsername;
	}
	public void SetVerificationCode(String verificationCode) {
		text_VarificationCode.sendKeys(verificationCode);
	}
	public void ClickOnVerifyButton() {
		
		VerifyButton.click();
		
	}
}
