package raju.poiDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage2 {
	
	WebDriver driver;
	loginPage2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']") WebElement txt_UserName;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement txt_password;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement Login_button;
	
	
	public  void setUserName(String userName) {
		txt_UserName.sendKeys(userName);
	}
	public void SetPassword(String passwrd) {
		txt_password.sendKeys(passwrd);
	}
	public void ClickLoginButton() {
		Login_button.click();
		
	}
	
	
	
}
