package raju.poiDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class loginTest {
	
WebDriver driver;	
 @BeforeClass
	void setUp() {
	 driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");;
	 
 }
 @Test
 void TestLogin() throws InterruptedException{
	 loginPage2 lp=new loginPage2(driver);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 lp.setUserName("Admin");
	 lp.SetPassword("admin123");
	 lp.ClickLoginButton();
	 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	 
 }
 
 @AfterClass
 void tearDen() {
	 driver.quit();
 }
}
