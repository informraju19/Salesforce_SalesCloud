package raju.Util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility {
	WebDriver driver;
	WebDriverWait wait;
	private void WaitDriver(WebDriver driver) {
		this.driver=driver;
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	
}
