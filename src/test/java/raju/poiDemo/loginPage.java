package raju.poiDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	//COnstructor 
	WebDriver driver;
	
	loginPage(WebDriver driver){
		this.driver=driver;
	}
	
	//Locator 
	By txt_UserName=By.xpath("//input[@placeholder='Username']");
	By txt_password=By.xpath("//input[@placeholder='Password']");
	By btn_loginbutton=By.xpath("//button[normalize-space()='Login']");
	
	//Action Methods
	
public void setUserName(String userName) {
	driver.findElement(txt_UserName).sendKeys(userName);
}
public void setPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}
public void clickLoginButton() {
	driver.findElement(btn_loginbutton).click();
}
	
}
